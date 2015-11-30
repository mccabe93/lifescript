// while statement

public class WhileStmt extends Stmt {
    
    public WhileStmt(Expr e, Stmt s) {
	this.addAST(e);
	this.addAST(s);
    }
}