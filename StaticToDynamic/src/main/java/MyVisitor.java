import java.util.LinkedHashSet;
import java.util.Set;

public class MyVisitor extends StaticToDynamicBaseVisitor<String> {

    private int forDepth = 0;
    private final Set<String> loopVars = new LinkedHashSet<>();

    @Override
    public String visitStart(StaticToDynamicParser.StartContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (StaticToDynamicParser.StatementContext stmt : ctx.statement()) {
            sb.append(visit(stmt)).append("\n");
        }

        if (!loopVars.isEmpty()) {
            sb.append("\n");
            sb.append("# values after the loops have run\n");
            for (String v : loopVars) {
                sb.append("print(\"").append(v).append(" =\", ").append(v).append(")\n");
            }
        }
        return sb.toString();
    }

    private void recordIfInLoop(String name) {
        if (forDepth > 0) {
            loopVars.add(name);
        }
    }

    @Override
    public String visitNumericDecl(StaticToDynamicParser.NumericDeclContext ctx) {

        String name = ctx.ID().getText();
        recordIfInLoop(name);
        return name + " = " + visit(ctx.expr());
    }

    @Override
    public String visitStringDecl(StaticToDynamicParser.StringDeclContext ctx) {
        String name = ctx.ID().getText();
        recordIfInLoop(name);
        return name + " = " + ctx.STRING().getText();
    }

    @Override
    public String visitAssignStmt(StaticToDynamicParser.AssignStmtContext ctx) {
        String name = ctx.ID().getText();
        recordIfInLoop(name);
        return name + " = " + visit(ctx.expr());
    }


    @Override
    public String visitForStmt(StaticToDynamicParser.ForStmtContext ctx) {
        StaticToDynamicParser.ForInitContext init = ctx.forInit();
        StaticToDynamicParser.ExprContext cond = ctx.expr();
        StaticToDynamicParser.ForUpdateContext upd = ctx.forUpdate();

        if (init != null) {
            loopVars.add(init.ID().getText());
        }

        forDepth++;
        String body = visit(ctx.block());
        forDepth--;

        String ranged = tryRange(init, cond, upd, body);
        if (ranged != null) {
            return ranged;
        }
        return toWhile(init, cond, upd, body);
    }

    private String tryRange(StaticToDynamicParser.ForInitContext init,
                            StaticToDynamicParser.ExprContext cond,
                            StaticToDynamicParser.ForUpdateContext upd,
                            String body) {
        if (init == null || cond == null || upd == null) {
            return null;
        }
        if (!(cond instanceof StaticToDynamicParser.CompareContext)) {
            return null;
        }
        StaticToDynamicParser.CompareContext cmp =
                (StaticToDynamicParser.CompareContext) cond;

        String var = init.ID().getText();
        String updVar = updateVar(upd);
        if (updVar == null || !updVar.equals(var)) {
            return null;
        }
        if (!isVar(cmp.expr(0), var)) {
            return null;
        }

        String op = cmp.getChild(1).getText();
        String start = visit(init.expr());
        String bound = visit(cmp.expr(1));

        String step = updateStep(upd);
        int sign = updateSign(upd);
        if (step == null) {
            return null;
        }

        boolean ascending;
        String stop;
        switch (op) {
            case "<":  ascending = true;  stop = bound; break;
            case "<=": ascending = true;  stop = shift(bound, 1); break;
            case ">":  ascending = false; stop = bound; break;
            case ">=": ascending = false; stop = shift(bound, -1); break;
            default:   return null; // == / != cannot map to range
        }
        if (ascending && sign != 1) return null;
        if (!ascending && sign != -1) return null;

        String args;
        if (ascending) {
            if (step.equals("1")) {
                args = start.equals("0") ? stop : start + ", " + stop;
            } else {
                args = start + ", " + stop + ", " + step;
            }
        } else {
            args = start + ", " + stop + ", -" + step;
        }

        return "for " + var + " in range(" + args + "):\n" + indent(body);
    }

    private String toWhile(StaticToDynamicParser.ForInitContext init,
                           StaticToDynamicParser.ExprContext cond,
                           StaticToDynamicParser.ForUpdateContext upd,
                           String body) {
        StringBuilder sb = new StringBuilder();
        if (init != null) {
            sb.append(init.ID().getText()).append(" = ")
              .append(visit(init.expr())).append("\n");
        }
        String condText = (cond == null) ? "True" : visit(cond);
        sb.append("while ").append(condText).append(":\n");

        String inner = body;
        String updText = updateToPython(upd);
        if (updText != null) {
            inner = inner.isEmpty() ? updText : inner + "\n" + updText;
        }
        sb.append(indent(inner));
        return sb.toString();
    }

    private String updateVar(StaticToDynamicParser.ForUpdateContext upd) {
        if (upd instanceof StaticToDynamicParser.PostIncContext)
            return ((StaticToDynamicParser.PostIncContext) upd).ID().getText();
        if (upd instanceof StaticToDynamicParser.PostDecContext)
            return ((StaticToDynamicParser.PostDecContext) upd).ID().getText();
        if (upd instanceof StaticToDynamicParser.PlusEqContext)
            return ((StaticToDynamicParser.PlusEqContext) upd).ID().getText();
        if (upd instanceof StaticToDynamicParser.MinusEqContext)
            return ((StaticToDynamicParser.MinusEqContext) upd).ID().getText();
        if (upd instanceof StaticToDynamicParser.UpdateAssignContext)
            return ((StaticToDynamicParser.UpdateAssignContext) upd).ID().getText();
        return null;
    }

    private String updateStep(StaticToDynamicParser.ForUpdateContext upd) {
        if (upd instanceof StaticToDynamicParser.PostIncContext) return "1";
        if (upd instanceof StaticToDynamicParser.PostDecContext) return "1";
        if (upd instanceof StaticToDynamicParser.PlusEqContext)
            return visit(((StaticToDynamicParser.PlusEqContext) upd).expr());
        if (upd instanceof StaticToDynamicParser.MinusEqContext)
            return visit(((StaticToDynamicParser.MinusEqContext) upd).expr());
        if (upd instanceof StaticToDynamicParser.UpdateAssignContext) {
            StaticToDynamicParser.UpdateAssignContext ua =
                    (StaticToDynamicParser.UpdateAssignContext) upd;
            if (ua.expr() instanceof StaticToDynamicParser.AddSubContext) {
                StaticToDynamicParser.AddSubContext as =
                        (StaticToDynamicParser.AddSubContext) ua.expr();
                if (isVar(as.expr(0), ua.ID().getText())) {
                    return visit(as.expr(1));
                }
            }
            return null;
        }
        return null;
    }

    private int updateSign(StaticToDynamicParser.ForUpdateContext upd) {
        if (upd instanceof StaticToDynamicParser.PostIncContext) return 1;
        if (upd instanceof StaticToDynamicParser.PostDecContext) return -1;
        if (upd instanceof StaticToDynamicParser.PlusEqContext) return 1;
        if (upd instanceof StaticToDynamicParser.MinusEqContext) return -1;
        if (upd instanceof StaticToDynamicParser.UpdateAssignContext) {
            StaticToDynamicParser.UpdateAssignContext ua =
                    (StaticToDynamicParser.UpdateAssignContext) upd;
            if (ua.expr() instanceof StaticToDynamicParser.AddSubContext) {
                StaticToDynamicParser.AddSubContext as =
                        (StaticToDynamicParser.AddSubContext) ua.expr();
                return as.getChild(1).getText().equals("-") ? -1 : 1;
            }
        }
        return 0;
    }

    private String updateToPython(StaticToDynamicParser.ForUpdateContext upd) {
        if (upd == null) return null;
        if (upd instanceof StaticToDynamicParser.PostIncContext)
            return ((StaticToDynamicParser.PostIncContext) upd).ID().getText() + " += 1";
        if (upd instanceof StaticToDynamicParser.PostDecContext)
            return ((StaticToDynamicParser.PostDecContext) upd).ID().getText() + " -= 1";
        if (upd instanceof StaticToDynamicParser.PlusEqContext) {
            StaticToDynamicParser.PlusEqContext p =
                    (StaticToDynamicParser.PlusEqContext) upd;
            return p.ID().getText() + " += " + visit(p.expr());
        }
        if (upd instanceof StaticToDynamicParser.MinusEqContext) {
            StaticToDynamicParser.MinusEqContext m =
                    (StaticToDynamicParser.MinusEqContext) upd;
            return m.ID().getText() + " -= " + visit(m.expr());
        }
        if (upd instanceof StaticToDynamicParser.UpdateAssignContext) {
            StaticToDynamicParser.UpdateAssignContext ua =
                    (StaticToDynamicParser.UpdateAssignContext) upd;
            return ua.ID().getText() + " = " + visit(ua.expr());
        }
        return null;
    }

    @Override
    public String visitBlock(StaticToDynamicParser.BlockContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (StaticToDynamicParser.StatementContext stmt : ctx.statement()) {
            if (sb.length() > 0) sb.append("\n");
            sb.append(visit(stmt));
        }
        return sb.toString();
    }

    private boolean isVar(StaticToDynamicParser.ExprContext e, String name) {
        return e instanceof StaticToDynamicParser.IdRefContext
                && ((StaticToDynamicParser.IdRefContext) e).ID().getText().equals(name);
    }

    private String shift(String bound, int delta) {
        try {
            return String.valueOf(Integer.parseInt(bound.trim()) + delta);
        } catch (NumberFormatException ex) {
            return delta >= 0 ? bound + " + " + delta : bound + " - " + (-delta);
        }
    }

    private String indent(String body) {
        if (body == null || body.isEmpty()) {
            return "    pass";
        }
        StringBuilder sb = new StringBuilder();
        for (String line : body.split("\n", -1)) {
            if (sb.length() > 0) sb.append("\n");
            sb.append("    ").append(line);
        }
        return sb.toString();
    }


    @Override
    public String visitMulDiv(StaticToDynamicParser.MulDivContext ctx) {
        String op = ctx.getChild(1).getText();
        return visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitAddSub(StaticToDynamicParser.AddSubContext ctx) {
        String op = ctx.getChild(1).getText();
        return visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitCompare(StaticToDynamicParser.CompareContext ctx) {
        String op = ctx.getChild(1).getText();
        return visit(ctx.expr(0)) + " " + op + " " + visit(ctx.expr(1));
    }

    @Override
    public String visitParens(StaticToDynamicParser.ParensContext ctx) {
        return "(" + visit(ctx.expr()) + ")";
    }

    @Override
    public String visitFloatLit(StaticToDynamicParser.FloatLitContext ctx) {
        return ctx.FLOAT().getText();
    }

    @Override
    public String visitIntLit(StaticToDynamicParser.IntLitContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitIdRef(StaticToDynamicParser.IdRefContext ctx) {
        return ctx.ID().getText();
    }
}
