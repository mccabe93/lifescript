import java.awt.*;
import javax.swing.*;

class Surface extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawLine(30, 30, 200, 30);
        g2d.drawLine(200, 30, 30, 200);
        g2d.drawLine(30, 200, 200, 200);
        g2d.drawLine(200, 200, 30, 30);

	System.out.println(getWidth() + "," + getHeight());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}

class Grid extends JPanel {

	private int rows = 15, columns = 15;		// width and height of cells are
							// proportional to the screen
	private String barColor = "0xff0000", backgroundColor; 	// hex colors of bars and background

	private int[][] matrix = new int[rows*columns][4];	
	private Cell[] cells = new Cell[rows*columns];

	private boolean matrixGenerated = false;
	
	static class Cell{
		public String color,
				type;
		public Cell()
		{
			color = "0xf0f0f0";
			type = "prey";
		}
		public Cell(String color, String type)
		{
			this.color = color;
			this.type = type;
		}
	}	

	private void getMatrix()
	{
		int winWidth = getWidth(), winHeight = getHeight();
		int cellWidth = winWidth / rows, cellHeight = winHeight / columns;
		System.out.println("cellWidth = " + cellWidth + ", cellHeight = " + cellHeight);
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{	
				int pos = (i*columns) + j, startX = j * cellWidth, startY = i * cellHeight;
				// first element is starting x
				matrix[pos][0] = startX;
				// second element is starting y
				matrix[pos][1] = startY;
				// third element is starting x
				matrix[pos][2] = cellWidth;
				// fourth element is starting x
				matrix[pos][3] = cellHeight;
				cells[pos] = new Cell();
			}
		}
		for(int i = 0; i < 15; i++)
		{
			int randx = (int)(Math.random()*15), randy = (int)(Math.random()*15);
			cells[randx*randy] = new Cell("0x000000", "predator");
		}
		matrixGenerated = true;
	}
	private void doDrawing(Graphics g) {
		if(!matrixGenerated)
			getMatrix();
		for(int i = 0; i < matrix.length; i++){
			g.setColor(Color.decode(cells[i].color));
			g.fillRect(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]);
			g.setColor(Color.decode(barColor));
			g.drawRect(matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		doDrawing(g);
	}
}

public class LSFrame extends JFrame {

	private String title;
	private int sizeX, sizeY;

	public LSFrame(String title, int sizeX, int sizeY) {
		if(title == null)
			title = "sim";
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Grid());	
	}


	public LSFrame()
	{
		this("sim", 540, 540);
	}
/*
	private void initUI() {

		setTitle("sim");
		setSize(540, 540);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Grid());
	}
*/
/*
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                LSFrame ex = new LSFrame();
                ex.setVisible(true);
            }
        });
    }
*/
}
