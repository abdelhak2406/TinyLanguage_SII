// Generated from /home/goku/Code/SII/Compil/ProjetC/src/TinyParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyParser}.
 */
public interface TinyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TinyParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TinyParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(TinyParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(TinyParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#listeDec}.
	 * @param ctx the parse tree
	 */
	void enterListeDec(TinyParser.ListeDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#listeDec}.
	 * @param ctx the parse tree
	 */
	void exitListeDec(TinyParser.ListeDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#typeDec}.
	 * @param ctx the parse tree
	 */
	void enterTypeDec(TinyParser.TypeDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#typeDec}.
	 * @param ctx the parse tree
	 */
	void exitTypeDec(TinyParser.TypeDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#descPgm}.
	 * @param ctx the parse tree
	 */
	void enterDescPgm(TinyParser.DescPgmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#descPgm}.
	 * @param ctx the parse tree
	 */
	void exitDescPgm(TinyParser.DescPgmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#operande}.
	 * @param ctx the parse tree
	 */
	void enterOperande(TinyParser.OperandeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#operande}.
	 * @param ctx the parse tree
	 */
	void exitOperande(TinyParser.OperandeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 */
	void enterAff(TinyParser.AffContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 */
	void exitAff(TinyParser.AffContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithOperation(TinyParser.ArithOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithOperation(TinyParser.ArithOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#opComparison}.
	 * @param ctx the parse tree
	 */
	void enterOpComparison(TinyParser.OpComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#opComparison}.
	 * @param ctx the parse tree
	 */
	void exitOpComparison(TinyParser.OpComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(TinyParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(TinyParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(TinyParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(TinyParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void enterEls(TinyParser.ElsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void exitEls(TinyParser.ElsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(TinyParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(TinyParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#scanInputs}.
	 * @param ctx the parse tree
	 */
	void enterScanInputs(TinyParser.ScanInputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#scanInputs}.
	 * @param ctx the parse tree
	 */
	void exitScanInputs(TinyParser.ScanInputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(TinyParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(TinyParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(TinyParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(TinyParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(TinyParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(TinyParser.PrintContext ctx);
}