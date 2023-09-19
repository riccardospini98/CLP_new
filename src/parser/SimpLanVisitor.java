// Generated from SimpLan.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpLanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpLanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code singleExp}
	 * labeled alternative in {@link SimpLanParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExp(SimpLanParser.SingleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letInExp}
	 * labeled alternative in {@link SimpLanParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetInExp(SimpLanParser.LetInExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(SimpLanParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idInit}
	 * labeled alternative in {@link SimpLanParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdInit(SimpLanParser.IdInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funDec}
	 * labeled alternative in {@link SimpLanParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDec(SimpLanParser.FunDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SimpLanParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpLanParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SimpLanParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SimpLanParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpLanParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(SimpLanParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(SimpLanParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolVal}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVal(SimpLanParser.BoolValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(SimpLanParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifExp}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(SimpLanParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExp}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExp(SimpLanParser.VarExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link SimpLanParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExp(SimpLanParser.FunExpContext ctx);
}