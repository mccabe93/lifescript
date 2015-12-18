// Node for a properties statement

public class PropertiesStmt extends Stmt {

	private String title, defaultType;

	public PropertiesStmt(String title, String defaultType, BlockStmt properties)
	{
		this.title = title;
		this.defaultType = defaultType;
		this.addAST(properties);
	}

	public String defaultType() {
		return defaultType;
	}
	
	public String title() {
		return title;
	}
}
