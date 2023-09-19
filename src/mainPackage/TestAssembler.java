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

public class TestAssembler {
	public static void main(String[] args) throws Exception {

		String fileName = "/prova.simplan.asm";


				FileInputStream isASM = new FileInputStream(fileName);
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
