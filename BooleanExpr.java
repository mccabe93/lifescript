
public class BooleanExpr extends Expr {
	private boolean value;

	public BooleanExpr(boolean value)
	{
		this.value = value;
	}

	public BooleanExpr(String value)
	{
		this.value = Boolean.parseBoolean(value);
	}

	public boolean value() {
		return value;
	}
}
