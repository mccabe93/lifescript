// Node for a kill statement

public class KillStmt extends Stmt {
	private String type;

	public KillStmt(String type, CoordExpr coords)
	{
		this.type = type;
		this.addAST(coords);
	}

	public String type() {
		return type;
	}
}
