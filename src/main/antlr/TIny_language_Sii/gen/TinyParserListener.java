// Generated from /home/goku/Code/SII/Compil/Projet/src/main/antlr/TIny_language_Sii/TinyParser.g4 by ANTLR 4.9.1
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
}