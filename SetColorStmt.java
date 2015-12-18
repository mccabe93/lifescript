// Node for a setcolor statement

public class SetColorStmt extends Stmt{	

	public SetColorStmt(CoordExpr loc, ColorExpr color) {
		if(loc != null)
			this.addAST(loc);
		this.addAST(color);
	}
	
}
