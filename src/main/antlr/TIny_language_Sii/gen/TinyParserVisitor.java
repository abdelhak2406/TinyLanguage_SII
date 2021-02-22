// Generated from /home/goku/Code/SII/Compil/Projet/src/main/antlr/TIny_language_Sii/TinyParser.g4 by ANTLR 4.9.1
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
}