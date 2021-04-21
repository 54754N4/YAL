package lib;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Antlr {
	// Creates lexer + parser and starts at chosen production rule
	public static ParseTree useParser(
		CharStream source, 
		Class<? extends Lexer> lclass, 
		Class<? extends Parser> pclass, 
		String startRule
	) throws Exception {
		Lexer lexer = lclass.getConstructor(CharStream.class)
				.newInstance(source);
		Parser parser = pclass.getConstructor(TokenStream.class)
			.newInstance(new CommonTokenStream(lexer));
		return (ParseTree) parser.getClass()
				.getDeclaredMethod(startRule)
				.invoke(parser);
	}
	
	// Walks a listener given specified lexer/parser/listener classes
	public static <T extends ParseTreeListener> T walk(
		CharStream source,
		Class<? extends Lexer> lclass,
		Class<? extends Parser> pclass,
		String startRule,
		T listener
	) throws Exception {
		new ParseTreeWalker()
			.walk(listener, useParser(source, lclass, pclass, startRule));
		return listener;
	}
	
	// Visits a visitor using specified lexer/parser/visitor classes 
	public static <T> T visit(
		CharStream source,
		Class<? extends Lexer> lclass,
		Class<? extends Parser> pclass,
		Class<? extends AbstractParseTreeVisitor<T>> iclass,
		String startRule
	) throws Exception {
		return iclass.getDeclaredConstructor()
				.newInstance()
				.visit(useParser(source, lclass, pclass, startRule));
	}
}
