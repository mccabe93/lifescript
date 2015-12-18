// $ANTLR 3.5 lifescript.g 2015-12-17 19:22:44

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
		"'>'", "'>='", "'Cell Size'", "'Default Type'", "'Dimensions'", "'Generations'", 
		"'Interval'", "'Neighborhood'", "'Pausable'", "'Properties'", "'Start'", 
		"'Steppable'", "'Title'", "'VAR'", "'['", "']'", "'addcolumn'", "'addrow'", 
		"'alive'", "'are'", "'at'", "'become'", "'cell'", "'create'", "'dead'", 
		"'else'", "'end'", "'endif'", "'endtype'", "'endwhile'", "'endworld'", 
		"'for'", "'if'", "'input'", "'is'", "'kill'", "'neighbor'", "'neighbors'", 
		"'next'", "'of'", "'print'", "'random'", "'setcolor'", "'setstate'", "'state'", 
		"'statecolor'", "'step'", "'that'", "'then'", "'to'", "'type'", "'while'", 
		"'world'", "'{'", "'|'", "'}'"
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
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
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
				if ( (LA1_0==ID||LA1_0==36||(LA1_0 >= 43 && LA1_0 <= 45)||LA1_0==48||(LA1_0 >= 50 && LA1_0 <= 51)||LA1_0==53||(LA1_0 >= 58 && LA1_0 <= 60)||LA1_0==62||LA1_0==67||(LA1_0 >= 69 && LA1_0 <= 70)||LA1_0==72||(LA1_0 >= 77 && LA1_0 <= 79)) ) {
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
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'become' STRING | 'setstate' ( 'of' coordexp )? 'to' exp | 'statecolor' exp 'is' colorexp | 'create' STRING 'at' coordexp | 'kill' ( STRING )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token text1=null;
		Token text2=null;
		Token v3=null;
		Token v4=null;
		Token title=null;
		Token celltype=null;
		Token dt=null;
		Token ID2=null;
		Token STRING4=null;
		Token ID5=null;
		Token STRING7=null;
		Token STRING12=null;
		Token STRING14=null;
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
		CoordExpr cs =null;
		CoordExpr dims =null;
		CoordExpr cellcoords =null;
		Expr gens =null;
		Expr intervals =null;
		Expr pause =null;
		Expr sb =null;
		Expr exp3 =null;
		Expr exp6 =null;
		CoordExpr coordexp8 =null;
		Expr exp9 =null;
		Expr exp10 =null;
		ColorExpr colorexp11 =null;
		CoordExpr coordexp13 =null;
		CoordExpr coordexp15 =null;
		CoordExpr coordexp16 =null;
		ColorExpr colorexp17 =null;

		try {
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'become' STRING | 'setstate' ( 'of' coordexp )? 'to' exp | 'statecolor' exp 'is' colorexp | 'create' STRING 'at' coordexp | 'kill' ( STRING )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? )
			int alt29=20;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt29=1;
				}
				break;
			case 60:
				{
				alt29=2;
				}
				break;
			case 67:
				{
				alt29=3;
				}
				break;
			case 53:
				{
				alt29=4;
				}
				break;
			case 59:
				{
				alt29=5;
				}
				break;
			case 78:
				{
				alt29=6;
				}
				break;
			case 58:
				{
				alt29=7;
				}
				break;
			case 77:
				{
				alt29=8;
				}
				break;
			case 45:
				{
				alt29=9;
				}
				break;
			case 51:
				{
				alt29=10;
				}
				break;
			case 48:
				{
				alt29=11;
				}
				break;
			case 70:
				{
				alt29=12;
				}
				break;
			case 72:
				{
				alt29=13;
				}
				break;
			case 50:
				{
				alt29=14;
				}
				break;
			case 62:
				{
				alt29=15;
				}
				break;
			case 44:
				{
				alt29=16;
				}
				break;
			case 43:
				{
				alt29=17;
				}
				break;
			case 69:
				{
				alt29=18;
				}
				break;
			case 79:
				{
				alt29=19;
				}
				break;
			case 36:
				{
				alt29=20;
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
					match(input,60,FOLLOW_60_in_stmt79); 
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
					match(input,67,FOLLOW_67_in_stmt102); 
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
					match(input,53,FOLLOW_53_in_stmt188); 
					ast = new EndStmt();
					}
					break;
				case 5 :
					// lifescript.g:62:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,59,FOLLOW_59_in_stmt204); 
					pushFollow(FOLLOW_exp_in_stmt208);
					e1=exp();
					state._fsp--;

					match(input,75,FOLLOW_75_in_stmt210); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:64:4: (s= stmt )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==36||(LA6_0 >= 43 && LA6_0 <= 45)||LA6_0==48||(LA6_0 >= 50 && LA6_0 <= 51)||LA6_0==53||(LA6_0 >= 58 && LA6_0 <= 60)||LA6_0==62||LA6_0==67||(LA6_0 >= 69 && LA6_0 <= 70)||LA6_0==72||(LA6_0 >= 77 && LA6_0 <= 79)) ) {
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
					if ( (LA8_0==52) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// lifescript.g:65:5: 'else' (s2= stmt )+
							{
							match(input,52,FOLLOW_52_in_stmt235); 
							// lifescript.g:66:5: (s2= stmt )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID||LA7_0==36||(LA7_0 >= 43 && LA7_0 <= 45)||LA7_0==48||(LA7_0 >= 50 && LA7_0 <= 51)||LA7_0==53||(LA7_0 >= 58 && LA7_0 <= 60)||LA7_0==62||LA7_0==67||(LA7_0 >= 69 && LA7_0 <= 70)||LA7_0==72||(LA7_0 >= 77 && LA7_0 <= 79)) ) {
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

					match(input,54,FOLLOW_54_in_stmt261); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 6 :
					// lifescript.g:73:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,78,FOLLOW_78_in_stmt277); 
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
						if ( (LA9_0==ID||LA9_0==36||(LA9_0 >= 43 && LA9_0 <= 45)||LA9_0==48||(LA9_0 >= 50 && LA9_0 <= 51)||LA9_0==53||(LA9_0 >= 58 && LA9_0 <= 60)||LA9_0==62||LA9_0==67||(LA9_0 >= 69 && LA9_0 <= 70)||LA9_0==72||(LA9_0 >= 77 && LA9_0 <= 79)) ) {
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

					match(input,56,FOLLOW_56_in_stmt296); 
					ast = new WhileStmt(exp6,whileBlock);
					}
					break;
				case 7 :
					// lifescript.g:78:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,58,FOLLOW_58_in_stmt311); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt315); 
					match(input,25,FOLLOW_25_in_stmt317); 
					pushFollow(FOLLOW_exp_in_stmt321);
					start2=exp();
					state._fsp--;

					match(input,76,FOLLOW_76_in_stmt323); 
					pushFollow(FOLLOW_exp_in_stmt327);
					lim=exp();
					state._fsp--;

					// lifescript.g:78:44: ( 'step' step= exp )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==73) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:78:45: 'step' step= exp
							{
							match(input,73,FOLLOW_73_in_stmt330); 
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
						if ( (LA11_0==ID||LA11_0==36||(LA11_0 >= 43 && LA11_0 <= 45)||LA11_0==48||(LA11_0 >= 50 && LA11_0 <= 51)||LA11_0==53||(LA11_0 >= 58 && LA11_0 <= 60)||LA11_0==62||LA11_0==67||(LA11_0 >= 69 && LA11_0 <= 70)||LA11_0==72||(LA11_0 >= 77 && LA11_0 <= 79)) ) {
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

					match(input,65,FOLLOW_65_in_stmt366); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt370); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:84:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,77,FOLLOW_77_in_stmt381); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt385); 
					match(input,22,FOLLOW_22_in_stmt387); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:86:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:86:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,34,FOLLOW_34_in_stmt398); 
					match(input,41,FOLLOW_41_in_stmt400); 
					pushFollow(FOLLOW_exp_in_stmt404);
					neighWidth=exp();
					state._fsp--;

					match(input,42,FOLLOW_42_in_stmt406); 
					match(input,25,FOLLOW_25_in_stmt408); 
					match(input,80,FOLLOW_80_in_stmt413); 
					// lifescript.g:87:8: (neigh1= exp ',' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||(LA12_0 >= FLOAT && LA12_0 <= INT)||LA12_0==12||LA12_0==15||LA12_0==20||LA12_0==45||LA12_0==49||(LA12_0 >= 63 && LA12_0 <= 64)||LA12_0==68||LA12_0==71) ) {
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

					match(input,40,FOLLOW_40_in_stmt430); 
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

					match(input,82,FOLLOW_82_in_stmt448); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:92:8: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||LA14_0==36||(LA14_0 >= 43 && LA14_0 <= 45)||LA14_0==48||(LA14_0 >= 50 && LA14_0 <= 51)||LA14_0==53||(LA14_0 >= 58 && LA14_0 <= 60)||LA14_0==62||LA14_0==67||(LA14_0 >= 69 && LA14_0 <= 70)||LA14_0==72||(LA14_0 >= 77 && LA14_0 <= 79)) ) {
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

					match(input,55,FOLLOW_55_in_stmt478); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 9 :
					// lifescript.g:96:4: 'alive'
					{
					match(input,45,FOLLOW_45_in_stmt490); 
					ast = new AliveStmt();
					}
					break;
				case 10 :
					// lifescript.g:99:4: 'dead'
					{
					match(input,51,FOLLOW_51_in_stmt500); 
					ast = new DeadStmt();
					}
					break;
				case 11 :
					// lifescript.g:102:4: 'become' STRING
					{
					match(input,48,FOLLOW_48_in_stmt510); 
					STRING7=(Token)match(input,STRING,FOLLOW_STRING_in_stmt512); 
					ast = new BecomeStmt((STRING7!=null?STRING7.getText():null));
					}
					break;
				case 12 :
					// lifescript.g:105:4: 'setstate' ( 'of' coordexp )? 'to' exp
					{
					match(input,70,FOLLOW_70_in_stmt522); 
					// lifescript.g:105:15: ( 'of' coordexp )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==66) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// lifescript.g:105:16: 'of' coordexp
							{
							match(input,66,FOLLOW_66_in_stmt525); 
							pushFollow(FOLLOW_coordexp_in_stmt527);
							coordexp8=coordexp();
							state._fsp--;

							}
							break;

					}

					match(input,76,FOLLOW_76_in_stmt531); 
					pushFollow(FOLLOW_exp_in_stmt533);
					exp9=exp();
					state._fsp--;

					ast = new SetStateStmt(coordexp8, exp9);
					}
					break;
				case 13 :
					// lifescript.g:108:4: 'statecolor' exp 'is' colorexp
					{
					match(input,72,FOLLOW_72_in_stmt543); 
					pushFollow(FOLLOW_exp_in_stmt545);
					exp10=exp();
					state._fsp--;

					match(input,61,FOLLOW_61_in_stmt547); 
					pushFollow(FOLLOW_colorexp_in_stmt549);
					colorexp11=colorexp();
					state._fsp--;

					ast = new StateColorStmt(exp10, colorexp11);
					}
					break;
				case 14 :
					// lifescript.g:111:4: 'create' STRING 'at' coordexp
					{
					match(input,50,FOLLOW_50_in_stmt559); 
					STRING12=(Token)match(input,STRING,FOLLOW_STRING_in_stmt561); 
					match(input,47,FOLLOW_47_in_stmt563); 
					pushFollow(FOLLOW_coordexp_in_stmt565);
					coordexp13=coordexp();
					state._fsp--;

					ast = new CreateStmt((STRING12!=null?STRING12.getText():null), coordexp13);
					}
					break;
				case 15 :
					// lifescript.g:114:4: 'kill' ( STRING )? 'at' coordexp
					{
					match(input,62,FOLLOW_62_in_stmt575); 
					// lifescript.g:114:11: ( STRING )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==STRING) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// lifescript.g:114:12: STRING
							{
							STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_stmt578); 
							}
							break;

					}

					match(input,47,FOLLOW_47_in_stmt582); 
					pushFollow(FOLLOW_coordexp_in_stmt584);
					coordexp15=coordexp();
					state._fsp--;

					ast = new KillStmt((STRING14!=null?STRING14.getText():null), coordexp15);
					}
					break;
				case 16 :
					// lifescript.g:117:4: 'addrow'
					{
					match(input,44,FOLLOW_44_in_stmt594); 
					ast = new AddRowStmt();
					}
					break;
				case 17 :
					// lifescript.g:120:4: 'addcolumn'
					{
					match(input,43,FOLLOW_43_in_stmt604); 
					ast = new AddColumnStmt();
					}
					break;
				case 18 :
					// lifescript.g:123:4: 'setcolor' ( 'at' coordexp )? 'to' colorexp
					{
					match(input,69,FOLLOW_69_in_stmt615); 
					// lifescript.g:123:15: ( 'at' coordexp )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==47) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// lifescript.g:123:16: 'at' coordexp
							{
							match(input,47,FOLLOW_47_in_stmt618); 
							pushFollow(FOLLOW_coordexp_in_stmt620);
							coordexp16=coordexp();
							state._fsp--;

							}
							break;

					}

					match(input,76,FOLLOW_76_in_stmt624); 
					pushFollow(FOLLOW_colorexp_in_stmt626);
					colorexp17=colorexp();
					state._fsp--;

					ast = new SetColorStmt(coordexp16, colorexp17);
					}
					break;
				case 19 :
					// lifescript.g:126:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,79,FOLLOW_79_in_stmt636); 
					match(input,22,FOLLOW_22_in_stmt638); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:127:4: (s= stmt )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==ID||LA18_0==36||(LA18_0 >= 43 && LA18_0 <= 45)||LA18_0==48||(LA18_0 >= 50 && LA18_0 <= 51)||LA18_0==53||(LA18_0 >= 58 && LA18_0 <= 60)||LA18_0==62||LA18_0==67||(LA18_0 >= 69 && LA18_0 <= 70)||LA18_0==72||(LA18_0 >= 77 && LA18_0 <= 79)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// lifescript.g:127:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt648);
							s=stmt();
							state._fsp--;

							worldBlock.addAST(s);
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input,57,FOLLOW_57_in_stmt656); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 20 :
					// lifescript.g:130:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )?
					{
					match(input,36,FOLLOW_36_in_stmt664); 
					match(input,22,FOLLOW_22_in_stmt666); 
					BlockStmt properties = new BlockStmt();
					// lifescript.g:132:4: ( 'Title' '=' title= STRING )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==39) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// lifescript.g:132:5: 'Title' '=' title= STRING
							{
							match(input,39,FOLLOW_39_in_stmt677); 
							match(input,25,FOLLOW_25_in_stmt679); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt683); 
							}
							break;

					}

					// lifescript.g:133:4: ( 'Cell Size' '=' cs= coordexp )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==29) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// lifescript.g:133:5: 'Cell Size' '=' cs= coordexp
							{
							match(input,29,FOLLOW_29_in_stmt692); 
							match(input,25,FOLLOW_25_in_stmt694); 
							pushFollow(FOLLOW_coordexp_in_stmt698);
							cs=coordexp();
							state._fsp--;

							properties.addAST(new CellSizeStmt(cs));
							}
							break;

					}

					// lifescript.g:134:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==31) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// lifescript.g:134:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,31,FOLLOW_31_in_stmt709); 
							match(input,25,FOLLOW_25_in_stmt711); 
							pushFollow(FOLLOW_coordexp_in_stmt715);
							dims=coordexp();
							state._fsp--;

							properties.addAST(new DimensionsStmt(dims));
							}
							break;

					}

					// lifescript.g:135:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==37) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:135:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,37,FOLLOW_37_in_stmt726); 
							match(input,25,FOLLOW_25_in_stmt728); 
							match(input,80,FOLLOW_80_in_stmt730); 
							BlockStmt startConditions = new BlockStmt();
							match(input,15,FOLLOW_15_in_stmt738); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt742); 
							match(input,19,FOLLOW_19_in_stmt744); 
							pushFollow(FOLLOW_coordexp_in_stmt748);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,16,FOLLOW_16_in_stmt761); 
							// lifescript.g:139:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop22:
							while (true) {
								int alt22=2;
								int LA22_0 = input.LA(1);
								if ( (LA22_0==19) ) {
									alt22=1;
								}

								switch (alt22) {
								case 1 :
									// lifescript.g:139:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,19,FOLLOW_19_in_stmt768); 
									match(input,15,FOLLOW_15_in_stmt770); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt774); 
									match(input,19,FOLLOW_19_in_stmt776); 
									pushFollow(FOLLOW_coordexp_in_stmt780);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,16,FOLLOW_16_in_stmt793); 
									}
									break;

								default :
									break loop22;
								}
							}

							match(input,82,FOLLOW_82_in_stmt797); 
							properties.addAST(startConditions);
							}
							break;

					}

					// lifescript.g:143:4: ( 'Default Type' '=' dt= STRING )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==30) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:143:5: 'Default Type' '=' dt= STRING
							{
							match(input,30,FOLLOW_30_in_stmt812); 
							match(input,25,FOLLOW_25_in_stmt814); 
							dt=(Token)match(input,STRING,FOLLOW_STRING_in_stmt818); 
							}
							break;

					}

					// lifescript.g:144:4: ( 'Generations' '=' gens= exp )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==32) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// lifescript.g:144:5: 'Generations' '=' gens= exp
							{
							match(input,32,FOLLOW_32_in_stmt826); 
							match(input,25,FOLLOW_25_in_stmt828); 
							pushFollow(FOLLOW_exp_in_stmt832);
							gens=exp();
							state._fsp--;

							properties.addAST(new GenerationsStmt(gens));
							}
							break;

					}

					// lifescript.g:145:4: ( 'Interval' '=' intervals= exp )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==33) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// lifescript.g:145:5: 'Interval' '=' intervals= exp
							{
							match(input,33,FOLLOW_33_in_stmt843); 
							match(input,25,FOLLOW_25_in_stmt845); 
							pushFollow(FOLLOW_exp_in_stmt849);
							intervals=exp();
							state._fsp--;

							properties.addAST(new IntervalStmt(intervals));
							}
							break;

					}

					// lifescript.g:146:4: ( 'Pausable' '=' pause= exp )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==35) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// lifescript.g:146:5: 'Pausable' '=' pause= exp
							{
							match(input,35,FOLLOW_35_in_stmt860); 
							match(input,25,FOLLOW_25_in_stmt862); 
							pushFollow(FOLLOW_exp_in_stmt866);
							pause=exp();
							state._fsp--;

							properties.addAST(new PausableStmt(pause));
							}
							break;

					}

					// lifescript.g:147:4: ( 'Steppable' '=' sb= exp )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==38) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// lifescript.g:147:5: 'Steppable' '=' sb= exp
							{
							match(input,38,FOLLOW_38_in_stmt877); 
							match(input,25,FOLLOW_25_in_stmt879); 
							pushFollow(FOLLOW_exp_in_stmt883);
							sb=exp();
							state._fsp--;

							properties.addAST(new SteppableStmt(sb));
							}
							break;

					}

					ast = new PropertiesStmt((title!=null?title.getText():null), (dt!=null?dt.getText():null), properties);
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
	// lifescript.g:151:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:152:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:152:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,15,FOLLOW_15_in_coordexp908); 
			pushFollow(FOLLOW_exp_in_coordexp912);
			e1=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_coordexp914); 
			pushFollow(FOLLOW_exp_in_coordexp918);
			e2=exp();
			state._fsp--;

			match(input,16,FOLLOW_16_in_coordexp920); 
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
	// lifescript.g:155:1: colorexp returns [ColorExpr ast] : ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' );
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Token STRING18=null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:156:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==15) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==STRING) ) {
					alt30=2;
				}
				else if ( (LA30_1==BOOLEAN||(LA30_1 >= FLOAT && LA30_1 <= INT)||LA30_1==12||LA30_1==15||LA30_1==20||LA30_1==45||LA30_1==49||(LA30_1 >= 63 && LA30_1 <= 64)||LA30_1==68||LA30_1==71) ) {
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
					// lifescript.g:156:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
					{
					match(input,15,FOLLOW_15_in_colorexp938); 
					pushFollow(FOLLOW_exp_in_colorexp942);
					e1=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp944); 
					pushFollow(FOLLOW_exp_in_colorexp948);
					e2=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp950); 
					pushFollow(FOLLOW_exp_in_colorexp954);
					e3=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_colorexp956); 
					ast = new ColorExpr(e1, e2, e3);
					}
					break;
				case 2 :
					// lifescript.g:157:4: '(' STRING ')'
					{
					match(input,15,FOLLOW_15_in_colorexp963); 
					STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_colorexp965); 
					match(input,16,FOLLOW_16_in_colorexp967); 
					ast = new ColorExpr((STRING18!=null?STRING18.getText():null));
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
	// lifescript.g:160:1: imagexp returns [ImageExpr ast] : STRING ;
	public final ImageExpr imagexp() throws RecognitionException {
		ImageExpr ast = null;


		Token STRING19=null;

		try {
			// lifescript.g:161:2: ( STRING )
			// lifescript.g:161:4: STRING
			{
			STRING19=(Token)match(input,STRING,FOLLOW_STRING_in_imagexp989); 
			ast = new ImageExpr((STRING19!=null?STRING19.getText():null));
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
	// lifescript.g:166:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp20 =null;

		try {
			// lifescript.g:167:2: ( logexp )
			// lifescript.g:167:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp1012);
			logexp20=logexp();
			state._fsp--;

			ast = logexp20; 
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
	// lifescript.g:171:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:172:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:172:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp1032);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:173:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==14) ) {
					alt31=1;
				}
				else if ( (LA31_0==81) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// lifescript.g:174:4: ( '&' e2= relexp )
					{
					// lifescript.g:174:4: ( '&' e2= relexp )
					// lifescript.g:174:5: '&' e2= relexp
					{
					match(input,14,FOLLOW_14_in_logexp1044); 
					pushFollow(FOLLOW_relexp_in_logexp1048);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:175:4: ( '|' e3= relexp )
					{
					// lifescript.g:175:4: ( '|' e3= relexp )
					// lifescript.g:175:5: '|' e3= relexp
					{
					match(input,81,FOLLOW_81_in_logexp1060); 
					pushFollow(FOLLOW_relexp_in_logexp1064);
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
	// lifescript.g:179:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* ;
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
			// lifescript.g:180:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* )
			// lifescript.g:180:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp1090);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:181:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
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
					// lifescript.g:182:4: ( '==' e2= addexp )
					{
					// lifescript.g:182:4: ( '==' e2= addexp )
					// lifescript.g:182:5: '==' e2= addexp
					{
					match(input,26,FOLLOW_26_in_relexp1103); 
					pushFollow(FOLLOW_addexp_in_relexp1107);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:183:4: ( '<=' e3= addexp )
					{
					// lifescript.g:183:4: ( '<=' e3= addexp )
					// lifescript.g:183:5: '<=' e3= addexp
					{
					match(input,24,FOLLOW_24_in_relexp1117); 
					pushFollow(FOLLOW_addexp_in_relexp1121);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
					}

					}
					break;
				case 3 :
					// lifescript.g:184:4: ( '>=' e4= addexp )
					{
					// lifescript.g:184:4: ( '>=' e4= addexp )
					// lifescript.g:184:5: '>=' e4= addexp
					{
					match(input,28,FOLLOW_28_in_relexp1131); 
					pushFollow(FOLLOW_addexp_in_relexp1135);
					e4=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MOREEQ,ast,e4); 
					}

					}
					break;
				case 4 :
					// lifescript.g:185:4: ( '<' e5= addexp )
					{
					// lifescript.g:185:4: ( '<' e5= addexp )
					// lifescript.g:185:5: '<' e5= addexp
					{
					match(input,23,FOLLOW_23_in_relexp1145); 
					pushFollow(FOLLOW_addexp_in_relexp1149);
					e5=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTLESS,ast,e5); 
					}

					}
					break;
				case 5 :
					// lifescript.g:186:4: ( '>' e6= addexp )
					{
					// lifescript.g:186:4: ( '>' e6= addexp )
					// lifescript.g:186:5: '>' e6= addexp
					{
					match(input,27,FOLLOW_27_in_relexp1159); 
					pushFollow(FOLLOW_addexp_in_relexp1163);
					e6=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTMORE,ast,e6); 
					}

					}
					break;
				case 6 :
					// lifescript.g:187:4: ( '!=' e7= addexp )
					{
					// lifescript.g:187:4: ( '!=' e7= addexp )
					// lifescript.g:187:5: '!=' e7= addexp
					{
					match(input,13,FOLLOW_13_in_relexp1173); 
					pushFollow(FOLLOW_addexp_in_relexp1177);
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
	// lifescript.g:191:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:192:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:192:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1202);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:193:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
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
					// lifescript.g:194:4: ( '+' e2= mulexp )
					{
					// lifescript.g:194:4: ( '+' e2= mulexp )
					// lifescript.g:194:5: '+' e2= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp1214); 
					pushFollow(FOLLOW_mulexp_in_addexp1218);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:195:4: ( '-' e3= mulexp )
					{
					// lifescript.g:195:4: ( '-' e3= mulexp )
					// lifescript.g:195:5: '-' e3= mulexp
					{
					match(input,20,FOLLOW_20_in_addexp1228); 
					pushFollow(FOLLOW_mulexp_in_addexp1232);
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
	// lifescript.g:199:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:200:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:200:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1258);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:201:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
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
					// lifescript.g:202:4: ( '*' e2= atom )
					{
					// lifescript.g:202:4: ( '*' e2= atom )
					// lifescript.g:202:5: '*' e2= atom
					{
					match(input,17,FOLLOW_17_in_mulexp1270); 
					pushFollow(FOLLOW_atom_in_mulexp1274);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:203:4: ( '/' e3= atom )
					{
					// lifescript.g:203:4: ( '/' e3= atom )
					// lifescript.g:203:5: '/' e3= atom
					{
					match(input,21,FOLLOW_21_in_mulexp1284); 
					pushFollow(FOLLOW_atom_in_mulexp1288);
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
	// lifescript.g:207:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )? | 'cell' 'at' coordexp ( 'is' STRING )? | 'neighbor' 'at' coordexp ( 'is' STRING )? | 'alive' | 'state' ( 'of' coordexp )? | 'random' '(' lb= exp ',' ub= exp ')' );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token ID23=null;
		Token BOOLEAN26=null;
		Token STRING28=null;
		Token STRING29=null;
		Token STRING31=null;
		Expr lb =null;
		Expr ub =null;
		Expr exp21 =null;
		Expr exp22 =null;
		ParserRuleReturnScope num24 =null;
		ParserRuleReturnScope num25 =null;
		CoordExpr coordexp27 =null;
		CoordExpr coordexp30 =null;
		CoordExpr coordexp32 =null;
		CoordExpr coordexp33 =null;

		try {
			// lifescript.g:208:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )? | 'cell' 'at' coordexp ( 'is' STRING )? | 'neighbor' 'at' coordexp ( 'is' STRING )? | 'alive' | 'state' ( 'of' coordexp )? | 'random' '(' lb= exp ',' ub= exp ')' )
			int alt40=12;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt40=1;
				}
				break;
			case 12:
				{
				alt40=2;
				}
				break;
			case ID:
				{
				alt40=3;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt40=4;
				}
				break;
			case 20:
				{
				alt40=5;
				}
				break;
			case BOOLEAN:
				{
				alt40=6;
				}
				break;
			case 64:
				{
				alt40=7;
				}
				break;
			case 49:
				{
				alt40=8;
				}
				break;
			case 63:
				{
				alt40=9;
				}
				break;
			case 45:
				{
				alt40=10;
				}
				break;
			case 71:
				{
				alt40=11;
				}
				break;
			case 68:
				{
				alt40=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// lifescript.g:208:4: '(' exp ')'
					{
					match(input,15,FOLLOW_15_in_atom1313); 
					pushFollow(FOLLOW_exp_in_atom1315);
					exp21=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1317); 
					 ast = new ParenExpr(exp21); 
					}
					break;
				case 2 :
					// lifescript.g:209:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1327); 
					pushFollow(FOLLOW_exp_in_atom1329);
					exp22=exp();
					state._fsp--;

					 ast = new NegExpr(exp22); 
					}
					break;
				case 3 :
					// lifescript.g:210:4: ID
					{
					ID23=(Token)match(input,ID,FOLLOW_ID_in_atom1338); 
					 ast = new VarExpr((ID23!=null?ID23.getText():null)); usageMap.put((ID23!=null?ID23.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:211:4: num
					{
					pushFollow(FOLLOW_num_in_atom1346);
					num24=num();
					state._fsp--;

					 ast = new NumExpr((num24!=null?input.toString(num24.start,num24.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:212:4: '-' num
					{
					match(input,20,FOLLOW_20_in_atom1354); 
					pushFollow(FOLLOW_num_in_atom1356);
					num25=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num25!=null?input.toString(num25.start,num25.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:213:4: BOOLEAN
					{
					BOOLEAN26=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1364); 
					 ast = new BooleanExpr((BOOLEAN26!=null?BOOLEAN26.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:214:4: 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )?
					{
					match(input,64,FOLLOW_64_in_atom1373); 
					// lifescript.g:214:16: ( 'of' coordexp )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==66) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// lifescript.g:214:17: 'of' coordexp
							{
							match(input,66,FOLLOW_66_in_atom1376); 
							pushFollow(FOLLOW_coordexp_in_atom1378);
							coordexp27=coordexp();
							state._fsp--;

							}
							break;

					}

					// lifescript.g:214:33: ( 'that' 'are' STRING )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==74) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// lifescript.g:214:34: 'that' 'are' STRING
							{
							match(input,74,FOLLOW_74_in_atom1383); 
							match(input,46,FOLLOW_46_in_atom1385); 
							STRING28=(Token)match(input,STRING,FOLLOW_STRING_in_atom1387); 
							}
							break;

					}

					ast = new NeighborsExpr(coordexp27, (STRING28!=null?STRING28.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:216:4: 'cell' 'at' coordexp ( 'is' STRING )?
					{
					match(input,49,FOLLOW_49_in_atom1398); 
					match(input,47,FOLLOW_47_in_atom1400); 
					pushFollow(FOLLOW_coordexp_in_atom1402);
					coordexp30=coordexp();
					state._fsp--;

					// lifescript.g:216:25: ( 'is' STRING )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==61) ) {
						int LA37_1 = input.LA(2);
						if ( (LA37_1==STRING) ) {
							alt37=1;
						}
					}
					switch (alt37) {
						case 1 :
							// lifescript.g:216:26: 'is' STRING
							{
							match(input,61,FOLLOW_61_in_atom1405); 
							STRING29=(Token)match(input,STRING,FOLLOW_STRING_in_atom1407); 
							}
							break;

					}

					 ast = new CellCheckExpr((STRING29!=null?STRING29.getText():null), coordexp30, false);
					}
					break;
				case 9 :
					// lifescript.g:218:4: 'neighbor' 'at' coordexp ( 'is' STRING )?
					{
					match(input,63,FOLLOW_63_in_atom1419); 
					match(input,47,FOLLOW_47_in_atom1421); 
					pushFollow(FOLLOW_coordexp_in_atom1423);
					coordexp32=coordexp();
					state._fsp--;

					// lifescript.g:218:29: ( 'is' STRING )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==61) ) {
						int LA38_1 = input.LA(2);
						if ( (LA38_1==STRING) ) {
							alt38=1;
						}
					}
					switch (alt38) {
						case 1 :
							// lifescript.g:218:30: 'is' STRING
							{
							match(input,61,FOLLOW_61_in_atom1426); 
							STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_atom1428); 
							}
							break;

					}

					 ast = new CellCheckExpr((STRING31!=null?STRING31.getText():null), coordexp32, true);
					}
					break;
				case 10 :
					// lifescript.g:220:4: 'alive'
					{
					match(input,45,FOLLOW_45_in_atom1440); 
					ast = new AliveExpr();
					}
					break;
				case 11 :
					// lifescript.g:221:4: 'state' ( 'of' coordexp )?
					{
					match(input,71,FOLLOW_71_in_atom1447); 
					// lifescript.g:221:12: ( 'of' coordexp )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==66) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// lifescript.g:221:13: 'of' coordexp
							{
							match(input,66,FOLLOW_66_in_atom1450); 
							pushFollow(FOLLOW_coordexp_in_atom1452);
							coordexp33=coordexp();
							state._fsp--;

							}
							break;

					}

					ast = new GetStateExpr(coordexp33);
					}
					break;
				case 12 :
					// lifescript.g:222:4: 'random' '(' lb= exp ',' ub= exp ')'
					{
					match(input,68,FOLLOW_68_in_atom1461); 
					match(input,15,FOLLOW_15_in_atom1463); 
					pushFollow(FOLLOW_exp_in_atom1467);
					lb=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_atom1469); 
					pushFollow(FOLLOW_exp_in_atom1473);
					ub=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1475); 
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
	// lifescript.g:225:1: value returns [Expr ast] : ( ID | num | '-' num );
	public final Expr value() throws RecognitionException {
		Expr ast = null;


		Token ID34=null;
		ParserRuleReturnScope num35 =null;
		ParserRuleReturnScope num36 =null;

		try {
			// lifescript.g:226:2: ( ID | num | '-' num )
			int alt41=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt41=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt41=2;
				}
				break;
			case 20:
				{
				alt41=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// lifescript.g:226:4: ID
					{
					ID34=(Token)match(input,ID,FOLLOW_ID_in_value1494); 
					 ast = new VarExpr((ID34!=null?ID34.getText():null)); usageMap.put((ID34!=null?ID34.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:227:4: num
					{
					pushFollow(FOLLOW_num_in_value1502);
					num35=num();
					state._fsp--;

					 ast = new NumExpr((num35!=null?input.toString(num35.start,num35.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:228:4: '-' num
					{
					match(input,20,FOLLOW_20_in_value1510); 
					pushFollow(FOLLOW_num_in_value1512);
					num36=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num36!=null?input.toString(num36.start,num36.stop):null)); 
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
	// lifescript.g:231:1: num : ( INT | FLOAT );
	public final lifescriptParser.num_return num() throws RecognitionException {
		lifescriptParser.num_return retval = new lifescriptParser.num_return();
		retval.start = input.LT(1);

		try {
			// lifescript.g:231:5: ( INT | FLOAT )
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0x5C2D381000000102L,0x000000000000E168L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt67 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_stmt79 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt82 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt84 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_stmt102 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt120 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt131 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt146 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt151 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt164 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_53_in_stmt188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_stmt204 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_stmt210 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt224 = new BitSet(new long[]{0x5C7D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_52_in_stmt235 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt245 = new BitSet(new long[]{0x5C6D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_54_in_stmt261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_stmt277 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt279 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt289 = new BitSet(new long[]{0x5D2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_56_in_stmt296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_stmt311 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt315 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt317 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_stmt323 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt327 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E368L});
	public static final BitSet FOLLOW_73_in_stmt330 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt334 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt354 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E16AL});
	public static final BitSet FOLLOW_65_in_stmt366 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_stmt381 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt385 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt387 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_stmt398 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_stmt400 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt404 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stmt406 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_stmt413 = new BitSet(new long[]{0x8002210000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt418 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt420 = new BitSet(new long[]{0x8002210000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_40_in_stmt430 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
	public static final BitSet FOLLOW_19_in_stmt438 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt442 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_stmt448 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt470 = new BitSet(new long[]{0x5CAD381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_55_in_stmt478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_stmt500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_stmt510 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_stmt522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
	public static final BitSet FOLLOW_66_in_stmt525 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_stmt531 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_stmt543 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt545 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_stmt547 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_colorexp_in_stmt549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stmt559 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt561 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_stmt563 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_stmt575 = new BitSet(new long[]{0x0000800000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt578 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_stmt582 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_stmt604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_stmt615 = new BitSet(new long[]{0x0000800000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_47_in_stmt618 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_stmt624 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_colorexp_in_stmt626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_stmt636 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt638 = new BitSet(new long[]{0x5C2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_stmt_in_stmt648 = new BitSet(new long[]{0x5E2D381000000100L,0x000000000000E168L});
	public static final BitSet FOLLOW_57_in_stmt656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt664 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt666 = new BitSet(new long[]{0x000000EBE0000002L});
	public static final BitSet FOLLOW_39_in_stmt677 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt679 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt683 = new BitSet(new long[]{0x0000006BE0000002L});
	public static final BitSet FOLLOW_29_in_stmt692 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt694 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt698 = new BitSet(new long[]{0x0000006BC0000002L});
	public static final BitSet FOLLOW_31_in_stmt709 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt711 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt715 = new BitSet(new long[]{0x0000006B40000002L});
	public static final BitSet FOLLOW_37_in_stmt726 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_stmt730 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt738 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt742 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt744 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt748 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt761 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
	public static final BitSet FOLLOW_19_in_stmt768 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt770 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt774 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt776 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt780 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt793 = new BitSet(new long[]{0x0000000000080000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_stmt797 = new BitSet(new long[]{0x0000004B40000002L});
	public static final BitSet FOLLOW_30_in_stmt812 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt814 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt818 = new BitSet(new long[]{0x0000004B00000002L});
	public static final BitSet FOLLOW_32_in_stmt826 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt828 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt832 = new BitSet(new long[]{0x0000004A00000002L});
	public static final BitSet FOLLOW_33_in_stmt843 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt845 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt849 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_35_in_stmt860 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt862 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt866 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_stmt877 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt879 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_stmt883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_coordexp908 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_coordexp912 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_coordexp914 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_coordexp918 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_coordexp920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp938 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_colorexp942 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp944 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_colorexp948 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp950 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_colorexp954 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp963 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_colorexp965 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imagexp989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logexp_in_exp1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp1032 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020000L});
	public static final BitSet FOLLOW_14_in_logexp1044 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_relexp_in_logexp1048 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_logexp1060 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_relexp_in_logexp1064 = new BitSet(new long[]{0x0000000000004002L,0x0000000000020000L});
	public static final BitSet FOLLOW_addexp_in_relexp1090 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_26_in_relexp1103 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1107 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_24_in_relexp1117 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1121 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_28_in_relexp1131 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1135 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_23_in_relexp1145 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1149 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_27_in_relexp1159 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1163 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_13_in_relexp1173 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_addexp_in_relexp1177 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1202 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_addexp1214 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_mulexp_in_addexp1218 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_addexp1228 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_mulexp_in_addexp1232 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_atom_in_mulexp1258 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_17_in_mulexp1270 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_atom_in_mulexp1274 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_21_in_mulexp1284 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_atom_in_mulexp1288 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_15_in_atom1313 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_atom1315 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1327 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_atom1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom1354 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_atom1373 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000404L});
	public static final BitSet FOLLOW_66_in_atom1376 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1378 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_atom1383 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_atom1385 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_atom1398 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atom1400 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1402 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_atom1405 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_atom1419 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atom1421 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1423 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_61_in_atom1426 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_atom1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_atom1447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_atom1450 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_atom1461 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1463 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_atom1467 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom1469 = new BitSet(new long[]{0x8002200000109390L,0x0000000000000091L});
	public static final BitSet FOLLOW_exp_in_atom1473 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_value1510 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1512 = new BitSet(new long[]{0x0000000000000002L});
}
