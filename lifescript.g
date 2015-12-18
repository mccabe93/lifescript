grammar lifescript;

//***
// Many of the nodes used in this grammar were written by Lutz Hamel for
// the SIMPLE1MULTI language implementation.
// Here is a list of the ones written from scratch:
// 1. EndStmt
// 2. EOLStmt
// 3. ForStmt
// 4. InputStmt
// 5. BinopExpr became MathExpr -- minor additions made
// 6. NegExpr

//********************************************************
// lifescript grammar implementation

@header {
import java.util.HashMap;
import java.util.Map;
}

@members{
public static HashMap usageMap = new HashMap();

public void reportError(RecognitionException e) {
	// call the Parser member function to report the error
	displayRecognitionError(this.getTokenNames(), e);
	// exit
	System.exit(1);
}
}

prog	returns [AST ast] 
	:	{$ast = new StmtList();}
		(stmt {$ast.addAST($stmt.ast);})+
	;

stmt	returns [Stmt ast]
	:	ID '=' exp
		{$ast = new AssignStmt($ID.text, $exp.ast);}

	|	'input' (STRING ',')? ID		
		{$ast = new InputStmt($STRING.text, $ID.text);}

	// This will actually be received as a BlockStmt node with all PrNUMStmt nodes are appended to it
	|	'print' // We create a BlockStmt
			{BlockStmt prints = new BlockStmt();}
			// and append all values/strings as nodes to its AST
			(v1=value {prints.addAST(new PrintStmt($v1.ast));}
			| text1=STRING {prints.addAST(new PrintStmt($text1.text));}
			)  
			(',' (v2=value {prints.addAST(new PrintStmt($v2.ast));}	// We append more nodes
				| text2=STRING {prints.addAST(new PrintStmt($text2.text));}
			))* 
			// Finally, we add an EOLStmt and set this node equal to the BlockStmt
			{prints.addAST(new EOLStmt()); 
			$ast = prints;}
	|	'end'					{$ast = new EndStmt();}

	// Just like the prNUM statement, we create a 'root' node via BlockStmt. We do so for both
	// the If and the Else.
	|	'if' e1=exp 'then' 
			{BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();}
			(s=stmt {ifBlock.addAST($s.ast);})+ 
			('else' 
				(s2=stmt {elseBlock.addAST($s2.ast);})+ 
			)? 
		'endif'
		// The ASTs of each BlockStmt is passed, and this node becomes the IfStmt
		{$ast = new IfStmt($e1.ast, ifBlock, elseBlock);}
	
	// The same BlockStmt logic is applied again, coupled with an expression to test in the while loop
	|	'while' exp {BlockStmt whileBlock = new BlockStmt();}
			(s=stmt {whileBlock.addAST($s.ast);})+  'endwhile'	
			{$ast = new WhileStmt($exp.ast,whileBlock);}
	
	// The for loop includes the BlockStmt logic, along with grabbing quite a few other values
	|	'for' v3=ID '=' start2=exp 'to' lim=exp ('step' step=exp)? 
			{BlockStmt forBlock = new BlockStmt();}
		    	(s=stmt {forBlock.addAST($s.ast);})+   
			'next' v4=ID
		{$ast = new ForStmt($v3.text, $start2.ast, $lim.ast, $step.ast, forBlock, $v4.text);}
	
	|	'type' v4=ID ':'
			{BlockStmt neighBlock = new BlockStmt();}
			('Neighborhood' '[' neighWidth=exp ']' '='
			'{' (neigh1=exp ',' {neighBlock.addAST(new NeighborhoodStmt($neigh1.ast, false));})* 
			'VAR' {neighBlock.addAST(new NeighborhoodStmt(new NumExpr(0.0), true));}
			(',' neigh2=exp {neighBlock.addAST(new NeighborhoodStmt($neigh2.ast, false));})* '}')
			
			{BlockStmt typelogic = new BlockStmt();}
		    	(s=stmt {typelogic.addAST($s.ast);})+
		'endtype' 
		{$ast = new TypeStmt($v4.text, neighWidth, neighBlock, typelogic);}
	
	|	'alive'
		{$ast = new AliveStmt();}

	|	'dead'
		{$ast = new DeadStmt();}

	|	'become' STRING
		{$ast = new BecomeStmt($STRING.text);}

	|	'setstate' ('of' coordexp)? 'to' exp
		{$ast = new SetStateStmt($coordexp.ast, $exp.ast);}

	|	'statecolor' exp 'is' colorexp
		{$ast = new StateColorStmt($exp.ast, $colorexp.ast);}

	|	'create' STRING 'at' coordexp
		{$ast = new CreateStmt($STRING.text, $coordexp.ast);}

	|	'kill' (STRING)? 'at' coordexp
		{$ast = new KillStmt($STRING.text, $coordexp.ast);}

	|	'addrow'
		{$ast = new AddRowStmt();}

	|	'addcolumn'
		{$ast = new AddColumnStmt();}
	
	|	'setcolor' ('at' coordexp)? 'to' colorexp
		{$ast = new SetColorStmt($coordexp.ast, $colorexp.ast);}

	|	'world' ':' {BlockStmt worldBlock = new BlockStmt();}
			(s=stmt {worldBlock.addAST($s.ast);})+
		'endworld' {$ast = new WorldStmt(worldBlock);}

	|	'Properties' ':'
			{BlockStmt properties = new BlockStmt();}
			('Title' '=' title=STRING)? // otherwise sim
			('Cell Size' '=' cs=coordexp {properties.addAST(new CellSizeStmt(cs));})? // defaults 10px
			('Dimensions' '=' dims=coordexp {properties.addAST(new DimensionsStmt(dims));})? // otherwise 540,540
			('Start' '=' '{' {BlockStmt startConditions = new BlockStmt();}
				'(' celltype=STRING ',' cellcoords=coordexp 
				{startConditions.addAST(new CellStmt($celltype.text, $cellcoords.ast));}
				')'
				(',' '(' celltype=STRING ',' cellcoords=coordexp 
				{startConditions.addAST(new CellStmt($celltype.text, $cellcoords.ast));}
				')')* '}' 
				{properties.addAST(startConditions);})?
			('Default Type' '=' dt=STRING)?
			('Generations' '=' gens=exp {properties.addAST(new GenerationsStmt(gens));})? // otherwise infinite
			('Interval' '=' intervals=exp {properties.addAST(new IntervalStmt(intervals));})? // otherwise 0.3 seconds
			('Pausable' '=' pause=exp {properties.addAST(new PausableStmt(pause));})? // defaults true
			('Steppable' '=' sb=exp {properties.addAST(new SteppableStmt(sb));})? // defaults false 
			{$ast = new PropertiesStmt($title.text, $dt.text, properties);}
	;

coordexp returns [CoordExpr ast]
	:	'(' e1=exp ',' e2=exp ')'		{$ast = new CoordExpr($e1.ast, $e2.ast);}
	;

colorexp returns [ColorExpr ast]
	:	'(' e1=exp ',' e2=exp ',' e3=exp ')'	{$ast = new ColorExpr($e1.ast, $e2.ast, $e3.ast);}
	|	'(' STRING ')'					{$ast = new ColorExpr($STRING.text);} // hex color encoding
	;

// Mathematical / numerical expressions

exp	returns [Expr ast]
	:	logexp {$ast = $logexp.ast; }
	;

// simple extension from the SIMPLE1MULTI structure
logexp	returns [Expr ast]
	:	e1=relexp { $ast = $e1.ast; }
		(
			('&' e2=relexp { $ast = new MathExpr(MathExpr.AND, $ast, $e2.ast); }) | 
			('|' e3=relexp { $ast = new MathExpr(MathExpr.OR, $ast, $e3.ast); })
		)*
	; 

relexp returns [Expr ast]
	:	e1=addexp { $ast = $e1.ast; } 
		(
			('==' e2=addexp { $ast = new MathExpr(MathExpr.EQ,$ast,$e2.ast); })|
			('<=' e3=addexp { $ast = new MathExpr(MathExpr.LESSEQ,$ast,$e3.ast); })|
			('>=' e4=addexp { $ast = new MathExpr(MathExpr.MOREEQ,$ast,$e4.ast); })|
			('<' e5=addexp { $ast = new MathExpr(MathExpr.STRICTLESS,$ast,$e5.ast); })|
			('>' e6=addexp { $ast = new MathExpr(MathExpr.STRICTMORE,$ast,$e6.ast); })|
			('!=' e7=addexp { $ast = new MathExpr(MathExpr.NOTEQ,$ast,$e7.ast); })
		)*
	;

addexp returns [Expr ast]
	:	e1=mulexp { $ast = $e1.ast; }
		(
			('+' e2=mulexp { $ast = new MathExpr(MathExpr.ADD,$ast,$e2.ast); })|
			('-' e3=mulexp { $ast = new MathExpr(MathExpr.MINUS,$ast,$e3.ast); })
		)* 
	;

mulexp returns [Expr ast]
	:	e1=atom { $ast = $e1.ast; }
		(
			('*' e2=atom { $ast = new MathExpr(MathExpr.MULT,$ast,$e2.ast); })|
			('/' e3=atom { $ast = new MathExpr(MathExpr.DIV,$ast,$e3.ast); })
		)* 
	;

atom 	returns [Expr ast]
	:	'(' exp ')'   	{ $ast = new ParenExpr($exp.ast); }
	|	'!' exp		{ $ast = new NegExpr($exp.ast); }	
	|	ID		{ $ast = new VarExpr($ID.text); usageMap.put($ID.text,new Boolean(true)); }
	|	num		{ $ast = new NumExpr($num.text); }
	|	'-' num		{ $ast = new NumExpr('-' + $num.text); }
	|	BOOLEAN		{ $ast = new BooleanExpr($BOOLEAN.text); }	
	|	'neighbors' ('of' coordexp)? ('that' 'are' STRING)?
		{$ast = new NeighborsExpr($coordexp.ast, $STRING.text);}
	|	'cell' 'at' coordexp ('is' STRING)? 
		{ $ast = new CellCheckExpr($STRING.text, $coordexp.ast, false);}
	|	'neighbor' 'at' coordexp ('is' STRING)? 
		{ $ast = new CellCheckExpr($STRING.text, $coordexp.ast, true);}
	|	'alive'	{$ast = new AliveExpr();}
	|	'state' ('of' coordexp)? {$ast = new GetStateExpr($coordexp.ast);}
	|	'random' '(' lb=exp ',' ub=exp ')' {$ast = new RandomExpr($lb.ast, $ub.ast);}
	;

value 	returns [Expr ast]	
	:	ID		{ $ast = new VarExpr($ID.text); usageMap.put($ID.text,new Boolean(true)); }
	|	num		{ $ast = new NumExpr($num.text); }
	|	'-' num		{ $ast = new NumExpr('-' + $num.text); }
	;

num : INT | FLOAT
    ;

BOOLEAN : 'true' | 'false';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	('0'..'9')+
    ;

FLOAT
    : INT '.' INT
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

COMMENT    
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
