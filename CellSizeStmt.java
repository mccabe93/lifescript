// Node for setting cell sizes in properties

public class CellSizeStmt extends Stmt {
	public CellSizeStmt(CoordExpr exp){
		this.addAST(exp);
	}	
}
