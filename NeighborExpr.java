
public class NeighborExpr extends Expr {
	/* 			Behavior
			Inside type definition

		Origin = top left cell of neighborhood

		If only here is given:
			Returns value of cell at 
			x
		If both here and there are given:
			Returns value of cell at
			x offset of y
		-	-	-	-	-	-	-
			Outside type definition
		
		Origin = top left cell of grid

		If only here is given:
			nothing
		If both here and there are given:
			Determines if there is a neighbor of x at y
	*/	
	public NeighborExpr(CoordExpr x, CoordExpr y)
	{
		this.addAST(x);
		this.addAST(y);
	}
}
