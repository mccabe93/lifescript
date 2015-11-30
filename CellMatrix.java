import java.util.*;
public class CellMatrix {

	public static final int DEAD 		= 0;
	public static final int ALIVE 		= 1;
	public static final int TRANSFORM 	= 100;	

	private HashMap<String, Cell> types; // stores info of each cell type for lookup
	private CellNode[] Matrix; // tracks states of each cell (0 = dead, 1 = alive) and type
	private int matrixWidth;
	/*
		0,block 0,block 1,block 1,block 0,block 0,block
		0,block	1,block	0,block	0,block	1,block	0,block
	*/	

	private int current = 0;

	public class CellNode {
		public int state = 0;
		public String type; 
		public CellNode(String type, int state){
			this.type = type;
			this.state = state;
		}
	}

	public class Cell {
		public int[] 	neighborhood;	// values of neighbors
		public int 	VAR;		// location of VARs in neighborhood

		// first value of any neighborhood is its width, height is implicit by array length
		public Cell(String name, int[] neighborhood, int VAR)
		{
			this.neighborhood = neighborhood;
			this.VAR = VAR;
		}
	}
	public CellMatrix(int[] dimensions, 			// dimensions of the matrix
				int[] coordinates, String[] types) // starting condition values
	{
		matrixWidth = dimensions[0];
		Matrix = new CellNode[matrixWidth*dimensions[1]];
		// the coordinates array should be exactly twice the size of the types array
//		if(coordinates.length/2 != types.length)
		for(int i = 0, j = 1; i < coordinates.length; i++, j+=2){
			int pos = coordinates[(j-1)*matrixWidth]+coordinates[j];
			Matrix[pos] = new CellNode(types[i], 1);	
		}
	}

	public String[] neighborTypes() {
		return null;
	}

	public int neighborValues(int pos) {
		int values = 0, place = pos;
		Cell cell = types.get(Matrix[pos].type);
		int[] hood = cell.neighborhood;
		for(int i = 1; i < hood.length; i++)
		{
			// if we're going to the next row in the neighborhood, we must
			// also go to the next row in the matrix
			if(i % hood[0] == 0 && place + matrixWidth < Matrix.length)
				place += matrixWidth;
			// we don't count the variable cells in the neighborhood
			if(i != cell.VAR)
				if(Matrix[place].state == 1)
					values += hood[i];
		}
		return values;
	}

	public int neighborValues() {
		return neighborValues(current);	
	}

	public void nextCell() {
		if(current == Matrix.length)
			current = 0;
		else
			current++;
	}

	public void state(int pos, int state, String add) {	
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
	}

	public void state(int state, String add) {
		state(current, state, add);
	}

	public void state(int state) {
		state(current, null);
	}

	public void addCellType(String name, int[] neighborhood, int VAR)
	{
		Cell cell = new Cell(name, neighborhood, VAR);
		types.put(name, cell);
	}

}
