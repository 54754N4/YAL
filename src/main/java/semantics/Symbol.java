package semantics;

public class Symbol {
	public final String name;
	public Symbol type;
	
	public Symbol(String name, Symbol type) {
		this.name = name;
		this.type = type;
	}
	
	public Symbol(String name) {
		this(name, this);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
