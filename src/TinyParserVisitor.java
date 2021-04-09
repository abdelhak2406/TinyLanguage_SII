// Generated from /home/goku/Code/SII/Compil/ProjetC/src/TinyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TinyParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(TinyParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#listeDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListeDec(TinyParser.ListeDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#typeDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDec(TinyParser.TypeDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#descPgm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescPgm(TinyParser.DescPgmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#operande}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperande(TinyParser.OperandeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAff(TinyParser.AffContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arith_mult}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_mult(TinyParser.Arith_multContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arith_div}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_div(TinyParser.Arith_divContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arith_add}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_add(TinyParser.Arith_addContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arith_sub}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_sub(TinyParser.Arith_subContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oper}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(TinyParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithParent}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithParent(TinyParser.ArithParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#opComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpComparison(TinyParser.OpComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(TinyParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_aff}
	 * labeled alternative in {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_aff(TinyParser.If_affContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse_aff}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse_aff(TinyParser.Ifelse_affContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseNothing}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseNothing(TinyParser.ElseNothingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(TinyParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#scanInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScanInputs(TinyParser.ScanInputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(TinyParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(TinyParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(TinyParser.PrintContext ctx);
}