import java.util.*;
/***
	Based heavily on the SIMPLE3INTERPRETER code given by Lutz Hamel,
	this is basically a "dumbed down" version that removes all Function
	capability (since it's non-existent in lifescript.)
									***/
public class SymbolTableScope {
    // scope stack is built as a linked list
    private SymbolTableScope parentScope = null;

    private HashMap<String,Double> value = new HashMap<String,Double>();

    public SymbolTableScope(SymbolTableScope parentScope) {
	this.parentScope = parentScope;
    }

    public SymbolTableScope getParentScope() {
	return parentScope;
    }

    public void setParentScope(SymbolTableScope parentScope) {
	this.parentScope = parentScope;
    }

    public void enterVariable(String name, Double value) {
	this.value.put(name,value);
    }

    public Object lookupSymbol(String name) {
	return value.get(name);
    }
}
