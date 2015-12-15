public class NeighborsExpr extends Expr {
	private String type;

	public NeighborsExpr(CoordExpr coords, String type)
	{
		if(coords != null)
			this.addAST(coords);
		this.type = type;
	}

	public String type() {
		return type;
	}
}
