// Node for a random expression

public class RandomExpr extends Expr {

    public RandomExpr(Expr lowerBound, Expr upperBound) {
	this.addAST(lowerBound);
	this.addAST(upperBound);
    }
}
