grammar SimpLan;

@lexer::members {
   //there is a much better way to do this, check the ANTLR guide
   public int lexicalErrors=0;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
  
prog   : exp ';'                 #singleExp
       | let exp ';'             #letInExp
       ;

let    : 'let' (dec ';')+ 'in' ;

dec    : type ID '=' exp                                         #idInit
       | type ID '(' ( param ( ',' param)* )? ')' '=' (let)? exp     #funDec
       ;
         
param  : type ID ;

type   : 'int'  
       | 'bool' 
       ;  
    
exp    :  ('-')? left=term ((plus='+' | sub='-') right=exp)?
       ;
   
term   : left=factor ((mul='*' | div='/') right=term)?
       ;
   
factor : left=value ('==' right=value)?
       ;     
   
value  :  INTEGER							#intVal
       | ('true' | 'false')                  #boolVal
       | '(' exp ')'                      	#baseExp
       | 'if' cond=exp 'then' '{' thenBranch=exp '}' 'else' '{' elseBranch=exp '}'  #ifExp
       | ID                                  #varExp
       | ID '(' (exp (',' exp)* )? ')'       #funExp
       ; 
 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

//Numbers
fragment DIGIT : '0'..'9';    
INTEGER       : DIGIT+;

//IDs
fragment CHAR  : 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//ESCAPE SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS    : '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;

 //VERY SIMPLISTIC ERROR CHECK FOR THE LEXING PROCESS, THE OUTPUT GOES DIRECTLY TO THE TERMINAL
 //THIS IS WRONG!!!!
ERR     : . { System.out.println("Invalid char: "+ getText()); lexicalErrors++; } -> channel(HIDDEN); 
