grammar StaticToDynamic;


start : statement* EOF ;

statement
    : 'struct' ID '{' structMember+ '}' ';'              #structDef
    | 'struct' ID ID ('=' '{' argList? '}')? ';'         #structDecl
    | NUMERIC_TYPE ID '=' expr ';'                       #numericDecl
    | STRING_TYPE ID '[' INTEGER? ']' '=' STRING ';'     #stringDecl
    | 'for' '(' forInit? ';' expr? ';' forUpdate? ')' block   #forStmt
    | ID '.' ID '=' expr ';'                             #memberAssign
    | NUMERIC_TYPE? ID '=' expr ';'                      #assignStmt
    ;

structMember
    : NUMERIC_TYPE ID ';'
    ;

argList
    : expr (',' expr)*
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
    : expr '.' ID                                       #memberRef
    | expr ('*' | '/') expr                             #mulDiv
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
