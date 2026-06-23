// Generated from /home/markov/Desktop/projects/github/Project-Automata/StaticToDynamic/src/main/antlr4/StaticToDynamic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StaticToDynamicParser}.
 */
public interface StaticToDynamicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StaticToDynamicParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(StaticToDynamicParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticToDynamicParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(StaticToDynamicParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDef}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStructDef(StaticToDynamicParser.StructDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDef}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStructDef(StaticToDynamicParser.StructDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStructDecl(StaticToDynamicParser.StructDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStructDecl(StaticToDynamicParser.StructDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterNumericDecl(StaticToDynamicParser.NumericDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitNumericDecl(StaticToDynamicParser.NumericDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStringDecl(StaticToDynamicParser.StringDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStringDecl(StaticToDynamicParser.StringDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(StaticToDynamicParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(StaticToDynamicParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAssign}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMemberAssign(StaticToDynamicParser.MemberAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAssign}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMemberAssign(StaticToDynamicParser.MemberAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(StaticToDynamicParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(StaticToDynamicParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticToDynamicParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(StaticToDynamicParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticToDynamicParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(StaticToDynamicParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticToDynamicParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(StaticToDynamicParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticToDynamicParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(StaticToDynamicParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticToDynamicParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(StaticToDynamicParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticToDynamicParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(StaticToDynamicParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPostInc(StaticToDynamicParser.PostIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPostInc(StaticToDynamicParser.PostIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPostDec(StaticToDynamicParser.PostDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPostDec(StaticToDynamicParser.PostDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterPlusEq(StaticToDynamicParser.PlusEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitPlusEq(StaticToDynamicParser.PlusEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterMinusEq(StaticToDynamicParser.MinusEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitMinusEq(StaticToDynamicParser.MinusEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateAssign}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterUpdateAssign(StaticToDynamicParser.UpdateAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateAssign}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitUpdateAssign(StaticToDynamicParser.UpdateAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StaticToDynamicParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StaticToDynamicParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StaticToDynamicParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StaticToDynamicParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(StaticToDynamicParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(StaticToDynamicParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(StaticToDynamicParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(StaticToDynamicParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloatLit(StaticToDynamicParser.FloatLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloatLit(StaticToDynamicParser.FloatLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(StaticToDynamicParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(StaticToDynamicParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberRef}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberRef(StaticToDynamicParser.MemberRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberRef}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberRef(StaticToDynamicParser.MemberRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(StaticToDynamicParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(StaticToDynamicParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idRef}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdRef(StaticToDynamicParser.IdRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idRef}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdRef(StaticToDynamicParser.IdRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(StaticToDynamicParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(StaticToDynamicParser.MulDivContext ctx);
}