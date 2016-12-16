// argument list
// Copyright 2013 Lutz Hamel
// Distributed under the terms of the GNU General Public License (GPL)

public class ArgList extends AST {

    public ArgList() {
    }

    public ArgList(VarExpr e) {
        this.addAST(e);
    }

    public ArgList(Expr e) {
        this.addAST(e);
    }
}