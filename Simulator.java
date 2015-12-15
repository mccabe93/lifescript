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
		CellMatrix matrix = interpVisitor.getCellMatrix();
		int[] dims = matrix.getDimensions();
		frame = new LSFrame(interpVisitor.frameTitle, 
					interpVisitor.cellWidth, interpVisitor.cellHeight, 
					dims[0], dims[1], matrix.getColorMatrix());
		run();
	}

	public void run(){
		for(int i = 0; i < interpVisitor.generations; i++) {
			interval();
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
			int[] dims = matrix.getDimensions();
			frame.update(interpVisitor.cellWidth, interpVisitor.cellHeight, dims[0], dims[1], matrix.getColorMatrix());
		}
	}

	private void interval() {
		try{
			Thread.sleep((long)(interpVisitor.interval * 1000));
		}catch(Exception e) {
			// do nothing
		}
	}

}
