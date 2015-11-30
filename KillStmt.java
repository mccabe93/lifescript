
public class KillStmt extends Stmt {
	// the text to be written to console, if any
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
