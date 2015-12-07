// $ANTLR 3.5 lifescript.g 2015-12-06 19:38:45

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
		"'>'", "'>='", "'Default Type'", "'Dimensions'", "'Generation Type'", 
		"'Generations'", "'Interval'", "'Neighborhood'", "'Pausable'", "'Properties'", 
		"'Start'", "'Steppable'", "'Title'", "'VAR'", "'['", "']'", "'addcolumn'", 
		"'addrow'", "'alive'", "'at'", "'create'", "'dead'", "'else'", "'end'", 
		"'endif'", "'endtype'", "'endwhile'", "'endworld'", "'for'", "'if'", "'input'", 
		"'kill'", "'neighbor'", "'neighbors'", "'next'", "'of'", "'print'", "'step'", 
		"'then'", "'to'", "'type'", "'while'", "'world'", "'{'", "'|'", "'}'"
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
				if ( (LA1_0==ID||LA1_0==36||(LA1_0 >= 43 && LA1_0 <= 45)||(LA1_0 >= 47 && LA1_0 <= 48)||LA1_0==50||(LA1_0 >= 55 && LA1_0 <= 58)||LA1_0==63||(LA1_0 >= 67 && LA1_0 <= 69)) ) {
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
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'addrow' | 'addcolumn' | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? );
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
		Expr exp3 =null;
		Expr exp6 =null;
		CoordExpr coordexp8 =null;
		CoordExpr coordexp10 =null;

		try {
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'addrow' | 'addcolumn' | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? )
			int alt27=16;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt27=1;
				}
				break;
			case 57:
				{
				alt27=2;
				}
				break;
			case 63:
				{
				alt27=3;
				}
				break;
			case 50:
				{
				alt27=4;
				}
				break;
			case 56:
				{
				alt27=5;
				}
				break;
			case 68:
				{
				alt27=6;
				}
				break;
			case 55:
				{
				alt27=7;
				}
				break;
			case 67:
				{
				alt27=8;
				}
				break;
			case 45:
				{
				alt27=9;
				}
				break;
			case 48:
				{
				alt27=10;
				}
				break;
			case 47:
				{
				alt27=11;
				}
				break;
			case 58:
				{
				alt27=12;
				}
				break;
			case 44:
				{
				alt27=13;
				}
				break;
			case 43:
				{
				alt27=14;
				}
				break;
			case 69:
				{
				alt27=15;
				}
				break;
			case 36:
				{
				alt27=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
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
					match(input,57,FOLLOW_57_in_stmt80); 
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
							STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_stmt83); 
							match(input,19,FOLLOW_19_in_stmt85); 
							}
							break;

					}

					ID5=(Token)match(input,ID,FOLLOW_ID_in_stmt89); 
					ast = new InputStmt((STRING4!=null?STRING4.getText():null), (ID5!=null?ID5.getText():null));
					}
					break;
				case 3 :
					// lifescript.g:46:4: 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )*
					{
					match(input,63,FOLLOW_63_in_stmt103); 
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
							pushFollow(FOLLOW_value_in_stmt121);
							v1=value();
							state._fsp--;

							prints.addAST(new PrintStmt(v1));
							}
							break;
						case 2 :
							// lifescript.g:50:6: text1= STRING
							{
							text1=(Token)match(input,STRING,FOLLOW_STRING_in_stmt132); 
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
							match(input,19,FOLLOW_19_in_stmt147); 
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
									pushFollow(FOLLOW_value_in_stmt152);
									v2=value();
									state._fsp--;

									prints.addAST(new PrintStmt(v2));
									}
									break;
								case 2 :
									// lifescript.g:53:7: text2= STRING
									{
									text2=(Token)match(input,STRING,FOLLOW_STRING_in_stmt165); 
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
					match(input,50,FOLLOW_50_in_stmt189); 
					ast = new EndStmt();
					}
					break;
				case 5 :
					// lifescript.g:62:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,56,FOLLOW_56_in_stmt205); 
					pushFollow(FOLLOW_exp_in_stmt209);
					e1=exp();
					state._fsp--;

					match(input,65,FOLLOW_65_in_stmt211); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:64:4: (s= stmt )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==36||(LA6_0 >= 43 && LA6_0 <= 45)||(LA6_0 >= 47 && LA6_0 <= 48)||LA6_0==50||(LA6_0 >= 55 && LA6_0 <= 58)||LA6_0==63||(LA6_0 >= 67 && LA6_0 <= 69)) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// lifescript.g:64:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt225);
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
					if ( (LA8_0==49) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// lifescript.g:65:5: 'else' (s2= stmt )+
							{
							match(input,49,FOLLOW_49_in_stmt236); 
							// lifescript.g:66:5: (s2= stmt )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID||LA7_0==36||(LA7_0 >= 43 && LA7_0 <= 45)||(LA7_0 >= 47 && LA7_0 <= 48)||LA7_0==50||(LA7_0 >= 55 && LA7_0 <= 58)||LA7_0==63||(LA7_0 >= 67 && LA7_0 <= 69)) ) {
									alt7=1;
								}

								switch (alt7) {
								case 1 :
									// lifescript.g:66:6: s2= stmt
									{
									pushFollow(FOLLOW_stmt_in_stmt246);
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

					match(input,51,FOLLOW_51_in_stmt262); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 6 :
					// lifescript.g:73:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,68,FOLLOW_68_in_stmt278); 
					pushFollow(FOLLOW_exp_in_stmt280);
					exp6=exp();
					state._fsp--;

					BlockStmt whileBlock = new BlockStmt();
					// lifescript.g:74:4: (s= stmt )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==ID||LA9_0==36||(LA9_0 >= 43 && LA9_0 <= 45)||(LA9_0 >= 47 && LA9_0 <= 48)||LA9_0==50||(LA9_0 >= 55 && LA9_0 <= 58)||LA9_0==63||(LA9_0 >= 67 && LA9_0 <= 69)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// lifescript.g:74:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt290);
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

					match(input,53,FOLLOW_53_in_stmt297); 
					ast = new WhileStmt(exp6,whileBlock);
					}
					break;
				case 7 :
					// lifescript.g:78:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,55,FOLLOW_55_in_stmt312); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt316); 
					match(input,25,FOLLOW_25_in_stmt318); 
					pushFollow(FOLLOW_exp_in_stmt322);
					start2=exp();
					state._fsp--;

					match(input,66,FOLLOW_66_in_stmt324); 
					pushFollow(FOLLOW_exp_in_stmt328);
					lim=exp();
					state._fsp--;

					// lifescript.g:78:44: ( 'step' step= exp )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==64) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:78:45: 'step' step= exp
							{
							match(input,64,FOLLOW_64_in_stmt331); 
							pushFollow(FOLLOW_exp_in_stmt335);
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
						if ( (LA11_0==ID||LA11_0==36||(LA11_0 >= 43 && LA11_0 <= 45)||(LA11_0 >= 47 && LA11_0 <= 48)||LA11_0==50||(LA11_0 >= 55 && LA11_0 <= 58)||LA11_0==63||(LA11_0 >= 67 && LA11_0 <= 69)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// lifescript.g:80:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt355);
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

					match(input,61,FOLLOW_61_in_stmt367); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt371); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:84:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,67,FOLLOW_67_in_stmt382); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt386); 
					match(input,22,FOLLOW_22_in_stmt388); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:86:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:86:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,34,FOLLOW_34_in_stmt399); 
					match(input,41,FOLLOW_41_in_stmt401); 
					pushFollow(FOLLOW_exp_in_stmt405);
					neighWidth=exp();
					state._fsp--;

					match(input,42,FOLLOW_42_in_stmt407); 
					match(input,25,FOLLOW_25_in_stmt409); 
					match(input,70,FOLLOW_70_in_stmt414); 
					// lifescript.g:87:8: (neigh1= exp ',' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||(LA12_0 >= FLOAT && LA12_0 <= INT)||LA12_0==12||LA12_0==15||LA12_0==20||LA12_0==45||(LA12_0 >= 59 && LA12_0 <= 60)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// lifescript.g:87:9: neigh1= exp ','
							{
							pushFollow(FOLLOW_exp_in_stmt419);
							neigh1=exp();
							state._fsp--;

							match(input,19,FOLLOW_19_in_stmt421); 
							neighBlock.addAST(new NeighborhoodStmt(neigh1, false));
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,40,FOLLOW_40_in_stmt431); 
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
							match(input,19,FOLLOW_19_in_stmt439); 
							pushFollow(FOLLOW_exp_in_stmt443);
							neigh2=exp();
							state._fsp--;

							neighBlock.addAST(new NeighborhoodStmt(neigh2, false));
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,72,FOLLOW_72_in_stmt449); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:92:8: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||LA14_0==36||(LA14_0 >= 43 && LA14_0 <= 45)||(LA14_0 >= 47 && LA14_0 <= 48)||LA14_0==50||(LA14_0 >= 55 && LA14_0 <= 58)||LA14_0==63||(LA14_0 >= 67 && LA14_0 <= 69)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// lifescript.g:92:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt471);
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

					match(input,52,FOLLOW_52_in_stmt479); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 9 :
					// lifescript.g:96:4: 'alive'
					{
					match(input,45,FOLLOW_45_in_stmt491); 
					ast = new AliveStmt();
					}
					break;
				case 10 :
					// lifescript.g:99:4: 'dead'
					{
					match(input,48,FOLLOW_48_in_stmt501); 
					ast = new DeadStmt();
					}
					break;
				case 11 :
					// lifescript.g:102:4: 'create' ID 'at' coordexp
					{
					match(input,47,FOLLOW_47_in_stmt511); 
					ID7=(Token)match(input,ID,FOLLOW_ID_in_stmt513); 
					match(input,46,FOLLOW_46_in_stmt515); 
					pushFollow(FOLLOW_coordexp_in_stmt517);
					coordexp8=coordexp();
					state._fsp--;

					ast = new CreateStmt((ID7!=null?ID7.getText():null), coordexp8);
					}
					break;
				case 12 :
					// lifescript.g:105:4: 'kill' ( ID )? 'at' coordexp
					{
					match(input,58,FOLLOW_58_in_stmt527); 
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
							ID9=(Token)match(input,ID,FOLLOW_ID_in_stmt530); 
							}
							break;

					}

					match(input,46,FOLLOW_46_in_stmt534); 
					pushFollow(FOLLOW_coordexp_in_stmt536);
					coordexp10=coordexp();
					state._fsp--;

					ast = new KillStmt((ID9!=null?ID9.getText():null), coordexp10);
					}
					break;
				case 13 :
					// lifescript.g:108:4: 'addrow'
					{
					match(input,44,FOLLOW_44_in_stmt546); 
					ast = new AddRowStmt();
					}
					break;
				case 14 :
					// lifescript.g:111:4: 'addcolumn'
					{
					match(input,43,FOLLOW_43_in_stmt556); 
					ast = new AddColumnStmt();
					}
					break;
				case 15 :
					// lifescript.g:123:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,69,FOLLOW_69_in_stmt575); 
					match(input,22,FOLLOW_22_in_stmt577); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:124:4: (s= stmt )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID||LA16_0==36||(LA16_0 >= 43 && LA16_0 <= 45)||(LA16_0 >= 47 && LA16_0 <= 48)||LA16_0==50||(LA16_0 >= 55 && LA16_0 <= 58)||LA16_0==63||(LA16_0 >= 67 && LA16_0 <= 69)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// lifescript.g:124:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt587);
							s=stmt();
							state._fsp--;

							worldBlock.addAST(s);
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input,54,FOLLOW_54_in_stmt595); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 16 :
					// lifescript.g:127:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )?
					{
					match(input,36,FOLLOW_36_in_stmt603); 
					match(input,22,FOLLOW_22_in_stmt605); 
					BlockStmt properties = new BlockStmt();
					// lifescript.g:129:4: ( 'Title' '=' title= STRING )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==39) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// lifescript.g:129:5: 'Title' '=' title= STRING
							{
							match(input,39,FOLLOW_39_in_stmt616); 
							match(input,25,FOLLOW_25_in_stmt618); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt622); 
							}
							break;

					}

					// lifescript.g:130:4: ( 'Generation Type' '=' genType= STRING )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==31) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// lifescript.g:130:5: 'Generation Type' '=' genType= STRING
							{
							match(input,31,FOLLOW_31_in_stmt631); 
							match(input,25,FOLLOW_25_in_stmt633); 
							genType=(Token)match(input,STRING,FOLLOW_STRING_in_stmt637); 
							}
							break;

					}

					// lifescript.g:131:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==30) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// lifescript.g:131:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,30,FOLLOW_30_in_stmt645); 
							match(input,25,FOLLOW_25_in_stmt647); 
							pushFollow(FOLLOW_coordexp_in_stmt651);
							dims=coordexp();
							state._fsp--;

							properties.addAST(new DimensionsStmt(dims));
							}
							break;

					}

					// lifescript.g:132:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==37) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// lifescript.g:132:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,37,FOLLOW_37_in_stmt662); 
							match(input,25,FOLLOW_25_in_stmt664); 
							match(input,70,FOLLOW_70_in_stmt666); 
							BlockStmt startConditions = new BlockStmt();
							match(input,15,FOLLOW_15_in_stmt674); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt678); 
							match(input,19,FOLLOW_19_in_stmt680); 
							pushFollow(FOLLOW_coordexp_in_stmt684);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,16,FOLLOW_16_in_stmt697); 
							// lifescript.g:136:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop20:
							while (true) {
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( (LA20_0==19) ) {
									alt20=1;
								}

								switch (alt20) {
								case 1 :
									// lifescript.g:136:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,19,FOLLOW_19_in_stmt704); 
									match(input,15,FOLLOW_15_in_stmt706); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt710); 
									match(input,19,FOLLOW_19_in_stmt712); 
									pushFollow(FOLLOW_coordexp_in_stmt716);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,16,FOLLOW_16_in_stmt729); 
									}
									break;

								default :
									break loop20;
								}
							}

							match(input,72,FOLLOW_72_in_stmt733); 
							properties.addAST(startConditions);
							}
							break;

					}

					// lifescript.g:140:4: ( 'Default Type' '=' dt= STRING )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==29) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// lifescript.g:140:5: 'Default Type' '=' dt= STRING
							{
							match(input,29,FOLLOW_29_in_stmt748); 
							match(input,25,FOLLOW_25_in_stmt750); 
							dt=(Token)match(input,STRING,FOLLOW_STRING_in_stmt754); 
							}
							break;

					}

					// lifescript.g:141:4: ( 'Generations' '=' gens= exp )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==32) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:141:5: 'Generations' '=' gens= exp
							{
							match(input,32,FOLLOW_32_in_stmt762); 
							match(input,25,FOLLOW_25_in_stmt764); 
							pushFollow(FOLLOW_exp_in_stmt768);
							gens=exp();
							state._fsp--;

							properties.addAST(new GenerationsStmt(gens));
							}
							break;

					}

					// lifescript.g:142:4: ( 'Interval' '=' intervals= exp )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==33) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:142:5: 'Interval' '=' intervals= exp
							{
							match(input,33,FOLLOW_33_in_stmt779); 
							match(input,25,FOLLOW_25_in_stmt781); 
							pushFollow(FOLLOW_exp_in_stmt785);
							intervals=exp();
							state._fsp--;

							properties.addAST(new IntervalStmt(intervals));
							}
							break;

					}

					// lifescript.g:143:4: ( 'Pausable' '=' pause= exp )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==35) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// lifescript.g:143:5: 'Pausable' '=' pause= exp
							{
							match(input,35,FOLLOW_35_in_stmt796); 
							match(input,25,FOLLOW_25_in_stmt798); 
							pushFollow(FOLLOW_exp_in_stmt802);
							pause=exp();
							state._fsp--;

							properties.addAST(new PausableStmt(pause));
							}
							break;

					}

					// lifescript.g:144:4: ( 'Steppable' '=' sb= exp )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==38) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// lifescript.g:144:5: 'Steppable' '=' sb= exp
							{
							match(input,38,FOLLOW_38_in_stmt813); 
							match(input,25,FOLLOW_25_in_stmt815); 
							pushFollow(FOLLOW_exp_in_stmt819);
							sb=exp();
							state._fsp--;

							properties.addAST(new SteppableStmt(sb));
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
	// lifescript.g:148:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:149:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:149:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,15,FOLLOW_15_in_coordexp844); 
			pushFollow(FOLLOW_exp_in_coordexp848);
			e1=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_coordexp850); 
			pushFollow(FOLLOW_exp_in_coordexp854);
			e2=exp();
			state._fsp--;

			match(input,16,FOLLOW_16_in_coordexp856); 
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
	// lifescript.g:152:1: colorexp returns [ColorExpr ast] : '(' e1= exp ',' e2= exp ',' e3= exp ')' ;
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:153:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' )
			// lifescript.g:153:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
			{
			match(input,15,FOLLOW_15_in_colorexp874); 
			pushFollow(FOLLOW_exp_in_colorexp878);
			e1=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_colorexp880); 
			pushFollow(FOLLOW_exp_in_colorexp884);
			e2=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_colorexp886); 
			pushFollow(FOLLOW_exp_in_colorexp890);
			e3=exp();
			state._fsp--;

			match(input,16,FOLLOW_16_in_colorexp892); 
			ast = new ColorExpr(e1, e2, e3);
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
	// lifescript.g:156:1: imagexp returns [ImageExpr ast] : STRING ;
	public final ImageExpr imagexp() throws RecognitionException {
		ImageExpr ast = null;


		Token STRING11=null;

		try {
			// lifescript.g:157:2: ( STRING )
			// lifescript.g:157:4: STRING
			{
			STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_imagexp909); 
			ast = new ImageExpr((STRING11!=null?STRING11.getText():null));
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
	// lifescript.g:162:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp12 =null;

		try {
			// lifescript.g:163:2: ( logexp )
			// lifescript.g:163:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp932);
			logexp12=logexp();
			state._fsp--;

			ast = logexp12; 
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
	// lifescript.g:167:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:168:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:168:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp952);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:169:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==14) ) {
					alt28=1;
				}
				else if ( (LA28_0==71) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// lifescript.g:170:4: ( '&' e2= relexp )
					{
					// lifescript.g:170:4: ( '&' e2= relexp )
					// lifescript.g:170:5: '&' e2= relexp
					{
					match(input,14,FOLLOW_14_in_logexp964); 
					pushFollow(FOLLOW_relexp_in_logexp968);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:171:4: ( '|' e3= relexp )
					{
					// lifescript.g:171:4: ( '|' e3= relexp )
					// lifescript.g:171:5: '|' e3= relexp
					{
					match(input,71,FOLLOW_71_in_logexp980); 
					pushFollow(FOLLOW_relexp_in_logexp984);
					e3=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.OR, ast, e3); 
					}

					}
					break;

				default :
					break loop28;
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
	// lifescript.g:175:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* ;
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
			// lifescript.g:176:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* )
			// lifescript.g:176:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp1010);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:177:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			loop29:
			while (true) {
				int alt29=7;
				switch ( input.LA(1) ) {
				case 26:
					{
					alt29=1;
					}
					break;
				case 24:
					{
					alt29=2;
					}
					break;
				case 28:
					{
					alt29=3;
					}
					break;
				case 23:
					{
					alt29=4;
					}
					break;
				case 27:
					{
					alt29=5;
					}
					break;
				case 13:
					{
					alt29=6;
					}
					break;
				}
				switch (alt29) {
				case 1 :
					// lifescript.g:178:4: ( '==' e2= addexp )
					{
					// lifescript.g:178:4: ( '==' e2= addexp )
					// lifescript.g:178:5: '==' e2= addexp
					{
					match(input,26,FOLLOW_26_in_relexp1023); 
					pushFollow(FOLLOW_addexp_in_relexp1027);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:179:4: ( '<=' e3= addexp )
					{
					// lifescript.g:179:4: ( '<=' e3= addexp )
					// lifescript.g:179:5: '<=' e3= addexp
					{
					match(input,24,FOLLOW_24_in_relexp1037); 
					pushFollow(FOLLOW_addexp_in_relexp1041);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
					}

					}
					break;
				case 3 :
					// lifescript.g:180:4: ( '>=' e4= addexp )
					{
					// lifescript.g:180:4: ( '>=' e4= addexp )
					// lifescript.g:180:5: '>=' e4= addexp
					{
					match(input,28,FOLLOW_28_in_relexp1051); 
					pushFollow(FOLLOW_addexp_in_relexp1055);
					e4=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MOREEQ,ast,e4); 
					}

					}
					break;
				case 4 :
					// lifescript.g:181:4: ( '<' e5= addexp )
					{
					// lifescript.g:181:4: ( '<' e5= addexp )
					// lifescript.g:181:5: '<' e5= addexp
					{
					match(input,23,FOLLOW_23_in_relexp1065); 
					pushFollow(FOLLOW_addexp_in_relexp1069);
					e5=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTLESS,ast,e5); 
					}

					}
					break;
				case 5 :
					// lifescript.g:182:4: ( '>' e6= addexp )
					{
					// lifescript.g:182:4: ( '>' e6= addexp )
					// lifescript.g:182:5: '>' e6= addexp
					{
					match(input,27,FOLLOW_27_in_relexp1079); 
					pushFollow(FOLLOW_addexp_in_relexp1083);
					e6=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTMORE,ast,e6); 
					}

					}
					break;
				case 6 :
					// lifescript.g:183:4: ( '!=' e7= addexp )
					{
					// lifescript.g:183:4: ( '!=' e7= addexp )
					// lifescript.g:183:5: '!=' e7= addexp
					{
					match(input,13,FOLLOW_13_in_relexp1093); 
					pushFollow(FOLLOW_addexp_in_relexp1097);
					e7=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.NOTEQ,ast,e7); 
					}

					}
					break;

				default :
					break loop29;
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
	// lifescript.g:187:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:188:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:188:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1122);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:189:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop30:
			while (true) {
				int alt30=3;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==18) ) {
					alt30=1;
				}
				else if ( (LA30_0==20) ) {
					alt30=2;
				}

				switch (alt30) {
				case 1 :
					// lifescript.g:190:4: ( '+' e2= mulexp )
					{
					// lifescript.g:190:4: ( '+' e2= mulexp )
					// lifescript.g:190:5: '+' e2= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp1134); 
					pushFollow(FOLLOW_mulexp_in_addexp1138);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:191:4: ( '-' e3= mulexp )
					{
					// lifescript.g:191:4: ( '-' e3= mulexp )
					// lifescript.g:191:5: '-' e3= mulexp
					{
					match(input,20,FOLLOW_20_in_addexp1148); 
					pushFollow(FOLLOW_mulexp_in_addexp1152);
					e3=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MINUS,ast,e3); 
					}

					}
					break;

				default :
					break loop30;
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
	// lifescript.g:195:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:196:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:196:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1178);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:197:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==17) ) {
					alt31=1;
				}
				else if ( (LA31_0==21) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// lifescript.g:198:4: ( '*' e2= atom )
					{
					// lifescript.g:198:4: ( '*' e2= atom )
					// lifescript.g:198:5: '*' e2= atom
					{
					match(input,17,FOLLOW_17_in_mulexp1190); 
					pushFollow(FOLLOW_atom_in_mulexp1194);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:199:4: ( '/' e3= atom )
					{
					// lifescript.g:199:4: ( '/' e3= atom )
					// lifescript.g:199:5: '/' e3= atom
					{
					match(input,21,FOLLOW_21_in_mulexp1204); 
					pushFollow(FOLLOW_atom_in_mulexp1208);
					e3=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.DIV,ast,e3); 
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
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// lifescript.g:203:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? | 'alive' );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token ID15=null;
		Token BOOLEAN18=null;
		Token STRING20=null;
		Token STRING21=null;
		CoordExpr d =null;
		CoordExpr p =null;
		Expr exp13 =null;
		Expr exp14 =null;
		ParserRuleReturnScope num16 =null;
		ParserRuleReturnScope num17 =null;
		CoordExpr coordexp19 =null;

		try {
			// lifescript.g:204:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? | 'alive' )
			int alt35=10;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt35=1;
				}
				break;
			case 12:
				{
				alt35=2;
				}
				break;
			case ID:
				{
				alt35=3;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt35=4;
				}
				break;
			case 20:
				{
				alt35=5;
				}
				break;
			case BOOLEAN:
				{
				alt35=6;
				}
				break;
			case 59:
				{
				alt35=7;
				}
				break;
			case 60:
				{
				int LA35_8 = input.LA(2);
				if ( (LA35_8==15) ) {
					alt35=8;
				}
				else if ( (LA35_8==EOF||LA35_8==ID||(LA35_8 >= 13 && LA35_8 <= 14)||(LA35_8 >= 16 && LA35_8 <= 24)||(LA35_8 >= 26 && LA35_8 <= 28)||LA35_8==33||(LA35_8 >= 35 && LA35_8 <= 36)||LA35_8==38||(LA35_8 >= 42 && LA35_8 <= 45)||(LA35_8 >= 47 && LA35_8 <= 58)||LA35_8==61||(LA35_8 >= 63 && LA35_8 <= 69)||(LA35_8 >= 71 && LA35_8 <= 72)) ) {
					alt35=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 45:
				{
				alt35=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// lifescript.g:204:4: '(' exp ')'
					{
					match(input,15,FOLLOW_15_in_atom1233); 
					pushFollow(FOLLOW_exp_in_atom1235);
					exp13=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1237); 
					 ast = new ParenExpr(exp13); 
					}
					break;
				case 2 :
					// lifescript.g:205:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1247); 
					pushFollow(FOLLOW_exp_in_atom1249);
					exp14=exp();
					state._fsp--;

					 ast = new NegExpr(exp14); 
					}
					break;
				case 3 :
					// lifescript.g:206:4: ID
					{
					ID15=(Token)match(input,ID,FOLLOW_ID_in_atom1258); 
					 ast = new VarExpr((ID15!=null?ID15.getText():null)); usageMap.put((ID15!=null?ID15.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:207:4: num
					{
					pushFollow(FOLLOW_num_in_atom1266);
					num16=num();
					state._fsp--;

					 ast = new NumExpr((num16!=null?input.toString(num16.start,num16.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:208:4: '-' num
					{
					match(input,20,FOLLOW_20_in_atom1274); 
					pushFollow(FOLLOW_num_in_atom1276);
					num17=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num17!=null?input.toString(num17.start,num17.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:209:4: BOOLEAN
					{
					BOOLEAN18=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1284); 
					 ast = new BooleanExpr((BOOLEAN18!=null?BOOLEAN18.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:210:4: 'neighbor' d= coordexp ( 'of' p= coordexp )?
					{
					match(input,59,FOLLOW_59_in_atom1293); 
					pushFollow(FOLLOW_coordexp_in_atom1297);
					d=coordexp();
					state._fsp--;

					// lifescript.g:210:26: ( 'of' p= coordexp )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==62) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// lifescript.g:210:27: 'of' p= coordexp
							{
							match(input,62,FOLLOW_62_in_atom1300); 
							pushFollow(FOLLOW_coordexp_in_atom1304);
							p=coordexp();
							state._fsp--;

							}
							break;

					}

					 ast = new NeighborExpr(d, p);
					}
					break;
				case 8 :
					// lifescript.g:212:4: 'neighbors' coordexp ( ':' 'type' '=' STRING )?
					{
					match(input,60,FOLLOW_60_in_atom1316); 
					pushFollow(FOLLOW_coordexp_in_atom1318);
					coordexp19=coordexp();
					state._fsp--;

					// lifescript.g:212:25: ( ':' 'type' '=' STRING )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==22) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// lifescript.g:212:26: ':' 'type' '=' STRING
							{
							match(input,22,FOLLOW_22_in_atom1321); 
							match(input,67,FOLLOW_67_in_atom1323); 
							match(input,25,FOLLOW_25_in_atom1325); 
							STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_atom1327); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ " + coordexp19 + "," + (STRING20!=null?STRING20.getText():null));
								ast = new NeighborsExpr(coordexp19, (STRING20!=null?STRING20.getText():null));
					}
					break;
				case 9 :
					// lifescript.g:215:4: 'neighbors' ( ':' 'type' '=' STRING )?
					{
					match(input,60,FOLLOW_60_in_atom1338); 
					// lifescript.g:215:16: ( ':' 'type' '=' STRING )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==22) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// lifescript.g:215:17: ':' 'type' '=' STRING
							{
							match(input,22,FOLLOW_22_in_atom1341); 
							match(input,67,FOLLOW_67_in_atom1343); 
							match(input,25,FOLLOW_25_in_atom1345); 
							STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_atom1347); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ this, " + (STRING21!=null?STRING21.getText():null));
								ast = new NeighborsExpr((STRING21!=null?STRING21.getText():null));
					}
					break;
				case 10 :
					// lifescript.g:218:4: 'alive'
					{
					match(input,45,FOLLOW_45_in_atom1358); 
					ast = new AliveExpr();
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


		Token ID22=null;
		ParserRuleReturnScope num23 =null;
		ParserRuleReturnScope num24 =null;

		try {
			// lifescript.g:226:2: ( ID | num | '-' num )
			int alt36=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt36=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt36=2;
				}
				break;
			case 20:
				{
				alt36=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// lifescript.g:226:4: ID
					{
					ID22=(Token)match(input,ID,FOLLOW_ID_in_value1381); 
					 ast = new VarExpr((ID22!=null?ID22.getText():null)); usageMap.put((ID22!=null?ID22.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:227:4: num
					{
					pushFollow(FOLLOW_num_in_value1389);
					num23=num();
					state._fsp--;

					 ast = new NumExpr((num23!=null?input.toString(num23.start,num23.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:228:4: '-' num
					{
					match(input,20,FOLLOW_20_in_value1397); 
					pushFollow(FOLLOW_num_in_value1399);
					num24=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num24!=null?input.toString(num24.start,num24.stop):null)); 
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0x8785B81000000102L,0x0000000000000038L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt67 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_stmt80 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt83 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt85 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_stmt103 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt121 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt132 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt147 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt152 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt165 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_50_in_stmt189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_stmt205 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_stmt211 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt225 = new BitSet(new long[]{0x878FB81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_49_in_stmt236 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt246 = new BitSet(new long[]{0x878DB81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_51_in_stmt262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_stmt278 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt280 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt290 = new BitSet(new long[]{0x87A5B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_53_in_stmt297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_stmt312 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt316 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt318 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_stmt324 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt328 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000039L});
	public static final BitSet FOLLOW_64_in_stmt331 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt335 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt355 = new BitSet(new long[]{0xA785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_61_in_stmt367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_stmt382 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt386 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt388 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_stmt399 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_stmt401 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt405 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stmt407 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_stmt414 = new BitSet(new long[]{0x1800210000109390L});
	public static final BitSet FOLLOW_exp_in_stmt419 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt421 = new BitSet(new long[]{0x1800210000109390L});
	public static final BitSet FOLLOW_40_in_stmt431 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_19_in_stmt439 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt443 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_stmt449 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt471 = new BitSet(new long[]{0x8795B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_52_in_stmt479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_stmt511 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt513 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_stmt515 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_stmt527 = new BitSet(new long[]{0x0000400000000100L});
	public static final BitSet FOLLOW_ID_in_stmt530 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_stmt534 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_stmt556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_stmt575 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt577 = new BitSet(new long[]{0x8785B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_stmt_in_stmt587 = new BitSet(new long[]{0x87C5B81000000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_54_in_stmt595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt603 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt605 = new BitSet(new long[]{0x000000EBE0000002L});
	public static final BitSet FOLLOW_39_in_stmt616 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt618 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt622 = new BitSet(new long[]{0x0000006BE0000002L});
	public static final BitSet FOLLOW_31_in_stmt631 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt633 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt637 = new BitSet(new long[]{0x0000006B60000002L});
	public static final BitSet FOLLOW_30_in_stmt645 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt647 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt651 = new BitSet(new long[]{0x0000006B20000002L});
	public static final BitSet FOLLOW_37_in_stmt662 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_stmt666 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt674 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt678 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt680 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt684 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt697 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_19_in_stmt704 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt706 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt710 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt712 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt716 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt729 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_stmt733 = new BitSet(new long[]{0x0000004B20000002L});
	public static final BitSet FOLLOW_29_in_stmt748 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt750 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt754 = new BitSet(new long[]{0x0000004B00000002L});
	public static final BitSet FOLLOW_32_in_stmt762 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt764 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt768 = new BitSet(new long[]{0x0000004A00000002L});
	public static final BitSet FOLLOW_33_in_stmt779 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt781 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt785 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_35_in_stmt796 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt798 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt802 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_stmt813 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt815 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_stmt819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_coordexp844 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_coordexp848 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_coordexp850 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_coordexp854 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_coordexp856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp874 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_colorexp878 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp880 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_colorexp884 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp886 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_colorexp890 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imagexp909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logexp_in_exp932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp952 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000080L});
	public static final BitSet FOLLOW_14_in_logexp964 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_relexp_in_logexp968 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_logexp980 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_relexp_in_logexp984 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000080L});
	public static final BitSet FOLLOW_addexp_in_relexp1010 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_26_in_relexp1023 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1027 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_24_in_relexp1037 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1041 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_28_in_relexp1051 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1055 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_23_in_relexp1065 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1069 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_27_in_relexp1079 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1083 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_13_in_relexp1093 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_addexp_in_relexp1097 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1122 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_addexp1134 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1138 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_addexp1148 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1152 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_atom_in_mulexp1178 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_17_in_mulexp1190 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_atom_in_mulexp1194 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_21_in_mulexp1204 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_atom_in_mulexp1208 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_15_in_atom1233 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_atom1235 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1247 = new BitSet(new long[]{0x1800200000109390L});
	public static final BitSet FOLLOW_exp_in_atom1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom1274 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_atom1293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1297 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_62_in_atom1300 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_atom1316 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1318 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_atom1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_atom1323 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_atom1325 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_atom1338 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_atom1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_atom1343 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_atom1345 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_atom1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_value1397 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1399 = new BitSet(new long[]{0x0000000000000002L});
}
