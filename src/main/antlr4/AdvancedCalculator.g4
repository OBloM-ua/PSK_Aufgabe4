grammar AdvancedCalculator;

// TODO Erweitern Sie die Grammatik

// Ein Programm besteht aus vielen Statements
// Ein Statement pro Zeile
// Ein Statement kann sein
// Eine Zuweisung (t = …)
// Eine Expression (1 + 2 * s / u - 1)


program     : // ...
            ;

expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | NUMBER                                # num
            ;

NUMBER  :   DIGIT* '.' DIGIT+
        |   DIGIT+
        ;
DIGIT   :   [0-9];
NEWLINE :   '\r'? '\n' ;
WS      :   [ \t]+ -> skip
        ;
