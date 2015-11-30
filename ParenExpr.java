// parenthesized expression

public class ParenExpr extends Expr {

    public ParenExpr(Expr e) {
	this.addAST(e);
    }
}
