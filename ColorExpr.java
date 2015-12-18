// Node for a color expression

public class ColorExpr extends AST {

	String hex;

	public ColorExpr(Expr r, Expr g, Expr b) {
		this.addAST(r);
		this.addAST(g);
		this.addAST(b);
	}

	public ColorExpr(String hex) {
		this.hex = hex;
	}

	public String hex() {
		return hex;
	}
}
