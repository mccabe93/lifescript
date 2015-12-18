// Node for a dimensions statement in properties

public class DimensionsStmt extends Stmt {
	public DimensionsStmt(CoordExpr exp){
		this.addAST(exp);
	}	
}
