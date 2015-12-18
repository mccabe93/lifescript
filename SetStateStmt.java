// Node for a state statement

public class SetStateStmt extends Stmt {

	public SetStateStmt(CoordExpr coord, Expr state) {
		if(coord != null)
			this.addAST(coord);
		this.addAST(state);
	}
}
