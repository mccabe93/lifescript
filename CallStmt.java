// call statement
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class CallStmt extends Stmt {

    private String functionName;

    // constructor for function calls with 
    // no parameters
    public CallStmt(String v) {
        functionName = v;
        // actual parameter list - empty
        this.addAST(new ArgList());
    }

    public CallStmt(String v, ArgList a) {
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