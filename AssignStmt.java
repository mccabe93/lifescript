// assignment statement

public class AssignStmt extends Stmt {

    private String lhsvar;

    public AssignStmt(String v, Expr e) {
	lhsvar = v;
	this.addAST(e);
    }

    public String lhsVar() {
	return lhsvar;
    }
}
