// Node for a state statement

public class GetStateExpr extends Expr {

    public GetStateExpr(CoordExpr e) {
	if(e != null)
		this.addAST(e);
    }
}
