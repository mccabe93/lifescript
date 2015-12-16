import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Simulator implements KeyListener {
	private ArrayList<AST>	worlds, types;
	private LSFrame		frame;
	private InterpVisitor 	interpVisitor;
	private boolean pausable = true, paused = false, steppable = false;
	private int breakPoint = 0;

	public Simulator(AST simAST){
		interpVisitor = new InterpVisitor();
		interpVisitor.dispatch(simAST);
		interpVisitor.saveStmts = false;
		pausable = interpVisitor.pausable;
		steppable = interpVisitor.steppable;
		worlds	=	interpVisitor.getWorldStmts();
		types	= 	interpVisitor.getTypeStmts();
		CellMatrix matrix = interpVisitor.getCellMatrix();
		int[] dims = matrix.getDimensions();
		frame = new LSFrame(interpVisitor.frameTitle, 
					interpVisitor.cellWidth, interpVisitor.cellHeight, 
					dims[0], dims[1], matrix.getColorMatrix());
		frame.addKeyListener(this);
		run();
	}

	public void run(){
		int gens = interpVisitor.generations;
		for(int i = breakPoint; i < gens; i++) {
			interval();
			if(paused){breakPoint = i; break;}
			CellMatrix matrix = interpVisitor.getCellMatrix();
			System.out.println("Generation " + (i+1) + "/" + gens);	
			for(int k = 0; k < matrix.cells(); k++) {
				for(AST type : types)
					interpVisitor.dispatch(type);
				interpVisitor.nextCell();
			}		
			for(AST world : worlds)
				interpVisitor.dispatch(world);
//			System.out.println();		
//			System.out.println();
//			matrix.printMatrix();
			interpVisitor.newGeneration();
			int[] dims = matrix.getDimensions();
			frame.update(interpVisitor.cellWidth, interpVisitor.cellHeight, dims[0], dims[1], matrix.getColorMatrix());
			if(steppable) paused = true;
		}
		if(paused) run();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// If the player presses Escape in a game, it's game over.
		if((pausable || steppable) && e.getKeyCode() == KeyEvent.VK_SPACE) {
			paused = !paused;
			if(paused) System.out.println("Simulation paused.");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	private void interval() {
		try{
			Thread.sleep((long)(interpVisitor.interval * 1000));
		}catch(Exception e) {
			// do nothing
		}
	}

}
