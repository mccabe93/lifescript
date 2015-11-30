// input statement

public class InputStmt extends Stmt {
	// the prompt that will be displayed, and the name of the variable to be stored
	private String prompt, var;

	public InputStmt(String prompt, String var) {
		this.prompt = prompt;
		this.var = var;
	}
	
	public String prompt()
	{
		return prompt;
	}

	public String var()
	{
		return var;
	}
}
