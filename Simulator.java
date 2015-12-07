import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;


public class Simulator {
	private ArrayList<AST>	worlds, types;
	private LSFrame		frame;
	private InterpVisitor 	interpVisitor;
	public Simulator(AST simAST){
		interpVisitor = new InterpVisitor();
		interpVisitor.dispatch(simAST);
		interpVisitor.saveStmts = false;
		worlds	=	interpVisitor.getWorldStmts();
		types	= 	interpVisitor.getTypeStmts();
		System.out.println("World Statements: " + worlds.size());
		System.out.println("Type Statements: " + types.size());
		interpVisitor.getCellMatrix().printMatrix();
		run();
		updateFrame();
	}

	public void updateFrame() {
		EventQueue.invokeLater(new Runnable() {
		    @Override
		    public void run() {	
			CellMatrix matrix = interpVisitor.getCellMatrix();
			int[] dims = matrix.getDimensions();
			System.out.println("# states = " + matrix.getStates().length + "\n# types = " + matrix.getTypes().length);
			frame = new LSFrame(interpVisitor.frameTitle, dims[0], dims[1], matrix.getStates(), matrix.getTypes());
		        frame.setVisible(true);
		    }
		});
	}

	public void run(){
		for(int i = 0; i < interpVisitor.getGenerations()-1; i++) {
			CellMatrix matrix = interpVisitor.getCellMatrix();

			System.out.println("Generation " + (i+1));
			for(int k = 0; k < matrix.cells(); k++) {
				for(AST type : types)
					interpVisitor.dispatch(type);
				interpVisitor.nextCell();
			}
			for(AST world : worlds)
				interpVisitor.dispatch(world);
			System.out.println();		
			System.out.println();
			matrix.printMatrix();

			interpVisitor.newGeneration();
		}
	}

}
