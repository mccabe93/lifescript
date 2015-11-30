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
		worlds	=	interpVisitor.getWorldStmts();
		types	= 	interpVisitor.getTypeStmts();
		matrix	= 	interpVisitor.getCellMatrix();
		frame	= 	interpVisitor.getLSFrame();
		System.out.println("World Statements: " + worlds.size());
		System.out.println("Type Statements: " + types.size());
	}

	public void run(){
		interpVisitor.setCellMatrix(matrix);
		interpVisitor.setLSFrame(frame);
		for(int i = 0; i < interpVisitor.getGenerations(); i++) {
//			for(AST world : worlds)
//				interpVisitor.dispatch(world);
		}
	}

}
