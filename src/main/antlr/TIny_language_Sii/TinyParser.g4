parser grammar TinyParser;

options { tokenVocab = TinyLexer ;}

//SECTION: genreal

start:  COMPIL PROGNAMES LPAREN RPAREN LCURL varDec START descPgm  RCURL;//EOF c'est pour end of file jsp si on le garde ou pas

varDec: (typeDec listeDec SEMICOLON)*  ;//partie declaration des variables l* c'est pour dire quil peut declarer
                                        // plusieurs Types de variable.

listeDec:   IDENTIFIER | IDENTIFIER COMMA listeDec ;

typeDec:   (INTCOMPIL | FLOATCOMPIL | STRINGCOMPIL) ;


descPgm: operation | aff | conditions | loop | scan | print ;
aff : IDENTIFIER ASSIGNMENT operation | IDENTIFIER ASSIGNNMENT IDENTIFIER;

operation: (addition | multip | division | comparison) SEMICOLON   ;


addition:  IDENTIFIER ADD IDENTIFIER | ADD IDENTIFIER ;

multip: IDENTIFIER MULT IDENTIFER | MULT IDENTIFIER;

division: IDENTIFIER DIV operation;

comparison : ;


conditions:     ;
loop:   ;
scan:   ;
print:  ;
