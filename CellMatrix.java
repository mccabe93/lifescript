import java.util.*;

/***
	The CellMatrix class handles all aspects of affecting cells and the matrix.
	It has its "orders" given via the InterpVisitor (primarily Type and World statements).

	The Cell Matrix works with two matrices: the working "Matrix" and the last generation
	"OriginalMatrix." Between these, a pseduo-simultaneous simulation can be achieved as 
	each cell affects the working Matrix, but analyzes its neighborhood in the OriginalMatrix.
***/

public class CellMatrix {

	// Cell state constants
	public static final int DEAD 		= 0;		// State 0 is dead
	public static final int ALIVE 		= 1;		// State 1 is alive

	// Dimensions of matrix
	public static final int DEFAULT 	= -99;		// Signals no change in matrix coordinate
	public static final int PLUSONE		= -999;		// Signals to increase coordinate by one

	private HashMap<String, Cell> types; // Stores info of each cell type for lookup
	private CellNode[] Matrix, OriginalMatrix; // Tracks states of each cell and type
	private int matrixWidth, matrixHeight; // Used in favor of calling Matrix.length constantly 
	private String defaultType; // The type we'll initially fill our matrices with.

	// The index of the current cell being evaluated
	private int current = 0;
	
	// wraparound data
	private boolean wraparound = false;

	// The CellNode type used for tracking cells in the Matrix and OriginalMatrix
	// Provides basic information about a cell.
	public class CellNode {
		public boolean	changed = false; // whether this cell changed this generation
		public int state = 0;		// the current state of the cell
		public String type;		// the type of the cell
		public int[] color, override; 	// the color and its override (setcolor stmt used)
		public CellNode(int state, String type){
			this.type = type;
			this.state = state;
			color = new int[]{255, 255, 255};
			setColorFromState(state);
		}
		public CellNode(int state, String type, int[] rgb) {
			this(state, type);
			this.color = rgb;		
		}
		public int[] color() {
			if(override != null)
				return override;
			setColorFromState(state);
			return color;
		}
		public void setColorFromState(int state) {
			Cell cell = types.get(type);
			if(cell != null) {
				int[] col = cell.stateColors.get(state);
				if(col != null)
					color = col;
			}
		}
		
	}

	// More detailed info such as neighborhood, some supplementary calculations for neighborhood
	// checking, and associations of states and colors. These are stored in the types hashmap.
	public class Cell {
		public int[]	neighborhood;	// values of neighbors
		public int 	VAR;		// location of VARs in neighborhood
		public int	rowsAbove = -1, rowsBelow = 0, 
				leftDisplacement = 0, rightDisplacement = 0;
		public int[]	neighborIndex; // stores the indices of the cell's neighbors
		public HashMap<Integer, int[]> stateColors = new HashMap<Integer, int[]>();
		//public int dx, dy;
		// first value of any neighborhood is its width, height is implicit by array length
		public Cell(String name, int[] neighborhood, int VAR) {
			this.neighborhood = neighborhood;
			this.VAR = VAR;
			// we set the value from -17 to 0 as to not affect calculations
			neighborhood[VAR] = 0;
			getTranslationData();
			stateColors.put(0, new int[]{255, 255, 255});
			stateColors.put(1, new int[]{0, 0, 0});
			System.out.println("rows below: " + rowsBelow + "\nrows above: " + rowsAbove);
		}

		public void addStateColor(int state, int[] color) {
			stateColors.put(state, color);
		}
		private void getTranslationData() {
			if(neighborhood[0] == 0)
				return;
			for(int i = 1; i < neighborhood.length; i++){
				if(i == VAR) { 
					leftDisplacement = (i % neighborhood[0]) - 1;
					rightDisplacement = (neighborhood[0] - leftDisplacement) - 1;
				}
				if(i % neighborhood[0] == 0){
					if((i-(neighborhood[0]+1)) < VAR)
						rowsAbove++;
					else if(i > VAR)
						rowsBelow++;
				}
			}
		}
	}

	// The constructor doesn't really do much except instantiate the types hashmap. 
	public CellMatrix() {
		this.types = new HashMap<String, Cell>();
	}

	/** Matrix handling functions **/

	// Copies the working Matrix to the OriginalMatrix (used once per generation, basically)
	private void copyMatrix() {
		OriginalMatrix = new CellNode[Matrix.length];
		for(int i = 0; i < OriginalMatrix.length; i++)
			OriginalMatrix[i] = copyCellNode(Matrix[i]);
	}

	// Copies a cell node by values (workaround as Java would prefer by reference.)
	private CellNode copyCellNode(CellNode temp) {
		return new CellNode(temp.state, temp.type, temp.override);
	}

	// A new generation makes all cellnodes reset to unchanged, copies the old matrix 
	// into OriginalMatrix, and sets the current index to the start of the matrix.
	public void newGeneration() {
		for(CellNode cn : Matrix)
			cn.changed = false;
		copyMatrix();
		current = 0;
	}

	// Fills the working matrix with the given (and hereafter saved as default) type
	public void setDefaultType(String type) {
		if(type == null || type == "")
			type = "DEFAULT";
		defaultType = type;
		System.out.println("Matrix length = " + Matrix.length);
		for(int i = 0; i < Matrix.length; i++)
			Matrix[i] = new CellNode(0, type);
	}
	
	public void setWraparound(boolean wraparound) {
		this.wraparound = wraparound;
	}

	// Sets the dimensions of the matrix to [x,y]
	public void setDimensions(int[] dimensions) {
		CellNode[] prev = Matrix;

		// Change the number of columns
		if(dimensions[0] == DEFAULT)
			dimensions[0] = matrixWidth;
		else if(dimensions[0] == PLUSONE) 
			matrixWidth += 1;	// increase columns by one; simply add a cell to each row
		else
			matrixWidth = dimensions[0];

		// Change the number of rows
		if(Matrix != null)
			matrixHeight = Matrix.length/matrixWidth;
		if(dimensions[1] == DEFAULT)
			dimensions[1] = matrixHeight;
		else if(dimensions[1] == PLUSONE)
			dimensions[1] = matrixHeight + 1; // increase rows by one; "height" increased by one
	
		// Matrix's new length is adjusted rows*columns
		Matrix = new CellNode[matrixWidth*dimensions[1]];

		// We then fill the new nodes with cells of the default type
		int offset = 0;
		if(prev != null)
			offset = prev.length;
		for(int i = 0; i < offset; i++)
			Matrix[i] = prev[i];
		for(int i = offset; i < Matrix.length; i++) {
			Matrix[i] = new CellNode(0, defaultType);
		}
		copyMatrix();
	}

	// The start conditions given in a coordinate array [x0, y0, x1, y1, ...] and
	// type array ["type0","type1",...]
	public void setStartConditions(int[] coordinates, String[] types)
	{
		// Since we know the start conditions' coordinate array will be twice the length
		// of the types array, we use slightly unconventional for loop values
		for(int i = 1, j = 0; j < types.length; i+=2, j++){
			int pos = coordinates[i]*matrixWidth+(coordinates[i-1]);
			Matrix[pos] = new CellNode(1, types[j]);	
		}
		// Update the original matrix now that we have our start conditions set
		copyMatrix();
	}

	// Prints the matrix out. Used for debugging, but could be a toggleable feature in the future.
	public void printMatrix() {
		for(int i = 0; i < Matrix.length; i++) {
			if(i%matrixWidth==0)
				System.out.println();
			CellNode c = Matrix[i];
			System.out.print(c.state + " " + c.type + " | ");
		}
	}

	// Prints the neighborhood values of each cell out.
	public void printNeighborsMatrix() {
		for(int i = 0; i < Matrix.length; i++) {
			if(i%matrixWidth==0)
				System.out.println();
			CellNode c = Matrix[i];
			System.out.print(neighborValues(i, null) + " " + c.type + " | ");
		}
	}
	/*** Cell functionality ***/
	
	// Return the values of the neighborhood of the cell at index pos.
	// Optionally we can discard the values of all neighbors that aren't of given type.
	public int neighborValues(int pos, String type) {
		if(types.get(Matrix[pos].type) == null) return 0;
		int values = 0;
		Cell cell = types.get(Matrix[pos].type);
		int[] hood = cell.neighborhood;
		if(hood[0] == 0) return 0;
		int diy = 0;
		int dix = 0;
		int y = pos/matrixWidth;
		int x = pos%matrixWidth;
		if(matrixHeight == 0)
			matrixHeight = Matrix.length/matrixWidth;
		if(wraparound) {
			for(int dy = -cell.rowsAbove; dy <= cell.rowsBelow; dy++, diy++) {
				for(int dx = -cell.leftDisplacement; dx <= cell.rightDisplacement; dx++, dix++) {
					int index = cellAddress(x+dx, (y+dy), matrixWidth, matrixHeight);
					CellNode tmp = OriginalMatrix[index];
					if(tmp.state > 0) {
						if((type != null && type.equals(tmp.type)) || type == null) {
							//if(!wraparound && !(x + dx < matrixWidth && x - dx >= 0 && y + dy < matrixHeight && y + dy >= 0))
							//	continue;
							//else {
							int loc = dix+diy*hood[0];
							values += hood[loc+1];
							//}
						}
					}
				}
				dix = 0;
			}
		}
		// not wraparound matrix uses legacy way of evaluating neighborhood
		// due to some bugs in the previous way
		else {
			int 	bufferTop = pos - cell.rowsAbove * matrixWidth, bufferBottom = pos + cell.rowsBelow * matrixWidth,
				bufferLeft = pos%matrixWidth - cell.leftDisplacement, bufferRight = pos%matrixWidth + cell.rightDisplacement;

			if(bufferTop > -1 && bufferBottom < Matrix.length && bufferLeft > -1 && bufferRight < matrixWidth) {
				pos = bufferTop - cell.leftDisplacement;
				for(int i = 1; i < hood.length; i++) {
					CellNode tmp = OriginalMatrix[pos];
					if(tmp.state > 0) {
						if((type != null && type.equals(tmp.type)) || type == null)
							values += hood[i];
					}
					if(i % hood[0] == 0){
						pos -= hood[0]-1;
						pos += matrixWidth;
					}
					else pos++;
				}
			}
		}
		return values;
	}
	
	private int cellAddress(int x, int y, int m, int n) {
		return (pymod(y,n))*m + pymod(x,m);
	}
	// stackoverflow 
	private int pymod(int a, int b) {
		if(b == 0)
			return 0;
		return ((a%b) + b) % b;
	} 

	// Converts [x,y] to index and checks neighbor values
	public int neighborValues(int[] coord, String type) {
		return neighborValues(coord[0]*matrixWidth+coord[1], type);
	}

	// Checks neighbor values of current cell
	public int neighborValues(String type) {
		return neighborValues(current, type);	
	}

	// Increments the current cell value. If we've reached the end of the matrix
	// go to the first value again.
	public void nextCell() {
		if(current == Matrix.length-1)
			current = 0;
		else
			current++;
	}

	// Set the state at index pos to state
	public void state(int pos, int state) {
		Matrix[pos].state = state;
		Matrix[pos].changed = true;
		Cell type = types.get(Matrix[pos].type);
		if(type != null) {
			int[] stateColor = type.stateColors.get(state);
			if(stateColor != null)
				Matrix[pos].color = stateColor;
		}
	}

	// Set the state of the cell at [x,y] to state
	public void state(int[] coord, int state) {
		state(coord[0]*matrixWidth+coord[1], state);
	}

	// Set the state of the current cell to state
	public void state(int state) {
		state(current, state);
	}

	// Get the number of cells in the matrix
	public int cells() { 
		return Matrix.length;
	}

	// Get the dimensions of the matrix [x,y]
	public int[] getDimensions() {
		return new int[]{matrixWidth, Matrix.length/matrixWidth};
	}

	// Return a matrix of the colors of the cells [cell#][r,g,b]
	public int[][] getColorMatrix() {
		int[][] cm = new int[Matrix.length][3];
		for(int i = 0; i < Matrix.length; i++) {
			cm[i] = Matrix[i].color();
		}
		return cm;
	}

	// Associate a state with a color
	public void setStateColor(int state, int[] color) {
		Cell guy = types.get(Matrix[current].type);
		if(guy != null)
			guy.addStateColor(state, color);
	}

	// Set the type of the current cell to type
	public void setType(String type) {
		Matrix[current].type = type;
	}

	// Check if the cell at the coord [x,y] is of the given type. 
	// Relative means use the current cell's position as the origin.
	public boolean cellCheck(String type, int[] coord, boolean relative) {
		if(relative) {
			coord[0] += current/matrixWidth;
			coord[1] += current%matrixWidth;
		}
		System.out.println("row = " + coord[0] + ", column = " + coord[1]);
		int pos = coord[0]*matrixWidth+coord[1];
		if(Matrix[pos].type.equals(type))
			return true;
		return false;
	}

	// Create a cell of type at coord
	public void create(String type, int[] coord) {
		Matrix[coord[0]*matrixWidth+coord[1]] = new CellNode(1, type);
	}

	// Kill a cell of type at coord (if no type given, kill any kind of cell)
	public void kill(String type, int[] coord) {
		CellNode cn = Matrix[coord[0]*matrixWidth+coord[1]];
		cn.state = DEAD;
		if(type != null)
			if(type != cn.type)
				cn.state = ALIVE;
	}

	// Get the state of a cell at index pos
	public int getState(int pos) {
		return Matrix[pos].state;
	}

	// Convert [x,y] into index and get state
	public int getState(int[] coord) {
		return getState(coord[0]*matrixWidth+coord[1]);
	}

	// get state of current cell
	public int getState() { 
		return getState(current);
	}

	// Set the color of the cell at pos to [r,g,b]
	public void setColor(int pos, int[] rgb) {
		Matrix[pos].override = rgb;
	}

	// Set the color of the current cell to [r,g,b]
	public void setColor(int[] rgb) {
		setColor(current, rgb);
	}

	// The type of the current cell
	public String currentType() {
		return Matrix[current].type;
	}

	// Adds a cell type to the hashmap of types.
	public void addCellType(String name, int[] neighborhood, int VAR)
	{
		if(!types.containsKey(name)) {
			Cell cell = new Cell(name, neighborhood, VAR);
			types.put(name, cell);
		}
	}

}
