// Generated from D:/Fontys work/Semester 4/Automata/Research/StaticToDynamic/src/main/antlr4/StaticToDynamic.g4 by ANTLR 4.13.2
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