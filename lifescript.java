/*******************************************************************************
 *  This is the toplevel driver program for the lifescript language processor.
 *  For language details please see the grammar file 'lifescript.g'.
 *******************************************************************************/

import org.antlr.runtime.*;
import java.util.*;
import java.awt.EventQueue;

public class lifescript {

    public static void main(String[] args) throws Exception {

	// set up and initialize our lexer and parser objects
	// open up the input file
	ANTLRFileStream input = new ANTLRFileStream(args[0]);
	// create the lexer with the input stream
	lifescriptLexer lexer = new lifescriptLexer(input);
	// create a token stream for the parser
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	// create a parser object with the token stream
	lifescriptParser parser = new lifescriptParser(tokens);

	Simulator sim = new Simulator(parser.prog());
    }
}
