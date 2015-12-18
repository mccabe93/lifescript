// Node for a neighborhood. A neighborhood in a type statement is made of an arbitrary
// number of these (a la a linked list.)

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
