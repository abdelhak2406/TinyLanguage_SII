parser grammar TinyParser;
//TODO: ajouter test pour les comparaision
options { tokenVocab = TinyLexer ;}

//SECTION: genreal

start:  COMPIL PROGNAMES LPAREN RPAREN LCURL varDec START descPgm  RCURL;//EOF c'est pour end of file jsp si on le garde ou pas

varDec: (typeDec listeDec SEMICOLON)*  ;//partie declaration des variables l* c'est pour dire quil peut declarer
                                        // plusieurs Types de variable.

listeDec:   IDENTIFIER | IDENTIFIER COMMA listeDec ;

typeDec:   (INTCOMPIL | FLOATCOMPIL | STRINGCOMPIL) ;


descPgm: operation* | aff* | conditions* | loop* | scan* | print* ;

aff : IDENTIFIER ASSIGNMENT (operation |  IDENTIFIER | INTEGER | FLOAT);

operation: (addition | multip | division | comparison) SEMICOLON    ;

addition:  (IDENTIFIER | INTEGER | FLOAT ) ADD (IDENTIFIER |INTEGER | FLOAT )
            | (IDENTIFIER | INTEGER | FLOAT ) ADD addition
            ;

multip: (IDENTIFIER | INTEGER | FLOAT ) MULT (IDENTIFIER | INTEGER | FLOAT ) | MULT IDENTIFIER multip;

division: IDENTIFIER DIV operation;

comparison : ;

conditions:     ;
loop:   ;
scan:  SCANCOMPIL LPAREN IDENTIFIER RPAREN ;
print: PRINTCOMPIL LPAREN  TEXT RPAREN ;
