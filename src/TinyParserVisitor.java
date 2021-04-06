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
	 * Visit a parse tree produced by {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOperation(TinyParser.ArithOperationContext ctx);
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
	 * Visit a parse tree produced by {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(TinyParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#els}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEls(TinyParser.ElsContext ctx);
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