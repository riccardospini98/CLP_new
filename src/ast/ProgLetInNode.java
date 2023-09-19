package ast;
import java.util.ArrayList;
import java.util.HashMap;

import evaluator.SimpLanlib;
import semanticanalysis.STentry;
import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;

public class ProgLetInNode implements Node {
	
	private ArrayList<Node> dec ;
	private Node exp ;
	private int nesting ;
  
	public ProgLetInNode (ArrayList<Node> _dec, Node _exp) {
		dec = _dec ;
		exp = _exp ;
	}
  
	public ArrayList<SemanticError> checkSemantics(SymbolTable ST, int _nesting) {
		  nesting = _nesting + 1 ;
	      HashMap<String,STentry> H = new HashMap<String, STentry>();
	      ST.add(H);
	      
	      //declare resulting list
	      ArrayList<SemanticError> errors = new ArrayList<SemanticError>();
	      
	      for (Node d : dec) {
	    	  	errors.addAll(d.checkSemantics(ST, nesting)) ; // nella sintassi non ci sono annidamenti di let
	      }												  // ad eccezione delle funzioni ...
	      
	      //check semantics in the exp body
	      errors.addAll(exp.checkSemantics(ST, nesting)) ;
	      
	      //clean the scope, we are leaving a let scope
	      ST.remove();
	      
	      //return the result
	      return errors;
	}
	public Type typeCheck () {
		for (Node d: dec)
		    d.typeCheck();
		return exp.typeCheck();
	}
		  
	public String codeGeneration() {
		String declCode="";
		for (Node d: dec)
				    declCode += d.codeGeneration();
		return  "move SP FP  \n"
				+ "pushr FP \n"
				+ "move SP AL \n"
				+ "pushr AL \n"
				+ declCode 
				+ exp.codeGeneration() 
				+ "halt\n" +
				SimpLanlib.getCode();
	} 
		  
	public String toPrint(String s) {
		String declstr="";
		for (Node d : dec)
			declstr += d.toPrint(s+"\t");
		return s+"ProgLetIn\n" + declstr + "\n" + exp.toPrint(s+"\t") ; 
	}
     
}  