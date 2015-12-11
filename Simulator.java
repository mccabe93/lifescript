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
		CellMatrix matrix = interpVisitor.getCellMatrix();
		int[] dims = matrix.getDimensions();
		System.out.println("dimensions loaded = " + dims);
		frame = new LSFrame(interpVisitor.frameTitle, dims[0], dims[1], matrix.getStates(), matrix.getTypes());
		run();
	}

	public void run(){
		try{
			Thread.sleep((long)(interpVisitor.interval * 1000));
		}catch(Exception e) {
			// do nothing
		}
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
			int[] dims = matrix.getDimensions();
			frame.update(dims[0], dims[1], matrix.getStates(), matrix.getTypes());
		}
	}

}
