parser grammar TinyParser;
//TODO: ajouter test pour les comparaision
options { tokenVocab = TinyLexer ;}

//SECTION: genreal

start:   PROGNAMES LPAREN RPAREN LCURL varDec START descPgm  RCURL EOF;//EOF c'est pour end of file jsp si on le garde ou pas

varDec: (typeDec listeDec SEMICOLON)*  ;//partie declaration des variables l* c'est pour dire quil peut declarer
                                        // plusieurs Types de variable.

listeDec:   IDENTIFIER | IDENTIFIER COMMA listeDec ;

typeDec:   (INTCOMPIL | FLOATCOMPIL | STRINGCOMPIL) ;


descPgm: (aff | comparison | arithOperation  | conditions | loop | scan | print)*;

operande : IDENTIFIER
         | INTEGER
         | FLOAT
         ;

aff : IDENTIFIER ASSIGNMENT (arithOperation SEMICOLON| operande SEMICOLON ) ;

//arithOperation 1 2 sont fait pour gérer la priorité.
arithOperation  : LPAREN arithOperation RPAREN
                | arithOperation DIV (operande|arithOperation)
                | arithOperation MULT (operande|arithOperation)
                | arithOperation ADD (operande|arithOperation)
                | arithOperation SUB (operande|arithOperation)
                | operande
                ;
//---------------------------------------------------------

opComparison    : RANGLE
                | LANGLE
                | EQEQ
                | EXCL_EQ
                ;
comparison : LPAREN (operande opComparison operande) RPAREN ;

conditions: IF comparison THEN LCURL descPgm RCURL els    ;//les if imbrique n'existe pas
els : ELSE LCURL descPgm RCURL
    |
    ;

//----------------------------------------------------------

loop: DO LCURL descPgm RCURL WHILE  comparison  ;
//----------------------------------------------------------


scanInputs :  (IDENTIFIER COMMA)* IDENTIFIER;
scan:  SCANCOMPIL LPAREN scanInputs  RPAREN SEMICOLON ;

//TODO: ici on doit detecter  si le texte contient un identificateur ,! on doit gerer sa en semantique @hind
text: IDENTIFIER* |TEXT ;
//text : IDENTIFIER* | TEXT*;
print: PRINTCOMPIL  LPAREN text  RPAREN SEMICOLON;//je pense que sa doit etre traite en semantique
                        //on vas regarder si il un des identifica
                        // ce que je veut obtenir c'est le fait de reconnnaitre une

