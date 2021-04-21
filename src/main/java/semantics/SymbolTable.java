package semantics;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* Each scope has his own SymTab */
public class SymbolTable {
	private Map<String, Symbol> globalScope;
	private Stack<Map<String, Symbol>> symtab;
	private int level;
	
	// Global scope always present initially
	public SymbolTable() {
		symtab = new Stack<>();
		globalScope = createScope();
		symtab.push(globalScope);
		level = 0;
	}
	
	private Map<String, Symbol> createScope() {
		return new HashMap<>();
	}
	
	public SymbolTable pushScope() {
		symtab.push(createScope());
		level++;
		return this;
	}
	
	public Map<String, Symbol> popScope() {
		if (symtab.size() == 1)
			throw new IllegalStateException("Can't pop global scope symbol table");
		level--;
		return symtab.pop();
	}
	
	public Symbol lookup(String name) {
		
	}
}
