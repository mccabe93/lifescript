import java.util.*;
import java.io.*;

public class Simulator {
	private ArrayList<AST>	worlds, types;
	private CellMatrix	matrix;
	private LSFrame		frame;
	private InterpVisitor 	interpVisitor;
	public Simulator(AST simAST){
		interpVisitor = new InterpVisitor();
		interpVisitor.dispatch(simAST);
		interpVisitor.saveStmts = false;
		worlds	=	interpVisitor.getWorldStmts();
		types	= 	interpVisitor.getTypeStmts();
		matrix	= 	interpVisitor.getCellMatrix();
		frame	= 	interpVisitor.getLSFrame();
		System.out.println("World Statements: " + worlds.size());
		System.out.println("Type Statements: " + types.size());
		matrix.printMatrix();
		run();
	}

	public void run(){
		for(int i = 0; i < interpVisitor.getGenerations()-1; i++) {
			interpVisitor.setCellMatrix(matrix);
			interpVisitor.setLSFrame(frame);
			System.out.println("Generation " + (i+1));
			for(int k = 0; k < matrix.cells(); k++) {
				for(AST type : types)
					interpVisitor.dispatch(type);
				interpVisitor.nextCell();
			}
//			for(AST world : worlds)
//				interpVisitor.dispatch(world);
			System.out.println();		
			System.out.println();
			matrix.printMatrix();
			matrix	= interpVisitor.getCellMatrix();
			frame	= interpVisitor.getLSFrame();
		}
	}

}
