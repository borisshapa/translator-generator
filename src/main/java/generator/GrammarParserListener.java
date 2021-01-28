// Generated from GrammarParser.g4 by ANTLR 4.7
package generator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(GrammarParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(GrammarParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarInfo}.
	 * @param ctx the parse tree
	 */
	void enterGrammarInfo(GrammarParser.GrammarInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarInfo}.
	 * @param ctx the parse tree
	 */
	void exitGrammarInfo(GrammarParser.GrammarInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInitAttributes(GrammarParser.InitAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInitAttributes(GrammarParser.InitAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initAttribute}.
	 * @param ctx the parse tree
	 */
	void enterInitAttribute(GrammarParser.InitAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initAttribute}.
	 * @param ctx the parse tree
	 */
	void exitInitAttribute(GrammarParser.InitAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#skipRule}.
	 * @param ctx the parse tree
	 */
	void enterSkipRule(GrammarParser.SkipRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#skipRule}.
	 * @param ctx the parse tree
	 */
	void exitSkipRule(GrammarParser.SkipRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#fold}.
	 * @param ctx the parse tree
	 */
	void enterFold(GrammarParser.FoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#fold}.
	 * @param ctx the parse tree
	 */
	void exitFold(GrammarParser.FoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleChild}.
	 * @param ctx the parse tree
	 */
	void enterRuleChild(GrammarParser.RuleChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleChild}.
	 * @param ctx the parse tree
	 */
	void exitRuleChild(GrammarParser.RuleChildContext ctx);
}