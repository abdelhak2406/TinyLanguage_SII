lexer grammar TinyLexer;
//TODO: manage comments
//TODO: gerer le nom du pgm qui commence par une majuscule

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


//TODO: see if you wanna keep them or not
DOT: '.';
COMMA: ',';
LPAREN: '(' ;//possiblemenet ajouter -> pushMode(Inside);
RPAREN: ')';
LSQUARE: '[' ;//possiblement ajouter -> pushMode(Inside);
RSQUARE: ']';
LCURL: '{' ;//possiblement ajouter -> pushMode(DEFAULT_MODE);
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

PROGNAMES : [A-Z][_A-Za-z]+ ;//commence par une majuscule puis peut contenir maj min ou _;
IDENTIFIER: [A-Za-z][\w];//Commence par lettre suivi de lettre ou chiffres

//Section : literals


