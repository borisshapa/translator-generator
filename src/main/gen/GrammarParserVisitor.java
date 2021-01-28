// Generated from /home/borisshapa/Projects/translator-generator/src/main/antlr/GrammarParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(GrammarParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarInfo(GrammarParser.GrammarInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ruleChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleChild(GrammarParser.RuleChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#initAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitAttributes(GrammarParser.InitAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#initAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitAttribute(GrammarParser.InitAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRules(GrammarParser.GrammarRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(GrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#fold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFold(GrammarParser.FoldContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#skipRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipRule(GrammarParser.SkipRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(GrammarParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(GrammarParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GrammarParser.ParensContext ctx);
}