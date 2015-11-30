// if statement

public class IfStmt extends Stmt {
    
    public IfStmt(Expr e, Stmt s1, Stmt s2) {
	this.addAST(e);
	this.addAST(s1);
	this.addAST(s2);
    }

    public IfStmt(Expr e, Stmt s1) {
	this.addAST(e);
	this.addAST(s1);
    }
}