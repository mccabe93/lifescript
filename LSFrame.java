import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/***
	The LSFrame handles the graphical side of the simulation.
***/

public class LSFrame extends Frame {

	// The grid we'll be drawing/updating
	private Grid grid;
	// The dimensions of the window
	private int winX, winY;

	// The constructor that initializes the frame and grid.
	public LSFrame(String title, int cellWidth, int cellHeight, int rows, int columns, int[][] colorMatrix) {
		super("sim");
		if(title != null)
			setTitle(title);
		// Frame setup
		setLayout(null);
		winX = (columns*cellWidth < 540) ? 540 : columns*cellWidth; 
		winY = (rows*cellHeight < 540) ? 540 : rows*cellHeight;
		setSize(winX,winY);
		setBackground(Color.white);
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		
		addWindowListener( new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent we) {
			System.exit(0);
		    }
		} );

		update(cellWidth, cellHeight, rows, columns, colorMatrix);
	}

	// Each generation we update the grid.
	public void update(int cellWidth, int cellHeight, int rows, int columns, int[][] colorMatrix) {
		// If the grid doesn't yet exist, instantiate it.
		if(grid == null || cellWidth != grid.cellWidth || cellHeight != grid.cellHeight || columns != grid.columns || rows != grid.rows)
			grid = new Grid(cellWidth, cellHeight, rows, columns, colorMatrix, winX, winY);
		else 
			grid.updateColors(colorMatrix);
		repaint();
	}

	// Redraw the graphics.
	public void update(Graphics g) {
		grid.paint(g);
	}
	

}

/***
	The Grid class is the workhorse of LSFrame.
***/
class Grid {

	// Dimensions of our matrix
	public int 	rows, columns,		
			winWidth, winHeight;
	public int cellWidth, cellHeight;

	// Hex color of bars [perhaps in the future this could be parameterized...]
	private String barColor = "0xff0000";

	// The matrix we'll be drawing [cell][xOffset,yOffset,+cellWidth,+cellHeight]
	// This could be simplified now that we use a colorMatrix!
	private int[][] matrix;	

	// The colorMatrix we'll be using for reference. [cell][r,g,b]
	private int[][] colorMatrix;

	// Simple null check. Don't paint unless our matrix has been created.
	private boolean matrixGenerated = false;

	// Instantiation of the grid
	public Grid(int cellWidth, int cellHeight, int columns, int rows, int[][] colors, int winWidth, int winHeight) {
		this.rows = rows;
		this.columns = columns;
		this.cellWidth = cellWidth;
		this.cellHeight = cellHeight;
		this.winWidth = winWidth;
		this.winHeight = winHeight;
		matrix = new int[rows*columns][4];
		calculateMatrix();
		updateColors(colors);
	}

	// Simple colorMatrix updater
	public void updateColors(int[][] colors) {
		colorMatrix = new int[colors.length][3];
		colorMatrix = colors;
	}

	// Debug method that outputs the color matrix.
	private void printColorMatrix() {
		for(int i = 0; i < colorMatrix.length; i++) {
			System.out.print("RGB: ");
			for(int j = 0; j < colorMatrix[i].length; j++)
				System.out.print(colorMatrix[i][j] + " ");
			System.out.println();
		}
	}

	// Calculates the matrix based on current dimensions.
	private void calculateMatrix()
	{
		int gridWidth = columns * cellWidth, gridHeight = rows * cellHeight;
		int centerX =  winWidth/2-gridWidth/2, centerY = winHeight/2-gridHeight/2;
		for(int i = 0; i < columns; i++)
		{
			for(int j = 0; j < rows; j++)
			{	
				// 2D -> 1D coordinates
				int pos = (j*columns) + i, startX = centerX + i * cellWidth, startY = centerY + j * cellHeight;
				// first element is starting x
				matrix[pos][0] = startX;
				// second element is starting y
				matrix[pos][1] = startY;
				// third element is starting x
				matrix[pos][2] = cellWidth;
				// fourth element is starting x
				matrix[pos][3] = cellHeight;
			}
		}
		matrixGenerated = true;
	}

	// Draws the matrix per index
	public void paint(Graphics g) {
		if(!matrixGenerated)
			return;
		Graphics2D g2 = (Graphics2D) g;
		for(int i = 0; i < matrix.length; i++){
			int[] rgb = colorMatrix[i];
			g2.setPaint(new Color(rgb[0], rgb[1], rgb[2]));
			g2.fill(new Rectangle2D.Double(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]));
			g2.setPaint(Color.decode(barColor));
			g2.draw(new Rectangle2D.Double(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]));
		}
	}
}
