// function declaration statement
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class FuncDeclStmt extends Stmt {

    private String name;

    public FuncDeclStmt(String name, Function f) {
        this.name = name;
        this.addAST(f);
    }

    public String Name() {
        return name;
    }

    public Function Value() {
        return (Function) this.getAST(0);
    }
}