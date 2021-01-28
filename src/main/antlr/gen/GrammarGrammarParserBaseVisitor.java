// Generated from /home/borisshapa/Projects/translator-generator/src/main/antlr/GrammarParser.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link GrammarGrammarParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class GrammarGrammarParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements GrammarGrammarParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGrammarRules(GrammarGrammarParser.GrammarRulesContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitGrammarRule(GrammarGrammarParser.GrammarRuleContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNonTerminalChild(GrammarGrammarParser.NonTerminalChildContext ctx) { return visitChildren(ctx); }
}