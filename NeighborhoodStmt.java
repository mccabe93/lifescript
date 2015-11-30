
public class NeighborhoodStmt extends Stmt {

	private String type;
	private boolean isVar;	
	
	public NeighborhoodStmt(Expr value, boolean isVar)
	{
		this.addAST(value);
		this.type = type;
		this.isVar = isVar;
	}

	public String type()
	{
		return type;
	}

	public boolean isVar()
	{
		return isVar;
	}
}
