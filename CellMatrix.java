import java.util.*;
public class CellMatrix {

	public static final int DEAD 		= 0;
	public static final int ALIVE 		= 1;
	public static final int TRANSFORM 	= 100;	

	private HashMap<String, Cell> types; // stores info of each cell type for lookup
	private CellNode[] Matrix, OriginalMatrix; // tracks states of each cell (0 = dead, 1 = alive) and type
	private int matrixWidth, matrixHeight;
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
		return new int[]{matrixWidth, matrixHeight};
	}

	public int[] getStates() {
		int[] vals = new int[Matrix.length];
		for(int i = 0; i < vals.length; i++) {
			vals[i] = Matrix[i].state;
		}
		return vals;
	}

	public String[] getTypes() {
		String[] vals = new String[Matrix.length];
		for(int i = 0; i < vals.length; i++) {
			vals[i] = Matrix[i].type;
		}
		return vals;
	}

	public class CellNode {
		public boolean	changed = false; // whether this cell changed this generation
		public int state = 0;
		public String type; 
		public CellNode(int state, String type){
			this.type = type;
			this.state = state;
		}
	}

	public class Cell {
		public int[]	neighborhood;	// values of neighbors
		public int 	VAR;		// location of VARs in neighborhood
		public int	rowsAbove = 0, rowsBelow = -1, 
				leftDisplacement = 0, rightDisplacement = 0;
		// first value of any neighborhood is its width, height is implicit by array length
		public Cell(String name, int[] neighborhood, int VAR)
		{
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
		return new CellNode(temp.state, temp.type);
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
		this.matrixWidth = dimensions[0];
		this.matrixHeight = dimensions[1];
		Matrix = new CellNode[matrixWidth*dimensions[1]];
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
		// If there's enough room in the matrix -- centered at the VAR of the neighborhood -- then a transpose is possible		
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

	public void state(int pos, int state, String add) {	
		Cell cell = types.get(Matrix[pos].type);
//		if(Matrix[pos].changed) return;
		switch(state)
		{
		case 0:
			Matrix[pos].state = 0;
			break;
		case 1:
			Matrix[pos].state = 1;
			break;
		case 100:
			Matrix[pos].type = add;
		}
		Matrix[pos].changed = true;
//		System.out.println("Matrix["+pos+"].state set to " + state);
	}

	public void state(int state, String add) {
		state(current, state, add);
	}

	public void state(int state) {
		state(state, null);
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
