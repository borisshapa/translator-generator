// Generated from /home/borisshapa/Projects/translator-generator/src/main/antlr/GrammarParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarGrammarParser}.
 */
public interface GrammarGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(GrammarGrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(GrammarGrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarGrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarGrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarGrammarParser#nonTerminalChild}.
	 * @param ctx the parse tree
	 */
	void enterNonTerminalChild(GrammarGrammarParser.NonTerminalChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarGrammarParser#nonTerminalChild}.
	 * @param ctx the parse tree
	 */
	void exitNonTerminalChild(GrammarGrammarParser.NonTerminalChildContext ctx);
}