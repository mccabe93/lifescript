// Node for an become statement

public class BecomeStmt extends Stmt {
	private String type;
	public BecomeStmt(String type){
		this.type = type;
	}	
	public String type() {
		return type;
	}
}
