grammar Calculator;

prog: stat+;

stat: expr NEWLINE              # Expression
    | ID '=' expr NEWLINE       # Assign
    | NEWLINE                   # Empty
    ;

expr: expr op=('*' | '/') expr  # MulDiv
    | expr op=('+' | '-') expr  # AddSub
    | number                    # num
    | ID                        # id
    | '(' expr ')'              # parens
    ;

number
    : INT | decimal
    ;

decimal
    : INT DOT INT
    ;

INT     : [0-9]+ ;
DOT     : '.';
ID      : [a-zA-Z]+ ;
NEWLINE : '\r'? '\n' ;

MUL     : '*' ;
DIV     : '/' ;
Add     : '+' ;
SUB     : '-' ;
