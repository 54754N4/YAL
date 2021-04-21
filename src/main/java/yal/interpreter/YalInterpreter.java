package yal.interpreter;

import org.antlr.v4.runtime.CharStreams;

import ast.AST;
import lib.Antlr;
import yal.generated.YalLexer;
import yal.generated.YalParser;
import yal.generated.YalParserBaseVisitor;

public class YalInterpreter extends YalParserBaseVisitor<AST> {
	
	
	
	public static void main(String[] args) throws Exception {
		String code = "#!shebang line ... just fucking parse plz\r\n";
		AST result = Antlr.visit(
				CharStreams.fromString(code), 
				YalLexer.class, 
				YalParser.class, 
				YalInterpreter.class,
				"program");
		System.out.println(result);
	}
}
