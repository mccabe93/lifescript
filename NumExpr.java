// implementation of num expression

public class NumExpr extends Expr {
    private Double value;

    public NumExpr(Double v) {
	value = v;
    }

    public NumExpr(String v) {
	value = Double.parseDouble(v);
    }    

    public Double getValue() {
	return value;
    }
}
