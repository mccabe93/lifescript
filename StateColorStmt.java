// Node for a statecolor statement

public class StateColorStmt extends Stmt {
	public StateColorStmt(Expr state, ColorExpr color) {
		this.addAST(state);
		this.addAST(color);
	}
}
