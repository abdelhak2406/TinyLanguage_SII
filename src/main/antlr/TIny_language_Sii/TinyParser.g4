parser grammar TinyParser;
//TODO: ajouter test pour les comparaision
options { tokenVocab = TinyLexer ;}

//SECTION: genreal

start:   PROGNAMES LPAREN RPAREN LCURL varDec START descPgm  RCURL EOF;//EOF c'est pour end of file jsp si on le garde ou pas

varDec: (typeDec listeDec SEMICOLON)*  ;//partie declaration des variables l* c'est pour dire quil peut declarer
                                        // plusieurs Types de variable.

listeDec:   IDENTIFIER | IDENTIFIER COMMA listeDec ;

typeDec:   (INTCOMPIL | FLOATCOMPIL | STRINGCOMPIL) ;


descPgm: (aff | comparison | arithOperation | conditions | loop | scan | print)*;

operande : IDENTIFIER | INTEGER | FLOAT;

aff : IDENTIFIER ASSIGNMENT (arithOperation | operande SEMICOLON ) ;

arithOperation  : arithOperation(
                multip
                | division
                | substraction
                | addition
                | operande
                )+SEMICOLON
                ;


multip:  MULT
      ;/*(operande) MULT operande | MULT IDENTIFIER multip;*/

division:   DIV
        ;
                                 /*IDENTIFIER DIV arithOperation;*/

addition:   ADD

            ;

substraction: SUB
              ;
comparison : LPAREN (operande RANGLE operande) RPAREN ;

conditions: IF comparison THEN LCURL descPgm RCURL else*    ;//les if imbrique n'existe pas
else: RCURL descPgm LCURL ;


loop: DO LCURL descPgm RCURL WHILE LPAREN comparison  ;

scanInputs :  (IDENTIFIER COMMA)* IDENTIFIER;
scan:  SCANCOMPIL LPAREN scanInputs  RPAREN SEMICOLON ;

//TODO: ici on doit detecter  si le texte contient un identificateur ,! on doit gerer sa en semantique @hind
text: IDENTIFIER* |TEXT ;
//text : IDENTIFIER* | TEXT*;
print: PRINTCOMPIL  LPAREN text  RPAREN SEMICOLON;//je pense que sa doit etre traite en semantique
                        //on vas regarder si il un des identifica
                        // ce que je veut obtenir c'est le fait de reconnnaitre une