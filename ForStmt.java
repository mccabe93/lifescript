// for statement

public class ForStmt extends Stmt {
	// The variables given after the for and after the next in a for loop
	private String startVar, endVar;

    	// s1 will be the first of the AST of statements ran
	public ForStmt(String startVar, Expr start, Expr lim, Expr step, Stmt s1, String endVar) {
		this.startVar = startVar;
		this.addAST(start);
		this.addAST(lim);
		this.addAST(step);
		this.addAST(s1);
		this.endVar = endVar;
	}

	public String startVar()
	{
		return startVar;
	}
	
	public String endVar()
	{
		return endVar;
	}
}
