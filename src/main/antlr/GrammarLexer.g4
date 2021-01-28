lexer grammar GrammarLexer;

Attribute: '{' StringWithoutNewlines '}';

Brackets: '[' StringWithoutNewlines ']';

Parens: '(' StringWithoutNewlines ')';

Arrow: '->';

Eps: '\\eps';

Tilda: '~';

Plus: '+';

Star: '*';

String: '\'' ~('\n' | '\r' | '\'')+ '\'';

Node: [A-Z] [A-Z_0-9]*;

fragment StringWithoutNewlines: ~('\n' | '\r' | '{')*;

Whitespace: [ \t]+ -> skip;

Newline: ('\r' | '\n');

Skip: 'skip';