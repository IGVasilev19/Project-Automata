grammar StaticToDynamic;


start : statement* EOF ;

statement
    : NUMERIC_TYPE ID '=' expr ';'                       #numericDecl
    | STRING_TYPE ID '[' INTEGER? ']' '=' STRING ';'     #stringDecl
    | 'for' '(' forInit? ';' expr? ';' forUpdate? ')' block   #forStmt
    | NUMERIC_TYPE? ID '=' expr ';'                      #assignStmt
    ;

forInit
    : NUMERIC_TYPE? ID '=' expr
    ;

forUpdate
    : ID '++'        #postInc
    | ID '--'        #postDec
    | ID '+=' expr   #plusEq
    | ID '-=' expr   #minusEq
    | ID '=' expr    #updateAssign
    ;

block
    : '{' statement* '}'
    | statement
    ;

expr
    : expr ('*' | '/') expr                             #mulDiv
    | expr ('+' | '-') expr                             #addSub
    | expr ('<' | '<=' | '>' | '>=' | '==' | '!=') expr #compare
    | '(' expr ')'                                      #parens
    | FLOAT                                             #floatLit
    | INTEGER                                           #intLit
    | ID                                                #idRef
    ;

NUMERIC_TYPE : 'int' | 'float' | 'double' ;
STRING_TYPE  : 'char' ;

FLOAT   : [0-9]+ '.' [0-9]* ;
INTEGER : [0-9]+ ;
STRING  : '"' ~["\r\n]* '"' ;
ID : [A-Za-z_][A-Za-z0-9_]* ;

WS : [ \t\r\n]+ -> skip ;
