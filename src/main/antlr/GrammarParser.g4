parser grammar GrammarParser;
options {
    tokenVocab = GrammarLexer;
}

terminal: regex | String | Eps;

regex: Tilda? (Parens | Brackets) (Plus | Star)?;

grammarInfo: initAttributes? Newline* grammarRules?;

initAttributes: initAttribute+;

initAttribute: Attribute (Newline | EOF);

grammarRules: grammarRule+;

skipRule: Brackets Arrow Skip;

grammarRule: (fold | skipRule) (Newline | EOF);

fold: Node Arrow (ruleChild)+ (Attribute Attribute?)?;

ruleChild: Node | terminal;
