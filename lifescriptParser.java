// $ANTLR 3.5 lifescript.g 2015-12-12 17:14:30

import java.util.HashMap;
import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lifescriptParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "COMMENT", "ESC_SEQ", 
		"FLOAT", "ID", "INT", "STRING", "WS", "'!'", "'!='", "'&'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'/'", "':'", "'<'", "'<='", "'='", "'=='", 
		"'>'", "'>='", "'Cell Size'", "'Default Type'", "'Dimensions'", "'Generation Type'", 
		"'Generations'", "'Interval'", "'Neighborhood'", "'Pausable'", "'Properties'", 
		"'Start'", "'Steppable'", "'Title'", "'VAR'", "'['", "']'", "'addcolumn'", 
		"'addrow'", "'alive'", "'at'", "'cell'", "'create'", "'dead'", "'else'", 
		"'end'", "'endif'", "'endtype'", "'endwhile'", "'endworld'", "'for'", 
		"'if'", "'input'", "'is'", "'kill'", "'next'", "'print'", "'random'", 
		"'setcolor'", "'step'", "'then'", "'to'", "'type'", "'while'", "'world'", 
		"'{'", "'|'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int BOOLEAN=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int FLOAT=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int STRING=10;
	public static final int WS=11;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public lifescriptParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public lifescriptParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return lifescriptParser.tokenNames; }
	@Override public String getGrammarFileName() { return "lifescript.g"; }


	public static HashMap usageMap = new HashMap();

	public void reportError(RecognitionException e) {
		// call the Parser member function to report the error
		displayRecognitionError(this.getTokenNames(), e);
		// exit
		System.exit(1);
	}



	// $ANTLR start "prog"
	// lifescript.g:33:1: prog returns [AST ast] : ( stmt )+ ;
	public final AST prog() throws RecognitionException {
		AST ast = null;


		Stmt stmt1 =null;

		try {
			// lifescript.g:34:2: ( ( stmt )+ )
			// lifescript.g:34:4: ( stmt )+
			{
			ast = new StmtList();
			// lifescript.g:35:3: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==37||(LA1_0 >= 44 && LA1_0 <= 46)||(LA1_0 >= 49 && LA1_0 <= 50)||LA1_0==52||(LA1_0 >= 57 && LA1_0 <= 59)||LA1_0==61||LA1_0==63||LA1_0==65||(LA1_0 >= 69 && LA1_0 <= 71)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// lifescript.g:35:4: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog46);
					stmt1=stmt();
					state._fsp--;

					ast.addAST(stmt1);
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? ( 'Cell Size' '=' cs= coordexp )? );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token text1=null;
		Token text2=null;
		Token v3=null;
		Token v4=null;
		Token title=null;
		Token genType=null;
		Token celltype=null;
		Token dt=null;
		Token ID2=null;
		Token STRING4=null;
		Token ID5=null;
		Token ID7=null;
		Token ID9=null;
		Expr v1 =null;
		Expr v2 =null;
		Expr e1 =null;
		Stmt s =null;
		Stmt s2 =null;
		Expr start2 =null;
		Expr lim =null;
		Expr step =null;
		Expr neighWidth =null;
		Expr neigh1 =null;
		Expr neigh2 =null;
		CoordExpr dims =null;
		CoordExpr cellcoords =null;
		Expr gens =null;
		Expr intervals =null;
		Expr pause =null;
		Expr sb =null;
		CoordExpr cs =null;
		Expr exp3 =null;
		Expr exp6 =null;
		CoordExpr coordexp8 =null;
		CoordExpr coordexp10 =null;
		CoordExpr coordexp11 =null;
		ColorExpr colorexp12 =null;

		try {
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? ( 'Cell Size' '=' cs= coordexp )? )
			int alt29=17;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt29=1;
				}
				break;
			case 59:
				{
				alt29=2;
				}
				break;
			case 63:
				{
				alt29=3;
				}
				break;
			case 52:
				{
				alt29=4;
				}
				break;
			case 58:
				{
				alt29=5;
				}
				break;
			case 70:
				{
				alt29=6;
				}
				break;
			case 57:
				{
				alt29=7;
				}
				break;
			case 69:
				{
				alt29=8;
				}
				break;
			case 46:
				{
				alt29=9;
				}
				break;
			case 50:
				{
				alt29=10;
				}
				break;
			case 49:
				{
				alt29=11;
				}
				break;
			case 61:
				{
				alt29=12;
				}
				break;
			case 45:
				{
				alt29=13;
				}
				break;
			case 44:
				{
				alt29=14;
				}
				break;
			case 65:
				{
				alt29=15;
				}
				break;
			case 71:
				{
				alt29=16;
				}
				break;
			case 37:
				{
				alt29=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// lifescript.g:39:4: ID '=' exp
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_stmt65); 
					match(input,25,FOLLOW_25_in_stmt67); 
					pushFollow(FOLLOW_exp_in_stmt69);
					exp3=exp();
					state._fsp--;

					ast = new AssignStmt((ID2!=null?ID2.getText():null), exp3);
					}
					break;
				case 2 :
					// lifescript.g:42:4: 'input' ( STRING ',' )? ID
					{
					match(input,59,FOLLOW_59_in_stmt79); 
					// lifescript.g:42:12: ( STRING ',' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==STRING) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// lifescript.g:42:13: STRING ','
							{
							STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_stmt82); 
							match(input,19,FOLLOW_19_in_stmt84); 
							}
							break;

					}

					ID5=(Token)match(input,ID,FOLLOW_ID_in_stmt88); 
					ast = new InputStmt((STRING4!=null?STRING4.getText():null), (ID5!=null?ID5.getText():null));
					}
					break;
				case 3 :
					// lifescript.g:46:4: 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )*
					{
					match(input,63,FOLLOW_63_in_stmt102); 
					BlockStmt prints = new BlockStmt();
					// lifescript.g:49:4: (v1= value |text1= STRING )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= FLOAT && LA3_0 <= INT)||LA3_0==20) ) {
						alt3=1;
					}
					else if ( (LA3_0==STRING) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// lifescript.g:49:5: v1= value
							{
							pushFollow(FOLLOW_value_in_stmt120);
							v1=value();
							state._fsp--;

							prints.addAST(new PrintStmt(v1));
							}
							break;
						case 2 :
							// lifescript.g:50:6: text1= STRING
							{
							text1=(Token)match(input,STRING,FOLLOW_STRING_in_stmt131); 
							prints.addAST(new PrintStmt((text1!=null?text1.getText():null)));
							}
							break;

					}

					// lifescript.g:52:4: ( ',' (v2= value |text2= STRING ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==19) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// lifescript.g:52:5: ',' (v2= value |text2= STRING )
							{
							match(input,19,FOLLOW_19_in_stmt146); 
							// lifescript.g:52:9: (v2= value |text2= STRING )
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( ((LA4_0 >= FLOAT && LA4_0 <= INT)||LA4_0==20) ) {
								alt4=1;
							}
							else if ( (LA4_0==STRING) ) {
								alt4=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 4, 0, input);
								throw nvae;
							}

							switch (alt4) {
								case 1 :
									// lifescript.g:52:10: v2= value
									{
									pushFollow(FOLLOW_value_in_stmt151);
									v2=value();
									state._fsp--;

									prints.addAST(new PrintStmt(v2));
									}
									break;
								case 2 :
									// lifescript.g:53:7: text2= STRING
									{
									text2=(Token)match(input,STRING,FOLLOW_STRING_in_stmt164); 
									prints.addAST(new PrintStmt((text2!=null?text2.getText():null)));
									}
									break;

							}

							}
							break;

						default :
							break loop5;
						}
					}

					prints.addAST(new EOLStmt()); 
								ast = prints;
					}
					break;
				case 4 :
					// lifescript.g:58:4: 'end'
					{
					match(input,52,FOLLOW_52_in_stmt188); 
					ast = new EndStmt();
					}
					break;
				case 5 :
					// lifescript.g:62:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,58,FOLLOW_58_in_stmt204); 
					pushFollow(FOLLOW_exp_in_stmt208);
					e1=exp();
					state._fsp--;

					match(input,67,FOLLOW_67_in_stmt210); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:64:4: (s= stmt )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==37||(LA6_0 >= 44 && LA6_0 <= 46)||(LA6_0 >= 49 && LA6_0 <= 50)||LA6_0==52||(LA6_0 >= 57 && LA6_0 <= 59)||LA6_0==61||LA6_0==63||LA6_0==65||(LA6_0 >= 69 && LA6_0 <= 71)) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// lifescript.g:64:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt224);
							s=stmt();
							state._fsp--;

							ifBlock.addAST(s);
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// lifescript.g:65:4: ( 'else' (s2= stmt )+ )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==51) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// lifescript.g:65:5: 'else' (s2= stmt )+
							{
							match(input,51,FOLLOW_51_in_stmt235); 
							// lifescript.g:66:5: (s2= stmt )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID||LA7_0==37||(LA7_0 >= 44 && LA7_0 <= 46)||(LA7_0 >= 49 && LA7_0 <= 50)||LA7_0==52||(LA7_0 >= 57 && LA7_0 <= 59)||LA7_0==61||LA7_0==63||LA7_0==65||(LA7_0 >= 69 && LA7_0 <= 71)) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// lifescript.g:66:6: s2= stmt
									{
									pushFollow(FOLLOW_stmt_in_stmt245);
									s2=stmt();
									state._fsp--;

									elseBlock.addAST(s2);
									}
									break;

								default :
									if ( cnt7 >= 1 ) break loop7;
									EarlyExitException eee = new EarlyExitException(7, input);
									throw eee;
								}
								cnt7++;
							}

							}
							break;

					}

					match(input,53,FOLLOW_53_in_stmt261); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 6 :
					// lifescript.g:73:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,70,FOLLOW_70_in_stmt277); 
					pushFollow(FOLLOW_exp_in_stmt279);
					exp6=exp();
					state._fsp--;

					BlockStmt whileBlock = new BlockStmt();
					// lifescript.g:74:4: (s= stmt )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ID||LA9_0==37||(LA9_0 >= 44 && LA9_0 <= 46)||(LA9_0 >= 49 && LA9_0 <= 50)||LA9_0==52||(LA9_0 >= 57 && LA9_0 <= 59)||LA9_0==61||LA9_0==63||LA9_0==65||(LA9_0 >= 69 && LA9_0 <= 71)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// lifescript.g:74:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt289);
							s=stmt();
							state._fsp--;

							whileBlock.addAST(s);
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input,55,FOLLOW_55_in_stmt296); 
					ast = new WhileStmt(exp6,whileBlock);
					}
					break;
				case 7 :
					// lifescript.g:78:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,57,FOLLOW_57_in_stmt311); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt315); 
					match(input,25,FOLLOW_25_in_stmt317); 
					pushFollow(FOLLOW_exp_in_stmt321);
					start2=exp();
					state._fsp--;

					match(input,68,FOLLOW_68_in_stmt323); 
					pushFollow(FOLLOW_exp_in_stmt327);
					lim=exp();
					state._fsp--;

					// lifescript.g:78:44: ( 'step' step= exp )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==66) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:78:45: 'step' step= exp
							{
							match(input,66,FOLLOW_66_in_stmt330); 
							pushFollow(FOLLOW_exp_in_stmt334);
							step=exp();
							state._fsp--;

							}
							break;

					}

					BlockStmt forBlock = new BlockStmt();
					// lifescript.g:80:8: (s= stmt )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ID||LA11_0==37||(LA11_0 >= 44 && LA11_0 <= 46)||(LA11_0 >= 49 && LA11_0 <= 50)||LA11_0==52||(LA11_0 >= 57 && LA11_0 <= 59)||LA11_0==61||LA11_0==63||LA11_0==65||(LA11_0 >= 69 && LA11_0 <= 71)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// lifescript.g:80:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt354);
							s=stmt();
							state._fsp--;

							forBlock.addAST(s);
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input,62,FOLLOW_62_in_stmt366); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt370); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:84:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,69,FOLLOW_69_in_stmt381); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt385); 
					match(input,22,FOLLOW_22_in_stmt387); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:86:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:86:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,35,FOLLOW_35_in_stmt398); 
					match(input,42,FOLLOW_42_in_stmt400); 
					pushFollow(FOLLOW_exp_in_stmt404);
					neighWidth=exp();
					state._fsp--;

					match(input,43,FOLLOW_43_in_stmt406); 
					match(input,25,FOLLOW_25_in_stmt408); 
					match(input,72,FOLLOW_72_in_stmt413); 
					// lifescript.g:87:8: (neigh1= exp ',' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||(LA12_0 >= FLOAT && LA12_0 <= INT)||LA12_0==12||LA12_0==15||LA12_0==20||LA12_0==46||LA12_0==48||LA12_0==64) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// lifescript.g:87:9: neigh1= exp ','
							{
							pushFollow(FOLLOW_exp_in_stmt418);
							neigh1=exp();
							state._fsp--;

							match(input,19,FOLLOW_19_in_stmt420); 
							neighBlock.addAST(new NeighborhoodStmt(neigh1, false));
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,41,FOLLOW_41_in_stmt430); 
					neighBlock.addAST(new NeighborhoodStmt(new NumExpr(0.0), true));
					// lifescript.g:89:4: ( ',' neigh2= exp )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==19) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// lifescript.g:89:5: ',' neigh2= exp
							{
							match(input,19,FOLLOW_19_in_stmt438); 
							pushFollow(FOLLOW_exp_in_stmt442);
							neigh2=exp();
							state._fsp--;

							neighBlock.addAST(new NeighborhoodStmt(neigh2, false));
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,74,FOLLOW_74_in_stmt448); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:92:8: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||LA14_0==37||(LA14_0 >= 44 && LA14_0 <= 46)||(LA14_0 >= 49 && LA14_0 <= 50)||LA14_0==52||(LA14_0 >= 57 && LA14_0 <= 59)||LA14_0==61||LA14_0==63||LA14_0==65||(LA14_0 >= 69 && LA14_0 <= 71)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// lifescript.g:92:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt470);
							s=stmt();
							state._fsp--;

							typelogic.addAST(s);
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input,54,FOLLOW_54_in_stmt478); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 9 :
					// lifescript.g:96:4: 'alive'
					{
					match(input,46,FOLLOW_46_in_stmt490); 
					ast = new AliveStmt();
					}
					break;
				case 10 :
					// lifescript.g:99:4: 'dead'
					{
					match(input,50,FOLLOW_50_in_stmt500); 
					ast = new DeadStmt();
					}
					break;
				case 11 :
					// lifescript.g:102:4: 'create' ID 'at' coordexp
					{
					match(input,49,FOLLOW_49_in_stmt510); 
					ID7=(Token)match(input,ID,FOLLOW_ID_in_stmt512); 
					match(input,47,FOLLOW_47_in_stmt514); 
					pushFollow(FOLLOW_coordexp_in_stmt516);
					coordexp8=coordexp();
					state._fsp--;

					ast = new CreateStmt((ID7!=null?ID7.getText():null), coordexp8);
					}
					break;
				case 12 :
					// lifescript.g:105:4: 'kill' ( ID )? 'at' coordexp
					{
					match(input,61,FOLLOW_61_in_stmt526); 
					// lifescript.g:105:11: ( ID )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ID) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// lifescript.g:105:12: ID
							{
							ID9=(Token)match(input,ID,FOLLOW_ID_in_stmt529); 
							}
							break;

					}

					match(input,47,FOLLOW_47_in_stmt533); 
					pushFollow(FOLLOW_coordexp_in_stmt535);
					coordexp10=coordexp();
					state._fsp--;

					ast = new KillStmt((ID9!=null?ID9.getText():null), coordexp10);
					}
					break;
				case 13 :
					// lifescript.g:108:4: 'addrow'
					{
					match(input,45,FOLLOW_45_in_stmt545); 
					ast = new AddRowStmt();
					}
					break;
				case 14 :
					// lifescript.g:111:4: 'addcolumn'
					{
					match(input,44,FOLLOW_44_in_stmt555); 
					ast = new AddColumnStmt();
					}
					break;
				case 15 :
					// lifescript.g:114:4: 'setcolor' ( 'at' coordexp )? 'to' colorexp
					{
					match(input,65,FOLLOW_65_in_stmt566); 
					// lifescript.g:114:15: ( 'at' coordexp )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==47) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// lifescript.g:114:16: 'at' coordexp
							{
							match(input,47,FOLLOW_47_in_stmt569); 
							pushFollow(FOLLOW_coordexp_in_stmt571);
							coordexp11=coordexp();
							state._fsp--;

							}
							break;

					}

					match(input,68,FOLLOW_68_in_stmt575); 
					pushFollow(FOLLOW_colorexp_in_stmt577);
					colorexp12=colorexp();
					state._fsp--;

					ast = new SetColorStmt(coordexp11, colorexp12);
					}
					break;
				case 16 :
					// lifescript.g:117:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,71,FOLLOW_71_in_stmt587); 
					match(input,22,FOLLOW_22_in_stmt589); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:118:4: (s= stmt )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==ID||LA17_0==37||(LA17_0 >= 44 && LA17_0 <= 46)||(LA17_0 >= 49 && LA17_0 <= 50)||LA17_0==52||(LA17_0 >= 57 && LA17_0 <= 59)||LA17_0==61||LA17_0==63||LA17_0==65||(LA17_0 >= 69 && LA17_0 <= 71)) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// lifescript.g:118:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt599);
							s=stmt();
							state._fsp--;

							worldBlock.addAST(s);
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					match(input,56,FOLLOW_56_in_stmt607); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 17 :
					// lifescript.g:121:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? ( 'Cell Size' '=' cs= coordexp )?
					{
					match(input,37,FOLLOW_37_in_stmt615); 
					match(input,22,FOLLOW_22_in_stmt617); 
					BlockStmt properties = new BlockStmt();
					// lifescript.g:123:4: ( 'Title' '=' title= STRING )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==40) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// lifescript.g:123:5: 'Title' '=' title= STRING
							{
							match(input,40,FOLLOW_40_in_stmt628); 
							match(input,25,FOLLOW_25_in_stmt630); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt634); 
							}
							break;

					}

					// lifescript.g:124:4: ( 'Generation Type' '=' genType= STRING )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==32) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// lifescript.g:124:5: 'Generation Type' '=' genType= STRING
							{
							match(input,32,FOLLOW_32_in_stmt643); 
							match(input,25,FOLLOW_25_in_stmt645); 
							genType=(Token)match(input,STRING,FOLLOW_STRING_in_stmt649); 
							}
							break;

					}

					// lifescript.g:125:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==31) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// lifescript.g:125:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,31,FOLLOW_31_in_stmt657); 
							match(input,25,FOLLOW_25_in_stmt659); 
							pushFollow(FOLLOW_coordexp_in_stmt663);
							dims=coordexp();
							state._fsp--;

							properties.addAST(new DimensionsStmt(dims));
							}
							break;

					}

					// lifescript.g:126:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==38) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// lifescript.g:126:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,38,FOLLOW_38_in_stmt674); 
							match(input,25,FOLLOW_25_in_stmt676); 
							match(input,72,FOLLOW_72_in_stmt678); 
							BlockStmt startConditions = new BlockStmt();
							match(input,15,FOLLOW_15_in_stmt686); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt690); 
							match(input,19,FOLLOW_19_in_stmt692); 
							pushFollow(FOLLOW_coordexp_in_stmt696);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,16,FOLLOW_16_in_stmt709); 
							// lifescript.g:130:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop21:
							while (true) {
								int alt21=2;
								int LA21_0 = input.LA(1);
								if ( (LA21_0==19) ) {
									alt21=1;
								}

								switch (alt21) {
								case 1 :
									// lifescript.g:130:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,19,FOLLOW_19_in_stmt716); 
									match(input,15,FOLLOW_15_in_stmt718); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt722); 
									match(input,19,FOLLOW_19_in_stmt724); 
									pushFollow(FOLLOW_coordexp_in_stmt728);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,16,FOLLOW_16_in_stmt741); 
									}
									break;

								default :
									break loop21;
								}
							}

							match(input,74,FOLLOW_74_in_stmt745); 
							properties.addAST(startConditions);
							}
							break;

					}

					// lifescript.g:134:4: ( 'Default Type' '=' dt= STRING )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==30) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:134:5: 'Default Type' '=' dt= STRING
							{
							match(input,30,FOLLOW_30_in_stmt760); 
							match(input,25,FOLLOW_25_in_stmt762); 
							dt=(Token)match(input,STRING,FOLLOW_STRING_in_stmt766); 
							}
							break;

					}

					// lifescript.g:135:4: ( 'Generations' '=' gens= exp )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==33) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:135:5: 'Generations' '=' gens= exp
							{
							match(input,33,FOLLOW_33_in_stmt774); 
							match(input,25,FOLLOW_25_in_stmt776); 
							pushFollow(FOLLOW_exp_in_stmt780);
							gens=exp();
							state._fsp--;

							properties.addAST(new GenerationsStmt(gens));
							}
							break;

					}

					// lifescript.g:136:4: ( 'Interval' '=' intervals= exp )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==34) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// lifescript.g:136:5: 'Interval' '=' intervals= exp
							{
							match(input,34,FOLLOW_34_in_stmt791); 
							match(input,25,FOLLOW_25_in_stmt793); 
							pushFollow(FOLLOW_exp_in_stmt797);
							intervals=exp();
							state._fsp--;

							properties.addAST(new IntervalStmt(intervals));
							}
							break;

					}

					// lifescript.g:137:4: ( 'Pausable' '=' pause= exp )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==36) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// lifescript.g:137:5: 'Pausable' '=' pause= exp
							{
							match(input,36,FOLLOW_36_in_stmt808); 
							match(input,25,FOLLOW_25_in_stmt810); 
							pushFollow(FOLLOW_exp_in_stmt814);
							pause=exp();
							state._fsp--;

							properties.addAST(new PausableStmt(pause));
							}
							break;

					}

					// lifescript.g:138:4: ( 'Steppable' '=' sb= exp )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==39) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// lifescript.g:138:5: 'Steppable' '=' sb= exp
							{
							match(input,39,FOLLOW_39_in_stmt825); 
							match(input,25,FOLLOW_25_in_stmt827); 
							pushFollow(FOLLOW_exp_in_stmt831);
							sb=exp();
							state._fsp--;

							properties.addAST(new SteppableStmt(sb));
							}
							break;

					}

					// lifescript.g:139:4: ( 'Cell Size' '=' cs= coordexp )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==29) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// lifescript.g:139:5: 'Cell Size' '=' cs= coordexp
							{
							match(input,29,FOLLOW_29_in_stmt842); 
							match(input,25,FOLLOW_25_in_stmt844); 
							pushFollow(FOLLOW_coordexp_in_stmt848);
							cs=coordexp();
							state._fsp--;

							properties.addAST(new CellSizeStmt(cs));
							}
							break;

					}

					ast = new PropertiesStmt((title!=null?title.getText():null), (genType!=null?genType.getText():null), (dt!=null?dt.getText():null), properties);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "stmt"



	// $ANTLR start "coordexp"
	// lifescript.g:143:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:144:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:144:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,15,FOLLOW_15_in_coordexp873); 
			pushFollow(FOLLOW_exp_in_coordexp877);
			e1=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_coordexp879); 
			pushFollow(FOLLOW_exp_in_coordexp883);
			e2=exp();
			state._fsp--;

			match(input,16,FOLLOW_16_in_coordexp885); 
			ast = new CoordExpr(e1, e2);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "coordexp"



	// $ANTLR start "colorexp"
	// lifescript.g:147:1: colorexp returns [ColorExpr ast] : ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' );
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Token STRING13=null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:148:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==15) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==STRING) ) {
					alt30=2;
				}
				else if ( (LA30_1==BOOLEAN||(LA30_1 >= FLOAT && LA30_1 <= INT)||LA30_1==12||LA30_1==15||LA30_1==20||LA30_1==46||LA30_1==48||LA30_1==64) ) {
					alt30=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// lifescript.g:148:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
					{
					match(input,15,FOLLOW_15_in_colorexp903); 
					pushFollow(FOLLOW_exp_in_colorexp907);
					e1=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp909); 
					pushFollow(FOLLOW_exp_in_colorexp913);
					e2=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp915); 
					pushFollow(FOLLOW_exp_in_colorexp919);
					e3=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_colorexp921); 
					ast = new ColorExpr(e1, e2, e3);
					}
					break;
				case 2 :
					// lifescript.g:149:4: '(' STRING ')'
					{
					match(input,15,FOLLOW_15_in_colorexp928); 
					STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_colorexp930); 
					match(input,16,FOLLOW_16_in_colorexp932); 
					ast = new ColorExpr((STRING13!=null?STRING13.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "colorexp"



	// $ANTLR start "imagexp"
	// lifescript.g:152:1: imagexp returns [ImageExpr ast] : STRING ;
	public final ImageExpr imagexp() throws RecognitionException {
		ImageExpr ast = null;


		Token STRING14=null;

		try {
			// lifescript.g:153:2: ( STRING )
			// lifescript.g:153:4: STRING
			{
			STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_imagexp954); 
			ast = new ImageExpr((STRING14!=null?STRING14.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "imagexp"



	// $ANTLR start "exp"
	// lifescript.g:158:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp15 =null;

		try {
			// lifescript.g:159:2: ( logexp )
			// lifescript.g:159:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp977);
			logexp15=logexp();
			state._fsp--;

			ast = logexp15; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "exp"



	// $ANTLR start "logexp"
	// lifescript.g:163:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:164:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:164:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp997);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:165:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==14) ) {
					alt31=1;
				}
				else if ( (LA31_0==73) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// lifescript.g:166:4: ( '&' e2= relexp )
					{
					// lifescript.g:166:4: ( '&' e2= relexp )
					// lifescript.g:166:5: '&' e2= relexp
					{
					match(input,14,FOLLOW_14_in_logexp1009); 
					pushFollow(FOLLOW_relexp_in_logexp1013);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:167:4: ( '|' e3= relexp )
					{
					// lifescript.g:167:4: ( '|' e3= relexp )
					// lifescript.g:167:5: '|' e3= relexp
					{
					match(input,73,FOLLOW_73_in_logexp1025); 
					pushFollow(FOLLOW_relexp_in_logexp1029);
					e3=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.OR, ast, e3); 
					}

					}
					break;

				default :
					break loop31;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "logexp"



	// $ANTLR start "relexp"
	// lifescript.g:171:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;
		Expr e4 =null;
		Expr e5 =null;
		Expr e6 =null;
		Expr e7 =null;

		try {
			// lifescript.g:172:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* )
			// lifescript.g:172:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp1055);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:173:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			loop32:
			while (true) {
				int alt32=7;
				switch ( input.LA(1) ) {
				case 26:
					{
					alt32=1;
					}
					break;
				case 24:
					{
					alt32=2;
					}
					break;
				case 28:
					{
					alt32=3;
					}
					break;
				case 23:
					{
					alt32=4;
					}
					break;
				case 27:
					{
					alt32=5;
					}
					break;
				case 13:
					{
					alt32=6;
					}
					break;
				}
				switch (alt32) {
				case 1 :
					// lifescript.g:174:4: ( '==' e2= addexp )
					{
					// lifescript.g:174:4: ( '==' e2= addexp )
					// lifescript.g:174:5: '==' e2= addexp
					{
					match(input,26,FOLLOW_26_in_relexp1068); 
					pushFollow(FOLLOW_addexp_in_relexp1072);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:175:4: ( '<=' e3= addexp )
					{
					// lifescript.g:175:4: ( '<=' e3= addexp )
					// lifescript.g:175:5: '<=' e3= addexp
					{
					match(input,24,FOLLOW_24_in_relexp1082); 
					pushFollow(FOLLOW_addexp_in_relexp1086);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
					}

					}
					break;
				case 3 :
					// lifescript.g:176:4: ( '>=' e4= addexp )
					{
					// lifescript.g:176:4: ( '>=' e4= addexp )
					// lifescript.g:176:5: '>=' e4= addexp
					{
					match(input,28,FOLLOW_28_in_relexp1096); 
					pushFollow(FOLLOW_addexp_in_relexp1100);
					e4=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MOREEQ,ast,e4); 
					}

					}
					break;
				case 4 :
					// lifescript.g:177:4: ( '<' e5= addexp )
					{
					// lifescript.g:177:4: ( '<' e5= addexp )
					// lifescript.g:177:5: '<' e5= addexp
					{
					match(input,23,FOLLOW_23_in_relexp1110); 
					pushFollow(FOLLOW_addexp_in_relexp1114);
					e5=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTLESS,ast,e5); 
					}

					}
					break;
				case 5 :
					// lifescript.g:178:4: ( '>' e6= addexp )
					{
					// lifescript.g:178:4: ( '>' e6= addexp )
					// lifescript.g:178:5: '>' e6= addexp
					{
					match(input,27,FOLLOW_27_in_relexp1124); 
					pushFollow(FOLLOW_addexp_in_relexp1128);
					e6=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTMORE,ast,e6); 
					}

					}
					break;
				case 6 :
					// lifescript.g:179:4: ( '!=' e7= addexp )
					{
					// lifescript.g:179:4: ( '!=' e7= addexp )
					// lifescript.g:179:5: '!=' e7= addexp
					{
					match(input,13,FOLLOW_13_in_relexp1138); 
					pushFollow(FOLLOW_addexp_in_relexp1142);
					e7=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.NOTEQ,ast,e7); 
					}

					}
					break;

				default :
					break loop32;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "relexp"



	// $ANTLR start "addexp"
	// lifescript.g:183:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:184:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:184:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1167);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:185:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop33:
			while (true) {
				int alt33=3;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==18) ) {
					alt33=1;
				}
				else if ( (LA33_0==20) ) {
					alt33=2;
				}

				switch (alt33) {
				case 1 :
					// lifescript.g:186:4: ( '+' e2= mulexp )
					{
					// lifescript.g:186:4: ( '+' e2= mulexp )
					// lifescript.g:186:5: '+' e2= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp1179); 
					pushFollow(FOLLOW_mulexp_in_addexp1183);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:187:4: ( '-' e3= mulexp )
					{
					// lifescript.g:187:4: ( '-' e3= mulexp )
					// lifescript.g:187:5: '-' e3= mulexp
					{
					match(input,20,FOLLOW_20_in_addexp1193); 
					pushFollow(FOLLOW_mulexp_in_addexp1197);
					e3=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MINUS,ast,e3); 
					}

					}
					break;

				default :
					break loop33;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// lifescript.g:191:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:192:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:192:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1223);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:193:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop34:
			while (true) {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==17) ) {
					alt34=1;
				}
				else if ( (LA34_0==21) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// lifescript.g:194:4: ( '*' e2= atom )
					{
					// lifescript.g:194:4: ( '*' e2= atom )
					// lifescript.g:194:5: '*' e2= atom
					{
					match(input,17,FOLLOW_17_in_mulexp1235); 
					pushFollow(FOLLOW_atom_in_mulexp1239);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:195:4: ( '/' e3= atom )
					{
					// lifescript.g:195:4: ( '/' e3= atom )
					// lifescript.g:195:5: '/' e3= atom
					{
					match(input,21,FOLLOW_21_in_mulexp1249); 
					pushFollow(FOLLOW_atom_in_mulexp1253);
					e3=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.DIV,ast,e3); 
					}

					}
					break;

				default :
					break loop34;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// lifescript.g:199:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'cell' 'at' coordexp ( 'is' ID )? | 'alive' | 'random' '(' lb= exp ',' ub= exp ')' );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token ID18=null;
		Token BOOLEAN21=null;
		Token ID23=null;
		Expr lb =null;
		Expr ub =null;
		Expr exp16 =null;
		Expr exp17 =null;
		ParserRuleReturnScope num19 =null;
		ParserRuleReturnScope num20 =null;
		CoordExpr coordexp22 =null;

		try {
			// lifescript.g:200:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'cell' 'at' coordexp ( 'is' ID )? | 'alive' | 'random' '(' lb= exp ',' ub= exp ')' )
			int alt36=9;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt36=1;
				}
				break;
			case 12:
				{
				alt36=2;
				}
				break;
			case ID:
				{
				alt36=3;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt36=4;
				}
				break;
			case 20:
				{
				alt36=5;
				}
				break;
			case BOOLEAN:
				{
				alt36=6;
				}
				break;
			case 48:
				{
				alt36=7;
				}
				break;
			case 46:
				{
				alt36=8;
				}
				break;
			case 64:
				{
				alt36=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// lifescript.g:200:4: '(' exp ')'
					{
					match(input,15,FOLLOW_15_in_atom1278); 
					pushFollow(FOLLOW_exp_in_atom1280);
					exp16=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1282); 
					 ast = new ParenExpr(exp16); 
					}
					break;
				case 2 :
					// lifescript.g:201:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1292); 
					pushFollow(FOLLOW_exp_in_atom1294);
					exp17=exp();
					state._fsp--;

					 ast = new NegExpr(exp17); 
					}
					break;
				case 3 :
					// lifescript.g:202:4: ID
					{
					ID18=(Token)match(input,ID,FOLLOW_ID_in_atom1303); 
					 ast = new VarExpr((ID18!=null?ID18.getText():null)); usageMap.put((ID18!=null?ID18.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:203:4: num
					{
					pushFollow(FOLLOW_num_in_atom1311);
					num19=num();
					state._fsp--;

					 ast = new NumExpr((num19!=null?input.toString(num19.start,num19.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:204:4: '-' num
					{
					match(input,20,FOLLOW_20_in_atom1319); 
					pushFollow(FOLLOW_num_in_atom1321);
					num20=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num20!=null?input.toString(num20.start,num20.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:205:4: BOOLEAN
					{
					BOOLEAN21=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1329); 
					 ast = new BooleanExpr((BOOLEAN21!=null?BOOLEAN21.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:206:4: 'cell' 'at' coordexp ( 'is' ID )?
					{
					match(input,48,FOLLOW_48_in_atom1338); 
					match(input,47,FOLLOW_47_in_atom1340); 
					pushFollow(FOLLOW_coordexp_in_atom1342);
					coordexp22=coordexp();
					state._fsp--;

					// lifescript.g:206:25: ( 'is' ID )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==60) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// lifescript.g:206:26: 'is' ID
							{
							match(input,60,FOLLOW_60_in_atom1345); 
							ID23=(Token)match(input,ID,FOLLOW_ID_in_atom1347); 
							}
							break;

					}

					 ast = new CellCheckExpr(coordexp22, (ID23!=null?ID23.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:210:4: 'alive'
					{
					match(input,46,FOLLOW_46_in_atom1361); 
					ast = new AliveExpr();
					}
					break;
				case 9 :
					// lifescript.g:211:4: 'random' '(' lb= exp ',' ub= exp ')'
					{
					match(input,64,FOLLOW_64_in_atom1368); 
					match(input,15,FOLLOW_15_in_atom1370); 
					pushFollow(FOLLOW_exp_in_atom1374);
					lb=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_atom1376); 
					pushFollow(FOLLOW_exp_in_atom1380);
					ub=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1382); 
					ast = new RandomExpr(lb, ub);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "atom"



	// $ANTLR start "value"
	// lifescript.g:214:1: value returns [Expr ast] : ( ID | num | '-' num );
	public final Expr value() throws RecognitionException {
		Expr ast = null;


		Token ID24=null;
		ParserRuleReturnScope num25 =null;
		ParserRuleReturnScope num26 =null;

		try {
			// lifescript.g:215:2: ( ID | num | '-' num )
			int alt37=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt37=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt37=2;
				}
				break;
			case 20:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// lifescript.g:215:4: ID
					{
					ID24=(Token)match(input,ID,FOLLOW_ID_in_value1401); 
					 ast = new VarExpr((ID24!=null?ID24.getText():null)); usageMap.put((ID24!=null?ID24.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:216:4: num
					{
					pushFollow(FOLLOW_num_in_value1409);
					num25=num();
					state._fsp--;

					 ast = new NumExpr((num25!=null?input.toString(num25.start,num25.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:217:4: '-' num
					{
					match(input,20,FOLLOW_20_in_value1417); 
					pushFollow(FOLLOW_num_in_value1419);
					num26=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num26!=null?input.toString(num26.start,num26.stop):null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "value"


	public static class num_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "num"
	// lifescript.g:220:1: num : ( INT | FLOAT );
	public final lifescriptParser.num_return num() throws RecognitionException {
		lifescriptParser.num_return retval = new lifescriptParser.num_return();
		retval.start = input.LT(1);

		try {
			// lifescript.g:220:5: ( INT | FLOAT )
			// lifescript.g:
			{
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "num"

	// Delegated rules



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0xAE16702000000102L,0x00000000000000E2L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt67 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_stmt79 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt82 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt84 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_stmt102 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt120 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt131 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt146 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt151 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt164 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_52_in_stmt188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_stmt204 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_stmt210 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt224 = new BitSet(new long[]{0xAE3E702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_51_in_stmt235 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt245 = new BitSet(new long[]{0xAE36702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_53_in_stmt261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_stmt277 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt279 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt289 = new BitSet(new long[]{0xAE96702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_55_in_stmt296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_stmt311 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt315 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt317 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_stmt323 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt327 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E6L});
	public static final BitSet FOLLOW_66_in_stmt330 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt334 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt354 = new BitSet(new long[]{0xEE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_62_in_stmt366 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_stmt381 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt385 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt387 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_stmt398 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stmt400 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt404 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_stmt406 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_stmt413 = new BitSet(new long[]{0x0001420000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt418 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt420 = new BitSet(new long[]{0x0001420000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_41_in_stmt430 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
	public static final BitSet FOLLOW_19_in_stmt438 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt442 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_stmt448 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt470 = new BitSet(new long[]{0xAE56702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_54_in_stmt478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_stmt490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stmt500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_stmt510 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt512 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_stmt514 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_stmt526 = new BitSet(new long[]{0x0000800000000100L});
	public static final BitSet FOLLOW_ID_in_stmt529 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_stmt533 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_stmt566 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_47_in_stmt569 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_stmt575 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_colorexp_in_stmt577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_stmt587 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt589 = new BitSet(new long[]{0xAE16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_stmt_in_stmt599 = new BitSet(new long[]{0xAF16702000000100L,0x00000000000000E2L});
	public static final BitSet FOLLOW_56_in_stmt607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt615 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt617 = new BitSet(new long[]{0x000001D7E0000002L});
	public static final BitSet FOLLOW_40_in_stmt628 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt630 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt634 = new BitSet(new long[]{0x000000D7E0000002L});
	public static final BitSet FOLLOW_32_in_stmt643 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt645 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt649 = new BitSet(new long[]{0x000000D6E0000002L});
	public static final BitSet FOLLOW_31_in_stmt657 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt659 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt663 = new BitSet(new long[]{0x000000D660000002L});
	public static final BitSet FOLLOW_38_in_stmt674 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_stmt678 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt686 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt690 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt692 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt696 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt709 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
	public static final BitSet FOLLOW_19_in_stmt716 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt718 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt722 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt724 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt728 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt741 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_stmt745 = new BitSet(new long[]{0x0000009660000002L});
	public static final BitSet FOLLOW_30_in_stmt760 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt762 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt766 = new BitSet(new long[]{0x0000009620000002L});
	public static final BitSet FOLLOW_33_in_stmt774 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt776 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt780 = new BitSet(new long[]{0x0000009420000002L});
	public static final BitSet FOLLOW_34_in_stmt791 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt793 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt797 = new BitSet(new long[]{0x0000009020000002L});
	public static final BitSet FOLLOW_36_in_stmt808 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt810 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt814 = new BitSet(new long[]{0x0000008020000002L});
	public static final BitSet FOLLOW_39_in_stmt825 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt827 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_stmt831 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_stmt842 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt844 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_coordexp873 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_coordexp877 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_coordexp879 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_coordexp883 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_coordexp885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp903 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_colorexp907 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp909 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_colorexp913 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp915 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_colorexp919 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp928 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_colorexp930 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imagexp954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logexp_in_exp977 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp997 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000200L});
	public static final BitSet FOLLOW_14_in_logexp1009 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_relexp_in_logexp1013 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_logexp1025 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_relexp_in_logexp1029 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000200L});
	public static final BitSet FOLLOW_addexp_in_relexp1055 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_26_in_relexp1068 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1072 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_24_in_relexp1082 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1086 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_28_in_relexp1096 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1100 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_23_in_relexp1110 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1114 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_27_in_relexp1124 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1128 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_13_in_relexp1138 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_addexp_in_relexp1142 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1167 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_addexp1179 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_mulexp_in_addexp1183 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_addexp1193 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_mulexp_in_addexp1197 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_atom_in_mulexp1223 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_17_in_mulexp1235 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_mulexp1239 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_21_in_mulexp1249 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_atom_in_mulexp1253 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_15_in_atom1278 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_atom1280 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1292 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_atom1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom1319 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_atom1338 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atom1340 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1342 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_60_in_atom1345 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_atom1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_atom1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_atom1368 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1370 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_atom1374 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom1376 = new BitSet(new long[]{0x0001400000109390L,0x0000000000000001L});
	public static final BitSet FOLLOW_exp_in_atom1380 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_value1417 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1419 = new BitSet(new long[]{0x0000000000000002L});
}
