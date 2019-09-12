grammar Functions;

dec: 'var' ID '=' expr #decVar
   | 'func' ID '(' ids ')' expr #decFunc
   ;

expr: expr '+' muldiv #exprSoma
    | expr '-' muldiv #exprSub
    | muldiv	      #exprMuldiv
    ;

muldiv: muldiv '*' paren #muldivMul
      | muldiv '/' paren #muldivDiv
      | paren		 #muldivParen
      ;

func: ID '(' ids ')' #func

ids: ids ',' ids
   | ID 
   ;

paren: ID	#parenID
   | NUM	#parenNum
   | func	#parenFunc
   | '(' expr ')' #parenParen
   ;


ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
