package ast;

import java.util.ArrayList;

import parser.*;
import parser.SimpLanParser.BaseExpContext;
import parser.SimpLanParser.BoolValContext;
import parser.SimpLanParser.DecContext;
import parser.SimpLanParser.ExpContext;
import parser.SimpLanParser.FactorContext;
import parser.SimpLanParser.FunDecContext;
import parser.SimpLanParser.FunExpContext;
import parser.SimpLanParser.IdInitContext;
import parser.SimpLanParser.IfExpContext;
import parser.SimpLanParser.IntValContext;
import parser.SimpLanParser.LetInExpContext;
import parser.SimpLanParser.ParamContext;
import parser.SimpLanParser.SingleExpContext;
import parser.SimpLanParser.TermContext;
import parser.SimpLanParser.TypeContext;
import parser.SimpLanParser.VarExpContext;

public class SimpLanVisitorImpl extends SimpLanBaseVisitor<Node> {
	
	public Node visitLetInExp(LetInExpContext ctx) {
		
		//list of declarations in @res
		ArrayList<Node> declarations = new ArrayList<Node>();
		
		//visit all nodes corresponding to declarations inside the let context and store them in @declarations
		//notice that the ctx.let().dec() method returns a list, this is because of the use of * or + in the grammar
		//antlr detects this is a group and therefore returns a list
		for (DecContext dc : ctx.let().dec()){
			declarations.add( visit(dc) );
		}
		
		//visit exp context
		Node exp = visit( ctx.exp() );
		
		//build @res accordingly with the result of the visits to its content
		return new ProgLetInNode(declarations, exp) ;
	}
	
	public Node visitSingleExp(SingleExpContext ctx) {
		
		//simply return the result of the visit to the inner exp
		return new ProgNode(visit(ctx.exp()));
		
	}
	
	public Node visitIdInit(IdInitContext ctx) {
		//visit the type
		Node typeNode = visit(ctx.type());
		
		//visit the exp
		Node expNode = visit(ctx.exp());
		
		//build the varNode
		return new DecNode(ctx.ID().getText(), typeNode, expNode);
	}
	
	public Node visitFunDec(FunDecContext ctx) {
		
		//initialize @res with the visits to the type and its ID
		
		
		//add argument declarations
		//we are getting a shortcut here by constructing directly the ParNode
		//this could be done differently by visiting instead the VardecContext
		ArrayList<ParNode> _param = new ArrayList<ParNode>() ;
				
		for (ParamContext vc : ctx.param())
			_param.add( new ParNode(vc.ID().getText(), (Type) visit( vc.type() )) );
		
		//add body
		//create a list for the nested declarations
		ArrayList<Node> innerDec = new ArrayList<Node>();
		
		//check whether there are actually nested decs
		if(ctx.let() != null){
			//if there are visit each dec and add it to the @innerDec list
			for(DecContext dc : ctx.let().dec())
				innerDec.add(visit(dc));
		}
		
		//get the exp body
		Node exp = visit(ctx.exp());
		
		return new FunNode(ctx.ID().getText(), (Type) visit(ctx.type()), _param, innerDec, exp);
	}
	
	public Node visitType(TypeContext ctx) {
		if(ctx.getText().equals("int"))
			return new IntType();
		else return new BoolType();
	}
	
	public Node visitExp(ExpContext ctx) {
		if(ctx.right == null){ //it is a simple expression
			return visit( ctx.left );
		} else { //it is a binary expression: visit left and right
			if (ctx.plus != null)
				return new PlusNode(visit(ctx.left), visit(ctx.right));
			else return new MinusNode(visit(ctx.left), visit(ctx.right));
		}		
	}
	// Integer.parseInt(ctx.INTEGER().getText())
	
	public Node visitTerm(TermContext ctx) {
		if(ctx.right == null){ //it is a simple expression
			return visit( ctx.left );
		} else {
			//it is a binary expression: visit left and right
			if(ctx.mul != null)
				return new MultNode(visit(ctx.left), visit(ctx.right));
			else return new DivNode(visit(ctx.left), visit(ctx.right));
		}
	}
	
	public Node visitFactor(FactorContext ctx) {
		if(ctx.right == null){ //it is a simple expression
			return visit( ctx.left );
		}else{ //it is a binary expression, you should visit left and right
			return new EqualNode(visit(ctx.left), visit(ctx.right));
		}
	}

	public Node visitIntVal(IntValContext ctx) {
		// notice that this method is not actually a rule but a named production #intVal		
		//there is no need to perform a check here, the lexer ensures this text is an int
		return new IntNode(Integer.parseInt(ctx.INTEGER().getText()));
	}
	
	public Node visitBoolVal(BoolValContext ctx) {	
		//there is no need to perform a check here, the lexer ensures this text is a boolean
		return new BoolNode(Boolean.parseBoolean(ctx.getText())); 
	}
	
	public Node visitBaseExp(BaseExpContext ctx) {
		
		//this is actually nothing in the sense that for the ast the parenthesis are not relevant
		//the thing is that the structure of the ast will ensure the operational order by giving
		//a larger depth (closer to the leafs) to those expressions with higher importance
		
		//this is actually the default implementation for this method in the SimpLanBaseVisitor class
		//therefore it can be safely removed here
		
		return visit (ctx.exp());
	}
	
	public Node visitIfExp(IfExpContext ctx) {
		//visit the conditional, then the then branch, and then the else branch
		//notice once again the need of named terminals in the rule, this is because
		//we need to point to the right expression among the 3 possible ones in the rule
		
		Node condExp = visit (ctx.cond);
		
		Node thenExp = visit (ctx.thenBranch);
		
		Node elseExp = visit (ctx.elseBranch);
		
		return new IfNode(condExp, thenExp, elseExp);
	}
	
	public Node visitVarExp(VarExpContext ctx) {		
		//this corresponds to a variable access
		return new IdNode(ctx.ID().getText());
	}
	
	public Node visitFunExp(FunExpContext ctx) {
		//this corresponds to a function invocation
		//declare the result
		Node res;
		
		//get the invocation arguments
		ArrayList<Node> args = new ArrayList<Node>();
		
		for (ExpContext exp : ctx.exp())
			args.add(visit(exp));
		
		// this is ad-hoc for this project...
		if(ctx.ID().getText().equals("print"))
			res = new PrintNode(args.get(0));
		
		else
			//instantiate the invocation
			res = new CallNode(ctx.ID().getText(), args);
		
		return res;
	}
	
}
