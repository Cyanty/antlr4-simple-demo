grammar PromptTemplate;

template: segment+ ;

segment: variable | text ;

variable: LBRACE ID RBRACE ;

text: TEXT_CHUNK+ ;

LBRACE: '{' ;

RBRACE: '}' ;

ID: [a-zA-Z_] [a-zA-Z0-9_]* ;

TEXT_CHUNK: ~[{}] + ;
