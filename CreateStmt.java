// Node for a create statement

public class CreateStmt extends Stmt {
	private String type;

	public CreateStmt(String type, CoordExpr coords)
	{
		this.type = type;
		this.addAST(coords);
	}

	public String type() {
		return type;
	}
}
