// $ANTLR 3.5 lifescript.g 2015-12-14 21:02:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class lifescriptLexer extends Lexer {
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
	public static final int BOOLEAN=4;
	public static final int COMMENT=5;
	public static final int ESC_SEQ=6;
	public static final int FLOAT=7;
	public static final int ID=8;
	public static final int INT=9;
	public static final int STRING=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public lifescriptLexer() {} 
	public lifescriptLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public lifescriptLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "lifescript.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:2:7: ( '!' )
			// lifescript.g:2:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:3:7: ( '!=' )
			// lifescript.g:3:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:4:7: ( '&' )
			// lifescript.g:4:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:5:7: ( '(' )
			// lifescript.g:5:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:6:7: ( ')' )
			// lifescript.g:6:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:7:7: ( '*' )
			// lifescript.g:7:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:8:7: ( '+' )
			// lifescript.g:8:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:9:7: ( ',' )
			// lifescript.g:9:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:10:7: ( '-' )
			// lifescript.g:10:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:11:7: ( '/' )
			// lifescript.g:11:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:12:7: ( ':' )
			// lifescript.g:12:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:13:7: ( '<' )
			// lifescript.g:13:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:14:7: ( '<=' )
			// lifescript.g:14:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:15:7: ( '=' )
			// lifescript.g:15:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:16:7: ( '==' )
			// lifescript.g:16:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:17:7: ( '>' )
			// lifescript.g:17:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:18:7: ( '>=' )
			// lifescript.g:18:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:19:7: ( 'Cell Size' )
			// lifescript.g:19:9: 'Cell Size'
			{
			match("Cell Size"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:20:7: ( 'Default Type' )
			// lifescript.g:20:9: 'Default Type'
			{
			match("Default Type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:21:7: ( 'Dimensions' )
			// lifescript.g:21:9: 'Dimensions'
			{
			match("Dimensions"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:22:7: ( 'Generations' )
			// lifescript.g:22:9: 'Generations'
			{
			match("Generations"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:23:7: ( 'Interval' )
			// lifescript.g:23:9: 'Interval'
			{
			match("Interval"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:24:7: ( 'Neighborhood' )
			// lifescript.g:24:9: 'Neighborhood'
			{
			match("Neighborhood"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:25:7: ( 'Pausable' )
			// lifescript.g:25:9: 'Pausable'
			{
			match("Pausable"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:26:7: ( 'Properties' )
			// lifescript.g:26:9: 'Properties'
			{
			match("Properties"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:27:7: ( 'Start' )
			// lifescript.g:27:9: 'Start'
			{
			match("Start"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:28:7: ( 'Steppable' )
			// lifescript.g:28:9: 'Steppable'
			{
			match("Steppable"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:29:7: ( 'Title' )
			// lifescript.g:29:9: 'Title'
			{
			match("Title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:30:7: ( 'VAR' )
			// lifescript.g:30:9: 'VAR'
			{
			match("VAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:31:7: ( '[' )
			// lifescript.g:31:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:32:7: ( ']' )
			// lifescript.g:32:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:33:7: ( 'addcolumn' )
			// lifescript.g:33:9: 'addcolumn'
			{
			match("addcolumn"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:34:7: ( 'addrow' )
			// lifescript.g:34:9: 'addrow'
			{
			match("addrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:35:7: ( 'alive' )
			// lifescript.g:35:9: 'alive'
			{
			match("alive"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:36:7: ( 'are' )
			// lifescript.g:36:9: 'are'
			{
			match("are"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:37:7: ( 'at' )
			// lifescript.g:37:9: 'at'
			{
			match("at"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:38:7: ( 'cell' )
			// lifescript.g:38:9: 'cell'
			{
			match("cell"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:39:7: ( 'create' )
			// lifescript.g:39:9: 'create'
			{
			match("create"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:40:7: ( 'dead' )
			// lifescript.g:40:9: 'dead'
			{
			match("dead"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:41:7: ( 'else' )
			// lifescript.g:41:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:42:7: ( 'end' )
			// lifescript.g:42:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:43:7: ( 'endif' )
			// lifescript.g:43:9: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:44:7: ( 'endtype' )
			// lifescript.g:44:9: 'endtype'
			{
			match("endtype"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:45:7: ( 'endwhile' )
			// lifescript.g:45:9: 'endwhile'
			{
			match("endwhile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:46:7: ( 'endworld' )
			// lifescript.g:46:9: 'endworld'
			{
			match("endworld"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:47:7: ( 'for' )
			// lifescript.g:47:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:48:7: ( 'if' )
			// lifescript.g:48:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:49:7: ( 'input' )
			// lifescript.g:49:9: 'input'
			{
			match("input"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:50:7: ( 'is' )
			// lifescript.g:50:9: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:51:7: ( 'kill' )
			// lifescript.g:51:9: 'kill'
			{
			match("kill"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:52:7: ( 'neighbors' )
			// lifescript.g:52:9: 'neighbors'
			{
			match("neighbors"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:53:7: ( 'next' )
			// lifescript.g:53:9: 'next'
			{
			match("next"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:54:7: ( 'of' )
			// lifescript.g:54:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:55:7: ( 'print' )
			// lifescript.g:55:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:56:7: ( 'random' )
			// lifescript.g:56:9: 'random'
			{
			match("random"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:57:7: ( 'setcolor' )
			// lifescript.g:57:9: 'setcolor'
			{
			match("setcolor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:58:7: ( 'setstate' )
			// lifescript.g:58:9: 'setstate'
			{
			match("setstate"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:59:7: ( 'state' )
			// lifescript.g:59:9: 'state'
			{
			match("state"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:60:7: ( 'statecolor' )
			// lifescript.g:60:9: 'statecolor'
			{
			match("statecolor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:61:7: ( 'step' )
			// lifescript.g:61:9: 'step'
			{
			match("step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:62:7: ( 'that' )
			// lifescript.g:62:9: 'that'
			{
			match("that"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:63:7: ( 'then' )
			// lifescript.g:63:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:64:7: ( 'to' )
			// lifescript.g:64:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:65:7: ( 'type' )
			// lifescript.g:65:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:66:7: ( 'while' )
			// lifescript.g:66:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:67:7: ( 'world' )
			// lifescript.g:67:9: 'world'
			{
			match("world"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:68:7: ( '{' )
			// lifescript.g:68:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:69:7: ( '|' )
			// lifescript.g:69:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:70:7: ( '}' )
			// lifescript.g:70:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:229:9: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// lifescript.g:229:11: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// lifescript.g:229:20: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:231:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// lifescript.g:231:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// lifescript.g:231:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// lifescript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:234:5: ( ( '0' .. '9' )+ )
			// lifescript.g:234:7: ( '0' .. '9' )+
			{
			// lifescript.g:234:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// lifescript.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:238:5: ( INT '.' INT )
			// lifescript.g:238:7: INT '.' INT
			{
			mINT(); 

			match('.'); 
			mINT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:242:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// lifescript.g:242:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// lifescript.g:242:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\\') ) {
					alt4=1;
				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// lifescript.g:242:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// lifescript.g:242:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// lifescript.g:248:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// lifescript.g:248:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:251:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// lifescript.g:251:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// lifescript.g:251:14: (~ ( '\\n' | '\\r' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// lifescript.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			// lifescript.g:251:28: ( '\\r' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='\r') ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// lifescript.g:251:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// lifescript.g:254:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// lifescript.g:254:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// lifescript.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | BOOLEAN | ID | INT | FLOAT | STRING | COMMENT | WS )
		int alt7=76;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// lifescript.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// lifescript.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// lifescript.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// lifescript.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// lifescript.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// lifescript.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// lifescript.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// lifescript.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// lifescript.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// lifescript.g:1:64: T__21
				{
				mT__21(); 

				}
				break;
			case 11 :
				// lifescript.g:1:70: T__22
				{
				mT__22(); 

				}
				break;
			case 12 :
				// lifescript.g:1:76: T__23
				{
				mT__23(); 

				}
				break;
			case 13 :
				// lifescript.g:1:82: T__24
				{
				mT__24(); 

				}
				break;
			case 14 :
				// lifescript.g:1:88: T__25
				{
				mT__25(); 

				}
				break;
			case 15 :
				// lifescript.g:1:94: T__26
				{
				mT__26(); 

				}
				break;
			case 16 :
				// lifescript.g:1:100: T__27
				{
				mT__27(); 

				}
				break;
			case 17 :
				// lifescript.g:1:106: T__28
				{
				mT__28(); 

				}
				break;
			case 18 :
				// lifescript.g:1:112: T__29
				{
				mT__29(); 

				}
				break;
			case 19 :
				// lifescript.g:1:118: T__30
				{
				mT__30(); 

				}
				break;
			case 20 :
				// lifescript.g:1:124: T__31
				{
				mT__31(); 

				}
				break;
			case 21 :
				// lifescript.g:1:130: T__32
				{
				mT__32(); 

				}
				break;
			case 22 :
				// lifescript.g:1:136: T__33
				{
				mT__33(); 

				}
				break;
			case 23 :
				// lifescript.g:1:142: T__34
				{
				mT__34(); 

				}
				break;
			case 24 :
				// lifescript.g:1:148: T__35
				{
				mT__35(); 

				}
				break;
			case 25 :
				// lifescript.g:1:154: T__36
				{
				mT__36(); 

				}
				break;
			case 26 :
				// lifescript.g:1:160: T__37
				{
				mT__37(); 

				}
				break;
			case 27 :
				// lifescript.g:1:166: T__38
				{
				mT__38(); 

				}
				break;
			case 28 :
				// lifescript.g:1:172: T__39
				{
				mT__39(); 

				}
				break;
			case 29 :
				// lifescript.g:1:178: T__40
				{
				mT__40(); 

				}
				break;
			case 30 :
				// lifescript.g:1:184: T__41
				{
				mT__41(); 

				}
				break;
			case 31 :
				// lifescript.g:1:190: T__42
				{
				mT__42(); 

				}
				break;
			case 32 :
				// lifescript.g:1:196: T__43
				{
				mT__43(); 

				}
				break;
			case 33 :
				// lifescript.g:1:202: T__44
				{
				mT__44(); 

				}
				break;
			case 34 :
				// lifescript.g:1:208: T__45
				{
				mT__45(); 

				}
				break;
			case 35 :
				// lifescript.g:1:214: T__46
				{
				mT__46(); 

				}
				break;
			case 36 :
				// lifescript.g:1:220: T__47
				{
				mT__47(); 

				}
				break;
			case 37 :
				// lifescript.g:1:226: T__48
				{
				mT__48(); 

				}
				break;
			case 38 :
				// lifescript.g:1:232: T__49
				{
				mT__49(); 

				}
				break;
			case 39 :
				// lifescript.g:1:238: T__50
				{
				mT__50(); 

				}
				break;
			case 40 :
				// lifescript.g:1:244: T__51
				{
				mT__51(); 

				}
				break;
			case 41 :
				// lifescript.g:1:250: T__52
				{
				mT__52(); 

				}
				break;
			case 42 :
				// lifescript.g:1:256: T__53
				{
				mT__53(); 

				}
				break;
			case 43 :
				// lifescript.g:1:262: T__54
				{
				mT__54(); 

				}
				break;
			case 44 :
				// lifescript.g:1:268: T__55
				{
				mT__55(); 

				}
				break;
			case 45 :
				// lifescript.g:1:274: T__56
				{
				mT__56(); 

				}
				break;
			case 46 :
				// lifescript.g:1:280: T__57
				{
				mT__57(); 

				}
				break;
			case 47 :
				// lifescript.g:1:286: T__58
				{
				mT__58(); 

				}
				break;
			case 48 :
				// lifescript.g:1:292: T__59
				{
				mT__59(); 

				}
				break;
			case 49 :
				// lifescript.g:1:298: T__60
				{
				mT__60(); 

				}
				break;
			case 50 :
				// lifescript.g:1:304: T__61
				{
				mT__61(); 

				}
				break;
			case 51 :
				// lifescript.g:1:310: T__62
				{
				mT__62(); 

				}
				break;
			case 52 :
				// lifescript.g:1:316: T__63
				{
				mT__63(); 

				}
				break;
			case 53 :
				// lifescript.g:1:322: T__64
				{
				mT__64(); 

				}
				break;
			case 54 :
				// lifescript.g:1:328: T__65
				{
				mT__65(); 

				}
				break;
			case 55 :
				// lifescript.g:1:334: T__66
				{
				mT__66(); 

				}
				break;
			case 56 :
				// lifescript.g:1:340: T__67
				{
				mT__67(); 

				}
				break;
			case 57 :
				// lifescript.g:1:346: T__68
				{
				mT__68(); 

				}
				break;
			case 58 :
				// lifescript.g:1:352: T__69
				{
				mT__69(); 

				}
				break;
			case 59 :
				// lifescript.g:1:358: T__70
				{
				mT__70(); 

				}
				break;
			case 60 :
				// lifescript.g:1:364: T__71
				{
				mT__71(); 

				}
				break;
			case 61 :
				// lifescript.g:1:370: T__72
				{
				mT__72(); 

				}
				break;
			case 62 :
				// lifescript.g:1:376: T__73
				{
				mT__73(); 

				}
				break;
			case 63 :
				// lifescript.g:1:382: T__74
				{
				mT__74(); 

				}
				break;
			case 64 :
				// lifescript.g:1:388: T__75
				{
				mT__75(); 

				}
				break;
			case 65 :
				// lifescript.g:1:394: T__76
				{
				mT__76(); 

				}
				break;
			case 66 :
				// lifescript.g:1:400: T__77
				{
				mT__77(); 

				}
				break;
			case 67 :
				// lifescript.g:1:406: T__78
				{
				mT__78(); 

				}
				break;
			case 68 :
				// lifescript.g:1:412: T__79
				{
				mT__79(); 

				}
				break;
			case 69 :
				// lifescript.g:1:418: T__80
				{
				mT__80(); 

				}
				break;
			case 70 :
				// lifescript.g:1:424: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 71 :
				// lifescript.g:1:432: ID
				{
				mID(); 

				}
				break;
			case 72 :
				// lifescript.g:1:435: INT
				{
				mINT(); 

				}
				break;
			case 73 :
				// lifescript.g:1:439: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 74 :
				// lifescript.g:1:445: STRING
				{
				mSTRING(); 

				}
				break;
			case 75 :
				// lifescript.g:1:452: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 76 :
				// lifescript.g:1:460: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\1\uffff\1\57\7\uffff\1\61\1\uffff\1\63\1\65\1\67\11\52\2\uffff\16\52"+
		"\4\uffff\1\136\14\uffff\16\52\1\157\7\52\1\167\1\52\1\171\2\52\1\175\5"+
		"\52\1\u0085\4\52\2\uffff\13\52\1\u0095\2\52\1\u0099\1\uffff\4\52\1\u00a1"+
		"\1\u00a2\1\52\1\uffff\1\52\1\uffff\3\52\1\uffff\7\52\1\uffff\17\52\1\uffff"+
		"\3\52\1\uffff\1\u00c2\1\52\1\u00c4\1\u00c5\3\52\2\uffff\2\52\1\u00cc\1"+
		"\52\1\u00ce\5\52\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\2\52\1\uffff"+
		"\7\52\1\u00e2\1\52\1\u00e4\2\52\1\u00e7\1\uffff\1\52\2\uffff\1\u00e9\3"+
		"\52\1\u00d8\1\u00ed\1\uffff\1\52\1\uffff\1\u00ef\3\52\1\u00f4\5\uffff"+
		"\1\u00f5\1\u00f6\7\52\1\uffff\1\52\1\uffff\1\52\1\u0100\1\uffff\1\u0101"+
		"\1\uffff\3\52\1\uffff\1\52\1\uffff\1\u0106\3\52\3\uffff\11\52\2\uffff"+
		"\1\u0113\3\52\1\uffff\3\52\1\uffff\2\52\1\u011c\1\52\1\u011e\3\52\1\uffff"+
		"\1\u0122\1\u0123\1\52\1\u0125\1\u0126\3\52\1\uffff\1\52\1\uffff\1\52\1"+
		"\u012c\1\u012d\2\uffff\1\u012e\2\uffff\1\52\1\u0130\2\52\1\u0133\3\uffff"+
		"\1\u0134\1\uffff\1\u0135\1\52\3\uffff\1\u0137\1\uffff";
	static final String DFA7_eofS =
		"\u0138\uffff";
	static final String DFA7_minS =
		"\1\11\1\75\7\uffff\1\57\1\uffff\3\75\3\145\1\156\1\145\1\141\1\164\1\151"+
		"\1\101\2\uffff\1\144\2\145\1\154\1\141\1\146\1\151\1\145\1\146\1\162\1"+
		"\141\1\145\2\150\4\uffff\1\56\14\uffff\1\154\1\146\1\155\1\156\1\164\1"+
		"\151\1\165\1\157\1\141\1\164\1\122\1\144\1\151\1\145\1\60\1\154\1\145"+
		"\1\141\1\163\1\144\1\162\1\154\1\60\1\160\1\60\1\154\1\151\1\60\1\151"+
		"\1\156\1\164\2\141\1\60\1\160\1\165\1\151\1\162\2\uffff\1\154\1\141\3"+
		"\145\1\147\1\163\1\160\1\162\1\160\1\154\1\60\1\143\1\166\1\60\1\uffff"+
		"\1\154\1\141\1\144\1\145\2\60\1\163\1\uffff\1\165\1\uffff\1\154\1\147"+
		"\1\164\1\uffff\1\156\1\144\1\143\1\164\1\160\1\164\1\156\1\uffff\2\145"+
		"\2\154\1\40\1\165\1\156\2\162\1\150\1\141\1\145\1\164\1\160\1\145\1\uffff"+
		"\2\157\1\145\1\uffff\1\60\1\164\2\60\1\146\1\171\1\150\2\uffff\1\145\1"+
		"\164\1\60\1\150\1\60\1\164\2\157\1\164\1\145\5\60\1\145\1\144\1\uffff"+
		"\1\154\1\163\1\141\1\166\2\142\1\162\1\60\1\141\1\60\1\154\1\167\1\60"+
		"\1\uffff\1\145\2\uffff\1\60\1\160\1\151\1\162\2\60\1\uffff\1\142\1\uffff"+
		"\1\60\1\155\1\154\1\141\1\60\5\uffff\2\60\1\164\1\151\1\164\1\141\1\157"+
		"\1\154\1\164\1\uffff\1\142\1\uffff\1\165\1\60\1\uffff\1\60\1\uffff\1\145"+
		"\2\154\1\uffff\1\157\1\uffff\1\60\1\157\1\164\1\157\3\uffff\1\40\1\157"+
		"\1\151\1\154\1\162\1\145\1\151\1\154\1\155\2\uffff\1\60\1\145\1\144\1"+
		"\162\1\uffff\1\162\1\145\1\154\1\uffff\1\156\1\157\1\60\1\150\1\60\2\145"+
		"\1\156\1\uffff\2\60\1\163\2\60\1\157\1\163\1\156\1\uffff\1\157\1\uffff"+
		"\1\163\2\60\2\uffff\1\60\2\uffff\1\162\1\60\1\163\1\157\1\60\3\uffff\1"+
		"\60\1\uffff\1\60\1\144\3\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\1\75\7\uffff\1\57\1\uffff\3\75\1\145\1\151\1\145\1\156\1\145\1"+
		"\162\1\164\1\151\1\101\2\uffff\1\164\1\162\1\145\1\156\1\157\1\163\1\151"+
		"\1\145\1\146\1\162\1\141\1\164\1\171\1\157\4\uffff\1\71\14\uffff\1\154"+
		"\1\146\1\155\1\156\1\164\1\151\1\165\1\157\1\145\1\164\1\122\1\144\1\151"+
		"\1\145\1\172\1\154\1\145\1\141\1\163\1\144\1\162\1\154\1\172\1\160\1\172"+
		"\1\154\1\170\1\172\1\151\1\156\1\164\2\145\1\172\1\160\1\165\1\151\1\162"+
		"\2\uffff\1\154\1\141\3\145\1\147\1\163\1\160\1\162\1\160\1\154\1\172\1"+
		"\162\1\166\1\172\1\uffff\1\154\1\141\1\144\1\145\2\172\1\163\1\uffff\1"+
		"\165\1\uffff\1\154\1\147\1\164\1\uffff\1\156\1\144\1\163\1\164\1\160\1"+
		"\164\1\156\1\uffff\2\145\2\154\1\40\1\165\1\156\2\162\1\150\1\141\1\145"+
		"\1\164\1\160\1\145\1\uffff\2\157\1\145\1\uffff\1\172\1\164\2\172\1\146"+
		"\1\171\1\157\2\uffff\1\145\1\164\1\172\1\150\1\172\1\164\2\157\1\164\1"+
		"\145\5\172\1\145\1\144\1\uffff\1\154\1\163\1\141\1\166\2\142\1\162\1\172"+
		"\1\141\1\172\1\154\1\167\1\172\1\uffff\1\145\2\uffff\1\172\1\160\1\151"+
		"\1\162\2\172\1\uffff\1\142\1\uffff\1\172\1\155\1\154\1\141\1\172\5\uffff"+
		"\2\172\1\164\1\151\1\164\1\141\1\157\1\154\1\164\1\uffff\1\142\1\uffff"+
		"\1\165\1\172\1\uffff\1\172\1\uffff\1\145\2\154\1\uffff\1\157\1\uffff\1"+
		"\172\1\157\1\164\1\157\3\uffff\1\40\1\157\1\151\1\154\1\162\1\145\1\151"+
		"\1\154\1\155\2\uffff\1\172\1\145\1\144\1\162\1\uffff\1\162\1\145\1\154"+
		"\1\uffff\1\156\1\157\1\172\1\150\1\172\2\145\1\156\1\uffff\2\172\1\163"+
		"\2\172\1\157\1\163\1\156\1\uffff\1\157\1\uffff\1\163\2\172\2\uffff\1\172"+
		"\2\uffff\1\162\1\172\1\163\1\157\1\172\3\uffff\1\172\1\uffff\1\172\1\144"+
		"\3\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\14\uffff\1\36\1\37"+
		"\16\uffff\1\103\1\104\1\105\1\107\1\uffff\1\112\1\114\1\2\1\1\1\113\1"+
		"\12\1\15\1\14\1\17\1\16\1\21\1\20\46\uffff\1\110\1\111\17\uffff\1\44\7"+
		"\uffff\1\57\1\uffff\1\61\3\uffff\1\65\7\uffff\1\77\17\uffff\1\35\3\uffff"+
		"\1\43\7\uffff\1\51\1\56\21\uffff\1\22\15\uffff\1\45\1\uffff\1\47\1\50"+
		"\6\uffff\1\62\1\uffff\1\64\5\uffff\1\74\1\75\1\76\1\100\1\106\11\uffff"+
		"\1\32\1\uffff\1\34\2\uffff\1\42\1\uffff\1\52\3\uffff\1\60\1\uffff\1\66"+
		"\4\uffff\1\72\1\101\1\102\11\uffff\1\41\1\46\4\uffff\1\67\3\uffff\1\23"+
		"\10\uffff\1\53\10\uffff\1\26\1\uffff\1\30\3\uffff\1\54\1\55\1\uffff\1"+
		"\70\1\71\5\uffff\1\33\1\40\1\63\1\uffff\1\24\2\uffff\1\31\1\73\1\25\1"+
		"\uffff\1\27";
	static final String DFA7_specialS =
		"\u0138\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\55\2\uffff\1\55\22\uffff\1\55\1\1\1\54\3\uffff\1\2\1\uffff\1\3\1\4"+
			"\1\5\1\6\1\7\1\10\1\uffff\1\11\12\53\1\12\1\uffff\1\13\1\14\1\15\2\uffff"+
			"\2\52\1\16\1\17\2\52\1\20\1\52\1\21\4\52\1\22\1\52\1\23\2\52\1\24\1\25"+
			"\1\52\1\26\4\52\1\27\1\uffff\1\30\1\uffff\1\52\1\uffff\1\31\1\52\1\32"+
			"\1\33\1\34\1\35\2\52\1\36\1\52\1\37\2\52\1\40\1\41\1\42\1\52\1\43\1\44"+
			"\1\45\2\52\1\46\3\52\1\47\1\50\1\51",
			"\1\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\60",
			"",
			"\1\62",
			"\1\64",
			"\1\66",
			"\1\70",
			"\1\71\3\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76\20\uffff\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"\1\103\7\uffff\1\104\5\uffff\1\105\1\uffff\1\106",
			"\1\107\14\uffff\1\110",
			"\1\111",
			"\1\112\1\uffff\1\113",
			"\1\115\15\uffff\1\114",
			"\1\116\7\uffff\1\117\4\uffff\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126\16\uffff\1\127",
			"\1\130\6\uffff\1\131\2\uffff\1\133\6\uffff\1\132",
			"\1\134\6\uffff\1\135",
			"",
			"",
			"",
			"",
			"\1\137\1\uffff\12\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150\3\uffff\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\170",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\172",
			"\1\173\16\uffff\1\174",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081\3\uffff\1\u0082",
			"\1\u0083\3\uffff\1\u0084",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"",
			"",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0096\16\uffff\1\u0097",
			"\1\u0098",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u009e\12\52\1\u009f"+
			"\2\52\1\u00a0\3\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00a3",
			"",
			"\1\u00a4",
			"",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa\17\uffff\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00c3",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8\6\uffff\1\u00c9",
			"",
			"",
			"\1\u00ca",
			"\1\u00cb",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00cd",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00d9",
			"\1\u00da",
			"",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00e3",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00e5",
			"\1\u00e6",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u00e8",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u00ee",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u00f3\27\52",
			"",
			"",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"",
			"\1\u00fe",
			"",
			"\1\u00ff",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"",
			"\1\u0105",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"",
			"",
			"",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"",
			"\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"",
			"\1\u011a",
			"\1\u011b",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u011d",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0124",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"",
			"\1\u012a",
			"",
			"\1\u012b",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\u012f",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0131",
			"\1\u0132",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			"\1\u0136",
			"",
			"",
			"",
			"\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | BOOLEAN | ID | INT | FLOAT | STRING | COMMENT | WS );";
		}
	}

}
