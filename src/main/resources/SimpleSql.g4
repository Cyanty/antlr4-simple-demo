grammar SimpleSql;

statement: (insertStatement | selectStatement | updateStatement | deleteStatement) ';'? ;

insertStatement:
    INSERT INTO tableName=ID '(' columns=idList ')' VALUES '(' values=valueList ')'
    ;

selectStatement:
    SELECT columns=selectList FROM tableName=ID (WHERE whereClause)?
    ;

updateStatement:
    UPDATE tableName=ID SET assignments (WHERE whereClause)?
    ;

deleteStatement:
    DELETE FROM tableName=ID (WHERE whereClause)?
    ;


idList: ID (',' ID)* ;

valueList: value (',' value)* ;

selectList: '*' | idList ;

assignments: assignment (',' assignment)* ;
assignment: ID '=' value ;

whereClause: expression ;

expression:
    left=ID op=comparisonOperator right=value
    ;

value:
    STRING
    | NUMBER
    ;

comparisonOperator: '=' | '!=' | '>' | '<' | '>=' | '<=' ;

INSERT: I N S E R T ;
INTO: I N T O ;
VALUES: V A L U E S ;
SELECT: S E L E C T ;
FROM: F R O M ;
WHERE: W H E R E ;
UPDATE: U P D A T E ;
SET: S E T ;
DELETE: D E L E T E ;

ID: [a-zA-Z_] [a-zA-Z0-9_]* ;               // 标识符，如表名、列名
NUMBER: [0-9]+ ('.' [0-9]+)? ;              // 数字，支持整数和小数
STRING: '\'' ( ~['\\] | '\\' . )* '\'' ;    // 字符串，例如 'hello'

// 忽略空格、换行等
WS: [ \t\r\n]+ -> skip ;

fragment A : [Aa] ;
fragment B : [Bb] ;
fragment C : [Cc] ;
fragment D : [Dd] ;
fragment E : [Ee] ;
fragment F : [Ff] ;
fragment G : [Gg] ;
fragment H : [Hh] ;
fragment I : [Ii] ;
fragment J : [Jj] ;
fragment K : [Kk] ;
fragment L : [Ll] ;
fragment M : [Mm] ;
fragment N : [Nn] ;
fragment O : [Oo] ;
fragment P : [Pp] ;
fragment Q : [Qq] ;
fragment R : [Rr] ;
fragment S : [Ss] ;
fragment T : [Tt] ;
fragment U : [Uu] ;
fragment V : [Vv] ;
fragment W : [Ww] ;
fragment X : [Xx] ;
fragment Y : [Yy] ;
fragment Z : [Zz] ;
