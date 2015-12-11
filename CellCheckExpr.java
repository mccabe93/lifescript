
public class CellCheckExpr extends Expr {

	private String type;

	public CellCheckExpr(CoordExpr location, String type)
	{
		this.addAST(location);
		this.type = type;
	}

	public String type() {
		return type;
	}
}
