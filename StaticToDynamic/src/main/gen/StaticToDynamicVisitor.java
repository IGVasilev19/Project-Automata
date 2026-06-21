// Generated from D:/Fontys work/Semester 4/Automata/Research/Project-Automata/StaticToDynamic/src/main/antlr4/StaticToDynamic.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StaticToDynamicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StaticToDynamicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StaticToDynamicParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(StaticToDynamicParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericDecl(StaticToDynamicParser.NumericDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDecl}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDecl(StaticToDynamicParser.StringDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(StaticToDynamicParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStmt}
	 * labeled alternative in {@link StaticToDynamicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(StaticToDynamicParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticToDynamicParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(StaticToDynamicParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postInc}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostInc(StaticToDynamicParser.PostIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postDec}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDec(StaticToDynamicParser.PostDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusEq(StaticToDynamicParser.PlusEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusEq}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusEq(StaticToDynamicParser.MinusEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateAssign}
	 * labeled alternative in {@link StaticToDynamicParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateAssign(StaticToDynamicParser.UpdateAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link StaticToDynamicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(StaticToDynamicParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(StaticToDynamicParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(StaticToDynamicParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLit(StaticToDynamicParser.FloatLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(StaticToDynamicParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(StaticToDynamicParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idRef}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRef(StaticToDynamicParser.IdRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link StaticToDynamicParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(StaticToDynamicParser.MulDivContext ctx);
}