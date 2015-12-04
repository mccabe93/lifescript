// $ANTLR 3.5 lifescript.g 2015-12-03 22:46:58

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
		"FLOAT", "ID", "INT", "STRING", "WS", "'!'", "'&'", "'('", "')'", "'*'", 
		"'+'", "','", "'-'", "'/'", "':'", "'<='", "'='", "'=='", "'Default Type'", 
		"'Dimensions'", "'Generation Type'", "'Generations'", "'Interval'", "'Neighborhood'", 
		"'Pausable'", "'Properties'", "'Start'", "'Steppable'", "'Title'", "'VAR'", 
		"'['", "']'", "'alive'", "'at'", "'create'", "'dead'", "'else'", "'end'", 
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
				if ( (LA1_0==ID||LA1_0==32||LA1_0==39||(LA1_0 >= 41 && LA1_0 <= 42)||LA1_0==44||(LA1_0 >= 49 && LA1_0 <= 52)||LA1_0==57||(LA1_0 >= 61 && LA1_0 <= 63)) ) {
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
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? );
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
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? )
			int alt27=14;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt27=1;
				}
				break;
			case 51:
				{
				alt27=2;
				}
				break;
			case 57:
				{
				alt27=3;
				}
				break;
			case 44:
				{
				alt27=4;
				}
				break;
			case 50:
				{
				alt27=5;
				}
				break;
			case 62:
				{
				alt27=6;
				}
				break;
			case 49:
				{
				alt27=7;
				}
				break;
			case 61:
				{
				alt27=8;
				}
				break;
			case 39:
				{
				alt27=9;
				}
				break;
			case 42:
				{
				alt27=10;
				}
				break;
			case 41:
				{
				alt27=11;
				}
				break;
			case 52:
				{
				alt27=12;
				}
				break;
			case 63:
				{
				alt27=13;
				}
				break;
			case 32:
				{
				alt27=14;
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
					match(input,23,FOLLOW_23_in_stmt67); 
					pushFollow(FOLLOW_exp_in_stmt69);
					exp3=exp();
					state._fsp--;

					ast = new AssignStmt((ID2!=null?ID2.getText():null), exp3);
					}
					break;
				case 2 :
					// lifescript.g:42:4: 'input' ( STRING ',' )? ID
					{
					match(input,51,FOLLOW_51_in_stmt80); 
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
							match(input,18,FOLLOW_18_in_stmt85); 
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
					match(input,57,FOLLOW_57_in_stmt103); 
					BlockStmt prints = new BlockStmt();
					// lifescript.g:49:4: (v1= value |text1= STRING )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= FLOAT && LA3_0 <= INT)||LA3_0==19) ) {
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
						if ( (LA5_0==18) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// lifescript.g:52:5: ',' (v2= value |text2= STRING )
							{
							match(input,18,FOLLOW_18_in_stmt147); 
							// lifescript.g:52:9: (v2= value |text2= STRING )
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( ((LA4_0 >= FLOAT && LA4_0 <= INT)||LA4_0==19) ) {
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
					match(input,44,FOLLOW_44_in_stmt189); 
					ast = new EndStmt();
					}
					break;
				case 5 :
					// lifescript.g:62:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,50,FOLLOW_50_in_stmt205); 
					pushFollow(FOLLOW_exp_in_stmt209);
					e1=exp();
					state._fsp--;

					match(input,59,FOLLOW_59_in_stmt211); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:64:4: (s= stmt )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==32||LA6_0==39||(LA6_0 >= 41 && LA6_0 <= 42)||LA6_0==44||(LA6_0 >= 49 && LA6_0 <= 52)||LA6_0==57||(LA6_0 >= 61 && LA6_0 <= 63)) ) {
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
					if ( (LA8_0==43) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// lifescript.g:65:5: 'else' (s2= stmt )+
							{
							match(input,43,FOLLOW_43_in_stmt236); 
							// lifescript.g:66:5: (s2= stmt )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID||LA7_0==32||LA7_0==39||(LA7_0 >= 41 && LA7_0 <= 42)||LA7_0==44||(LA7_0 >= 49 && LA7_0 <= 52)||LA7_0==57||(LA7_0 >= 61 && LA7_0 <= 63)) ) {
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

					match(input,45,FOLLOW_45_in_stmt262); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 6 :
					// lifescript.g:73:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,62,FOLLOW_62_in_stmt278); 
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
						if ( (LA9_0==ID||LA9_0==32||LA9_0==39||(LA9_0 >= 41 && LA9_0 <= 42)||LA9_0==44||(LA9_0 >= 49 && LA9_0 <= 52)||LA9_0==57||(LA9_0 >= 61 && LA9_0 <= 63)) ) {
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

					match(input,47,FOLLOW_47_in_stmt297); 
					ast = new WhileStmt(exp6,whileBlock);
					}
					break;
				case 7 :
					// lifescript.g:78:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,49,FOLLOW_49_in_stmt312); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt316); 
					match(input,23,FOLLOW_23_in_stmt318); 
					pushFollow(FOLLOW_exp_in_stmt322);
					start2=exp();
					state._fsp--;

					match(input,60,FOLLOW_60_in_stmt324); 
					pushFollow(FOLLOW_exp_in_stmt328);
					lim=exp();
					state._fsp--;

					// lifescript.g:78:44: ( 'step' step= exp )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==58) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:78:45: 'step' step= exp
							{
							match(input,58,FOLLOW_58_in_stmt331); 
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
						if ( (LA11_0==ID||LA11_0==32||LA11_0==39||(LA11_0 >= 41 && LA11_0 <= 42)||LA11_0==44||(LA11_0 >= 49 && LA11_0 <= 52)||LA11_0==57||(LA11_0 >= 61 && LA11_0 <= 63)) ) {
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

					match(input,55,FOLLOW_55_in_stmt367); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt371); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:84:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,61,FOLLOW_61_in_stmt382); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt386); 
					match(input,21,FOLLOW_21_in_stmt388); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:86:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:86:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,30,FOLLOW_30_in_stmt399); 
					match(input,37,FOLLOW_37_in_stmt401); 
					pushFollow(FOLLOW_exp_in_stmt405);
					neighWidth=exp();
					state._fsp--;

					match(input,38,FOLLOW_38_in_stmt407); 
					match(input,23,FOLLOW_23_in_stmt409); 
					match(input,64,FOLLOW_64_in_stmt414); 
					// lifescript.g:87:8: (neigh1= exp ',' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||(LA12_0 >= FLOAT && LA12_0 <= INT)||LA12_0==12||LA12_0==14||LA12_0==19||LA12_0==39||(LA12_0 >= 53 && LA12_0 <= 54)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// lifescript.g:87:9: neigh1= exp ','
							{
							pushFollow(FOLLOW_exp_in_stmt419);
							neigh1=exp();
							state._fsp--;

							match(input,18,FOLLOW_18_in_stmt421); 
							neighBlock.addAST(new NeighborhoodStmt(neigh1, false));
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,36,FOLLOW_36_in_stmt431); 
					neighBlock.addAST(new NeighborhoodStmt(new NumExpr(0.0), true));
					// lifescript.g:89:4: ( ',' neigh2= exp )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==18) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// lifescript.g:89:5: ',' neigh2= exp
							{
							match(input,18,FOLLOW_18_in_stmt439); 
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

					match(input,66,FOLLOW_66_in_stmt449); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:92:8: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||LA14_0==32||LA14_0==39||(LA14_0 >= 41 && LA14_0 <= 42)||LA14_0==44||(LA14_0 >= 49 && LA14_0 <= 52)||LA14_0==57||(LA14_0 >= 61 && LA14_0 <= 63)) ) {
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

					match(input,46,FOLLOW_46_in_stmt479); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 9 :
					// lifescript.g:96:4: 'alive'
					{
					match(input,39,FOLLOW_39_in_stmt491); 
					ast = new AliveStmt();
					}
					break;
				case 10 :
					// lifescript.g:99:4: 'dead'
					{
					match(input,42,FOLLOW_42_in_stmt501); 
					ast = new DeadStmt();
					}
					break;
				case 11 :
					// lifescript.g:102:4: 'create' ID 'at' coordexp
					{
					match(input,41,FOLLOW_41_in_stmt511); 
					ID7=(Token)match(input,ID,FOLLOW_ID_in_stmt513); 
					match(input,40,FOLLOW_40_in_stmt515); 
					pushFollow(FOLLOW_coordexp_in_stmt517);
					coordexp8=coordexp();
					state._fsp--;

					ast = new CreateStmt((ID7!=null?ID7.getText():null), coordexp8);
					}
					break;
				case 12 :
					// lifescript.g:105:4: 'kill' ( ID )? 'at' coordexp
					{
					match(input,52,FOLLOW_52_in_stmt527); 
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

					match(input,40,FOLLOW_40_in_stmt534); 
					pushFollow(FOLLOW_coordexp_in_stmt536);
					coordexp10=coordexp();
					state._fsp--;

					ast = new KillStmt((ID9!=null?ID9.getText():null), coordexp10);
					}
					break;
				case 13 :
					// lifescript.g:117:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,63,FOLLOW_63_in_stmt555); 
					match(input,21,FOLLOW_21_in_stmt557); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:118:4: (s= stmt )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID||LA16_0==32||LA16_0==39||(LA16_0 >= 41 && LA16_0 <= 42)||LA16_0==44||(LA16_0 >= 49 && LA16_0 <= 52)||LA16_0==57||(LA16_0 >= 61 && LA16_0 <= 63)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// lifescript.g:118:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt567);
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

					match(input,48,FOLLOW_48_in_stmt575); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 14 :
					// lifescript.g:121:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Generation Type' '=' genType= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )?
					{
					match(input,32,FOLLOW_32_in_stmt583); 
					match(input,21,FOLLOW_21_in_stmt585); 
					BlockStmt properties = new BlockStmt();
					// lifescript.g:123:4: ( 'Title' '=' title= STRING )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==35) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// lifescript.g:123:5: 'Title' '=' title= STRING
							{
							match(input,35,FOLLOW_35_in_stmt596); 
							match(input,23,FOLLOW_23_in_stmt598); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt602); 
							}
							break;

					}

					// lifescript.g:124:4: ( 'Generation Type' '=' genType= STRING )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==27) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// lifescript.g:124:5: 'Generation Type' '=' genType= STRING
							{
							match(input,27,FOLLOW_27_in_stmt611); 
							match(input,23,FOLLOW_23_in_stmt613); 
							genType=(Token)match(input,STRING,FOLLOW_STRING_in_stmt617); 
							}
							break;

					}

					// lifescript.g:125:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==26) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// lifescript.g:125:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,26,FOLLOW_26_in_stmt625); 
							match(input,23,FOLLOW_23_in_stmt627); 
							pushFollow(FOLLOW_coordexp_in_stmt631);
							dims=coordexp();
							state._fsp--;

							properties.addAST(new DimensionsStmt(dims));
							}
							break;

					}

					// lifescript.g:126:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==33) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// lifescript.g:126:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,33,FOLLOW_33_in_stmt642); 
							match(input,23,FOLLOW_23_in_stmt644); 
							match(input,64,FOLLOW_64_in_stmt646); 
							BlockStmt startConditions = new BlockStmt();
							match(input,14,FOLLOW_14_in_stmt654); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt658); 
							match(input,18,FOLLOW_18_in_stmt660); 
							pushFollow(FOLLOW_coordexp_in_stmt664);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,15,FOLLOW_15_in_stmt677); 
							// lifescript.g:130:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop20:
							while (true) {
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( (LA20_0==18) ) {
									alt20=1;
								}

								switch (alt20) {
								case 1 :
									// lifescript.g:130:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,18,FOLLOW_18_in_stmt684); 
									match(input,14,FOLLOW_14_in_stmt686); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt690); 
									match(input,18,FOLLOW_18_in_stmt692); 
									pushFollow(FOLLOW_coordexp_in_stmt696);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,15,FOLLOW_15_in_stmt709); 
									}
									break;

								default :
									break loop20;
								}
							}

							match(input,66,FOLLOW_66_in_stmt713); 
							properties.addAST(startConditions);
							}
							break;

					}

					// lifescript.g:134:4: ( 'Default Type' '=' dt= STRING )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==25) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// lifescript.g:134:5: 'Default Type' '=' dt= STRING
							{
							match(input,25,FOLLOW_25_in_stmt728); 
							match(input,23,FOLLOW_23_in_stmt730); 
							dt=(Token)match(input,STRING,FOLLOW_STRING_in_stmt734); 
							}
							break;

					}

					// lifescript.g:135:4: ( 'Generations' '=' gens= exp )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==28) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:135:5: 'Generations' '=' gens= exp
							{
							match(input,28,FOLLOW_28_in_stmt742); 
							match(input,23,FOLLOW_23_in_stmt744); 
							pushFollow(FOLLOW_exp_in_stmt748);
							gens=exp();
							state._fsp--;

							properties.addAST(new GenerationsStmt(gens));
							}
							break;

					}

					// lifescript.g:136:4: ( 'Interval' '=' intervals= exp )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==29) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:136:5: 'Interval' '=' intervals= exp
							{
							match(input,29,FOLLOW_29_in_stmt759); 
							match(input,23,FOLLOW_23_in_stmt761); 
							pushFollow(FOLLOW_exp_in_stmt765);
							intervals=exp();
							state._fsp--;

							properties.addAST(new IntervalStmt(intervals));
							}
							break;

					}

					// lifescript.g:137:4: ( 'Pausable' '=' pause= exp )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==31) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// lifescript.g:137:5: 'Pausable' '=' pause= exp
							{
							match(input,31,FOLLOW_31_in_stmt776); 
							match(input,23,FOLLOW_23_in_stmt778); 
							pushFollow(FOLLOW_exp_in_stmt782);
							pause=exp();
							state._fsp--;

							properties.addAST(new PausableStmt(pause));
							}
							break;

					}

					// lifescript.g:138:4: ( 'Steppable' '=' sb= exp )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==34) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// lifescript.g:138:5: 'Steppable' '=' sb= exp
							{
							match(input,34,FOLLOW_34_in_stmt793); 
							match(input,23,FOLLOW_23_in_stmt795); 
							pushFollow(FOLLOW_exp_in_stmt799);
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
	// lifescript.g:142:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:143:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:143:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,14,FOLLOW_14_in_coordexp824); 
			pushFollow(FOLLOW_exp_in_coordexp828);
			e1=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_coordexp830); 
			pushFollow(FOLLOW_exp_in_coordexp834);
			e2=exp();
			state._fsp--;

			match(input,15,FOLLOW_15_in_coordexp836); 
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
	// lifescript.g:146:1: colorexp returns [ColorExpr ast] : '(' e1= exp ',' e2= exp ',' e3= exp ')' ;
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:147:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' )
			// lifescript.g:147:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
			{
			match(input,14,FOLLOW_14_in_colorexp854); 
			pushFollow(FOLLOW_exp_in_colorexp858);
			e1=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_colorexp860); 
			pushFollow(FOLLOW_exp_in_colorexp864);
			e2=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_colorexp866); 
			pushFollow(FOLLOW_exp_in_colorexp870);
			e3=exp();
			state._fsp--;

			match(input,15,FOLLOW_15_in_colorexp872); 
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
	// lifescript.g:150:1: imagexp returns [ImageExpr ast] : STRING ;
	public final ImageExpr imagexp() throws RecognitionException {
		ImageExpr ast = null;


		Token STRING11=null;

		try {
			// lifescript.g:151:2: ( STRING )
			// lifescript.g:151:4: STRING
			{
			STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_imagexp889); 
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
	// lifescript.g:156:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp12 =null;

		try {
			// lifescript.g:157:2: ( logexp )
			// lifescript.g:157:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp912);
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
	// lifescript.g:161:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:162:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:162:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp932);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:163:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==13) ) {
					alt28=1;
				}
				else if ( (LA28_0==65) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// lifescript.g:164:4: ( '&' e2= relexp )
					{
					// lifescript.g:164:4: ( '&' e2= relexp )
					// lifescript.g:164:5: '&' e2= relexp
					{
					match(input,13,FOLLOW_13_in_logexp944); 
					pushFollow(FOLLOW_relexp_in_logexp948);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:165:4: ( '|' e3= relexp )
					{
					// lifescript.g:165:4: ( '|' e3= relexp )
					// lifescript.g:165:5: '|' e3= relexp
					{
					match(input,65,FOLLOW_65_in_logexp960); 
					pushFollow(FOLLOW_relexp_in_logexp964);
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
	// lifescript.g:169:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:170:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// lifescript.g:170:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp990);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:171:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==24) ) {
					alt29=1;
				}
				else if ( (LA29_0==22) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// lifescript.g:172:4: ( '==' e2= addexp )
					{
					// lifescript.g:172:4: ( '==' e2= addexp )
					// lifescript.g:172:5: '==' e2= addexp
					{
					match(input,24,FOLLOW_24_in_relexp1003); 
					pushFollow(FOLLOW_addexp_in_relexp1007);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:173:4: ( '<=' e3= addexp )
					{
					// lifescript.g:173:4: ( '<=' e3= addexp )
					// lifescript.g:173:5: '<=' e3= addexp
					{
					match(input,22,FOLLOW_22_in_relexp1017); 
					pushFollow(FOLLOW_addexp_in_relexp1021);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
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
	// lifescript.g:177:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:178:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:178:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1046);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:179:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop30:
			while (true) {
				int alt30=3;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==17) ) {
					alt30=1;
				}
				else if ( (LA30_0==19) ) {
					alt30=2;
				}

				switch (alt30) {
				case 1 :
					// lifescript.g:180:4: ( '+' e2= mulexp )
					{
					// lifescript.g:180:4: ( '+' e2= mulexp )
					// lifescript.g:180:5: '+' e2= mulexp
					{
					match(input,17,FOLLOW_17_in_addexp1058); 
					pushFollow(FOLLOW_mulexp_in_addexp1062);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:181:4: ( '-' e3= mulexp )
					{
					// lifescript.g:181:4: ( '-' e3= mulexp )
					// lifescript.g:181:5: '-' e3= mulexp
					{
					match(input,19,FOLLOW_19_in_addexp1072); 
					pushFollow(FOLLOW_mulexp_in_addexp1076);
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
	// lifescript.g:185:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:186:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:186:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1102);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:187:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==16) ) {
					alt31=1;
				}
				else if ( (LA31_0==20) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// lifescript.g:188:4: ( '*' e2= atom )
					{
					// lifescript.g:188:4: ( '*' e2= atom )
					// lifescript.g:188:5: '*' e2= atom
					{
					match(input,16,FOLLOW_16_in_mulexp1114); 
					pushFollow(FOLLOW_atom_in_mulexp1118);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:189:4: ( '/' e3= atom )
					{
					// lifescript.g:189:4: ( '/' e3= atom )
					// lifescript.g:189:5: '/' e3= atom
					{
					match(input,20,FOLLOW_20_in_mulexp1128); 
					pushFollow(FOLLOW_atom_in_mulexp1132);
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
	// lifescript.g:193:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? | 'alive' );
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
			// lifescript.g:194:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? | 'alive' )
			int alt35=10;
			switch ( input.LA(1) ) {
			case 14:
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
			case 19:
				{
				alt35=5;
				}
				break;
			case BOOLEAN:
				{
				alt35=6;
				}
				break;
			case 53:
				{
				alt35=7;
				}
				break;
			case 54:
				{
				int LA35_8 = input.LA(2);
				if ( (LA35_8==14) ) {
					alt35=8;
				}
				else if ( (LA35_8==EOF||LA35_8==ID||LA35_8==13||(LA35_8 >= 15 && LA35_8 <= 22)||LA35_8==24||LA35_8==29||(LA35_8 >= 31 && LA35_8 <= 32)||LA35_8==34||(LA35_8 >= 38 && LA35_8 <= 39)||(LA35_8 >= 41 && LA35_8 <= 52)||LA35_8==55||(LA35_8 >= 57 && LA35_8 <= 63)||(LA35_8 >= 65 && LA35_8 <= 66)) ) {
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
			case 39:
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
					// lifescript.g:194:4: '(' exp ')'
					{
					match(input,14,FOLLOW_14_in_atom1157); 
					pushFollow(FOLLOW_exp_in_atom1159);
					exp13=exp();
					state._fsp--;

					match(input,15,FOLLOW_15_in_atom1161); 
					 ast = new ParenExpr(exp13); 
					}
					break;
				case 2 :
					// lifescript.g:195:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1171); 
					pushFollow(FOLLOW_exp_in_atom1173);
					exp14=exp();
					state._fsp--;

					 ast = new NegExpr(exp14); 
					}
					break;
				case 3 :
					// lifescript.g:196:4: ID
					{
					ID15=(Token)match(input,ID,FOLLOW_ID_in_atom1182); 
					 ast = new VarExpr((ID15!=null?ID15.getText():null)); usageMap.put((ID15!=null?ID15.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:197:4: num
					{
					pushFollow(FOLLOW_num_in_atom1190);
					num16=num();
					state._fsp--;

					 ast = new NumExpr((num16!=null?input.toString(num16.start,num16.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:198:4: '-' num
					{
					match(input,19,FOLLOW_19_in_atom1198); 
					pushFollow(FOLLOW_num_in_atom1200);
					num17=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num17!=null?input.toString(num17.start,num17.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:199:4: BOOLEAN
					{
					BOOLEAN18=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1208); 
					 ast = new BooleanExpr((BOOLEAN18!=null?BOOLEAN18.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:200:4: 'neighbor' d= coordexp ( 'of' p= coordexp )?
					{
					match(input,53,FOLLOW_53_in_atom1217); 
					pushFollow(FOLLOW_coordexp_in_atom1221);
					d=coordexp();
					state._fsp--;

					// lifescript.g:200:26: ( 'of' p= coordexp )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==56) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// lifescript.g:200:27: 'of' p= coordexp
							{
							match(input,56,FOLLOW_56_in_atom1224); 
							pushFollow(FOLLOW_coordexp_in_atom1228);
							p=coordexp();
							state._fsp--;

							}
							break;

					}

					 ast = new NeighborExpr(d, p);
					}
					break;
				case 8 :
					// lifescript.g:202:4: 'neighbors' coordexp ( ':' 'type' '=' STRING )?
					{
					match(input,54,FOLLOW_54_in_atom1240); 
					pushFollow(FOLLOW_coordexp_in_atom1242);
					coordexp19=coordexp();
					state._fsp--;

					// lifescript.g:202:25: ( ':' 'type' '=' STRING )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==21) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// lifescript.g:202:26: ':' 'type' '=' STRING
							{
							match(input,21,FOLLOW_21_in_atom1245); 
							match(input,61,FOLLOW_61_in_atom1247); 
							match(input,23,FOLLOW_23_in_atom1249); 
							STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_atom1251); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ " + coordexp19 + "," + (STRING20!=null?STRING20.getText():null));
								ast = new NeighborsExpr(coordexp19, (STRING20!=null?STRING20.getText():null));
					}
					break;
				case 9 :
					// lifescript.g:205:4: 'neighbors' ( ':' 'type' '=' STRING )?
					{
					match(input,54,FOLLOW_54_in_atom1262); 
					// lifescript.g:205:16: ( ':' 'type' '=' STRING )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==21) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// lifescript.g:205:17: ':' 'type' '=' STRING
							{
							match(input,21,FOLLOW_21_in_atom1265); 
							match(input,61,FOLLOW_61_in_atom1267); 
							match(input,23,FOLLOW_23_in_atom1269); 
							STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_atom1271); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ this, " + (STRING21!=null?STRING21.getText():null));
								ast = new NeighborsExpr((STRING21!=null?STRING21.getText():null));
					}
					break;
				case 10 :
					// lifescript.g:208:4: 'alive'
					{
					match(input,39,FOLLOW_39_in_atom1282); 
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
	// lifescript.g:215:1: value returns [Expr ast] : ( ID | num | '-' num );
	public final Expr value() throws RecognitionException {
		Expr ast = null;


		Token ID22=null;
		ParserRuleReturnScope num23 =null;
		ParserRuleReturnScope num24 =null;

		try {
			// lifescript.g:216:2: ( ID | num | '-' num )
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
			case 19:
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
					// lifescript.g:216:4: ID
					{
					ID22=(Token)match(input,ID,FOLLOW_ID_in_value1305); 
					 ast = new VarExpr((ID22!=null?ID22.getText():null)); usageMap.put((ID22!=null?ID22.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:217:4: num
					{
					pushFollow(FOLLOW_num_in_value1313);
					num23=num();
					state._fsp--;

					 ast = new NumExpr((num23!=null?input.toString(num23.start,num23.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:218:4: '-' num
					{
					match(input,19,FOLLOW_19_in_value1321); 
					pushFollow(FOLLOW_num_in_value1323);
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
	// lifescript.g:221:1: num : ( INT | FLOAT );
	public final lifescriptParser.num_return num() throws RecognitionException {
		lifescriptParser.num_return retval = new lifescriptParser.num_return();
		retval.start = input.LT(1);

		try {
			// lifescript.g:221:5: ( INT | FLOAT )
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0xE21E168100000102L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt67 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_stmt80 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt83 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt85 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_stmt103 = new BitSet(new long[]{0x0000000000080780L});
	public static final BitSet FOLLOW_value_in_stmt121 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_STRING_in_stmt132 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt147 = new BitSet(new long[]{0x0000000000080780L});
	public static final BitSet FOLLOW_value_in_stmt152 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_STRING_in_stmt165 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_44_in_stmt189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stmt205 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt209 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_stmt211 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt225 = new BitSet(new long[]{0xE21E3E8100000100L});
	public static final BitSet FOLLOW_43_in_stmt236 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt246 = new BitSet(new long[]{0xE21E368100000100L});
	public static final BitSet FOLLOW_45_in_stmt262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_stmt278 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt280 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt290 = new BitSet(new long[]{0xE21E968100000100L});
	public static final BitSet FOLLOW_47_in_stmt297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_stmt312 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt316 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt318 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt322 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_stmt324 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt328 = new BitSet(new long[]{0xE61E168100000100L});
	public static final BitSet FOLLOW_58_in_stmt331 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt335 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt355 = new BitSet(new long[]{0xE29E168100000100L});
	public static final BitSet FOLLOW_55_in_stmt367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_stmt382 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt386 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt388 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_stmt399 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_stmt401 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt405 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_stmt407 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_stmt414 = new BitSet(new long[]{0x0060009000085390L});
	public static final BitSet FOLLOW_exp_in_stmt419 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt421 = new BitSet(new long[]{0x0060009000085390L});
	public static final BitSet FOLLOW_36_in_stmt431 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_18_in_stmt439 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt443 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_stmt449 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt471 = new BitSet(new long[]{0xE21E568100000100L});
	public static final BitSet FOLLOW_46_in_stmt479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stmt491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_stmt511 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt513 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_stmt515 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_stmt527 = new BitSet(new long[]{0x0000010000000100L});
	public static final BitSet FOLLOW_ID_in_stmt530 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_stmt534 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_stmt555 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt557 = new BitSet(new long[]{0xE21E168100000100L});
	public static final BitSet FOLLOW_stmt_in_stmt567 = new BitSet(new long[]{0xE21F168100000100L});
	public static final BitSet FOLLOW_48_in_stmt575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_stmt583 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt585 = new BitSet(new long[]{0x0000000EBE000002L});
	public static final BitSet FOLLOW_35_in_stmt596 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt598 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt602 = new BitSet(new long[]{0x00000006BE000002L});
	public static final BitSet FOLLOW_27_in_stmt611 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt613 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt617 = new BitSet(new long[]{0x00000006B6000002L});
	public static final BitSet FOLLOW_26_in_stmt625 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt627 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt631 = new BitSet(new long[]{0x00000006B2000002L});
	public static final BitSet FOLLOW_33_in_stmt642 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_stmt646 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt654 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt658 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt660 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt664 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt677 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_18_in_stmt684 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt686 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt690 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt692 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt696 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt709 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_stmt713 = new BitSet(new long[]{0x00000004B2000002L});
	public static final BitSet FOLLOW_25_in_stmt728 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt730 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt734 = new BitSet(new long[]{0x00000004B0000002L});
	public static final BitSet FOLLOW_28_in_stmt742 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt744 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt748 = new BitSet(new long[]{0x00000004A0000002L});
	public static final BitSet FOLLOW_29_in_stmt759 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt761 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt765 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_31_in_stmt776 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt778 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt782 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_stmt793 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt795 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_stmt799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_coordexp824 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_coordexp828 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_coordexp830 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_coordexp834 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_coordexp836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_colorexp854 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp858 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_colorexp860 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp864 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_colorexp866 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp870 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_colorexp872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imagexp889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logexp_in_exp912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp932 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_logexp944 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_relexp_in_logexp948 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_logexp960 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_relexp_in_logexp964 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000002L});
	public static final BitSet FOLLOW_addexp_in_relexp990 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_24_in_relexp1003 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_addexp_in_relexp1007 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_22_in_relexp1017 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_addexp_in_relexp1021 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1046 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_17_in_addexp1058 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1062 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_19_in_addexp1072 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1076 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_atom_in_mulexp1102 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_16_in_mulexp1114 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_atom_in_mulexp1118 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_20_in_mulexp1128 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_atom_in_mulexp1132 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_14_in_atom1157 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_atom1159 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1171 = new BitSet(new long[]{0x0060008000085390L});
	public static final BitSet FOLLOW_exp_in_atom1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom1198 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_atom1217 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1221 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_atom1224 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_atom1240 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1242 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_atom1245 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_atom1247 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_atom1249 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_atom1262 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_atom1265 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_atom1267 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_atom1269 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_atom1282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_value1321 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1323 = new BitSet(new long[]{0x0000000000000002L});
}
