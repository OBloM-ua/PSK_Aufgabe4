grammar AdvancedCalculator;

// TODO Erweitern Sie die Grammatik

// Ein Programm besteht aus vielen Statements
// Ein Statement pro Zeile
// Ein Statement kann sein
// Eine Zuweisung (t = …)
// Eine Expression (1 + 2 * s / u - 1)


program     : statment+;

statment    : assignment NEWLINE
            | expression+
            ;


expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | NUMBER                                # num
            | IDENTIFIER                            # variable
            ;


assignment: IDENTIFIER '=' expression;


NUMBER  :   DIGIT* '.' DIGIT+
        |   DIGIT+
        ;
IDENTIFIER: [a-z][a-zA-Z0-9]* ;
DIGIT   :   [0-9];
NEWLINE :   '\r'? '\n' ;
WS      :   [ \t]+ -> skip
        ;
