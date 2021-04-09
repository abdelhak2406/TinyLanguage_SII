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
	 * Enter a parse tree produced by the {@code arith_mult}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArith_mult(TinyParser.Arith_multContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arith_mult}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArith_mult(TinyParser.Arith_multContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arith_div}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArith_div(TinyParser.Arith_divContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arith_div}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArith_div(TinyParser.Arith_divContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arith_add}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArith_add(TinyParser.Arith_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arith_add}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArith_add(TinyParser.Arith_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arith_sub}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArith_sub(TinyParser.Arith_subContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arith_sub}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArith_sub(TinyParser.Arith_subContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oper}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterOper(TinyParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oper}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitOper(TinyParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithParent}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithParent(TinyParser.ArithParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithParent}
	 * labeled alternative in {@link TinyParser#arithOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithParent(TinyParser.ArithParentContext ctx);
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
	 * Enter a parse tree produced by the {@code if_aff}
	 * labeled alternative in {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterIf_aff(TinyParser.If_affContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_aff}
	 * labeled alternative in {@link TinyParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitIf_aff(TinyParser.If_affContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse_aff}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void enterIfelse_aff(TinyParser.Ifelse_affContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse_aff}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void exitIfelse_aff(TinyParser.Ifelse_affContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseNothing}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void enterElseNothing(TinyParser.ElseNothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseNothing}
	 * labeled alternative in {@link TinyParser#els}.
	 * @param ctx the parse tree
	 */
	void exitElseNothing(TinyParser.ElseNothingContext ctx);
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