public class NeighborsExpr extends Expr {
	private String type;
	private boolean _this;

	public NeighborsExpr(String type)
	{
		this.type = type;
		this._this = true;
	}

	public NeighborsExpr(CoordExpr coords, String type)
	{
		this.addAST(coords);
		this.type = type;
	}

	public String type() {
		return type;
	}
	public boolean _this() {
		return _this;
	}
}
