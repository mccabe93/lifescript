// implementation of rhsvar expression

public class CoordExpr extends AST {

    public CoordExpr(Expr x, Expr y) {
	this.addAST(x);
	this.addAST(y);
    }
}
