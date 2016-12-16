// function 
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class Function extends AST {

    // we are implementing static scoping, so once
    // we declare a function during interpretation we
    // need to keep track of the scope were it was declared.
    private SymbolTableScope parentScope = null;

    public Function(ArgList formalParameters, Stmt body) {
        this.addAST(formalParameters);
        this.addAST(body);
    }

    public Function(Stmt body) {
        // formal parameter list is empty
        this.addAST(new ArgList());
        this.addAST(body);
    }

    public ArgList getFormalParameters() {
        return (ArgList) this.getAST(0);
    }

    public Stmt getFunctionBody() {
        return (Stmt) this.getAST(1);
    }

    public void setParentScope (SymbolTableScope parentScope) {
        this.parentScope = parentScope;
    }

    public SymbolTableScope getParentScope () {
        return this.parentScope;
    }
}
