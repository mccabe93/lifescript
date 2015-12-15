// Negative (inverse) expression

public class GetStateExpr extends Expr {

    public GetStateExpr(CoordExpr e) {
	if(e != null)
		this.addAST(e);
    }
}
