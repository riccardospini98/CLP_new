package mainPackage;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import parser.SimpLanLexer;
import parser.SimpLanParser;

import semanticanalysis.SemanticError;
import semanticanalysis.SymbolTable;
import parser.SVMLexer;
import parser.SVMParser;
import ast.SimpLanVisitorImpl;
import evaluator.ExecuteVM;
import ast.ErrorType;
import ast.Node;
import ast.SVMVisitorImpl;

public class Test {
	public static void main(String[] args) throws Exception {

		String fileName = "prova.simplan";

		FileInputStream is = new FileInputStream(fileName);
		ANTLRInputStream input = new ANTLRInputStream(is);
		SimpLanLexer lexer = new SimpLanLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		SimpLanParser parser = new SimpLanParser(tokens);
		SimpLanVisitorImpl visitor = new SimpLanVisitorImpl();
		Node ast = visitor.visit(parser.prog()); //generazione AST 
			
		//SIMPLE CHECK FOR LEXER ERRORS
		if (lexer.lexicalErrors > 0){
			System.out.println("The program was not in the right format. Exiting the compilation process now");
		} else {
			SymbolTable ST = new SymbolTable();	
			ArrayList<SemanticError> errors = ast.checkSemantics(ST, 0);
			if(errors.size()>0){
				System.out.println("You had: " + errors.size() + " errors:");
				for(SemanticError e : errors)
					System.out.println("\t" + e);
			} else {
				System.out.println("Visualizing AST...");
				System.out.println(ast.toPrint(""));

				Node type = ast.typeCheck(); //type-checking bottom-up 
				if (type instanceof ErrorType)
					System.out.println("Type checking is WRONG!");
				else 
					System.out.println(type.toPrint("Type checking ok! Type of the program is: "));


				// CODE GENERATION  prova.SimpLan.asm
				String code=ast.codeGeneration(); 
				BufferedWriter out = new BufferedWriter(new FileWriter(fileName+".asm")); 
				out.write(code);
				out.close(); 
				System.out.println("Code generated! Assembling and running generated code.");

				FileInputStream isASM = new FileInputStream(fileName+".asm");
				ANTLRInputStream inputASM = new ANTLRInputStream(isASM);
				SVMLexer lexerASM = new SVMLexer(inputASM);
				CommonTokenStream tokensASM = new CommonTokenStream(lexerASM);
				SVMParser parserASM = new SVMParser(tokensASM);

				//parserASM.assembly();

				SVMVisitorImpl visitorSVM = new SVMVisitorImpl();
				visitorSVM.visit(parserASM.assembly()); 

				//System.out.println("You had: "+lexerASM.lexicalErrors+" lexical errors and "+parserASM.getNumberOfSyntaxErrors()+" syntax errors.");
				//if (lexerASM.lexicalErrors>0 || parserASM.getNumberOfSyntaxErrors()>0) System.exit(1);

				System.out.println("Starting Virtual Machine...");
				ExecuteVM vm = new ExecuteVM(visitorSVM.code);
				vm.cpu();
				}
		}


	}
}
