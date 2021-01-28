// Generated from GrammarParser.g4 by ANTLR 4.7
package generator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Attribute=1, Brackets=2, Parens=3, Arrow=4, Eps=5, Tilda=6, Plus=7, Star=8, 
		String=9, Node=10, Whitespace=11, Newline=12, Skip=13;
	public static final int
		RULE_terminal = 0, RULE_regex = 1, RULE_grammarInfo = 2, RULE_initAttributes = 3, 
		RULE_initAttribute = 4, RULE_grammarRules = 5, RULE_skipRule = 6, RULE_grammarRule = 7, 
		RULE_fold = 8, RULE_ruleChild = 9;
	public static final String[] ruleNames = {
		"terminal", "regex", "grammarInfo", "initAttributes", "initAttribute", 
		"grammarRules", "skipRule", "grammarRule", "fold", "ruleChild"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'->'", "'\\eps'", "'~'", "'+'", "'*'", null, 
		null, null, null, "'skip'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Attribute", "Brackets", "Parens", "Arrow", "Eps", "Tilda", "Plus", 
		"Star", "String", "Node", "Whitespace", "Newline", "Skip"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TerminalContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode String() { return getToken(GrammarParser.String, 0); }
		public TerminalNode Eps() { return getToken(GrammarParser.Eps, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_terminal);
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Brackets:
			case Parens:
			case Tilda:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				regex();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(String);
				}
				break;
			case Eps:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(Eps);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegexContext extends ParserRuleContext {
		public TerminalNode Parens() { return getToken(GrammarParser.Parens, 0); }
		public TerminalNode Brackets() { return getToken(GrammarParser.Brackets, 0); }
		public TerminalNode Tilda() { return getToken(GrammarParser.Tilda, 0); }
		public TerminalNode Plus() { return getToken(GrammarParser.Plus, 0); }
		public TerminalNode Star() { return getToken(GrammarParser.Star, 0); }
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tilda) {
				{
				setState(25);
				match(Tilda);
				}
			}

			setState(28);
			_la = _input.LA(1);
			if ( !(_la==Brackets || _la==Parens) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Star) {
				{
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Star) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarInfoContext extends ParserRuleContext {
		public InitAttributesContext initAttributes() {
			return getRuleContext(InitAttributesContext.class,0);
		}
		public List<TerminalNode> Newline() { return getTokens(GrammarParser.Newline); }
		public TerminalNode Newline(int i) {
			return getToken(GrammarParser.Newline, i);
		}
		public GrammarRulesContext grammarRules() {
			return getRuleContext(GrammarRulesContext.class,0);
		}
		public GrammarInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarInfoContext grammarInfo() throws RecognitionException {
		GrammarInfoContext _localctx = new GrammarInfoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_grammarInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Attribute) {
				{
				setState(32);
				initAttributes();
				}
			}

			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newline) {
				{
				{
				setState(35);
				match(Newline);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Brackets || _la==Node) {
				{
				setState(41);
				grammarRules();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitAttributesContext extends ParserRuleContext {
		public List<InitAttributeContext> initAttribute() {
			return getRuleContexts(InitAttributeContext.class);
		}
		public InitAttributeContext initAttribute(int i) {
			return getRuleContext(InitAttributeContext.class,i);
		}
		public InitAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInitAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitInitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitAttributesContext initAttributes() throws RecognitionException {
		InitAttributesContext _localctx = new InitAttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				initAttribute();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Attribute );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitAttributeContext extends ParserRuleContext {
		public TerminalNode Attribute() { return getToken(GrammarParser.Attribute, 0); }
		public TerminalNode Newline() { return getToken(GrammarParser.Newline, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public InitAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterInitAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitInitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitInitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitAttributeContext initAttribute() throws RecognitionException {
		InitAttributeContext _localctx = new InitAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Attribute);
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Newline) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRulesContext extends ParserRuleContext {
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public GrammarRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRulesContext grammarRules() throws RecognitionException {
		GrammarRulesContext _localctx = new GrammarRulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_grammarRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				grammarRule();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Brackets || _la==Node );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkipRuleContext extends ParserRuleContext {
		public TerminalNode Brackets() { return getToken(GrammarParser.Brackets, 0); }
		public TerminalNode Arrow() { return getToken(GrammarParser.Arrow, 0); }
		public TerminalNode Skip() { return getToken(GrammarParser.Skip, 0); }
		public SkipRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterSkipRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitSkipRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitSkipRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipRuleContext skipRule() throws RecognitionException {
		SkipRuleContext _localctx = new SkipRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_skipRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Brackets);
			setState(58);
			match(Arrow);
			setState(59);
			match(Skip);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrammarRuleContext extends ParserRuleContext {
		public TerminalNode Newline() { return getToken(GrammarParser.Newline, 0); }
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public FoldContext fold() {
			return getRuleContext(FoldContext.class,0);
		}
		public SkipRuleContext skipRule() {
			return getRuleContext(SkipRuleContext.class,0);
		}
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitGrammarRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitGrammarRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_grammarRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Node:
				{
				setState(61);
				fold();
				}
				break;
			case Brackets:
				{
				setState(62);
				skipRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Newline) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FoldContext extends ParserRuleContext {
		public TerminalNode Node() { return getToken(GrammarParser.Node, 0); }
		public TerminalNode Arrow() { return getToken(GrammarParser.Arrow, 0); }
		public List<RuleChildContext> ruleChild() {
			return getRuleContexts(RuleChildContext.class);
		}
		public RuleChildContext ruleChild(int i) {
			return getRuleContext(RuleChildContext.class,i);
		}
		public List<TerminalNode> Attribute() { return getTokens(GrammarParser.Attribute); }
		public TerminalNode Attribute(int i) {
			return getToken(GrammarParser.Attribute, i);
		}
		public FoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterFold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitFold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitFold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoldContext fold() throws RecognitionException {
		FoldContext _localctx = new FoldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(Node);
			setState(68);
			match(Arrow);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				ruleChild();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Brackets) | (1L << Parens) | (1L << Eps) | (1L << Tilda) | (1L << String) | (1L << Node))) != 0) );
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Attribute) {
				{
				setState(74);
				match(Attribute);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Attribute) {
					{
					setState(75);
					match(Attribute);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleChildContext extends ParserRuleContext {
		public TerminalNode Node() { return getToken(GrammarParser.Node, 0); }
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public RuleChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).enterRuleChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarParserListener ) ((GrammarParserListener)listener).exitRuleChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarParserVisitor ) return ((GrammarParserVisitor<? extends T>)visitor).visitRuleChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleChildContext ruleChild() throws RecognitionException {
		RuleChildContext _localctx = new RuleChildContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruleChild);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Node:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(Node);
				}
				break;
			case Brackets:
			case Parens:
			case Eps:
			case Tilda:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				terminal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\5\2\32\n\2\3\3\5\3\35\n\3\3\3\3\3\5\3!\n\3\3\4\5\4$\n\4\3\4"+
		"\7\4\'\n\4\f\4\16\4*\13\4\3\4\5\4-\n\4\3\5\6\5\60\n\5\r\5\16\5\61\3\6"+
		"\3\6\3\6\3\7\6\78\n\7\r\7\16\79\3\b\3\b\3\b\3\b\3\t\3\t\5\tB\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\6\nI\n\n\r\n\16\nJ\3\n\3\n\5\nO\n\n\5\nQ\n\n\3\13\3\13"+
		"\5\13U\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\4\5\3\2\t\n\3\3"+
		"\16\16\2Z\2\31\3\2\2\2\4\34\3\2\2\2\6#\3\2\2\2\b/\3\2\2\2\n\63\3\2\2\2"+
		"\f\67\3\2\2\2\16;\3\2\2\2\20A\3\2\2\2\22E\3\2\2\2\24T\3\2\2\2\26\32\5"+
		"\4\3\2\27\32\7\13\2\2\30\32\7\7\2\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30"+
		"\3\2\2\2\32\3\3\2\2\2\33\35\7\b\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36"+
		"\3\2\2\2\36 \t\2\2\2\37!\t\3\2\2 \37\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"$\5"+
		"\b\5\2#\"\3\2\2\2#$\3\2\2\2$(\3\2\2\2%\'\7\16\2\2&%\3\2\2\2\'*\3\2\2\2"+
		"(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+-\5\f\7\2,+\3\2\2\2,-\3\2\2\2"+
		"-\7\3\2\2\2.\60\5\n\6\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\t\3\2\2\2\63\64\7\3\2\2\64\65\t\4\2\2\65\13\3\2\2\2\668\5\20\t"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\r\3\2\2\2;<\7\4\2\2"+
		"<=\7\6\2\2=>\7\17\2\2>\17\3\2\2\2?B\5\22\n\2@B\5\16\b\2A?\3\2\2\2A@\3"+
		"\2\2\2BC\3\2\2\2CD\t\4\2\2D\21\3\2\2\2EF\7\f\2\2FH\7\6\2\2GI\5\24\13\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KP\3\2\2\2LN\7\3\2\2MO\7\3\2\2"+
		"NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PL\3\2\2\2PQ\3\2\2\2Q\23\3\2\2\2RU\7\f\2"+
		"\2SU\5\2\2\2TR\3\2\2\2TS\3\2\2\2U\25\3\2\2\2\17\31\34 #(,\619AJNPT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}