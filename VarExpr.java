// implementation of rhsvar expression

public class VarExpr extends Expr {

    private String rhsvar;

    public VarExpr(String v) {
	rhsvar = v;
    }

    public String rhsVar() {
	return rhsvar;
    }
}
