// $ANTLR 3.5 lifescript.g 2015-11-29 14:40:23

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
		"'+'", "','", "'-'", "'/'", "':'", "'<='", "'='", "'=='", "'Dimensions'", 
		"'Generations'", "'Interval'", "'Neighborhood'", "'Pausable'", "'Properties'", 
		"'Start'", "'Steppable'", "'Title'", "'VAR'", "'['", "']'", "'alive'", 
		"'at'", "'create'", "'dead'", "'else'", "'end'", "'endif'", "'endtype'", 
		"'endwhile'", "'endworld'", "'for'", "'if'", "'input'", "'kill'", "'neighbor'", 
		"'neighbors'", "'next'", "'of'", "'print'", "'step'", "'then'", "'to'", 
		"'type'", "'while'", "'world'", "'{'", "'|'", "'}'"
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
				if ( (LA1_0==ID||LA1_0==30||LA1_0==37||(LA1_0 >= 39 && LA1_0 <= 40)||LA1_0==42||(LA1_0 >= 47 && LA1_0 <= 50)||LA1_0==55||(LA1_0 >= 59 && LA1_0 <= 61)) ) {
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
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token text1=null;
		Token text2=null;
		Token v3=null;
		Token v4=null;
		Token title=null;
		Token celltype=null;
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
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'create' ID 'at' coordexp | 'kill' ( ID )? 'at' coordexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? )
			int alt25=14;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt25=1;
				}
				break;
			case 49:
				{
				alt25=2;
				}
				break;
			case 55:
				{
				alt25=3;
				}
				break;
			case 42:
				{
				alt25=4;
				}
				break;
			case 48:
				{
				alt25=5;
				}
				break;
			case 60:
				{
				alt25=6;
				}
				break;
			case 47:
				{
				alt25=7;
				}
				break;
			case 59:
				{
				alt25=8;
				}
				break;
			case 37:
				{
				alt25=9;
				}
				break;
			case 40:
				{
				alt25=10;
				}
				break;
			case 39:
				{
				alt25=11;
				}
				break;
			case 50:
				{
				alt25=12;
				}
				break;
			case 61:
				{
				alt25=13;
				}
				break;
			case 30:
				{
				alt25=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
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
					match(input,49,FOLLOW_49_in_stmt80); 
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
					match(input,55,FOLLOW_55_in_stmt103); 
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
					match(input,42,FOLLOW_42_in_stmt189); 
					ast = new EndStmt();
					}
					break;
				case 5 :
					// lifescript.g:62:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,48,FOLLOW_48_in_stmt205); 
					pushFollow(FOLLOW_exp_in_stmt209);
					e1=exp();
					state._fsp--;

					match(input,57,FOLLOW_57_in_stmt211); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:64:4: (s= stmt )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==30||LA6_0==37||(LA6_0 >= 39 && LA6_0 <= 40)||LA6_0==42||(LA6_0 >= 47 && LA6_0 <= 50)||LA6_0==55||(LA6_0 >= 59 && LA6_0 <= 61)) ) {
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
					if ( (LA8_0==41) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// lifescript.g:65:5: 'else' (s2= stmt )+
							{
							match(input,41,FOLLOW_41_in_stmt236); 
							// lifescript.g:66:5: (s2= stmt )+
							int cnt7=0;
							loop7:
							while (true) {
								int alt7=2;
								int LA7_0 = input.LA(1);
								if ( (LA7_0==ID||LA7_0==30||LA7_0==37||(LA7_0 >= 39 && LA7_0 <= 40)||LA7_0==42||(LA7_0 >= 47 && LA7_0 <= 50)||LA7_0==55||(LA7_0 >= 59 && LA7_0 <= 61)) ) {
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

					match(input,43,FOLLOW_43_in_stmt262); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 6 :
					// lifescript.g:73:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,60,FOLLOW_60_in_stmt278); 
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
						if ( (LA9_0==ID||LA9_0==30||LA9_0==37||(LA9_0 >= 39 && LA9_0 <= 40)||LA9_0==42||(LA9_0 >= 47 && LA9_0 <= 50)||LA9_0==55||(LA9_0 >= 59 && LA9_0 <= 61)) ) {
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

					match(input,45,FOLLOW_45_in_stmt297); 
					ast = new WhileStmt(exp6,whileBlock);
					}
					break;
				case 7 :
					// lifescript.g:78:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,47,FOLLOW_47_in_stmt312); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt316); 
					match(input,23,FOLLOW_23_in_stmt318); 
					pushFollow(FOLLOW_exp_in_stmt322);
					start2=exp();
					state._fsp--;

					match(input,58,FOLLOW_58_in_stmt324); 
					pushFollow(FOLLOW_exp_in_stmt328);
					lim=exp();
					state._fsp--;

					// lifescript.g:78:44: ( 'step' step= exp )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==56) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:78:45: 'step' step= exp
							{
							match(input,56,FOLLOW_56_in_stmt331); 
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
						if ( (LA11_0==ID||LA11_0==30||LA11_0==37||(LA11_0 >= 39 && LA11_0 <= 40)||LA11_0==42||(LA11_0 >= 47 && LA11_0 <= 50)||LA11_0==55||(LA11_0 >= 59 && LA11_0 <= 61)) ) {
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

					match(input,53,FOLLOW_53_in_stmt367); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt371); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:84:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,59,FOLLOW_59_in_stmt382); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt386); 
					match(input,21,FOLLOW_21_in_stmt388); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:86:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:86:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,28,FOLLOW_28_in_stmt399); 
					match(input,35,FOLLOW_35_in_stmt401); 
					pushFollow(FOLLOW_exp_in_stmt405);
					neighWidth=exp();
					state._fsp--;

					match(input,36,FOLLOW_36_in_stmt407); 
					match(input,23,FOLLOW_23_in_stmt409); 
					match(input,62,FOLLOW_62_in_stmt414); 
					// lifescript.g:87:8: (neigh1= exp ',' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==BOOLEAN||(LA12_0 >= FLOAT && LA12_0 <= INT)||LA12_0==12||LA12_0==14||LA12_0==19||(LA12_0 >= 51 && LA12_0 <= 52)) ) {
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

					match(input,34,FOLLOW_34_in_stmt431); 
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

					match(input,64,FOLLOW_64_in_stmt449); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:92:8: (s= stmt )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID||LA14_0==30||LA14_0==37||(LA14_0 >= 39 && LA14_0 <= 40)||LA14_0==42||(LA14_0 >= 47 && LA14_0 <= 50)||LA14_0==55||(LA14_0 >= 59 && LA14_0 <= 61)) ) {
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

					match(input,44,FOLLOW_44_in_stmt479); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 9 :
					// lifescript.g:96:4: 'alive'
					{
					match(input,37,FOLLOW_37_in_stmt491); 
					ast = new AliveStmt();
					}
					break;
				case 10 :
					// lifescript.g:99:4: 'dead'
					{
					match(input,40,FOLLOW_40_in_stmt501); 
					ast = new DeadStmt();
					}
					break;
				case 11 :
					// lifescript.g:102:4: 'create' ID 'at' coordexp
					{
					match(input,39,FOLLOW_39_in_stmt511); 
					ID7=(Token)match(input,ID,FOLLOW_ID_in_stmt513); 
					match(input,38,FOLLOW_38_in_stmt515); 
					pushFollow(FOLLOW_coordexp_in_stmt517);
					coordexp8=coordexp();
					state._fsp--;

					ast = new CreateStmt((ID7!=null?ID7.getText():null), coordexp8);
					}
					break;
				case 12 :
					// lifescript.g:105:4: 'kill' ( ID )? 'at' coordexp
					{
					match(input,50,FOLLOW_50_in_stmt527); 
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

					match(input,38,FOLLOW_38_in_stmt534); 
					pushFollow(FOLLOW_coordexp_in_stmt536);
					coordexp10=coordexp();
					state._fsp--;

					ast = new KillStmt((ID9!=null?ID9.getText():null), coordexp10);
					}
					break;
				case 13 :
					// lifescript.g:117:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,61,FOLLOW_61_in_stmt555); 
					match(input,21,FOLLOW_21_in_stmt557); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:118:4: (s= stmt )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID||LA16_0==30||LA16_0==37||(LA16_0 >= 39 && LA16_0 <= 40)||LA16_0==42||(LA16_0 >= 47 && LA16_0 <= 50)||LA16_0==55||(LA16_0 >= 59 && LA16_0 <= 61)) ) {
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

					match(input,46,FOLLOW_46_in_stmt575); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 14 :
					// lifescript.g:120:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Dimensions' '=' dims= coordexp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )?
					{
					match(input,30,FOLLOW_30_in_stmt582); 
					match(input,21,FOLLOW_21_in_stmt584); 
					// lifescript.g:121:4: ( 'Title' '=' title= STRING )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==33) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// lifescript.g:121:5: 'Title' '=' title= STRING
							{
							match(input,33,FOLLOW_33_in_stmt590); 
							match(input,23,FOLLOW_23_in_stmt592); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt596); 
							}
							break;

					}

					// lifescript.g:122:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==25) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// lifescript.g:122:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,25,FOLLOW_25_in_stmt605); 
							match(input,23,FOLLOW_23_in_stmt607); 
							pushFollow(FOLLOW_coordexp_in_stmt611);
							dims=coordexp();
							state._fsp--;

							}
							break;

					}

					BlockStmt startConditions = new BlockStmt();
					// lifescript.g:124:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==31) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// lifescript.g:124:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,31,FOLLOW_31_in_stmt625); 
							match(input,23,FOLLOW_23_in_stmt627); 
							match(input,62,FOLLOW_62_in_stmt629); 
							match(input,14,FOLLOW_14_in_stmt636); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt640); 
							match(input,18,FOLLOW_18_in_stmt642); 
							pushFollow(FOLLOW_coordexp_in_stmt646);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,15,FOLLOW_15_in_stmt659); 
							// lifescript.g:128:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( (LA19_0==18) ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// lifescript.g:128:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,18,FOLLOW_18_in_stmt666); 
									match(input,14,FOLLOW_14_in_stmt668); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt672); 
									match(input,18,FOLLOW_18_in_stmt674); 
									pushFollow(FOLLOW_coordexp_in_stmt678);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,15,FOLLOW_15_in_stmt691); 
									}
									break;

								default :
									break loop19;
								}
							}

							match(input,64,FOLLOW_64_in_stmt695); 
							}
							break;

					}

					// lifescript.g:131:4: ( 'Generations' '=' gens= exp )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==26) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// lifescript.g:131:5: 'Generations' '=' gens= exp
							{
							match(input,26,FOLLOW_26_in_stmt704); 
							match(input,23,FOLLOW_23_in_stmt706); 
							pushFollow(FOLLOW_exp_in_stmt710);
							gens=exp();
							state._fsp--;

							}
							break;

					}

					// lifescript.g:132:4: ( 'Interval' '=' intervals= exp )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==27) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// lifescript.g:132:5: 'Interval' '=' intervals= exp
							{
							match(input,27,FOLLOW_27_in_stmt719); 
							match(input,23,FOLLOW_23_in_stmt721); 
							pushFollow(FOLLOW_exp_in_stmt725);
							intervals=exp();
							state._fsp--;

							}
							break;

					}

					// lifescript.g:133:4: ( 'Pausable' '=' pause= exp )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==29) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:133:5: 'Pausable' '=' pause= exp
							{
							match(input,29,FOLLOW_29_in_stmt734); 
							match(input,23,FOLLOW_23_in_stmt736); 
							pushFollow(FOLLOW_exp_in_stmt740);
							pause=exp();
							state._fsp--;

							}
							break;

					}

					// lifescript.g:134:4: ( 'Steppable' '=' sb= exp )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==32) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:134:5: 'Steppable' '=' sb= exp
							{
							match(input,32,FOLLOW_32_in_stmt749); 
							match(input,23,FOLLOW_23_in_stmt751); 
							pushFollow(FOLLOW_exp_in_stmt755);
							sb=exp();
							state._fsp--;

							}
							break;

					}

					System.out.println("new properties = " + (title!=null?title.getText():null) + ", " + dims+ ", " + gens + 
										", " + intervals + ", "+ pause + ", " + sb);
								ast = new PropertiesStmt((title!=null?title.getText():null), dims, startConditions, gens, 
											intervals, pause, sb);
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
	// lifescript.g:141:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:142:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:142:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,14,FOLLOW_14_in_coordexp777); 
			pushFollow(FOLLOW_exp_in_coordexp781);
			e1=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_coordexp783); 
			pushFollow(FOLLOW_exp_in_coordexp787);
			e2=exp();
			state._fsp--;

			match(input,15,FOLLOW_15_in_coordexp789); 
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
	// lifescript.g:145:1: colorexp returns [ColorExpr ast] : '(' e1= exp ',' e2= exp ',' e3= exp ')' ;
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:146:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' )
			// lifescript.g:146:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
			{
			match(input,14,FOLLOW_14_in_colorexp807); 
			pushFollow(FOLLOW_exp_in_colorexp811);
			e1=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_colorexp813); 
			pushFollow(FOLLOW_exp_in_colorexp817);
			e2=exp();
			state._fsp--;

			match(input,18,FOLLOW_18_in_colorexp819); 
			pushFollow(FOLLOW_exp_in_colorexp823);
			e3=exp();
			state._fsp--;

			match(input,15,FOLLOW_15_in_colorexp825); 
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
	// lifescript.g:149:1: imagexp returns [ImageExpr ast] : STRING ;
	public final ImageExpr imagexp() throws RecognitionException {
		ImageExpr ast = null;


		Token STRING11=null;

		try {
			// lifescript.g:150:2: ( STRING )
			// lifescript.g:150:4: STRING
			{
			STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_imagexp842); 
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
	// lifescript.g:155:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp12 =null;

		try {
			// lifescript.g:156:2: ( logexp )
			// lifescript.g:156:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp865);
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
	// lifescript.g:160:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:161:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:161:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp885);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:162:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==13) ) {
					alt26=1;
				}
				else if ( (LA26_0==63) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// lifescript.g:163:4: ( '&' e2= relexp )
					{
					// lifescript.g:163:4: ( '&' e2= relexp )
					// lifescript.g:163:5: '&' e2= relexp
					{
					match(input,13,FOLLOW_13_in_logexp897); 
					pushFollow(FOLLOW_relexp_in_logexp901);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:164:4: ( '|' e3= relexp )
					{
					// lifescript.g:164:4: ( '|' e3= relexp )
					// lifescript.g:164:5: '|' e3= relexp
					{
					match(input,63,FOLLOW_63_in_logexp913); 
					pushFollow(FOLLOW_relexp_in_logexp917);
					e3=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.OR, ast, e3); 
					}

					}
					break;

				default :
					break loop26;
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
	// lifescript.g:168:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* ;
	public final Expr relexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:169:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )* )
			// lifescript.g:169:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp943);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:170:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) )*
			loop27:
			while (true) {
				int alt27=3;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==24) ) {
					alt27=1;
				}
				else if ( (LA27_0==22) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// lifescript.g:171:4: ( '==' e2= addexp )
					{
					// lifescript.g:171:4: ( '==' e2= addexp )
					// lifescript.g:171:5: '==' e2= addexp
					{
					match(input,24,FOLLOW_24_in_relexp956); 
					pushFollow(FOLLOW_addexp_in_relexp960);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:172:4: ( '<=' e3= addexp )
					{
					// lifescript.g:172:4: ( '<=' e3= addexp )
					// lifescript.g:172:5: '<=' e3= addexp
					{
					match(input,22,FOLLOW_22_in_relexp970); 
					pushFollow(FOLLOW_addexp_in_relexp974);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
					}

					}
					break;

				default :
					break loop27;
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
	// lifescript.g:176:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:177:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:177:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp999);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:178:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==17) ) {
					alt28=1;
				}
				else if ( (LA28_0==19) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// lifescript.g:179:4: ( '+' e2= mulexp )
					{
					// lifescript.g:179:4: ( '+' e2= mulexp )
					// lifescript.g:179:5: '+' e2= mulexp
					{
					match(input,17,FOLLOW_17_in_addexp1011); 
					pushFollow(FOLLOW_mulexp_in_addexp1015);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:180:4: ( '-' e3= mulexp )
					{
					// lifescript.g:180:4: ( '-' e3= mulexp )
					// lifescript.g:180:5: '-' e3= mulexp
					{
					match(input,19,FOLLOW_19_in_addexp1025); 
					pushFollow(FOLLOW_mulexp_in_addexp1029);
					e3=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MINUS,ast,e3); 
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
	// $ANTLR end "addexp"



	// $ANTLR start "mulexp"
	// lifescript.g:184:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:185:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:185:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1055);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:186:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==16) ) {
					alt29=1;
				}
				else if ( (LA29_0==20) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// lifescript.g:187:4: ( '*' e2= atom )
					{
					// lifescript.g:187:4: ( '*' e2= atom )
					// lifescript.g:187:5: '*' e2= atom
					{
					match(input,16,FOLLOW_16_in_mulexp1067); 
					pushFollow(FOLLOW_atom_in_mulexp1071);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:188:4: ( '/' e3= atom )
					{
					// lifescript.g:188:4: ( '/' e3= atom )
					// lifescript.g:188:5: '/' e3= atom
					{
					match(input,20,FOLLOW_20_in_mulexp1081); 
					pushFollow(FOLLOW_atom_in_mulexp1085);
					e3=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.DIV,ast,e3); 
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
	// $ANTLR end "mulexp"



	// $ANTLR start "atom"
	// lifescript.g:192:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? );
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
			// lifescript.g:193:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbor' d= coordexp ( 'of' p= coordexp )? | 'neighbors' coordexp ( ':' 'type' '=' STRING )? | 'neighbors' ( ':' 'type' '=' STRING )? )
			int alt33=9;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt33=1;
				}
				break;
			case 12:
				{
				alt33=2;
				}
				break;
			case ID:
				{
				alt33=3;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt33=4;
				}
				break;
			case 19:
				{
				alt33=5;
				}
				break;
			case BOOLEAN:
				{
				alt33=6;
				}
				break;
			case 51:
				{
				alt33=7;
				}
				break;
			case 52:
				{
				int LA33_8 = input.LA(2);
				if ( (LA33_8==14) ) {
					alt33=8;
				}
				else if ( (LA33_8==EOF||LA33_8==ID||LA33_8==13||(LA33_8 >= 15 && LA33_8 <= 22)||LA33_8==24||LA33_8==27||(LA33_8 >= 29 && LA33_8 <= 30)||LA33_8==32||(LA33_8 >= 36 && LA33_8 <= 37)||(LA33_8 >= 39 && LA33_8 <= 50)||LA33_8==53||(LA33_8 >= 55 && LA33_8 <= 61)||(LA33_8 >= 63 && LA33_8 <= 64)) ) {
					alt33=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// lifescript.g:193:4: '(' exp ')'
					{
					match(input,14,FOLLOW_14_in_atom1110); 
					pushFollow(FOLLOW_exp_in_atom1112);
					exp13=exp();
					state._fsp--;

					match(input,15,FOLLOW_15_in_atom1114); 
					 ast = new ParenExpr(exp13); 
					}
					break;
				case 2 :
					// lifescript.g:194:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1124); 
					pushFollow(FOLLOW_exp_in_atom1126);
					exp14=exp();
					state._fsp--;

					 ast = new NegExpr(exp14); 
					}
					break;
				case 3 :
					// lifescript.g:195:4: ID
					{
					ID15=(Token)match(input,ID,FOLLOW_ID_in_atom1135); 
					 ast = new VarExpr((ID15!=null?ID15.getText():null)); usageMap.put((ID15!=null?ID15.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:196:4: num
					{
					pushFollow(FOLLOW_num_in_atom1143);
					num16=num();
					state._fsp--;

					 ast = new NumExpr((num16!=null?input.toString(num16.start,num16.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:197:4: '-' num
					{
					match(input,19,FOLLOW_19_in_atom1151); 
					pushFollow(FOLLOW_num_in_atom1153);
					num17=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num17!=null?input.toString(num17.start,num17.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:198:4: BOOLEAN
					{
					BOOLEAN18=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1161); 
					 ast = new BooleanExpr((BOOLEAN18!=null?BOOLEAN18.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:199:4: 'neighbor' d= coordexp ( 'of' p= coordexp )?
					{
					match(input,51,FOLLOW_51_in_atom1170); 
					pushFollow(FOLLOW_coordexp_in_atom1174);
					d=coordexp();
					state._fsp--;

					// lifescript.g:199:26: ( 'of' p= coordexp )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==54) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// lifescript.g:199:27: 'of' p= coordexp
							{
							match(input,54,FOLLOW_54_in_atom1177); 
							pushFollow(FOLLOW_coordexp_in_atom1181);
							p=coordexp();
							state._fsp--;

							}
							break;

					}

					 ast = new NeighborExpr(d, p);
					}
					break;
				case 8 :
					// lifescript.g:201:4: 'neighbors' coordexp ( ':' 'type' '=' STRING )?
					{
					match(input,52,FOLLOW_52_in_atom1193); 
					pushFollow(FOLLOW_coordexp_in_atom1195);
					coordexp19=coordexp();
					state._fsp--;

					// lifescript.g:201:25: ( ':' 'type' '=' STRING )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==21) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// lifescript.g:201:26: ':' 'type' '=' STRING
							{
							match(input,21,FOLLOW_21_in_atom1198); 
							match(input,59,FOLLOW_59_in_atom1200); 
							match(input,23,FOLLOW_23_in_atom1202); 
							STRING20=(Token)match(input,STRING,FOLLOW_STRING_in_atom1204); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ " + coordexp19 + "," + (STRING20!=null?STRING20.getText():null));
								ast = new NeighborsExpr(coordexp19, (STRING20!=null?STRING20.getText():null));
					}
					break;
				case 9 :
					// lifescript.g:204:4: 'neighbors' ( ':' 'type' '=' STRING )?
					{
					match(input,52,FOLLOW_52_in_atom1215); 
					// lifescript.g:204:16: ( ':' 'type' '=' STRING )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==21) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// lifescript.g:204:17: ':' 'type' '=' STRING
							{
							match(input,21,FOLLOW_21_in_atom1218); 
							match(input,59,FOLLOW_59_in_atom1220); 
							match(input,23,FOLLOW_23_in_atom1222); 
							STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_atom1224); 
							}
							break;

					}

						System.out.println("initializing neighbors w/ this, " + (STRING21!=null?STRING21.getText():null));
								ast = new NeighborsExpr((STRING21!=null?STRING21.getText():null));
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
	// lifescript.g:213:1: value returns [Expr ast] : ( ID | num | '-' num );
	public final Expr value() throws RecognitionException {
		Expr ast = null;


		Token ID22=null;
		ParserRuleReturnScope num23 =null;
		ParserRuleReturnScope num24 =null;

		try {
			// lifescript.g:214:2: ( ID | num | '-' num )
			int alt34=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt34=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt34=2;
				}
				break;
			case 19:
				{
				alt34=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// lifescript.g:214:4: ID
					{
					ID22=(Token)match(input,ID,FOLLOW_ID_in_value1251); 
					 ast = new VarExpr((ID22!=null?ID22.getText():null)); usageMap.put((ID22!=null?ID22.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:215:4: num
					{
					pushFollow(FOLLOW_num_in_value1259);
					num23=num();
					state._fsp--;

					 ast = new NumExpr((num23!=null?input.toString(num23.start,num23.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:216:4: '-' num
					{
					match(input,19,FOLLOW_19_in_value1267); 
					pushFollow(FOLLOW_num_in_value1269);
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
	// lifescript.g:219:1: num : ( INT | FLOAT );
	public final lifescriptParser.num_return num() throws RecognitionException {
		lifescriptParser.num_return retval = new lifescriptParser.num_return();
		retval.start = input.LT(1);

		try {
			// lifescript.g:219:5: ( INT | FLOAT )
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0x388785A040000102L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt67 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_stmt80 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt83 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt85 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_stmt103 = new BitSet(new long[]{0x0000000000080780L});
	public static final BitSet FOLLOW_value_in_stmt121 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_STRING_in_stmt132 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_stmt147 = new BitSet(new long[]{0x0000000000080780L});
	public static final BitSet FOLLOW_value_in_stmt152 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_STRING_in_stmt165 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_42_in_stmt189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_stmt205 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt209 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_stmt211 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt225 = new BitSet(new long[]{0x38878FA040000100L});
	public static final BitSet FOLLOW_41_in_stmt236 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt246 = new BitSet(new long[]{0x38878DA040000100L});
	public static final BitSet FOLLOW_43_in_stmt262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_stmt278 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt280 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt290 = new BitSet(new long[]{0x3887A5A040000100L});
	public static final BitSet FOLLOW_45_in_stmt297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_stmt312 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt316 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt318 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt322 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_stmt324 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt328 = new BitSet(new long[]{0x398785A040000100L});
	public static final BitSet FOLLOW_56_in_stmt331 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt335 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt355 = new BitSet(new long[]{0x38A785A040000100L});
	public static final BitSet FOLLOW_53_in_stmt367 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_stmt382 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt386 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt388 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_stmt399 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_stmt401 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt405 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_stmt407 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt409 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_stmt414 = new BitSet(new long[]{0x0018000400085390L});
	public static final BitSet FOLLOW_exp_in_stmt419 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt421 = new BitSet(new long[]{0x0018000400085390L});
	public static final BitSet FOLLOW_34_in_stmt431 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_18_in_stmt439 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt443 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_stmt449 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt471 = new BitSet(new long[]{0x388795A040000100L});
	public static final BitSet FOLLOW_44_in_stmt479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_stmt491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_stmt511 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt513 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_stmt515 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_stmt527 = new BitSet(new long[]{0x0000004000000100L});
	public static final BitSet FOLLOW_ID_in_stmt530 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_stmt534 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_stmt555 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt557 = new BitSet(new long[]{0x388785A040000100L});
	public static final BitSet FOLLOW_stmt_in_stmt567 = new BitSet(new long[]{0x3887C5A040000100L});
	public static final BitSet FOLLOW_46_in_stmt575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_stmt582 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_stmt584 = new BitSet(new long[]{0x00000003AE000002L});
	public static final BitSet FOLLOW_33_in_stmt590 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt592 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt596 = new BitSet(new long[]{0x00000001AE000002L});
	public static final BitSet FOLLOW_25_in_stmt605 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt607 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt611 = new BitSet(new long[]{0x00000001AC000002L});
	public static final BitSet FOLLOW_31_in_stmt625 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt627 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_stmt629 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt636 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt640 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt642 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt646 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt659 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_18_in_stmt666 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_stmt668 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt672 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_stmt674 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_stmt678 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt691 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_stmt695 = new BitSet(new long[]{0x000000012C000002L});
	public static final BitSet FOLLOW_26_in_stmt704 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt706 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt710 = new BitSet(new long[]{0x0000000128000002L});
	public static final BitSet FOLLOW_27_in_stmt719 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt721 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt725 = new BitSet(new long[]{0x0000000120000002L});
	public static final BitSet FOLLOW_29_in_stmt734 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt736 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt740 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_stmt749 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_stmt751 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_stmt755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_coordexp777 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_coordexp781 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_coordexp783 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_coordexp787 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_coordexp789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_colorexp807 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp811 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_colorexp813 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp817 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_colorexp819 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_colorexp823 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_colorexp825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_imagexp842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logexp_in_exp865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp885 = new BitSet(new long[]{0x8000000000002002L});
	public static final BitSet FOLLOW_13_in_logexp897 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_relexp_in_logexp901 = new BitSet(new long[]{0x8000000000002002L});
	public static final BitSet FOLLOW_63_in_logexp913 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_relexp_in_logexp917 = new BitSet(new long[]{0x8000000000002002L});
	public static final BitSet FOLLOW_addexp_in_relexp943 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_24_in_relexp956 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_addexp_in_relexp960 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_22_in_relexp970 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_addexp_in_relexp974 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_mulexp_in_addexp999 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_17_in_addexp1011 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1015 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_19_in_addexp1025 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_mulexp_in_addexp1029 = new BitSet(new long[]{0x00000000000A0002L});
	public static final BitSet FOLLOW_atom_in_mulexp1055 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_16_in_mulexp1067 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_atom_in_mulexp1071 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_20_in_mulexp1081 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_atom_in_mulexp1085 = new BitSet(new long[]{0x0000000000110002L});
	public static final BitSet FOLLOW_14_in_atom1110 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_atom1112 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1124 = new BitSet(new long[]{0x0018000000085390L});
	public static final BitSet FOLLOW_exp_in_atom1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom1151 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_atom1170 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1174 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_atom1177 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_atom1193 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_coordexp_in_atom1195 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_atom1198 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_atom1200 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_atom1202 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_atom1215 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_atom1218 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_atom1220 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_atom1222 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_value1267 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1269 = new BitSet(new long[]{0x0000000000000002L});
}
