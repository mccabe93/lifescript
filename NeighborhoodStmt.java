
public class NeighborhoodStmt extends Stmt {
	private boolean isVar;	
	
	public NeighborhoodStmt(Expr value, boolean isVar)
	{
		this.addAST(value);
		this.isVar = isVar;
	}

	public boolean isVar()
	{
		return isVar;
	}
}
