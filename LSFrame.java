import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class LSFrame extends Frame {

	private Grid grid;

	public LSFrame(String title, int rows, int columns, int[] states, String[] types) {
		super("sim");
		if(title != null)
			setTitle(title);
		grid = new Grid(rows, columns, states, types);
		grid.setCellValues(states, types);
		// Frame & input setup
//		addMouseListener(menu);
//		addKeyListener(this);
		setLayout(null);
		int winX = (columns*15 < 400) ? 400 : columns*15; 
		int winY = (rows*15 < 400) ? 400 : rows*15;
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
	}

	public void update(int rows, int columns, int[] states, String[] types) {
		if(columns != grid.columns() || rows != grid.rows())
			grid = new Grid(rows, columns, states, types);
		grid.setCellValues(states, types);
		repaint();
	}

	public void paint(Graphics g) {
		grid.paint(g);
//		repaint();
	}
	

}

class Grid {

	private int rows = 15, columns = 15;		// width and height of cells are
							// proportional to the screen
	private String barColor = "0xff0000", backgroundColor; 	// hex colors of bars and background

	private int[][] matrix = new int[rows*columns][4];	
	private Cell[] cells = new Cell[rows*columns];

	private boolean matrixGenerated = false;

	public int rows() {return rows;}
	public int columns() {return columns;}	

	static class Cell{
		public String color,
				type;
		public int state = 0;
		public Cell()
		{
			color = "0xf0f0f0";
			type = "prey";
		}
		public Cell(String color, String type)
		{
			this();
			this.color = color;
			this.type = type;
		}
		public Cell(int state, String type)
		{
			this();
			this.type = type;
			this.state = state;
			if(state == 1) color = "0x000000";
		}
	}	

	public Grid(int columns, int rows, int[] states, String[] types) {
		this.rows = rows;
		this.columns = columns;
		matrix = new int[rows*columns][4];
		cells = new Cell[rows*columns];
		setCellValues(states, types);
	}

	public void setCellValues(int[] states, String[] types) {
		System.out.println("Grid: cells len = " + cells.length);
		calculateMatrix();
		cells = new Cell[states.length];
		for(int i = 0; i < states.length; i++) {
			cells[i] = new Cell(states[i], types[i]);	
		}
	}

	private void calculateMatrix()
	{
		Rectangle bounds = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
		int winWidth = bounds.width, winHeight = bounds.height;
		int cellWidth = 6, cellHeight = 6;
		System.out.println("rows = " + rows + ", columns = " + columns);
		for(int i = 0; i < columns; i++)
		{
			for(int j = 0; j < rows; j++)
			{	
				int pos = (j*columns) + i, startX =43 + i * cellWidth, startY = 43 + j * cellHeight;
				// first element is starting x
				matrix[pos][0] = startX;
				// second element is starting y
				matrix[pos][1] = startY;
				// third element is starting x
				matrix[pos][2] = cellWidth;
				// fourth element is starting x
				matrix[pos][3] = cellHeight;
				cells[i] = new Cell();
			}
		}
		matrixGenerated = true;
	}

	public void paint(Graphics g) {
		if(!matrixGenerated)
			return;
		Graphics2D g2 = (Graphics2D) g;
		for(int i = 0; i < matrix.length; i++){
			if(cells[i].state == 1)
				g2.setPaint(Color.decode(cells[i].color));
			else
				g2.setPaint(Color.white);
			g2.fill(new Rectangle2D.Double(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]));
//			g.fillRect(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]);
//			g.setColor(Color.decode(barColor));
			g2.setPaint(Color.decode(barColor));
			g2.draw(new Rectangle2D.Double(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]));
//			g.drawRect(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]);
		}
	}
}
