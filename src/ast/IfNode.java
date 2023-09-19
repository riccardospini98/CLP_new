package ast;

import java.util.ArrayList;

import evaluator.SimpLanlib;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

public class IfNode implements Node {
	private final Node guard ;
	private final ArrayList<Node> thenbranch ;
	private final ArrayList<Node> elsebranch ;
  
	public IfNode (Node _guard, ArrayList<Node> _thenbranch, ArrayList<Node> _elsebranch) {
    	guard = _guard ;
    	thenbranch = _thenbranch ;
    	elsebranch = _elsebranch ;
  }
  
   @Override
  public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
	  ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
	  
	  errors.addAll(guard.checkSemantics(ST, _nesting));
	  for(Node then: thenbranch){
		  errors.addAll(then.checkSemantics(ST, _nesting));
	  }
	  errors.addAll(then.checkSemantics(ST, _nesting));
	  errors.addAll(elsebranch.checkSemantics(ST, _nesting));

	  return errors;
  }
  
	public Type typeCheck() {
		if (guard.typeCheck() instanceof BoolType) {
			Type thenstm = thenbranch.typeCheck() ;
			Type elsestm = elsebranch.typeCheck() ;
			if (thenstm.getClass().equals(elsestm.getClass()))
        		return thenstm;
			else {
        		System.out.println("Type Error: incompatible types in then and else branches");
        		return new ErrorType() ;	
			}
		} else {
			System.out.println("Type Error: non boolean condition in if");
			return new ErrorType() ;
		}   
	}
  
  	public String codeGeneration() {
  		String lthen = SimpLanlib.freshLabel(); 
  		String lend = SimpLanlib.freshLabel();
  		return guard.codeGeneration() +
			 "storei T1 1 \n" +
			 "beq A0 T1 "+ lthen + "\n" +			  
			 elsebranch.codeGeneration() +
			 "b " + lend + "\n" +
			 lthen + ":\n" +
			 thenbranch.codeGeneration() +
	         lend + ":\n" ; 
  	}

  	public String toPrint(String s) {
	    return s+"If\n" + guard.toPrint(s+"  ") + thenbranch.toPrint(s+"  ")  + elsebranch.toPrint(s+"  ") ; 
	}
	  
}  