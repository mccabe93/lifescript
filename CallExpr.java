// call expression
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class CallExpr extends Expr {

    private String functionName;

    // constructor for function calls with 
    // no parameters
    public CallExpr(String v) {
        functionName = v;
    }

    public CallExpr(String v, ArgList a) {
        functionName = v;
        // actual parameter list
        this.addAST(a);
    }

    public String getFunctionName() {
        return functionName;
    }

    public ArgList getActualParameters() {
        return (ArgList) getAST(0);
    }
}