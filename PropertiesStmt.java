
public class PropertiesStmt extends Stmt {

	private String title, defaultType;

	public PropertiesStmt(String title, CoordExpr dimensions, String defaultType, Stmt startConditions, 
				Expr generations, Expr intervals, Expr pausable, Expr steppable)
	{
		this.title = "sim";
		this.defaultType = "block";
		if(title != null)		
			this.title = title;
		if(defaultType != null)
			this.defaultType = defaultType;
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

	public String defaultType() {
		return defaultType;
	}
	
	public String title() {
		return title;
	}
}
