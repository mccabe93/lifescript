// print statement:	either takes an expression (and adds it to the AST) 
// 			or a string (and stores it in the variable text)

public class PrintStmt extends Stmt {
	// the text to be written to console, if any
	private String text;

	public PrintStmt(Expr e) {
		this.addAST(e);
	}
	public PrintStmt(String s){
		this.text = s;
	}
	public String text()
	{
		return text;
	}
}
