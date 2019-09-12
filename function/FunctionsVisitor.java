// Generated from Functions.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code decVar}
	 * labeled alternative in {@link FunctionsParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVar(FunctionsParser.DecVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decFunc}
	 * labeled alternative in {@link FunctionsParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunc(FunctionsParser.DecFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSub}
	 * labeled alternative in {@link FunctionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(FunctionsParser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMuldiv}
	 * labeled alternative in {@link FunctionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMuldiv(FunctionsParser.ExprMuldivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSoma}
	 * labeled alternative in {@link FunctionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSoma(FunctionsParser.ExprSomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivDiv}
	 * labeled alternative in {@link FunctionsParser#muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivDiv(FunctionsParser.MuldivDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivMul}
	 * labeled alternative in {@link FunctionsParser#muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivMul(FunctionsParser.MuldivMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldivParen}
	 * labeled alternative in {@link FunctionsParser#muldiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldivParen(FunctionsParser.MuldivParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link FunctionsParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionsParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionsParser#ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIds(FunctionsParser.IdsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenID}
	 * labeled alternative in {@link FunctionsParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenID(FunctionsParser.ParenIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenNum}
	 * labeled alternative in {@link FunctionsParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenNum(FunctionsParser.ParenNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenFunc}
	 * labeled alternative in {@link FunctionsParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFunc(FunctionsParser.ParenFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenParen}
	 * labeled alternative in {@link FunctionsParser#paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenParen(FunctionsParser.ParenParenContext ctx);
}