/***
	Based heavily on the SIMPLE3INTERPRETER code given by Lutz Hamel,
	this is basically a "dumbed down" version that removes all Function
	capability (since it's non-existent in lifescript.)
									***/
public class SymbolTable {

    private SymbolTableScope globalScope = new SymbolTableScope(null);
    private SymbolTableScope currentScope = globalScope;

    public SymbolTableScope getCurrentScope() {
	return this.currentScope;
    }

    public void setCurrentScope(SymbolTableScope scope) {
	this.currentScope = scope;
    }

    public SymbolTableScope  pushScope() {
	currentScope = new SymbolTableScope(currentScope);
	return currentScope;
    }

    public SymbolTableScope popScope() {
	// go up one entry 
	currentScope = currentScope.getParentScope();
	return currentScope;
    }

    public void declareVariable(String symbol, Double value) {
	// check that the current symbol was not already declared in the
	// current scope, if so then we have an error
	if (currentScope.lookupSymbol(symbol) != null) {
	    System.err.println("Error: redclaring variable "+symbol+".");
	    System.exit(1);
	}
	// all clear...enter the symbol into the scope
	currentScope.enterVariable(symbol,value);
    }

    public Double lookupVariable(String symbol) {
	// lookup the symbol in the current scope
	SymbolTableScope lookupScope = currentScope;
	Object value = lookupScope.lookupSymbol(symbol);

	// if not in current scope search up the stack
	while (value == null) {
	    lookupScope = lookupScope.getParentScope();
	    if (lookupScope == null) {
		// no parent scope, symbol not found
		System.err.println("Error (lookup): variable '"+symbol+"' not declared.");
		// could do some more intelligent recovery here.
		System.exit(1);
		return null;
	    }
	    value = lookupScope.lookupSymbol(symbol);
	}
	// all done, return the value, guaranteed to be here
	// by the nature of our search procedure -- now check 
	// that it is a variable
	return (Double) value;
    }

    public void updateVariable(String symbol, Double initValue) throws Exception{
	// find the scope where the symbol was declared
	SymbolTableScope lookupScope = currentScope;
	Object value = lookupScope.lookupSymbol(symbol);

	// if not in current scope search up the stack
	while (value == null) {
	    lookupScope = lookupScope.getParentScope();
	    if (lookupScope == null) {
		// no parent scope, symbol not found
//		System.err.println("Error (update): variable '"+symbol+"' not declared.");
		// could do some more intelligent recovery here.
//		System.exit(1);
		throw new Exception();
	    }
	    value = lookupScope.lookupSymbol(symbol);
	}
	// we found a scope where symbol is defined, update it
	// make sure that it is a variable
	lookupScope.enterVariable(symbol,initValue);
    }

}
