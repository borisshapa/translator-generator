// Generated from /home/borisshapa/Projects/translator-generator/src/main/antlr/GrammarParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRules(GrammarGrammarParser.GrammarRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarGrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarGrammarParser#nonTerminalChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerminalChild(GrammarGrammarParser.NonTerminalChildContext ctx);
}