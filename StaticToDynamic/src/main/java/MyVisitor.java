
public class MyVisitor extends StaticToDynamicBaseVisitor<String> {

    @Override
    public String visitStart(StaticToDynamicParser.StartContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (StaticToDynamicParser.StatementContext stmt : ctx.statement()) {
            sb.append(visit(stmt)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitNumericDecl(StaticToDynamicParser.NumericDeclContext ctx) {

        String name = ctx.ID().getText();
        return name + " = " + visit(ctx.expr());
    }

    @Override
    public String visitStringDecl(StaticToDynamicParser.StringDeclContext ctx) {
        String name = ctx.ID().getText();
        return name + " = " + ctx.STRING().getText();
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
