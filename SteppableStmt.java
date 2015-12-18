// Node for a steppable statement in properties

public class SteppableStmt extends Stmt {
	public SteppableStmt(Expr exp){
		this.addAST(exp);
	}	
}
