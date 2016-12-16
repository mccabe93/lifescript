// $ANTLR 3.5 lifescript.g 2016-12-15 23:23:07

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
		"'Steppable'", "'Title'", "'VAR'", "'Wraparound'", "'['", "']'", "'addcolumn'", 
		"'addrow'", "'alive'", "'are'", "'at'", "'become'", "'cell'", "'create'", 
		"'dead'", "'def'", "'else'", "'end'", "'enddef'", "'endif'", "'endtype'", 
		"'endwhile'", "'endworld'", "'for'", "'if'", "'input'", "'is'", "'kill'", 
		"'neighbor'", "'neighbors'", "'next'", "'of'", "'print'", "'random'", 
		"'return'", "'setcolor'", "'setstate'", "'state'", "'statecolor'", "'step'", 
		"'that'", "'then'", "'to'", "'type'", "'while'", "'world'", "'{'", "'|'", 
		"'}'"
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
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
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
				if ( (LA1_0==ID||LA1_0==36||(LA1_0 >= 44 && LA1_0 <= 46)||LA1_0==49||(LA1_0 >= 51 && LA1_0 <= 53)||LA1_0==55||(LA1_0 >= 61 && LA1_0 <= 63)||LA1_0==65||LA1_0==70||(LA1_0 >= 72 && LA1_0 <= 74)||LA1_0==76||(LA1_0 >= 81 && LA1_0 <= 83)) ) {
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
	// lifescript.g:38:1: stmt returns [Stmt ast] : ( ID '=' exp | 'input' ( STRING ',' )? ID | 'def' f0= ID '(' ')' ':' (s= stmt )+ 'enddef' | 'def' f1= ID '(' l= formalParamList ')' ':' (s= stmt )+ 'enddef' | ID '(' ')' | ID '(' l= actualParamList ')' | 'return' exp | 'return' | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'become' STRING | 'setstate' ( 'of' coordexp )? 'to' exp | 'statecolor' exp 'is' colorexp | 'create' STRING 'at' coordexp | 'kill' ( STRING )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Wraparound' '=' wrap= exp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? );
	public final Stmt stmt() throws RecognitionException {
		Stmt ast = null;


		Token f0=null;
		Token f1=null;
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
		Token ID6=null;
		Token ID7=null;
		Token STRING10=null;
		Token STRING15=null;
		Token STRING17=null;
		Stmt s =null;
		ArgList l =null;
		Expr v1 =null;
		Expr v2 =null;
		Expr e1 =null;
		Stmt s2 =null;
		Expr start2 =null;
		Expr lim =null;
		Expr step =null;
		Expr neighWidth =null;
		Expr neigh1 =null;
		Expr neigh2 =null;
		CoordExpr cs =null;
		CoordExpr dims =null;
		Expr wrap =null;
		CoordExpr cellcoords =null;
		Expr gens =null;
		Expr intervals =null;
		Expr pause =null;
		Expr sb =null;
		Expr exp3 =null;
		Expr exp8 =null;
		Expr exp9 =null;
		CoordExpr coordexp11 =null;
		Expr exp12 =null;
		Expr exp13 =null;
		ColorExpr colorexp14 =null;
		CoordExpr coordexp16 =null;
		CoordExpr coordexp18 =null;
		CoordExpr coordexp19 =null;
		ColorExpr colorexp20 =null;

		try {
			// lifescript.g:39:2: ( ID '=' exp | 'input' ( STRING ',' )? ID | 'def' f0= ID '(' ')' ':' (s= stmt )+ 'enddef' | 'def' f1= ID '(' l= formalParamList ')' ':' (s= stmt )+ 'enddef' | ID '(' ')' | ID '(' l= actualParamList ')' | 'return' exp | 'return' | 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )* | 'end' | 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif' | 'while' exp (s= stmt )+ 'endwhile' | 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID | 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype' | 'alive' | 'dead' | 'become' STRING | 'setstate' ( 'of' coordexp )? 'to' exp | 'statecolor' exp 'is' colorexp | 'create' STRING 'at' coordexp | 'kill' ( STRING )? 'at' coordexp | 'addrow' | 'addcolumn' | 'setcolor' ( 'at' coordexp )? 'to' colorexp | 'world' ':' (s= stmt )+ 'endworld' | 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Wraparound' '=' wrap= exp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )? )
			int alt32=26;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA32_1 = input.LA(2);
				if ( (LA32_1==25) ) {
					alt32=1;
				}
				else if ( (LA32_1==15) ) {
					int LA32_24 = input.LA(3);
					if ( (LA32_24==16) ) {
						alt32=5;
					}
					else if ( (LA32_24==BOOLEAN||(LA32_24 >= FLOAT && LA32_24 <= INT)||LA32_24==12||LA32_24==15||LA32_24==20||LA32_24==46||LA32_24==50||(LA32_24 >= 66 && LA32_24 <= 67)||LA32_24==71||LA32_24==75) ) {
						alt32=6;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 24, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 63:
				{
				alt32=2;
				}
				break;
			case 53:
				{
				int LA32_3 = input.LA(2);
				if ( (LA32_3==ID) ) {
					int LA32_25 = input.LA(3);
					if ( (LA32_25==15) ) {
						int LA32_32 = input.LA(4);
						if ( (LA32_32==16) ) {
							alt32=3;
						}
						else if ( (LA32_32==ID) ) {
							alt32=4;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 32, 32, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 25, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 72:
				{
				switch ( input.LA(2) ) {
				case BOOLEAN:
				case FLOAT:
				case INT:
				case 12:
				case 15:
				case 20:
				case 50:
				case 66:
				case 67:
					{
					alt32=7;
					}
					break;
				case ID:
					{
					int LA32_27 = input.LA(3);
					if ( (LA32_27==15||LA32_27==25) ) {
						alt32=8;
					}
					else if ( (LA32_27==EOF||LA32_27==ID||(LA32_27 >= 13 && LA32_27 <= 14)||(LA32_27 >= 17 && LA32_27 <= 18)||(LA32_27 >= 20 && LA32_27 <= 21)||(LA32_27 >= 23 && LA32_27 <= 24)||(LA32_27 >= 26 && LA32_27 <= 28)||LA32_27==36||(LA32_27 >= 44 && LA32_27 <= 46)||LA32_27==49||(LA32_27 >= 51 && LA32_27 <= 63)||LA32_27==65||LA32_27==68||LA32_27==70||(LA32_27 >= 72 && LA32_27 <= 74)||LA32_27==76||(LA32_27 >= 81 && LA32_27 <= 83)||LA32_27==85) ) {
						alt32=7;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 27, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 46:
				case 71:
				case 75:
					{
					alt32=7;
					}
					break;
				case EOF:
				case 36:
				case 44:
				case 45:
				case 49:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 62:
				case 63:
				case 65:
				case 68:
				case 70:
				case 72:
				case 73:
				case 74:
				case 76:
				case 81:
				case 82:
				case 83:
					{
					alt32=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 70:
				{
				alt32=9;
				}
				break;
			case 55:
				{
				alt32=10;
				}
				break;
			case 62:
				{
				alt32=11;
				}
				break;
			case 82:
				{
				alt32=12;
				}
				break;
			case 61:
				{
				alt32=13;
				}
				break;
			case 81:
				{
				alt32=14;
				}
				break;
			case 46:
				{
				alt32=15;
				}
				break;
			case 52:
				{
				alt32=16;
				}
				break;
			case 49:
				{
				alt32=17;
				}
				break;
			case 74:
				{
				alt32=18;
				}
				break;
			case 76:
				{
				alt32=19;
				}
				break;
			case 51:
				{
				alt32=20;
				}
				break;
			case 65:
				{
				alt32=21;
				}
				break;
			case 45:
				{
				alt32=22;
				}
				break;
			case 44:
				{
				alt32=23;
				}
				break;
			case 73:
				{
				alt32=24;
				}
				break;
			case 83:
				{
				alt32=25;
				}
				break;
			case 36:
				{
				alt32=26;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
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
					match(input,63,FOLLOW_63_in_stmt79); 
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
					// lifescript.g:45:4: 'def' f0= ID '(' ')' ':' (s= stmt )+ 'enddef'
					{
					match(input,53,FOLLOW_53_in_stmt100); 
					f0=(Token)match(input,ID,FOLLOW_ID_in_stmt104); 
					match(input,15,FOLLOW_15_in_stmt106); 
					match(input,16,FOLLOW_16_in_stmt108); 
					match(input,22,FOLLOW_22_in_stmt110); 
					BlockStmt funcBlock = new BlockStmt();
					// lifescript.g:47:8: (s= stmt )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID||LA3_0==36||(LA3_0 >= 44 && LA3_0 <= 46)||LA3_0==49||(LA3_0 >= 51 && LA3_0 <= 53)||LA3_0==55||(LA3_0 >= 61 && LA3_0 <= 63)||LA3_0==65||LA3_0==70||(LA3_0 >= 72 && LA3_0 <= 74)||LA3_0==76||(LA3_0 >= 81 && LA3_0 <= 83)) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// lifescript.g:47:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt128);
							s=stmt();
							state._fsp--;

							funcBlock.addAST(s);
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input,56,FOLLOW_56_in_stmt136); 
					 ast = new FuncDeclStmt((f0!=null?f0.getText():null),new Function(new ArgList(),funcBlock)); 
					}
					break;
				case 4 :
					// lifescript.g:51:4: 'def' f1= ID '(' l= formalParamList ')' ':' (s= stmt )+ 'enddef'
					{
					match(input,53,FOLLOW_53_in_stmt148); 
					f1=(Token)match(input,ID,FOLLOW_ID_in_stmt152); 
					match(input,15,FOLLOW_15_in_stmt154); 
					pushFollow(FOLLOW_formalParamList_in_stmt158);
					l=formalParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt160); 
					match(input,22,FOLLOW_22_in_stmt162); 
					BlockStmt funcBlock2 = new BlockStmt();
					// lifescript.g:53:8: (s= stmt )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID||LA4_0==36||(LA4_0 >= 44 && LA4_0 <= 46)||LA4_0==49||(LA4_0 >= 51 && LA4_0 <= 53)||LA4_0==55||(LA4_0 >= 61 && LA4_0 <= 63)||LA4_0==65||LA4_0==70||(LA4_0 >= 72 && LA4_0 <= 74)||LA4_0==76||(LA4_0 >= 81 && LA4_0 <= 83)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// lifescript.g:53:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt180);
							s=stmt();
							state._fsp--;

							funcBlock2.addAST(s);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input,56,FOLLOW_56_in_stmt188); 
					 ast = new FuncDeclStmt((f1!=null?f1.getText():null),new Function(l,funcBlock2));
								
					}
					break;
				case 5 :
					// lifescript.g:57:4: ID '(' ')'
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_stmt197); 
					match(input,15,FOLLOW_15_in_stmt199); 
					match(input,16,FOLLOW_16_in_stmt201); 
					 ast = new CallStmt((ID6!=null?ID6.getText():null));
					}
					break;
				case 6 :
					// lifescript.g:58:4: ID '(' l= actualParamList ')'
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_stmt212); 
					match(input,15,FOLLOW_15_in_stmt214); 
					pushFollow(FOLLOW_actualParamList_in_stmt218);
					l=actualParamList();
					state._fsp--;

					match(input,16,FOLLOW_16_in_stmt220); 
					 ast = new CallStmt((ID7!=null?ID7.getText():null),l);
					}
					break;
				case 7 :
					// lifescript.g:59:4: 'return' exp
					{
					match(input,72,FOLLOW_72_in_stmt229); 
					pushFollow(FOLLOW_exp_in_stmt231);
					exp8=exp();
					state._fsp--;

					 ast = new ReturnStmt(exp8); 
					}
					break;
				case 8 :
					// lifescript.g:60:4: 'return'
					{
					match(input,72,FOLLOW_72_in_stmt242); 
					 ast = new ReturnStmt(); 
					}
					break;
				case 9 :
					// lifescript.g:62:4: 'print' (v1= value |text1= STRING ) ( ',' (v2= value |text2= STRING ) )*
					{
					match(input,70,FOLLOW_70_in_stmt255); 
					BlockStmt prints = new BlockStmt();
					// lifescript.g:65:4: (v1= value |text1= STRING )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= FLOAT && LA5_0 <= INT)||LA5_0==20) ) {
						alt5=1;
					}
					else if ( (LA5_0==STRING) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// lifescript.g:65:5: v1= value
							{
							pushFollow(FOLLOW_value_in_stmt273);
							v1=value();
							state._fsp--;

							prints.addAST(new PrintStmt(v1));
							}
							break;
						case 2 :
							// lifescript.g:66:6: text1= STRING
							{
							text1=(Token)match(input,STRING,FOLLOW_STRING_in_stmt284); 
							prints.addAST(new PrintStmt((text1!=null?text1.getText():null)));
							}
							break;

					}

					// lifescript.g:68:4: ( ',' (v2= value |text2= STRING ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==19) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// lifescript.g:68:5: ',' (v2= value |text2= STRING )
							{
							match(input,19,FOLLOW_19_in_stmt299); 
							// lifescript.g:68:9: (v2= value |text2= STRING )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( ((LA6_0 >= FLOAT && LA6_0 <= INT)||LA6_0==20) ) {
								alt6=1;
							}
							else if ( (LA6_0==STRING) ) {
								alt6=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								throw nvae;
							}

							switch (alt6) {
								case 1 :
									// lifescript.g:68:10: v2= value
									{
									pushFollow(FOLLOW_value_in_stmt304);
									v2=value();
									state._fsp--;

									prints.addAST(new PrintStmt(v2));
									}
									break;
								case 2 :
									// lifescript.g:69:7: text2= STRING
									{
									text2=(Token)match(input,STRING,FOLLOW_STRING_in_stmt317); 
									prints.addAST(new PrintStmt((text2!=null?text2.getText():null)));
									}
									break;

							}

							}
							break;

						default :
							break loop7;
						}
					}

					prints.addAST(new EOLStmt()); 
								ast = prints;
					}
					break;
				case 10 :
					// lifescript.g:74:4: 'end'
					{
					match(input,55,FOLLOW_55_in_stmt341); 
					ast = new EndStmt();
					}
					break;
				case 11 :
					// lifescript.g:78:4: 'if' e1= exp 'then' (s= stmt )+ ( 'else' (s2= stmt )+ )? 'endif'
					{
					match(input,62,FOLLOW_62_in_stmt357); 
					pushFollow(FOLLOW_exp_in_stmt361);
					e1=exp();
					state._fsp--;

					match(input,79,FOLLOW_79_in_stmt363); 
					BlockStmt ifBlock = new BlockStmt(); BlockStmt elseBlock = new BlockStmt();
					// lifescript.g:80:4: (s= stmt )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ID||LA8_0==36||(LA8_0 >= 44 && LA8_0 <= 46)||LA8_0==49||(LA8_0 >= 51 && LA8_0 <= 53)||LA8_0==55||(LA8_0 >= 61 && LA8_0 <= 63)||LA8_0==65||LA8_0==70||(LA8_0 >= 72 && LA8_0 <= 74)||LA8_0==76||(LA8_0 >= 81 && LA8_0 <= 83)) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// lifescript.g:80:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt377);
							s=stmt();
							state._fsp--;

							ifBlock.addAST(s);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// lifescript.g:81:4: ( 'else' (s2= stmt )+ )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==54) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// lifescript.g:81:5: 'else' (s2= stmt )+
							{
							match(input,54,FOLLOW_54_in_stmt388); 
							// lifescript.g:82:5: (s2= stmt )+
							int cnt9=0;
							loop9:
							while (true) {
								int alt9=2;
								int LA9_0 = input.LA(1);
								if ( (LA9_0==ID||LA9_0==36||(LA9_0 >= 44 && LA9_0 <= 46)||LA9_0==49||(LA9_0 >= 51 && LA9_0 <= 53)||LA9_0==55||(LA9_0 >= 61 && LA9_0 <= 63)||LA9_0==65||LA9_0==70||(LA9_0 >= 72 && LA9_0 <= 74)||LA9_0==76||(LA9_0 >= 81 && LA9_0 <= 83)) ) {
									alt9=1;
								}

								switch (alt9) {
								case 1 :
									// lifescript.g:82:6: s2= stmt
									{
									pushFollow(FOLLOW_stmt_in_stmt398);
									s2=stmt();
									state._fsp--;

									elseBlock.addAST(s2);
									}
									break;

								default :
									if ( cnt9 >= 1 ) break loop9;
									EarlyExitException eee = new EarlyExitException(9, input);
									throw eee;
								}
								cnt9++;
							}

							}
							break;

					}

					match(input,57,FOLLOW_57_in_stmt414); 
					ast = new IfStmt(e1, ifBlock, elseBlock);
					}
					break;
				case 12 :
					// lifescript.g:89:4: 'while' exp (s= stmt )+ 'endwhile'
					{
					match(input,82,FOLLOW_82_in_stmt430); 
					pushFollow(FOLLOW_exp_in_stmt432);
					exp9=exp();
					state._fsp--;

					BlockStmt whileBlock = new BlockStmt();
					// lifescript.g:90:4: (s= stmt )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ID||LA11_0==36||(LA11_0 >= 44 && LA11_0 <= 46)||LA11_0==49||(LA11_0 >= 51 && LA11_0 <= 53)||LA11_0==55||(LA11_0 >= 61 && LA11_0 <= 63)||LA11_0==65||LA11_0==70||(LA11_0 >= 72 && LA11_0 <= 74)||LA11_0==76||(LA11_0 >= 81 && LA11_0 <= 83)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// lifescript.g:90:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt442);
							s=stmt();
							state._fsp--;

							whileBlock.addAST(s);
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input,59,FOLLOW_59_in_stmt449); 
					ast = new WhileStmt(exp9,whileBlock);
					}
					break;
				case 13 :
					// lifescript.g:94:4: 'for' v3= ID '=' start2= exp 'to' lim= exp ( 'step' step= exp )? (s= stmt )+ 'next' v4= ID
					{
					match(input,61,FOLLOW_61_in_stmt464); 
					v3=(Token)match(input,ID,FOLLOW_ID_in_stmt468); 
					match(input,25,FOLLOW_25_in_stmt470); 
					pushFollow(FOLLOW_exp_in_stmt474);
					start2=exp();
					state._fsp--;

					match(input,80,FOLLOW_80_in_stmt476); 
					pushFollow(FOLLOW_exp_in_stmt480);
					lim=exp();
					state._fsp--;

					// lifescript.g:94:44: ( 'step' step= exp )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==77) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// lifescript.g:94:45: 'step' step= exp
							{
							match(input,77,FOLLOW_77_in_stmt483); 
							pushFollow(FOLLOW_exp_in_stmt487);
							step=exp();
							state._fsp--;

							}
							break;

					}

					BlockStmt forBlock = new BlockStmt();
					// lifescript.g:96:8: (s= stmt )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==ID||LA13_0==36||(LA13_0 >= 44 && LA13_0 <= 46)||LA13_0==49||(LA13_0 >= 51 && LA13_0 <= 53)||LA13_0==55||(LA13_0 >= 61 && LA13_0 <= 63)||LA13_0==65||LA13_0==70||(LA13_0 >= 72 && LA13_0 <= 74)||LA13_0==76||(LA13_0 >= 81 && LA13_0 <= 83)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// lifescript.g:96:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt507);
							s=stmt();
							state._fsp--;

							forBlock.addAST(s);
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					match(input,68,FOLLOW_68_in_stmt519); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt523); 
					ast = new ForStmt((v3!=null?v3.getText():null), start2, lim, step, forBlock, (v4!=null?v4.getText():null));
					}
					break;
				case 14 :
					// lifescript.g:100:4: 'type' v4= ID ':' ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' ) (s= stmt )+ 'endtype'
					{
					match(input,81,FOLLOW_81_in_stmt534); 
					v4=(Token)match(input,ID,FOLLOW_ID_in_stmt538); 
					match(input,22,FOLLOW_22_in_stmt540); 
					BlockStmt neighBlock = new BlockStmt();
					// lifescript.g:102:4: ( 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}' )
					// lifescript.g:102:5: 'Neighborhood' '[' neighWidth= exp ']' '=' '{' (neigh1= exp ',' )* 'VAR' ( ',' neigh2= exp )* '}'
					{
					match(input,34,FOLLOW_34_in_stmt551); 
					match(input,42,FOLLOW_42_in_stmt553); 
					pushFollow(FOLLOW_exp_in_stmt557);
					neighWidth=exp();
					state._fsp--;

					match(input,43,FOLLOW_43_in_stmt559); 
					match(input,25,FOLLOW_25_in_stmt561); 
					match(input,84,FOLLOW_84_in_stmt566); 
					// lifescript.g:103:8: (neigh1= exp ',' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==BOOLEAN||(LA14_0 >= FLOAT && LA14_0 <= INT)||LA14_0==12||LA14_0==15||LA14_0==20||LA14_0==46||LA14_0==50||(LA14_0 >= 66 && LA14_0 <= 67)||LA14_0==71||LA14_0==75) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// lifescript.g:103:9: neigh1= exp ','
							{
							pushFollow(FOLLOW_exp_in_stmt571);
							neigh1=exp();
							state._fsp--;

							match(input,19,FOLLOW_19_in_stmt573); 
							neighBlock.addAST(new NeighborhoodStmt(neigh1, false));
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,40,FOLLOW_40_in_stmt583); 
					neighBlock.addAST(new NeighborhoodStmt(new NumExpr(0.0), true));
					// lifescript.g:105:4: ( ',' neigh2= exp )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==19) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// lifescript.g:105:5: ',' neigh2= exp
							{
							match(input,19,FOLLOW_19_in_stmt591); 
							pushFollow(FOLLOW_exp_in_stmt595);
							neigh2=exp();
							state._fsp--;

							neighBlock.addAST(new NeighborhoodStmt(neigh2, false));
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,86,FOLLOW_86_in_stmt601); 
					}

					BlockStmt typelogic = new BlockStmt();
					// lifescript.g:108:8: (s= stmt )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ID||LA16_0==36||(LA16_0 >= 44 && LA16_0 <= 46)||LA16_0==49||(LA16_0 >= 51 && LA16_0 <= 53)||LA16_0==55||(LA16_0 >= 61 && LA16_0 <= 63)||LA16_0==65||LA16_0==70||(LA16_0 >= 72 && LA16_0 <= 74)||LA16_0==76||(LA16_0 >= 81 && LA16_0 <= 83)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// lifescript.g:108:9: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt623);
							s=stmt();
							state._fsp--;

							typelogic.addAST(s);
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input,58,FOLLOW_58_in_stmt631); 
					ast = new TypeStmt((v4!=null?v4.getText():null), neighWidth, neighBlock, typelogic);
					}
					break;
				case 15 :
					// lifescript.g:112:4: 'alive'
					{
					match(input,46,FOLLOW_46_in_stmt643); 
					ast = new AliveStmt();
					}
					break;
				case 16 :
					// lifescript.g:115:4: 'dead'
					{
					match(input,52,FOLLOW_52_in_stmt653); 
					ast = new DeadStmt();
					}
					break;
				case 17 :
					// lifescript.g:118:4: 'become' STRING
					{
					match(input,49,FOLLOW_49_in_stmt663); 
					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_stmt665); 
					ast = new BecomeStmt((STRING10!=null?STRING10.getText():null));
					}
					break;
				case 18 :
					// lifescript.g:121:4: 'setstate' ( 'of' coordexp )? 'to' exp
					{
					match(input,74,FOLLOW_74_in_stmt675); 
					// lifescript.g:121:15: ( 'of' coordexp )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==69) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// lifescript.g:121:16: 'of' coordexp
							{
							match(input,69,FOLLOW_69_in_stmt678); 
							pushFollow(FOLLOW_coordexp_in_stmt680);
							coordexp11=coordexp();
							state._fsp--;

							}
							break;

					}

					match(input,80,FOLLOW_80_in_stmt684); 
					pushFollow(FOLLOW_exp_in_stmt686);
					exp12=exp();
					state._fsp--;

					ast = new SetStateStmt(coordexp11, exp12);
					}
					break;
				case 19 :
					// lifescript.g:124:4: 'statecolor' exp 'is' colorexp
					{
					match(input,76,FOLLOW_76_in_stmt696); 
					pushFollow(FOLLOW_exp_in_stmt698);
					exp13=exp();
					state._fsp--;

					match(input,64,FOLLOW_64_in_stmt700); 
					pushFollow(FOLLOW_colorexp_in_stmt702);
					colorexp14=colorexp();
					state._fsp--;

					ast = new StateColorStmt(exp13, colorexp14);
					}
					break;
				case 20 :
					// lifescript.g:127:4: 'create' STRING 'at' coordexp
					{
					match(input,51,FOLLOW_51_in_stmt712); 
					STRING15=(Token)match(input,STRING,FOLLOW_STRING_in_stmt714); 
					match(input,48,FOLLOW_48_in_stmt716); 
					pushFollow(FOLLOW_coordexp_in_stmt718);
					coordexp16=coordexp();
					state._fsp--;

					ast = new CreateStmt((STRING15!=null?STRING15.getText():null), coordexp16);
					}
					break;
				case 21 :
					// lifescript.g:130:4: 'kill' ( STRING )? 'at' coordexp
					{
					match(input,65,FOLLOW_65_in_stmt728); 
					// lifescript.g:130:11: ( STRING )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==STRING) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// lifescript.g:130:12: STRING
							{
							STRING17=(Token)match(input,STRING,FOLLOW_STRING_in_stmt731); 
							}
							break;

					}

					match(input,48,FOLLOW_48_in_stmt735); 
					pushFollow(FOLLOW_coordexp_in_stmt737);
					coordexp18=coordexp();
					state._fsp--;

					ast = new KillStmt((STRING17!=null?STRING17.getText():null), coordexp18);
					}
					break;
				case 22 :
					// lifescript.g:133:4: 'addrow'
					{
					match(input,45,FOLLOW_45_in_stmt747); 
					ast = new AddRowStmt();
					}
					break;
				case 23 :
					// lifescript.g:136:4: 'addcolumn'
					{
					match(input,44,FOLLOW_44_in_stmt757); 
					ast = new AddColumnStmt();
					}
					break;
				case 24 :
					// lifescript.g:139:4: 'setcolor' ( 'at' coordexp )? 'to' colorexp
					{
					match(input,73,FOLLOW_73_in_stmt768); 
					// lifescript.g:139:15: ( 'at' coordexp )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==48) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// lifescript.g:139:16: 'at' coordexp
							{
							match(input,48,FOLLOW_48_in_stmt771); 
							pushFollow(FOLLOW_coordexp_in_stmt773);
							coordexp19=coordexp();
							state._fsp--;

							}
							break;

					}

					match(input,80,FOLLOW_80_in_stmt777); 
					pushFollow(FOLLOW_colorexp_in_stmt779);
					colorexp20=colorexp();
					state._fsp--;

					ast = new SetColorStmt(coordexp19, colorexp20);
					}
					break;
				case 25 :
					// lifescript.g:142:4: 'world' ':' (s= stmt )+ 'endworld'
					{
					match(input,83,FOLLOW_83_in_stmt789); 
					match(input,22,FOLLOW_22_in_stmt791); 
					BlockStmt worldBlock = new BlockStmt();
					// lifescript.g:143:4: (s= stmt )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==ID||LA20_0==36||(LA20_0 >= 44 && LA20_0 <= 46)||LA20_0==49||(LA20_0 >= 51 && LA20_0 <= 53)||LA20_0==55||(LA20_0 >= 61 && LA20_0 <= 63)||LA20_0==65||LA20_0==70||(LA20_0 >= 72 && LA20_0 <= 74)||LA20_0==76||(LA20_0 >= 81 && LA20_0 <= 83)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// lifescript.g:143:5: s= stmt
							{
							pushFollow(FOLLOW_stmt_in_stmt801);
							s=stmt();
							state._fsp--;

							worldBlock.addAST(s);
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input,60,FOLLOW_60_in_stmt809); 
					ast = new WorldStmt(worldBlock);
					}
					break;
				case 26 :
					// lifescript.g:146:4: 'Properties' ':' ( 'Title' '=' title= STRING )? ( 'Cell Size' '=' cs= coordexp )? ( 'Dimensions' '=' dims= coordexp )? ( 'Wraparound' '=' wrap= exp )? ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )? ( 'Default Type' '=' dt= STRING )? ( 'Generations' '=' gens= exp )? ( 'Interval' '=' intervals= exp )? ( 'Pausable' '=' pause= exp )? ( 'Steppable' '=' sb= exp )?
					{
					match(input,36,FOLLOW_36_in_stmt817); 
					match(input,22,FOLLOW_22_in_stmt819); 
					BlockStmt properties = new BlockStmt();
					// lifescript.g:148:4: ( 'Title' '=' title= STRING )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==39) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// lifescript.g:148:5: 'Title' '=' title= STRING
							{
							match(input,39,FOLLOW_39_in_stmt830); 
							match(input,25,FOLLOW_25_in_stmt832); 
							title=(Token)match(input,STRING,FOLLOW_STRING_in_stmt836); 
							}
							break;

					}

					// lifescript.g:149:4: ( 'Cell Size' '=' cs= coordexp )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==29) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// lifescript.g:149:5: 'Cell Size' '=' cs= coordexp
							{
							match(input,29,FOLLOW_29_in_stmt845); 
							match(input,25,FOLLOW_25_in_stmt847); 
							pushFollow(FOLLOW_coordexp_in_stmt851);
							cs=coordexp();
							state._fsp--;

							properties.addAST(new CellSizeStmt(cs));
							}
							break;

					}

					// lifescript.g:150:4: ( 'Dimensions' '=' dims= coordexp )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==31) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// lifescript.g:150:5: 'Dimensions' '=' dims= coordexp
							{
							match(input,31,FOLLOW_31_in_stmt862); 
							match(input,25,FOLLOW_25_in_stmt864); 
							pushFollow(FOLLOW_coordexp_in_stmt868);
							dims=coordexp();
							state._fsp--;

							properties.addAST(new DimensionsStmt(dims));
							}
							break;

					}

					// lifescript.g:151:4: ( 'Wraparound' '=' wrap= exp )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==41) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// lifescript.g:151:5: 'Wraparound' '=' wrap= exp
							{
							match(input,41,FOLLOW_41_in_stmt879); 
							match(input,25,FOLLOW_25_in_stmt881); 
							pushFollow(FOLLOW_exp_in_stmt885);
							wrap=exp();
							state._fsp--;

							properties.addAST(new WrapMatrixStmt(wrap));
							}
							break;

					}

					// lifescript.g:152:4: ( 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}' )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==37) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// lifescript.g:152:5: 'Start' '=' '{' '(' celltype= STRING ',' cellcoords= coordexp ')' ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )* '}'
							{
							match(input,37,FOLLOW_37_in_stmt896); 
							match(input,25,FOLLOW_25_in_stmt898); 
							match(input,84,FOLLOW_84_in_stmt900); 
							BlockStmt startConditions = new BlockStmt();
							match(input,15,FOLLOW_15_in_stmt908); 
							celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt912); 
							match(input,19,FOLLOW_19_in_stmt914); 
							pushFollow(FOLLOW_coordexp_in_stmt918);
							cellcoords=coordexp();
							state._fsp--;

							startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
							match(input,16,FOLLOW_16_in_stmt931); 
							// lifescript.g:156:5: ( ',' '(' celltype= STRING ',' cellcoords= coordexp ')' )*
							loop25:
							while (true) {
								int alt25=2;
								int LA25_0 = input.LA(1);
								if ( (LA25_0==19) ) {
									alt25=1;
								}

								switch (alt25) {
								case 1 :
									// lifescript.g:156:6: ',' '(' celltype= STRING ',' cellcoords= coordexp ')'
									{
									match(input,19,FOLLOW_19_in_stmt938); 
									match(input,15,FOLLOW_15_in_stmt940); 
									celltype=(Token)match(input,STRING,FOLLOW_STRING_in_stmt944); 
									match(input,19,FOLLOW_19_in_stmt946); 
									pushFollow(FOLLOW_coordexp_in_stmt950);
									cellcoords=coordexp();
									state._fsp--;

									startConditions.addAST(new CellStmt((celltype!=null?celltype.getText():null), cellcoords));
									match(input,16,FOLLOW_16_in_stmt963); 
									}
									break;

								default :
									break loop25;
								}
							}

							match(input,86,FOLLOW_86_in_stmt967); 
							properties.addAST(startConditions);
							}
							break;

					}

					// lifescript.g:160:4: ( 'Default Type' '=' dt= STRING )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==30) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// lifescript.g:160:5: 'Default Type' '=' dt= STRING
							{
							match(input,30,FOLLOW_30_in_stmt982); 
							match(input,25,FOLLOW_25_in_stmt984); 
							dt=(Token)match(input,STRING,FOLLOW_STRING_in_stmt988); 
							}
							break;

					}

					// lifescript.g:161:4: ( 'Generations' '=' gens= exp )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==32) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// lifescript.g:161:5: 'Generations' '=' gens= exp
							{
							match(input,32,FOLLOW_32_in_stmt996); 
							match(input,25,FOLLOW_25_in_stmt998); 
							pushFollow(FOLLOW_exp_in_stmt1002);
							gens=exp();
							state._fsp--;

							properties.addAST(new GenerationsStmt(gens));
							}
							break;

					}

					// lifescript.g:162:4: ( 'Interval' '=' intervals= exp )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==33) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// lifescript.g:162:5: 'Interval' '=' intervals= exp
							{
							match(input,33,FOLLOW_33_in_stmt1013); 
							match(input,25,FOLLOW_25_in_stmt1015); 
							pushFollow(FOLLOW_exp_in_stmt1019);
							intervals=exp();
							state._fsp--;

							properties.addAST(new IntervalStmt(intervals));
							}
							break;

					}

					// lifescript.g:163:4: ( 'Pausable' '=' pause= exp )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==35) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// lifescript.g:163:5: 'Pausable' '=' pause= exp
							{
							match(input,35,FOLLOW_35_in_stmt1030); 
							match(input,25,FOLLOW_25_in_stmt1032); 
							pushFollow(FOLLOW_exp_in_stmt1036);
							pause=exp();
							state._fsp--;

							properties.addAST(new PausableStmt(pause));
							}
							break;

					}

					// lifescript.g:164:4: ( 'Steppable' '=' sb= exp )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==38) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// lifescript.g:164:5: 'Steppable' '=' sb= exp
							{
							match(input,38,FOLLOW_38_in_stmt1047); 
							match(input,25,FOLLOW_25_in_stmt1049); 
							pushFollow(FOLLOW_exp_in_stmt1053);
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
	// lifescript.g:168:1: coordexp returns [CoordExpr ast] : '(' e1= exp ',' e2= exp ')' ;
	public final CoordExpr coordexp() throws RecognitionException {
		CoordExpr ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:169:2: ( '(' e1= exp ',' e2= exp ')' )
			// lifescript.g:169:4: '(' e1= exp ',' e2= exp ')'
			{
			match(input,15,FOLLOW_15_in_coordexp1078); 
			pushFollow(FOLLOW_exp_in_coordexp1082);
			e1=exp();
			state._fsp--;

			match(input,19,FOLLOW_19_in_coordexp1084); 
			pushFollow(FOLLOW_exp_in_coordexp1088);
			e2=exp();
			state._fsp--;

			match(input,16,FOLLOW_16_in_coordexp1090); 
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
	// lifescript.g:172:1: colorexp returns [ColorExpr ast] : ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' );
	public final ColorExpr colorexp() throws RecognitionException {
		ColorExpr ast = null;


		Token STRING21=null;
		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:173:2: ( '(' e1= exp ',' e2= exp ',' e3= exp ')' | '(' STRING ')' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==15) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==STRING) ) {
					alt33=2;
				}
				else if ( (LA33_1==BOOLEAN||(LA33_1 >= FLOAT && LA33_1 <= INT)||LA33_1==12||LA33_1==15||LA33_1==20||LA33_1==46||LA33_1==50||(LA33_1 >= 66 && LA33_1 <= 67)||LA33_1==71||LA33_1==75) ) {
					alt33=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// lifescript.g:173:4: '(' e1= exp ',' e2= exp ',' e3= exp ')'
					{
					match(input,15,FOLLOW_15_in_colorexp1108); 
					pushFollow(FOLLOW_exp_in_colorexp1112);
					e1=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp1114); 
					pushFollow(FOLLOW_exp_in_colorexp1118);
					e2=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_colorexp1120); 
					pushFollow(FOLLOW_exp_in_colorexp1124);
					e3=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_colorexp1126); 
					ast = new ColorExpr(e1, e2, e3);
					}
					break;
				case 2 :
					// lifescript.g:174:4: '(' STRING ')'
					{
					match(input,15,FOLLOW_15_in_colorexp1133); 
					STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_colorexp1135); 
					match(input,16,FOLLOW_16_in_colorexp1137); 
					ast = new ColorExpr((STRING21!=null?STRING21.getText():null));
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



	// $ANTLR start "formalParamList"
	// lifescript.g:177:1: formalParamList returns [ArgList ast] : v1= ID ( ',' v2= ID )* ;
	public final ArgList formalParamList() throws RecognitionException {
		ArgList ast = null;


		Token v1=null;
		Token v2=null;

		try {
			// lifescript.g:178:6: (v1= ID ( ',' v2= ID )* )
			// lifescript.g:178:12: v1= ID ( ',' v2= ID )*
			{
			v1=(Token)match(input,ID,FOLLOW_ID_in_formalParamList1172); 
			ast = new ArgList(new VarExpr((v1!=null?v1.getText():null)));
			// lifescript.g:178:64: ( ',' v2= ID )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==19) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// lifescript.g:178:65: ',' v2= ID
					{
					match(input,19,FOLLOW_19_in_formalParamList1176); 
					v2=(Token)match(input,ID,FOLLOW_ID_in_formalParamList1180); 
					ast.addAST(new VarExpr((v2!=null?v2.getText():null)));
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
	// $ANTLR end "formalParamList"



	// $ANTLR start "actualParamList"
	// lifescript.g:180:1: actualParamList returns [ArgList ast] : e1= exp ( ',' e2= exp )* ;
	public final ArgList actualParamList() throws RecognitionException {
		ArgList ast = null;


		Expr e1 =null;
		Expr e2 =null;

		try {
			// lifescript.g:181:6: (e1= exp ( ',' e2= exp )* )
			// lifescript.g:181:12: e1= exp ( ',' e2= exp )*
			{
			pushFollow(FOLLOW_exp_in_actualParamList1218);
			e1=exp();
			state._fsp--;

			ast = new ArgList(e1);
			// lifescript.g:181:52: ( ',' e2= exp )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==19) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// lifescript.g:181:53: ',' e2= exp
					{
					match(input,19,FOLLOW_19_in_actualParamList1223); 
					pushFollow(FOLLOW_exp_in_actualParamList1227);
					e2=exp();
					state._fsp--;

					ast.addAST(e2);
					}
					break;

				default :
					break loop35;
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
	// $ANTLR end "actualParamList"



	// $ANTLR start "exp"
	// lifescript.g:186:1: exp returns [Expr ast] : logexp ;
	public final Expr exp() throws RecognitionException {
		Expr ast = null;


		Expr logexp22 =null;

		try {
			// lifescript.g:187:2: ( logexp )
			// lifescript.g:187:4: logexp
			{
			pushFollow(FOLLOW_logexp_in_exp1255);
			logexp22=logexp();
			state._fsp--;

			ast = logexp22; 
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
	// lifescript.g:191:1: logexp returns [Expr ast] : e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* ;
	public final Expr logexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:192:2: (e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )* )
			// lifescript.g:192:4: e1= relexp ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			{
			pushFollow(FOLLOW_relexp_in_logexp1275);
			e1=relexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:193:3: ( ( '&' e2= relexp ) | ( '|' e3= relexp ) )*
			loop36:
			while (true) {
				int alt36=3;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==14) ) {
					alt36=1;
				}
				else if ( (LA36_0==85) ) {
					alt36=2;
				}

				switch (alt36) {
				case 1 :
					// lifescript.g:194:4: ( '&' e2= relexp )
					{
					// lifescript.g:194:4: ( '&' e2= relexp )
					// lifescript.g:194:5: '&' e2= relexp
					{
					match(input,14,FOLLOW_14_in_logexp1287); 
					pushFollow(FOLLOW_relexp_in_logexp1291);
					e2=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.AND, ast, e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:195:4: ( '|' e3= relexp )
					{
					// lifescript.g:195:4: ( '|' e3= relexp )
					// lifescript.g:195:5: '|' e3= relexp
					{
					match(input,85,FOLLOW_85_in_logexp1303); 
					pushFollow(FOLLOW_relexp_in_logexp1307);
					e3=relexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.OR, ast, e3); 
					}

					}
					break;

				default :
					break loop36;
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
	// lifescript.g:199:1: relexp returns [Expr ast] : e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* ;
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
			// lifescript.g:200:2: (e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )* )
			// lifescript.g:200:4: e1= addexp ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			{
			pushFollow(FOLLOW_addexp_in_relexp1333);
			e1=addexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:201:3: ( ( '==' e2= addexp ) | ( '<=' e3= addexp ) | ( '>=' e4= addexp ) | ( '<' e5= addexp ) | ( '>' e6= addexp ) | ( '!=' e7= addexp ) )*
			loop37:
			while (true) {
				int alt37=7;
				switch ( input.LA(1) ) {
				case 26:
					{
					alt37=1;
					}
					break;
				case 24:
					{
					alt37=2;
					}
					break;
				case 28:
					{
					alt37=3;
					}
					break;
				case 23:
					{
					alt37=4;
					}
					break;
				case 27:
					{
					alt37=5;
					}
					break;
				case 13:
					{
					alt37=6;
					}
					break;
				}
				switch (alt37) {
				case 1 :
					// lifescript.g:202:4: ( '==' e2= addexp )
					{
					// lifescript.g:202:4: ( '==' e2= addexp )
					// lifescript.g:202:5: '==' e2= addexp
					{
					match(input,26,FOLLOW_26_in_relexp1346); 
					pushFollow(FOLLOW_addexp_in_relexp1350);
					e2=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.EQ,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:203:4: ( '<=' e3= addexp )
					{
					// lifescript.g:203:4: ( '<=' e3= addexp )
					// lifescript.g:203:5: '<=' e3= addexp
					{
					match(input,24,FOLLOW_24_in_relexp1360); 
					pushFollow(FOLLOW_addexp_in_relexp1364);
					e3=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.LESSEQ,ast,e3); 
					}

					}
					break;
				case 3 :
					// lifescript.g:204:4: ( '>=' e4= addexp )
					{
					// lifescript.g:204:4: ( '>=' e4= addexp )
					// lifescript.g:204:5: '>=' e4= addexp
					{
					match(input,28,FOLLOW_28_in_relexp1374); 
					pushFollow(FOLLOW_addexp_in_relexp1378);
					e4=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MOREEQ,ast,e4); 
					}

					}
					break;
				case 4 :
					// lifescript.g:205:4: ( '<' e5= addexp )
					{
					// lifescript.g:205:4: ( '<' e5= addexp )
					// lifescript.g:205:5: '<' e5= addexp
					{
					match(input,23,FOLLOW_23_in_relexp1388); 
					pushFollow(FOLLOW_addexp_in_relexp1392);
					e5=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTLESS,ast,e5); 
					}

					}
					break;
				case 5 :
					// lifescript.g:206:4: ( '>' e6= addexp )
					{
					// lifescript.g:206:4: ( '>' e6= addexp )
					// lifescript.g:206:5: '>' e6= addexp
					{
					match(input,27,FOLLOW_27_in_relexp1402); 
					pushFollow(FOLLOW_addexp_in_relexp1406);
					e6=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.STRICTMORE,ast,e6); 
					}

					}
					break;
				case 6 :
					// lifescript.g:207:4: ( '!=' e7= addexp )
					{
					// lifescript.g:207:4: ( '!=' e7= addexp )
					// lifescript.g:207:5: '!=' e7= addexp
					{
					match(input,13,FOLLOW_13_in_relexp1416); 
					pushFollow(FOLLOW_addexp_in_relexp1420);
					e7=addexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.NOTEQ,ast,e7); 
					}

					}
					break;

				default :
					break loop37;
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
	// lifescript.g:211:1: addexp returns [Expr ast] : e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* ;
	public final Expr addexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:212:2: (e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )* )
			// lifescript.g:212:4: e1= mulexp ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			{
			pushFollow(FOLLOW_mulexp_in_addexp1445);
			e1=mulexp();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:213:3: ( ( '+' e2= mulexp ) | ( '-' e3= mulexp ) )*
			loop38:
			while (true) {
				int alt38=3;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==18) ) {
					alt38=1;
				}
				else if ( (LA38_0==20) ) {
					alt38=2;
				}

				switch (alt38) {
				case 1 :
					// lifescript.g:214:4: ( '+' e2= mulexp )
					{
					// lifescript.g:214:4: ( '+' e2= mulexp )
					// lifescript.g:214:5: '+' e2= mulexp
					{
					match(input,18,FOLLOW_18_in_addexp1457); 
					pushFollow(FOLLOW_mulexp_in_addexp1461);
					e2=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.ADD,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:215:4: ( '-' e3= mulexp )
					{
					// lifescript.g:215:4: ( '-' e3= mulexp )
					// lifescript.g:215:5: '-' e3= mulexp
					{
					match(input,20,FOLLOW_20_in_addexp1471); 
					pushFollow(FOLLOW_mulexp_in_addexp1475);
					e3=mulexp();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MINUS,ast,e3); 
					}

					}
					break;

				default :
					break loop38;
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
	// lifescript.g:219:1: mulexp returns [Expr ast] : e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* ;
	public final Expr mulexp() throws RecognitionException {
		Expr ast = null;


		Expr e1 =null;
		Expr e2 =null;
		Expr e3 =null;

		try {
			// lifescript.g:220:2: (e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )* )
			// lifescript.g:220:4: e1= atom ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			{
			pushFollow(FOLLOW_atom_in_mulexp1501);
			e1=atom();
			state._fsp--;

			 ast = e1; 
			// lifescript.g:221:3: ( ( '*' e2= atom ) | ( '/' e3= atom ) )*
			loop39:
			while (true) {
				int alt39=3;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==17) ) {
					alt39=1;
				}
				else if ( (LA39_0==21) ) {
					alt39=2;
				}

				switch (alt39) {
				case 1 :
					// lifescript.g:222:4: ( '*' e2= atom )
					{
					// lifescript.g:222:4: ( '*' e2= atom )
					// lifescript.g:222:5: '*' e2= atom
					{
					match(input,17,FOLLOW_17_in_mulexp1513); 
					pushFollow(FOLLOW_atom_in_mulexp1517);
					e2=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.MULT,ast,e2); 
					}

					}
					break;
				case 2 :
					// lifescript.g:223:4: ( '/' e3= atom )
					{
					// lifescript.g:223:4: ( '/' e3= atom )
					// lifescript.g:223:5: '/' e3= atom
					{
					match(input,21,FOLLOW_21_in_mulexp1527); 
					pushFollow(FOLLOW_atom_in_mulexp1531);
					e3=atom();
					state._fsp--;

					 ast = new MathExpr(MathExpr.DIV,ast,e3); 
					}

					}
					break;

				default :
					break loop39;
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
	// lifescript.g:227:1: atom returns [Expr ast] : ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )? | 'cell' 'at' coordexp ( 'is' STRING )? | 'neighbor' 'at' coordexp ( 'is' STRING )? | 'alive' | 'state' ( 'of' coordexp )? | 'random' '(' lb= exp ',' ub= exp ')' );
	public final Expr atom() throws RecognitionException {
		Expr ast = null;


		Token ID25=null;
		Token BOOLEAN28=null;
		Token STRING30=null;
		Token STRING31=null;
		Token STRING33=null;
		Expr lb =null;
		Expr ub =null;
		Expr exp23 =null;
		Expr exp24 =null;
		ParserRuleReturnScope num26 =null;
		ParserRuleReturnScope num27 =null;
		CoordExpr coordexp29 =null;
		CoordExpr coordexp32 =null;
		CoordExpr coordexp34 =null;
		CoordExpr coordexp35 =null;

		try {
			// lifescript.g:228:2: ( '(' exp ')' | '!' exp | ID | num | '-' num | BOOLEAN | 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )? | 'cell' 'at' coordexp ( 'is' STRING )? | 'neighbor' 'at' coordexp ( 'is' STRING )? | 'alive' | 'state' ( 'of' coordexp )? | 'random' '(' lb= exp ',' ub= exp ')' )
			int alt45=12;
			switch ( input.LA(1) ) {
			case 15:
				{
				alt45=1;
				}
				break;
			case 12:
				{
				alt45=2;
				}
				break;
			case ID:
				{
				alt45=3;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt45=4;
				}
				break;
			case 20:
				{
				alt45=5;
				}
				break;
			case BOOLEAN:
				{
				alt45=6;
				}
				break;
			case 67:
				{
				alt45=7;
				}
				break;
			case 50:
				{
				alt45=8;
				}
				break;
			case 66:
				{
				alt45=9;
				}
				break;
			case 46:
				{
				alt45=10;
				}
				break;
			case 75:
				{
				alt45=11;
				}
				break;
			case 71:
				{
				alt45=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// lifescript.g:228:4: '(' exp ')'
					{
					match(input,15,FOLLOW_15_in_atom1556); 
					pushFollow(FOLLOW_exp_in_atom1558);
					exp23=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1560); 
					 ast = new ParenExpr(exp23); 
					}
					break;
				case 2 :
					// lifescript.g:229:4: '!' exp
					{
					match(input,12,FOLLOW_12_in_atom1570); 
					pushFollow(FOLLOW_exp_in_atom1572);
					exp24=exp();
					state._fsp--;

					 ast = new NegExpr(exp24); 
					}
					break;
				case 3 :
					// lifescript.g:230:4: ID
					{
					ID25=(Token)match(input,ID,FOLLOW_ID_in_atom1581); 
					 ast = new VarExpr((ID25!=null?ID25.getText():null)); usageMap.put((ID25!=null?ID25.getText():null),new Boolean(true)); 
					}
					break;
				case 4 :
					// lifescript.g:231:4: num
					{
					pushFollow(FOLLOW_num_in_atom1589);
					num26=num();
					state._fsp--;

					 ast = new NumExpr((num26!=null?input.toString(num26.start,num26.stop):null)); 
					}
					break;
				case 5 :
					// lifescript.g:232:4: '-' num
					{
					match(input,20,FOLLOW_20_in_atom1597); 
					pushFollow(FOLLOW_num_in_atom1599);
					num27=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num27!=null?input.toString(num27.start,num27.stop):null)); 
					}
					break;
				case 6 :
					// lifescript.g:233:4: BOOLEAN
					{
					BOOLEAN28=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom1607); 
					 ast = new BooleanExpr((BOOLEAN28!=null?BOOLEAN28.getText():null)); 
					}
					break;
				case 7 :
					// lifescript.g:234:4: 'neighbors' ( 'of' coordexp )? ( 'that' 'are' STRING )?
					{
					match(input,67,FOLLOW_67_in_atom1616); 
					// lifescript.g:234:16: ( 'of' coordexp )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==69) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// lifescript.g:234:17: 'of' coordexp
							{
							match(input,69,FOLLOW_69_in_atom1619); 
							pushFollow(FOLLOW_coordexp_in_atom1621);
							coordexp29=coordexp();
							state._fsp--;

							}
							break;

					}

					// lifescript.g:234:33: ( 'that' 'are' STRING )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==78) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// lifescript.g:234:34: 'that' 'are' STRING
							{
							match(input,78,FOLLOW_78_in_atom1626); 
							match(input,47,FOLLOW_47_in_atom1628); 
							STRING30=(Token)match(input,STRING,FOLLOW_STRING_in_atom1630); 
							}
							break;

					}

					ast = new NeighborsExpr(coordexp29, (STRING30!=null?STRING30.getText():null));
					}
					break;
				case 8 :
					// lifescript.g:236:4: 'cell' 'at' coordexp ( 'is' STRING )?
					{
					match(input,50,FOLLOW_50_in_atom1641); 
					match(input,48,FOLLOW_48_in_atom1643); 
					pushFollow(FOLLOW_coordexp_in_atom1645);
					coordexp32=coordexp();
					state._fsp--;

					// lifescript.g:236:25: ( 'is' STRING )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==64) ) {
						int LA42_1 = input.LA(2);
						if ( (LA42_1==STRING) ) {
							alt42=1;
						}
					}
					switch (alt42) {
						case 1 :
							// lifescript.g:236:26: 'is' STRING
							{
							match(input,64,FOLLOW_64_in_atom1648); 
							STRING31=(Token)match(input,STRING,FOLLOW_STRING_in_atom1650); 
							}
							break;

					}

					 ast = new CellCheckExpr((STRING31!=null?STRING31.getText():null), coordexp32, false);
					}
					break;
				case 9 :
					// lifescript.g:238:4: 'neighbor' 'at' coordexp ( 'is' STRING )?
					{
					match(input,66,FOLLOW_66_in_atom1662); 
					match(input,48,FOLLOW_48_in_atom1664); 
					pushFollow(FOLLOW_coordexp_in_atom1666);
					coordexp34=coordexp();
					state._fsp--;

					// lifescript.g:238:29: ( 'is' STRING )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==64) ) {
						int LA43_1 = input.LA(2);
						if ( (LA43_1==STRING) ) {
							alt43=1;
						}
					}
					switch (alt43) {
						case 1 :
							// lifescript.g:238:30: 'is' STRING
							{
							match(input,64,FOLLOW_64_in_atom1669); 
							STRING33=(Token)match(input,STRING,FOLLOW_STRING_in_atom1671); 
							}
							break;

					}

					 ast = new CellCheckExpr((STRING33!=null?STRING33.getText():null), coordexp34, true);
					}
					break;
				case 10 :
					// lifescript.g:240:4: 'alive'
					{
					match(input,46,FOLLOW_46_in_atom1683); 
					ast = new AliveExpr();
					}
					break;
				case 11 :
					// lifescript.g:241:4: 'state' ( 'of' coordexp )?
					{
					match(input,75,FOLLOW_75_in_atom1690); 
					// lifescript.g:241:12: ( 'of' coordexp )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==69) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// lifescript.g:241:13: 'of' coordexp
							{
							match(input,69,FOLLOW_69_in_atom1693); 
							pushFollow(FOLLOW_coordexp_in_atom1695);
							coordexp35=coordexp();
							state._fsp--;

							}
							break;

					}

					ast = new GetStateExpr(coordexp35);
					}
					break;
				case 12 :
					// lifescript.g:242:4: 'random' '(' lb= exp ',' ub= exp ')'
					{
					match(input,71,FOLLOW_71_in_atom1704); 
					match(input,15,FOLLOW_15_in_atom1706); 
					pushFollow(FOLLOW_exp_in_atom1710);
					lb=exp();
					state._fsp--;

					match(input,19,FOLLOW_19_in_atom1712); 
					pushFollow(FOLLOW_exp_in_atom1716);
					ub=exp();
					state._fsp--;

					match(input,16,FOLLOW_16_in_atom1718); 
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
	// lifescript.g:245:1: value returns [Expr ast] : ( ID | num | '-' num );
	public final Expr value() throws RecognitionException {
		Expr ast = null;


		Token ID36=null;
		ParserRuleReturnScope num37 =null;
		ParserRuleReturnScope num38 =null;

		try {
			// lifescript.g:246:2: ( ID | num | '-' num )
			int alt46=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt46=1;
				}
				break;
			case FLOAT:
			case INT:
				{
				alt46=2;
				}
				break;
			case 20:
				{
				alt46=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// lifescript.g:246:4: ID
					{
					ID36=(Token)match(input,ID,FOLLOW_ID_in_value1737); 
					 ast = new VarExpr((ID36!=null?ID36.getText():null)); usageMap.put((ID36!=null?ID36.getText():null),new Boolean(true)); 
					}
					break;
				case 2 :
					// lifescript.g:247:4: num
					{
					pushFollow(FOLLOW_num_in_value1745);
					num37=num();
					state._fsp--;

					 ast = new NumExpr((num37!=null?input.toString(num37.start,num37.stop):null)); 
					}
					break;
				case 3 :
					// lifescript.g:248:4: '-' num
					{
					match(input,20,FOLLOW_20_in_value1753); 
					pushFollow(FOLLOW_num_in_value1755);
					num38=num();
					state._fsp--;

					 ast = new NumExpr('-' + (num38!=null?input.toString(num38.start,num38.stop):null)); 
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
	// lifescript.g:251:1: num : ( INT | FLOAT );
	public final lifescriptParser.num_return num() throws RecognitionException {
		lifescriptParser.num_return retval = new lifescriptParser.num_return();
		retval.start = input.LT(1);

		try {
			// lifescript.g:251:5: ( INT | FLOAT )
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



	public static final BitSet FOLLOW_stmt_in_prog46 = new BitSet(new long[]{0xE0BA701000000102L,0x00000000000E1742L});
	public static final BitSet FOLLOW_ID_in_stmt65 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt67 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_stmt79 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_STRING_in_stmt82 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt84 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_stmt100 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt104 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt106 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt108 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt110 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt128 = new BitSet(new long[]{0xE1BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_56_in_stmt136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_stmt148 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt152 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt154 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_formalParamList_in_stmt158 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt160 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt162 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt180 = new BitSet(new long[]{0xE1BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_56_in_stmt188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt197 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt199 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stmt212 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt214 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_actualParamList_in_stmt218 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_stmt229 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_72_in_stmt242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_stmt255 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt273 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt284 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_stmt299 = new BitSet(new long[]{0x0000000000100780L});
	public static final BitSet FOLLOW_value_in_stmt304 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_STRING_in_stmt317 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_55_in_stmt341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_stmt357 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_stmt363 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt377 = new BitSet(new long[]{0xE2FA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_54_in_stmt388 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt398 = new BitSet(new long[]{0xE2BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_57_in_stmt414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_stmt430 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt432 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt442 = new BitSet(new long[]{0xE8BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_59_in_stmt449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_stmt464 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt468 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt470 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_stmt476 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt480 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E3742L});
	public static final BitSet FOLLOW_77_in_stmt483 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt487 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt507 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1752L});
	public static final BitSet FOLLOW_68_in_stmt519 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_stmt534 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_stmt538 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt540 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_stmt551 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_stmt553 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt557 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_stmt559 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_stmt566 = new BitSet(new long[]{0x0004410000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt571 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt573 = new BitSet(new long[]{0x0004410000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_40_in_stmt583 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
	public static final BitSet FOLLOW_19_in_stmt591 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt595 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_stmt601 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt623 = new BitSet(new long[]{0xE4BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_58_in_stmt631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_stmt643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_stmt653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_stmt663 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_stmt675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010020L});
	public static final BitSet FOLLOW_69_in_stmt678 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_stmt684 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_stmt696 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_stmt700 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_colorexp_in_stmt702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_stmt712 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt714 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_stmt716 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_stmt728 = new BitSet(new long[]{0x0001000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt731 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_stmt735 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_stmt747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_stmt757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_stmt768 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_48_in_stmt771 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_stmt777 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_colorexp_in_stmt779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_stmt789 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt791 = new BitSet(new long[]{0xE0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_stmt_in_stmt801 = new BitSet(new long[]{0xF0BA701000000100L,0x00000000000E1742L});
	public static final BitSet FOLLOW_60_in_stmt809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_stmt817 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_stmt819 = new BitSet(new long[]{0x000002EBE0000002L});
	public static final BitSet FOLLOW_39_in_stmt830 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt832 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt836 = new BitSet(new long[]{0x0000026BE0000002L});
	public static final BitSet FOLLOW_29_in_stmt845 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt847 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt851 = new BitSet(new long[]{0x0000026BC0000002L});
	public static final BitSet FOLLOW_31_in_stmt862 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt864 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt868 = new BitSet(new long[]{0x0000026B40000002L});
	public static final BitSet FOLLOW_41_in_stmt879 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt881 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt885 = new BitSet(new long[]{0x0000006B40000002L});
	public static final BitSet FOLLOW_37_in_stmt896 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_stmt900 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt908 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt912 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt914 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt918 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt931 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
	public static final BitSet FOLLOW_19_in_stmt938 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stmt940 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt944 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_stmt946 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_stmt950 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_stmt963 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_stmt967 = new BitSet(new long[]{0x0000004B40000002L});
	public static final BitSet FOLLOW_30_in_stmt982 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt984 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_stmt988 = new BitSet(new long[]{0x0000004B00000002L});
	public static final BitSet FOLLOW_32_in_stmt996 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt998 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt1002 = new BitSet(new long[]{0x0000004A00000002L});
	public static final BitSet FOLLOW_33_in_stmt1013 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt1015 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt1019 = new BitSet(new long[]{0x0000004800000002L});
	public static final BitSet FOLLOW_35_in_stmt1030 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt1032 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt1036 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_stmt1047 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_stmt1049 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_stmt1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_coordexp1078 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_coordexp1082 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_coordexp1084 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_coordexp1088 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_coordexp1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp1108 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_colorexp1112 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp1114 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_colorexp1118 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_colorexp1120 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_colorexp1124 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_colorexp1133 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_colorexp1135 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_colorexp1137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_formalParamList1172 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_formalParamList1176 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_formalParamList1180 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_exp_in_actualParamList1218 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_actualParamList1223 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_actualParamList1227 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_logexp_in_exp1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexp_in_logexp1275 = new BitSet(new long[]{0x0000000000004002L,0x0000000000200000L});
	public static final BitSet FOLLOW_14_in_logexp1287 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_relexp_in_logexp1291 = new BitSet(new long[]{0x0000000000004002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_logexp1303 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_relexp_in_logexp1307 = new BitSet(new long[]{0x0000000000004002L,0x0000000000200000L});
	public static final BitSet FOLLOW_addexp_in_relexp1333 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_26_in_relexp1346 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1350 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_24_in_relexp1360 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1364 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_28_in_relexp1374 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1378 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_23_in_relexp1388 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1392 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_27_in_relexp1402 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1406 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_13_in_relexp1416 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_addexp_in_relexp1420 = new BitSet(new long[]{0x000000001D802002L});
	public static final BitSet FOLLOW_mulexp_in_addexp1445 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_18_in_addexp1457 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_mulexp_in_addexp1461 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_20_in_addexp1471 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_mulexp_in_addexp1475 = new BitSet(new long[]{0x0000000000140002L});
	public static final BitSet FOLLOW_atom_in_mulexp1501 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_17_in_mulexp1513 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_atom_in_mulexp1517 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_21_in_mulexp1527 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_atom_in_mulexp1531 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_15_in_atom1556 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_atom1558 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_atom1570 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_atom1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_atom1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_atom1597 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_atom1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLEAN_in_atom1607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_atom1616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004020L});
	public static final BitSet FOLLOW_69_in_atom1619 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_atom1626 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_atom1628 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_atom1641 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_atom1643 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_atom1648 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_atom1662 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_atom1664 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_atom1669 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_atom1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_atom1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_atom1690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_atom1693 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_coordexp_in_atom1695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_atom1704 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_atom1706 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_atom1710 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom1712 = new BitSet(new long[]{0x0004400000109390L,0x000000000000088CL});
	public static final BitSet FOLLOW_exp_in_atom1716 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_atom1718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_value1737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_value1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_value1753 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_num_in_value1755 = new BitSet(new long[]{0x0000000000000002L});
}
