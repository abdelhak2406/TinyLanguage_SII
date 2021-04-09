lexer grammar TinyLexer;
//TODO: ajouter les types: reel int
tokens{SUB,ADD,MULT,DIV,LAE,RANGLE,EQEQ,EXCL_EQ,ASSIGNMENT,DOT,COMMA,LPAREN,RPAREN,LSQUARE,RSQUARE,LCURL,RCURL,
COMPIL,START,INTCOMPIL,FLOATCOMPIL,STRINGCOMPIL,IF,THEN,ELSE,DO,WHILE,SCANCOMPIL,PRINTCOMPIL,WHITESPACE,PROGNAMES,IDENTIFIER,NL,INTEGER,FLOAT,TEXT}

DelimitedComment
        : '/*' ( DelimitedComment | . )*? '*/'
          -> skip
        ;
LineComment
        : '//' ~[\r\n]*
        -> skip
        ;

//Section: SeparatorsAndOperations
SUB: '-';
ADD: '+';
MULT: '*';
DIV: '/';
LANGLE: '<';
RANGLE: '>';
EQEQ: '==';
EXCL_EQ: '!=';
ASSIGNMENT: '=';
NL: ('\n' | '\r' '\n'?) -> skip;

//TODO: see if you wanna keep them or not
//PONCTUATIONS
DOT: '.';
COMMA: ',';
LPAREN: '(' ;//possiblemenet ajouter -> pushMode(Inside);
RPAREN: ')';
LSQUARE: '[' ;//possiblement ajouter -> pushMode(Inside);
RSQUARE: ']';
LCURL: '{' ;//possiblement ajouter -> pushMode(DEFAULT_MODE);
RCURL: '}';
SEMICOLON: ';';

//----------------



//Section: Keywords
COMPIL: 'compil';
START:  'start';
INTCOMPIL:  'intCompil';
FLOATCOMPIL:'floatCompil';
STRINGCOMPIL: 'StringCompil';
IF :'if';
THEN:'then';
ELSE:'else';
DO:'do';
WHILE:'while';
SCANCOMPIL:'scanCompil';
PRINTCOMPIL:'printCompil';





//Section : Identifiers
WHITESPACE  : ' ' -> skip;
// le seul endoit ou on peu avoir un progname c'est au debut avant le mot clé compil, donc il suffit de perciser qu'il a compil avant
// j'ai essyer de le faire au niveau du parser (COMPIL PROGNAMES ..) sauf que sa cree une confusion entre les identifier et les prognames.

PROGNAMES : COMPIL WHITESPACE [A-Z][_A-Za-z]+ ;//commence par une majuscule puis peut contenir maj min ou _;

IDENTIFIER: [A-Za-z][0-9A-Za-z]*;//Commence par lettre suivi de lettre ou chiffres
/*INTPOS : [+]?[0-9]+;
INTNEG : [-]?[0-9]+;*/
INTEGER : [-]?([1-9][0-9]*|'0');
FLOAT : [-]?([0-9]+|'0')DOT([1-9][0-9]*|'0');
TEXT: ~ ')';// li'dee c'etait d'utilier sa dans Print et scan, mais puisqu'a chaque fois sa ne reconaissait
                // que les identifiers, j'ai decider d'inclure text dans le parser.et du coup j'ai enlevé ça
//Section : literals


