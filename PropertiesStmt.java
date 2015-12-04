
public class PropertiesStmt extends Stmt {

	private String title, defaultType, generationType;

	public PropertiesStmt(String title, String generationType, String defaultType, BlockStmt properties)
	{
		this.title = "sim";
		this.defaultType = "block";
		this.generationType = generationType;
		this.addAST(properties);
	}

	public String generationType() {
		return generationType;
	}

	public String defaultType() {
		return defaultType;
	}
	
	public String title() {
		return title;
	}
}
