// this class implements implements binary operators

public class MathExpr extends Expr {

	public static final int ADD = 10;
	public static final int MINUS = 20;
	public static final int MULT = 30;
	public static final int DIV = 40;
	public static final int EQ = 50;
	public static final int LESSEQ = 60;
	public static final int AND = 70;
	public static final int OR = 80;

	private int op;

	public MathExpr(int o, Expr e1, Expr e2) {
		op = o;
		this.addAST(e1);
		this.addAST(e2);
	}

	public int getOp() {
		return op;
	}
} 
