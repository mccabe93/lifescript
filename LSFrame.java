import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class LSFrame extends Frame {

	private Grid grid;
	private int winX, winY;

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

	public void update(int cellWidth, int cellHeight, int rows, int columns, int[][] colorMatrix) {
		if(grid == null || cellWidth != grid.cellWidth || cellHeight != grid.cellHeight || columns != grid.columns || rows != grid.rows)
			grid = new Grid(cellWidth, cellHeight, rows, columns, colorMatrix, winX, winY);
		else 
			grid.updateColors(colorMatrix);
		repaint();
	}

	public void paint(Graphics g) {
		grid.paint(g);
		g.setColor(Color.white);
	}
	

}

class Grid {

	public int 	rows, columns,		
			winWidth, winHeight;
	public int cellWidth, cellHeight;	// width and height of cells are
	private String barColor = "0xff0000"; 	// hex colors of bars

	private int[][] matrix;	
	private int[][] colorMatrix;

	private boolean matrixGenerated = false;

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

	public void updateColors(int[][] colors) {
		colorMatrix = new int[colors.length][3];
		colorMatrix = colors;
	}

	private void printColorMatrix() {
		for(int i = 0; i < colorMatrix.length; i++) {
			System.out.print("RGB: ");
			for(int j = 0; j < colorMatrix[i].length; j++)
				System.out.print(colorMatrix[i][j] + " ");
			System.out.println();
		}
	}

	private void calculateMatrix()
	{
		int gridWidth = columns * cellWidth, gridHeight = rows * cellHeight;
		int centerX =  winWidth/2-gridWidth/2, centerY = winHeight/2-gridHeight/2;
		for(int i = 0; i < columns; i++)
		{
			for(int j = 0; j < rows; j++)
			{	
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
