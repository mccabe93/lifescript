import java.util.*;
public class CellMatrix {

	public static final int DEAD 		= 0;
	public static final int ALIVE 		= 1;
	public static final int DEFAULT 	= -99;	
	public static final int PLUSONE		= -999;

	private HashMap<String, Cell> types; // stores info of each cell type for lookup
	private CellNode[] Matrix, OriginalMatrix; // tracks states of each cell (0 = dead, 1 = alive) and type
	private int matrixWidth;
	private String defaultType;

	private int current = 0;
	/*
		0,block 0,block 1,block 1,block 0,block 0,block
		0,block	1,block	0,block	0,block	1,block	0,block
	*/	

	public boolean alive() {
		return Matrix[current].state == 1;
	}

	public int cells() { 
		return Matrix.length;
	}

	public int[] getDimensions() {
		return new int[]{matrixWidth, Matrix.length/matrixWidth};
	}

	public int[][] getColorMatrix() {
		int[][] cm = new int[Matrix.length][3];
		for(int i = 0; i < Matrix.length; i++) {
			cm[i] = Matrix[i].color;
		}
		return cm;
	}

	public void setColor(int pos, int[] rgb) {
		Matrix[current].color = rgb;
	}

	public void setColor(int[] rgb) {
		setColor(current, rgb);
	}

	public class CellNode {
		public boolean	changed = false; // whether this cell changed this generation
		public int state = 0;
		public String type;
		public int[] color; 
		public CellNode(int state, String type){
			this.type = type;
			this.state = state;
			this.color = new int[]{255, 255, 255};
		}
		public CellNode(int state, String type, int[] rgb) {
			this(state, type);
			this.color = rgb;		
		}
	}

	public class Cell {
		public int[]	neighborhood;	// values of neighbors
		public int 	VAR;		// location of VARs in neighborhood
		public int	rowsAbove = 0, rowsBelow = -1, 
				leftDisplacement = 0, rightDisplacement = 0;
		// first value of any neighborhood is its width, height is implicit by array length
		public Cell(String name, int[] neighborhood, int VAR) {
			this.neighborhood = neighborhood;
			this.VAR = VAR;
			// we set the value from -17 to 0 as to not affect calculations
			neighborhood[VAR] = 0;
			getTransposeData();
		}
		private void getTransposeData() {
			// center the neighborhood matrix on VAR
			for(int i = 1; i < neighborhood.length; i++){
				if(i == VAR) { 
					leftDisplacement = (i % neighborhood[0]) - 1;
					rightDisplacement = (neighborhood[0] - leftDisplacement) - 1;
				}
				if(i % neighborhood[0] == 0){
//					System.out.println("row found");
					if(i < VAR)
						rowsAbove++;
					else if(i > VAR)
						rowsBelow++;
				}
			}
		}
	}

	private CellNode copyCellNode(CellNode temp)
	{
		return new CellNode(temp.state, temp.type, temp.color);
	}

	private void copyMatrix() {
		OriginalMatrix = new CellNode[Matrix.length];
		for(int i = 0; i < OriginalMatrix.length; i++)
			OriginalMatrix[i] = copyCellNode(Matrix[i]);
	}

	public void addrow() {
		CellNode[] prev = Matrix;
		Matrix = new CellNode[prev.length+matrixWidth];
		for(int i = 0; i < prev.length; i++)
			Matrix[i] = prev[i];
		for(int i = prev.length; i < Matrix.length; i++) {
			Matrix[i] = new CellNode(0, defaultType);
		}
		copyMatrix();
	}

	public void newGeneration() {
		for(CellNode cn : Matrix)
			cn.changed = false;
		copyMatrix();
		current = 0;
	}

	public CellMatrix()
	{
		this.types = new HashMap<String, Cell>();
	}

	public void setDefaultType(String type)
	{
		if(type == null || type == "")
			type = "DEFAULT";
		defaultType = type;
		for(int i = 0; i < Matrix.length; i++) {
			Matrix[i] = new CellNode(0, type);
		}
	}

	public void setDimensions(int[] dimensions)
	{
		CellNode[] prev = Matrix;

		if(dimensions[0] == DEFAULT)
			dimensions[0] = matrixWidth;
		else if(dimensions[0] == PLUSONE)
			matrixWidth += 1;
		else
			matrixWidth = dimensions[0];

		if(dimensions[1] == DEFAULT)
			dimensions[1] = Matrix.length/matrixWidth;					// increase rows by one; "height" increased by one
		else if(dimensions[1] == PLUSONE)
			dimensions[1] += 1;		// increase columns by one; simply add a cell to each row

		System.out.println("matrixWidth = " + matrixWidth + "dimensions[1] = " + dimensions[1]);
		Matrix = new CellNode[matrixWidth*dimensions[1]];
		int offset = 0;
		if(prev != null)
			offset = prev.length;
		for(int i = 0; i < offset; i++)
			Matrix[i] = prev[i];
		for(int i = offset; i < Matrix.length; i++) {
			Matrix[i] = new CellNode(0, defaultType);
		}
		copyMatrix();
		printMatrix();
	}

	public void setStartConditions(int[] coordinates, String[] types)
	{
		for(int i = 1, j = 0; j < types.length; i+=2, j++){
			int pos = coordinates[(i-1)]*matrixWidth+(coordinates[i]-1);
			Matrix[pos] = new CellNode(1, types[j]);	
		}
		copyMatrix();
	}

	public void printMatrix() {
		for(int i = 0; i < Matrix.length; i++) {
			if(i%matrixWidth==0)
				System.out.println();
			CellNode c = Matrix[i];
			System.out.print(c.state + " " + c.type + " | ");
		}
	}

	public void printNeighborsMatrix() {
		for(int i = 0; i < Matrix.length; i++) {
			if(i%matrixWidth==0)
				System.out.println();
			CellNode c = Matrix[i];
			System.out.print(neighborValues(i) + " " + c.type + " | ");
		}
	}

	public String[] neighborTypes() {
		return null;
	}

	public int neighborValues(int pos) {
		int values = 0;
		if(types.get(Matrix[pos].type) == null) return 0;
		Cell cell = types.get(Matrix[pos].type);
		int[] hood = cell.neighborhood;
	
		int 	bufferTop = pos - cell.rowsAbove * matrixWidth, bufferBottom = pos + cell.rowsBelow * matrixWidth,
			bufferLeft = pos%matrixWidth - cell.leftDisplacement, bufferRight = pos%matrixWidth + cell.rightDisplacement;
		// If there's enough room in the matrix -- centered at the VAR of the neighborhood -- then a translation is possible		
		if(bufferTop > -1 && bufferBottom < Matrix.length && bufferLeft > -1 && bufferRight < matrixWidth) {
//			System.out.println("PARSING CELL @ " + pos);
//			System.out.println("Buffer Top = " +bufferTop + "\nBuffer Bottom = " +bufferBottom + "\nBuffer Left = " +bufferLeft + "\nBuffer Right = " +bufferRight);
//			System.out.println("we can transpose @ pos " + pos);
			pos = bufferTop - cell.leftDisplacement;
//			System.out.println(pos);
			for(int i = 1; i < hood.length; i++) {
//				System.out.println(pos-1 + "\n" + Matrix[pos-1].state);
				if(OriginalMatrix[pos].state == 1) {
//					System.out.println("Value @ pos " + (pos-1) + " = " + hood[i]);
					values += hood[i];
				}
				if(i % hood[0] == 0){
					pos -= hood[0]-1;
					pos += matrixWidth;
				}
				else
					pos++;
			}
		}
		return values;
	}

	public int neighborValues() {
		return neighborValues(current);	
	}

	public void nextCell() {
		if(current == Matrix.length-1)
			current = 0;
		else
			current++;
	}

	public void state(int pos, int state) {
		Matrix[pos].state = state;
		Matrix[pos].changed = true;
	}

	public void state(int state) {
		state(current, state);
	}

	public void addCellType(String name, int[] neighborhood, int VAR)
	{
		System.out.println("Hood Width: " + neighborhood[0] + "\nHood Size = " + (neighborhood.length-1));
		if(!types.containsKey(name)) {
			Cell cell = new Cell(name, neighborhood, VAR);
			types.put(name, cell);
			System.out.println("added type " + name);
		}
	}

}
