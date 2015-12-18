import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/***
	The Simulator is the driver class of the program, keeping everything in sync. It interfaces directly with the
	InterpVisitor and LSFrame. Taking the output of the CellMatrix from InterpVisitor and giving it to the LSFrame
	creates the graphical simulation you see when the program is ran.
	Additionally, the Simulator takes the top-level AST nodes of each Type and World statement and dispatches them
	per generation. The last bit of functionality the Simulator performs is keyboard input, allowing the simulation
	to be paused or stepped through.
															***/
public class Simulator implements KeyListener {
	// Our worlds and types for repeated execution.
	private ArrayList<AST>	worlds, types;
	private LSFrame		frame;
	private InterpVisitor 	interpVisitor;
	// Key properties of the sim
	private boolean pausable = true, paused = false, steppable = false;
	// The generation we're paused at [this could be replaced with threading]
	private int breakPoint = 0;

	// Constructor; a pivotal do-once.
	public Simulator(AST simAST){
		// Run the source file
		interpVisitor = new InterpVisitor();
		interpVisitor.dispatch(simAST);
		// We don't want to save the statements anymore!
		interpVisitor.saveStmts = false;

		// Get all of the relevant properties
		pausable = interpVisitor.pausable;
		steppable = interpVisitor.steppable;
		worlds	=	interpVisitor.getWorldStmts();
		types	= 	interpVisitor.getTypeStmts();

		// Reference the CellMatrix for instantiating our graphics
		CellMatrix matrix = interpVisitor.getCellMatrix();
		int[] dims = matrix.getDimensions();
		frame = new LSFrame(interpVisitor.frameTitle, 
					interpVisitor.cellWidth, interpVisitor.cellHeight, 
					dims[0], dims[1], matrix.getColorMatrix());
		frame.addKeyListener(this);
		run();
	}

	// run controls the flow of the generations
	public void run(){
		int gens = interpVisitor.generations;
		// We resume from where we last paused until (potentially) the end.
		for(int i = breakPoint; i < gens; i++) {

			// Wait the interval amount of time
			interval();

			// If the user has hit the pause button, save where we're at and break out.
			if(paused){breakPoint = i; break;}

			// Pretty much just go through each cell, run the type statements
			// (they'll terminate if not applicable) and then run
			// the world statements						
			CellMatrix matrix = interpVisitor.getCellMatrix();
			System.out.println("Generation " + (i+1) + "/" + gens);	
			for(int k = 0; k < matrix.cells(); k++) {
				for(AST type : types)
					interpVisitor.dispatch(type);
				interpVisitor.nextCell();
			}		
			for(AST world : worlds)
				interpVisitor.dispatch(world);

			// Prints the matrix out -- could be a toggleable option?
//			System.out.println();		
//			System.out.println();
//			matrix.printMatrix();

			// Save the new generation and let the LSFrame know what's going on.
			interpVisitor.newGeneration();
			int[] dims = matrix.getDimensions();
			frame.update(interpVisitor.cellWidth, interpVisitor.cellHeight, dims[0], dims[1], matrix.getColorMatrix());
			// If the sim is supposed to be stepped through, we pause after each generation.
			if(steppable) paused = true;
		}
		// Here is how we don't get stuck on a pause... A bit of recursion.
		if(paused) run();
	}

	// Checks if sim is pausable/steppable and if space was pressed. 
	@Override
	public void keyPressed(KeyEvent e) {
		if((pausable || steppable) && e.getKeyCode() == KeyEvent.VK_SPACE) {
			paused = !paused;
			if(paused) System.out.println("Simulation paused.");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}

	// Sleeps for the interval amount of time [could be improved via threading]
	private void interval() {
		try{
			Thread.sleep((long)(interpVisitor.interval * 1000));
		}catch(Exception e) {
			// do nothing
		}
	}

}
