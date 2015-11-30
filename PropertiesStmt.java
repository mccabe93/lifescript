
public class PropertiesStmt extends Stmt {

	private String title;

	public PropertiesStmt(String title, CoordExpr dimensions, Stmt startConditions, 
				Expr generations, Expr intervals, Expr pausable, Expr steppable)
	{
		this.title = "sim";
		if(title != null)		
			this.title = title;
		if(startConditions != null)
			this.addAST(startConditions);
		if(dimensions != null)
			this.addAST(dimensions);
		if(generations != null)
			this.addAST(generations);
		if(intervals != null)
			this.addAST(intervals);
		if(pausable != null)
			this.addAST(pausable);
		if(steppable != null)
			this.addAST(steppable);
	}
	
	public String title() {
		return title;
	}
}
