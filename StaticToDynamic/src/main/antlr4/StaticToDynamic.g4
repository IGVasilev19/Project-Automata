grammar StaticToDynamic;


start : statement* EOF ;

statement
    : NUMERIC_TYPE ID '=' expr ';'   #numericDecl
    | STRING_TYPE ID '[' INTEGER? ']' '=' STRING ';'   #stringDecl
    ;

expr
    : expr ('*' | '/') expr   #mulDiv
    | expr ('+' | '-') expr   #addSub
    | '(' expr ')'            #parens
    | FLOAT                   #floatLit
    | INTEGER                 #intLit
    | ID                      #idRef
    ;

NUMERIC_TYPE : 'int' | 'float' | 'double' ;
STRING_TYPE  : 'char' ;

FLOAT   : [0-9]+ '.' [0-9]* ;
INTEGER : [0-9]+ ;
STRING  : '"' ~["\r\n]* '"' ;
ID : [A-Za-z_][A-Za-z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;

