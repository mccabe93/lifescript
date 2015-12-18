
public class TypeStmt extends Stmt{

	private String type;
	
	public TypeStmt(String type, Expr width, Stmt neighborhood, Stmt code) {
		this.type = type;
		this.addAST(width);
		this.addAST(neighborhood);
		this.addAST(code);
	}

	public String type() {
		return type;
	}
	
}
