import java.util.*;
import java.io.*;
import java.awt.Color;

/***		
	The InterpVisitor class is where we actually implement the behavior of our AST nodes. 
	Essentially, it will traverse the AST generated by our grammar (in conjunction with 
	the various node classes) and determine which operation to run based upon the type of 
	node we are given.

	Additionally, a hashmap is used to store and retrieve the variables, and a scanner is 
	used to receive input from the user.
	
NOTE:	Much of the implementation was in SIMPLE1MULTI and has been reused. All SIMPLE1MULTI
	code was written by Lutz Hamel. 

	These methods have been separated from those that were written from scratch for the 
	Mini2Basic language.
***/

public class InterpVisitor {
	public String frameTitle = "sim";
	public double interval = 0.5;
	public boolean pausable = true, steppable = false;
	public int cellWidth = 6, cellHeight = 6;
	public int generations = 3;
	

	public boolean saveStmts = true;
	private CellMatrix cellMatrix;
	private ArrayList<AST> 	typeStmts = new ArrayList<AST>(), 
				worldStmts = new ArrayList<AST>();

	private ArrayList<Integer> startConditionCoords = new ArrayList<Integer>();
	private ArrayList<String> startConditionTypes = new ArrayList<String>();
	
	// our variable value memory.
	private HashMap memory = new HashMap();
	
	// Get the value of the variable
	private Scanner consoleInput = new Scanner(System.in);

	// the dispatcher for the interpreter visitor
	public Double dispatch(AST ast) {
		if      (ast.getClass() == AssignStmt.class)		return interp((AssignStmt)ast);
		else if (ast.getClass() == BlockStmt.class)		return interp((BlockStmt)ast);
		else if (ast.getClass() == IfStmt.class)		return interp((IfStmt)ast);
		else if (ast.getClass() == ForStmt.class)		return interp((ForStmt)ast);
		else if (ast.getClass() == InputStmt.class)		return interp((InputStmt)ast);
		else if (ast.getClass() == PrintStmt.class)		return interp((PrintStmt)ast);
		else if (ast.getClass() == EOLStmt.class)		return interp((EOLStmt)ast);
		else if (ast.getClass() == EndStmt.class)		return interp((EndStmt)ast);
		else if (ast.getClass() == WhileStmt.class)		return interp((WhileStmt)ast);
		else if (ast.getClass() == StmtList.class)		return interp((StmtList)ast);
		else if (ast.getClass() == CreateStmt.class)		return interp((CreateStmt)ast);
		else if (ast.getClass() == KillStmt.class)		return interp((KillStmt)ast);
		else if (ast.getClass() == AliveStmt.class)		return interp((AliveStmt)ast);
		else if (ast.getClass() == DeadStmt.class)		return interp((DeadStmt)ast);
		else if (ast.getClass() == NeighborhoodStmt.class)	return interp((NeighborhoodStmt)ast);

		else if (ast.getClass() == PropertiesStmt.class)	return interp((PropertiesStmt)ast);
		else if (ast.getClass() == CellSizeStmt.class)		return interp((CellSizeStmt)ast);
		else if (ast.getClass() == CellStmt.class)		return interp((CellStmt)ast);
		else if (ast.getClass() == DimensionsStmt.class)	return interp((DimensionsStmt)ast);
		else if (ast.getClass() == IntervalStmt.class)		return interp((IntervalStmt)ast);
		else if (ast.getClass() == SteppableStmt.class)		return interp((SteppableStmt)ast);
		else if (ast.getClass() == IntervalStmt.class)		return interp((IntervalStmt)ast);
		else if (ast.getClass() == GenerationsStmt.class)	return interp((GenerationsStmt)ast);
		else if (ast.getClass() == PausableStmt.class)		return interp((PausableStmt)ast);
		else if (ast.getClass() == SteppableStmt.class)		return interp((SteppableStmt)ast);
		else if (ast.getClass() == AddRowStmt.class)		return interp((AddRowStmt)ast);
		else if (ast.getClass() == AddColumnStmt.class)		return interp((AddColumnStmt)ast);

		else if (ast.getClass() == SetColorStmt.class)		return interp((SetColorStmt)ast);
		else if (ast.getClass() == StateColorStmt.class)	return interp((StateColorStmt)ast);
		else if (ast.getClass() == SetStateStmt.class)		return interp((SetStateStmt)ast);

		else if (ast.getClass() == TypeStmt.class)		return interp((TypeStmt)ast);
		else if (ast.getClass() == WorldStmt.class)		return interp((WorldStmt)ast);

		else if (ast.getClass() == CellCheckExpr.class)		return interp((CellCheckExpr)ast);
		else if (ast.getClass() == NeighborsExpr.class)		return interp((NeighborsExpr)ast);
		else if (ast.getClass() == BecomeStmt.class)		return interp((BecomeStmt)ast);

		else if (ast.getClass() == ColorExpr.class)		return interp((ColorExpr)ast);
		else if (ast.getClass() == RandomExpr.class)		return interp((RandomExpr)ast);
		else if (ast.getClass() == BooleanExpr.class)		return interp((BooleanExpr)ast);
		else if (ast.getClass() == AliveExpr.class)		return interp((AliveExpr)ast);
		else if (ast.getClass() == CoordExpr.class)		return interp((CoordExpr)ast);
		else if (ast.getClass() == GetStateExpr.class)		return interp((GetStateExpr)ast);

		else if (ast.getClass() == MathExpr.class)		return interp((MathExpr)ast);
		else if (ast.getClass() == NumExpr.class)		return interp((NumExpr)ast);
		else if (ast.getClass() == ParenExpr.class)		return interp((ParenExpr)ast);
		else if (ast.getClass() == VarExpr.class)		return interp((VarExpr)ast);
		else if (ast.getClass() == NegExpr.class)		return interp((NegExpr)ast);
		else {
		    System.out.println("PrettyPrintVisitor: unknown class type [" + ast.getClass() + "]");
		    System.exit(1);
		    return null;
		}
	}

	public void setCellMatrix(CellMatrix matrix){
		this.cellMatrix = matrix;
	}
	public ArrayList<AST> getTypeStmts(){
		return typeStmts;
	}

	public ArrayList<AST> getWorldStmts(){
		return worldStmts;
	}

	public CellMatrix getCellMatrix(){
		return cellMatrix;
	}
	
	private Double interp(CreateStmt ast) {
		cellMatrix.create(dequote(ast.type()), decodeCoord(this.dispatch(ast.getAST(0))));
		return null;	
	}
	private Double interp(KillStmt ast) {
		cellMatrix.kill(dequote(ast.type()), decodeCoord(this.dispatch(ast.getAST(0))));
		return null;
	}
	private Double interp(StateColorStmt ast) {
		cellMatrix.setStateColor(this.dispatch(ast.getAST(0)).intValue(), decodeColor(this.dispatch(ast.getAST(1))));
		return null;	
	}
	private Double interp(SetStateStmt ast) {
		if(ast.size() == 1)
			cellMatrix.setState(this.dispatch(ast.getAST(0)).intValue());
		else
			cellMatrix.setState(decodeCoord(this.dispatch(ast.getAST(0))), this.dispatch(ast.getAST(1)).intValue());
		return null;	
	}

	private Double interp(DimensionsStmt ast)
	{
		Double x = this.dispatch(ast.getAST(0).getAST(0)), y = this.dispatch(ast.getAST(0).getAST(1));
		
		cellMatrix.setDimensions(new int[]{x.intValue(), y.intValue()});
		return null;
	}
	
	private Double interp(GenerationsStmt ast) {
		this.generations = this.dispatch(ast.getAST(0)).intValue();
		return null;	
	}
	
	private Double interp(AddRowStmt ast) {
		cellMatrix.setDimensions(new int[]{cellMatrix.DEFAULT, cellMatrix.PLUSONE});
		return null;	
	}

	private Double interp(AddColumnStmt ast) {
		cellMatrix.setDimensions(new int[]{cellMatrix.PLUSONE, cellMatrix.DEFAULT});
		return null;
	}
	
	private Double interp(IntervalStmt ast)
	{
		interval = this.dispatch(ast.getAST(0));
		return null;
	}

	private Double interp(PausableStmt ast)
	{
		pausable = this.dispatch(ast.getAST(0)) == 1 ? true : false;
		return null;
	}

	private Double interp(SteppableStmt ast)
	{
		steppable = this.dispatch(ast.getAST(0)) == 1 ? true : false;
		return null;
	}

	private Double interp(CellStmt ast)
	{
		Double x = this.dispatch(ast.getAST(0).getAST(0)), y = this.dispatch(ast.getAST(0).getAST(1));
		startConditionCoords.add(x.intValue());
		startConditionCoords.add(y.intValue());
		startConditionTypes.add(dequote(ast.name()));
		return null;
	}

	private Double interp(BecomeStmt ast)
	{
		cellMatrix.setType(dequote(ast.type()));
		return null;
	}

	private Double interp(PropertiesStmt ast) {
		cellMatrix = new CellMatrix();
		this.dispatch(ast.getAST(0));
		frameTitle = dequote(ast.title());
		int[] coords = new int[startConditionCoords.size()];
		for(int h = 0; h < coords.length; h++)
			coords[h] = startConditionCoords.get(h);
		String[] types = new String[startConditionTypes.size()];
		for(int k = 0; k < types.length; k++)
			types[k] = startConditionTypes.get(k);
		int[] dims = cellMatrix.getDimensions();
		cellMatrix.setDefaultType(dequote(ast.defaultType()));
		cellMatrix.setStartConditions(coords, types);
		return null;	
	}

	private Double interp(AliveStmt ast) {
		cellMatrix.state(cellMatrix.ALIVE);
		return null;	
	}
	private Double interp(DeadStmt ast) {
		cellMatrix.state(cellMatrix.DEAD);
		return null;	
	}
	private Double interp(CellCheckExpr ast) {
		return cellMatrix.cellCheck(dequote(ast.type()), decodeCoord(this.dispatch(ast.getAST(0))), ast.relative()) ? 1.0 : 0.0;
	}
	private Double interp(AliveExpr ast) {
		return cellMatrix.alive() ? 1.0 : 0.0;
	}
	public void nextCell() {
		cellMatrix.nextCell();
	}

	private Double interp(NeighborsExpr ast) {
		// We're calling from inside a Type		
		if(ast.size() == 0) 
			return new Double(cellMatrix.neighborValues(dequote(ast.type())));
		// otherwise we're calling from somewhere else and process a coord
		return new Double(cellMatrix.neighborValues(decodeCoord(this.dispatch(ast.getAST(0))), dequote(ast.type())));
	}

	private Double interp(GetStateExpr ast) {
		if(ast.size() == 0)
			return new Double(cellMatrix.getState());
		return new Double(cellMatrix.getState(decodeCoord(this.dispatch(ast.getAST(0)))));
	}

	private ArrayList<Integer> currentNeighborhood = new ArrayList<Integer>();

	private Double interp(NeighborhoodStmt ast) {
		if(!ast.isVar())
			currentNeighborhood.add(this.dispatch(ast.getAST(0)).intValue());
		else
			currentNeighborhood.add(-17);
		return null;	
	}

	public void newGeneration() {
		cellMatrix.newGeneration();
	}	

	private Double interp(CoordExpr ast) {
		String coord = "1" + thousandString(this.dispatch(ast.getAST(1)).intValue());
		coord += thousandString(this.dispatch(ast.getAST(0)).intValue());
		return Double.parseDouble(coord);
	}

	private String thousandString(int val) {
		String ts = "";
		if(val < 1000)
			ts += "0";
		return (ts + hundredString(val));
	}

	private String hundredString(int val) {
		String ts = "";
		if(val < 100)
			ts += "0";
		if(val < 10)
			ts += "0";
		return (ts + val);
	}

	private int[] decodeCoord(Double val) {
		String d = Integer.toString(val.intValue());
		return new int[]{Integer.parseInt(d.substring(1,5)), Integer.parseInt(d.substring(5,9))};
	}

	private Double interp(CellSizeStmt ast) {
		int[] dims = decodeCoord(this.dispatch(ast.getAST(0)));
		this.cellWidth = dims[0];
		this.cellHeight = dims[1];
		return null;
	}

	private int[] decodeColor(Double val) {
		String d = Integer.toString(val.intValue());
		return new int[]{Integer.parseInt(d.substring(1,4)), Integer.parseInt(d.substring(4,7)), Integer.parseInt(d.substring(7,10))};
	}

	private Double interp(BooleanExpr ast) {
		return ast.value() == true ? 1.0 : 0.0;	
	}
	
	private Double interp(SetColorStmt ast) {
		int[] color, coord;
		if(ast.size() == 2) {
			coord = decodeCoord(this.dispatch(ast.getAST(0)));
			color = decodeColor(this.dispatch(ast.getAST(1)));
		} else {
			color = decodeColor(this.dispatch(ast.getAST(0)));
			cellMatrix.setColor(color);
		}
		return null;
	}

	private Double interp(ColorExpr ast) {
		String encode = "1";
		// if our color isn't already in hex, we convert it		
		if(ast.hex() != null) {
			Color c = Color.decode(ast.hex());
			encode += hundredString((int)(c.getRed()));
			encode += hundredString((int)(c.getGreen()));
			encode += hundredString((int)(c.getBlue()));
		} else {
			encode += hundredString(this.dispatch(ast.getAST(0)).intValue());
			encode += hundredString(this.dispatch(ast.getAST(1)).intValue());
			encode += hundredString(this.dispatch(ast.getAST(2)).intValue());
		}
		return Double.parseDouble(encode);
	}

	public Double interp(RandomExpr ast) {
		Random r = new Random();
		double lowerBound = this.dispatch(ast.getAST(0)),
			upperBound = this.dispatch(ast.getAST(1));
		return (upperBound - lowerBound) * r.nextDouble() + lowerBound;
	}

	private Double interp(TypeStmt ast) {
		if(!saveStmts && !ast.type().equals(cellMatrix.currentType())) return null;
		if(saveStmts) {
			typeStmts.add(ast);
			currentNeighborhood.add(this.dispatch(ast.getAST(0)).intValue());
			for (int i = 0; i < ast.size(); i++)
				this.dispatch(ast.getAST(i));
		}
		else
			for (int i = 0; i < ast.size(); i++)
				this.dispatch(ast.getAST(i));
		if(saveStmts) {
			int[] neighborhood = new int[currentNeighborhood.size()];
			int var = 0;
			for(int i = 0; i < neighborhood.length; i++) {
				neighborhood[i] = currentNeighborhood.get(i);
				if(neighborhood[i] == -17)
					var = i;
			}
			cellMatrix.addCellType(ast.type(), neighborhood, var);// this.dispatch(ast.getAST(0)).intValue());
			currentNeighborhood = new ArrayList<Integer>();
		}
		return null;	
	}

	private Double interp(WorldStmt ast) {
		if(saveStmts)
			worldStmts.add(ast);
		for (int i = 0; i < ast.size(); i++) {
			this.dispatch(ast.getAST(i));
		}
		return null;	
	}

	private Double interp(ForStmt ast) {
		// First we check if the variable given at the start is the same as the one
		// we "next" at the end. If not, the syntax is wrong.
		String var = ast.startVar(), nexted = ast.endVar();
		if(!var.equals(nexted)){
			System.out.println("Variable in for loop (" + var + 
				") differs from one following next (" + nexted + "). Terminating.");
			System.exit(1);
		}
		// Now we get all the components for the For loop
		Double start = this.dispatch(ast.getAST(0));
		Double max = this.dispatch(ast.getAST(1));
		Double step = 1.0;
		if(ast.getAST(2) != null)
			step = this.dispatch(ast.getAST(2));
		System.out.println(step);
		for(int i = start.intValue(); i != max; i += step){
			memory.put(var, i);
			this.dispatch(ast.getAST(3)); 
		}
		return null;
	}

	// Spits out the prompt and uses the scanner to get input
	private Double interp(InputStmt ast) {
		// Print out the prompt
		System.out.print(dequote(ast.prompt()));
		int value = consoleInput.nextInt();
		// and assign it in the hashmap
		memory.put(ast.var(),value);
		return null;
	}

	private Double interp(EndStmt ast) {
		// The End statement just calls System.exit()
		System.exit(1);
		return null;
	}

	private Double interp(PrintStmt ast) {
		String value = "";	
		// Value will either be the value of an expression (and therefore has an AST)
		// or a given string (which indicates there is no AST)
		if(ast.size() > 0.0)
			value = this.dispatch(ast.getAST(0)).toString();
		else if(ast.text() != "")
			value = dequote(ast.text());
		System.out.print(value);
		return null;
	}

	// an EOLStmt always follows the series of PrintStmts generated in the print grammar/call
	private Double interp(EOLStmt ast) {
		System.out.println();
		return null;
	}

	// Helper method that simply removes the quotations from given strings in the language
	private String dequote(String val)
	{	
		if(val == null) return null;
		int len = val.length();
		// if there are 2 characters, then there are only quotes => empty string
		if(len < 3)
			return "";
		return val.substring(1,len-1);
	}

/*** 


	All of these implementations were written by Lutz Hamel for SIMPLE1MULTI.


											***/

	//****** interpret statement level ASTs
	// statements
	private Double interp(AssignStmt ast) {
		// evaluate the expression
		Double value = this.dispatch(ast.getAST(0));
		// assign the value to the lhs var
		memory.put(ast.lhsVar(),value);

		// statements do not have return values -- null
		return null;
	}

	// block statements
	private Double interp(BlockStmt ast) {
		// interpret each of the statements in the block
		for (int i = 0; i < ast.size(); i++) {
		    this.dispatch(ast.getAST(i));
		}

		// statements do not have return values -- null
		return null;
	}

	// if statements
	private Double interp(IfStmt ast) {
		// interpret the expression
		Double value = this.dispatch(ast.getAST(0));
		if (value.doubleValue() != 0.0) {
		    // interpret the then clause
		    this.dispatch(ast.getAST(1));
		}
		else
		    // interpret the else clause if we have one
		    this.dispatch(ast.getAST(2));

		// statements do not have return values -- null
		return null;
	}

	// while statements
	private Double interp(WhileStmt ast) {
		Double value;

		// interpet the expression
		value = this.dispatch(ast.getAST(0));

		// interpret the loop while the expression value != 0.0
		while (value.doubleValue() != 0.0) {
		    // interpret the while body
		    this.dispatch(ast.getAST(1));
		    // reevaluate the loop expression
		    value = this.dispatch(ast.getAST(0));
		}

		// statements do not have return values -- null
		return null;
	}

	// statement lists
	private Double interp(StmtList ast) {
		// interpret each of the statements
		for (int i = 0; i < ast.size(); i++) {
		    this.dispatch(ast.getAST(i));
		}

		// statements do not have return values -- null
		return null;
	}


	//****** interpret expression level ASTs
	// binop expressions
	private Double interp(MathExpr ast) {
		// interpret left child
		Double left = this.dispatch(ast.getAST(0));
		// interpret right child
		Double right = this.dispatch(ast.getAST(1));

		// compute the return value based on the OP
		switch(ast.getOp()) {
		case MathExpr.ADD:
		    return new Double(left.doubleValue() + right.doubleValue());
		case MathExpr.MINUS:
		    return new Double(left.doubleValue() - right.doubleValue());
		case MathExpr.MULT:
		    return new Double(left.doubleValue() * right.doubleValue());
		case MathExpr.DIV:
		    return new Double(left.doubleValue() / right.doubleValue());
		case MathExpr.EQ:
		    return new Double((left.doubleValue() == right.doubleValue())?1.0:0.0);
		case MathExpr.LESSEQ:
		    return new Double((left.doubleValue() <= right.doubleValue())?1.0:0.0);
		case MathExpr.MOREEQ:
		    return new Double((left.doubleValue() >= right.doubleValue())?1.0:0.0);
		case MathExpr.STRICTLESS:
		    return new Double((left.doubleValue() < right.doubleValue())?1.0:0.0);
		case MathExpr.STRICTMORE:
		    return new Double((left.doubleValue() > right.doubleValue())?1.0:0.0);
		case MathExpr.NOTEQ:
		    return new Double((left.doubleValue() != right.doubleValue())?1.0:0.0);
		case MathExpr.AND:
		    return new Double((left.intValue() * right.intValue()) != 0.0?1.0:0.0);
		case MathExpr.OR:
		    return new Double((left.intValue() + right.intValue()) != 0.0?1.0:0.0);
		default:
		    System.out.println("Interpreter  Visitor: unknown binary operator expression.");
		    System.exit(1);
		    return null;
		}
	}

	// Double expressions
	private Double interp(NumExpr ast) {
		return ast.getValue();
	}

	// parenthesized expressions
	private  Double interp(ParenExpr ast) {
		return this.dispatch(ast.getAST(0));
	}

	// rhs variable expressions
	private Double interp(VarExpr ast) {
		// fetch the variable value from memory
		Double v = (Double)memory.get(ast.rhsVar());

		// if not there, return 0.0
		if (v == null) 
		    return new Double(0.0);
		else
		    return v;
	}

	// negative expressions
	private  Double interp(NegExpr ast) {
		return this.dispatch(ast.getAST(0)) == 0.0 ? 1 : 0.0;
	}
}
