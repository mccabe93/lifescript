// Node for a pausable statement in properties

public class PausableStmt extends Stmt {
	public PausableStmt(Expr exp){
		this.addAST(exp);
	}	
}
