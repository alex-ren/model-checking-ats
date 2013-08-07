// $ANTLR 3.5 G:\\workspace\\PAT\\grammar\\cspsharp.g 2013-01-19 11:45:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class cspsharpParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "LINE_COMMENT", 
		"STRING", "WS", "'!'", "'!='", "'#'", "'$'", "'%'", "'&&'", "'&'", "'('", 
		"')'", "'*'", "'+'", "'++'", "','", "'-'", "'--'", "'->'", "'.'", "'..'", 
		"'/'", "'/\\\\'", "':'", "';'", "'<'", "'<->'", "'<='", "'<>'", "'<F>'", 
		"'<FD>'", "'='", "'=='", "'>'", "'>='", "'?'", "'@'", "'Skip'", "'Stop'", 
		"'['", "'[*]'", "'[]'", "'\\\\/'", "']'", "'^'", "'alphabet'", "'assert'", 
		"'atomic'", "'call'", "'case'", "'channel'", "'dd'", "'deadlockfree'", 
		"'default'", "'define'", "'deterministic'", "'divergencefree'", "'else'", 
		"'enum'", "'false'", "'hvar'", "'if'", "'ifa'", "'ifb'", "'import'", "'include'", 
		"'interrupt'", "'max'", "'min'", "'new'", "'nonterminating'", "'reaches'", 
		"'refines'", "'tau'", "'true'", "'var'", "'while'", "'with'", "'xor'", 
		"'{'", "'|'", "'|='", "'||'", "'|||'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
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
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int COMMENT=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int LINE_COMMENT=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred6_cspsharp", "eventList", "definition", "synpred156_cspsharp", 
		"synpred69_cspsharp", "atom", "relationalExpression", "synpred50_cspsharp", 
		"synpred100_cspsharp", "synpred70_cspsharp", "synpred95_cspsharp", "unaryExpression", 
		"synpred71_cspsharp", "synpred173_cspsharp", "synpred24_cspsharp", "synpred146_cspsharp", 
		"caseExpr", "channel", "specBody", "synpred14_cspsharp", "synpred139_cspsharp", 
		"interruptExpr", "synpred12_cspsharp", "synpred20_cspsharp", "specification", 
		"bitwiseLogicExpression", "synpred126_cspsharp", "statement", "synpred163_cspsharp", 
		"synpred56_cspsharp", "synpred52_cspsharp", "synpred149_cspsharp", "synpred11_cspsharp", 
		"parameter", "sequentialExpr", "synpred19_cspsharp", "indexedExpression", 
		"synpred145_cspsharp", "channelExpr_refactor", "synpred131_cspsharp", 
		"synpred83_cspsharp", "synpred104_cspsharp", "synpred66_cspsharp", "synpred169_cspsharp", 
		"synpred82_cspsharp", "synpred77_cspsharp", "synpred46_cspsharp", "synpred174_cspsharp", 
		"equalityExpression", "externalChoiceExpr", "synpred168_cspsharp", "synpred8_cspsharp", 
		"localVariableDeclaration", "synpred76_cspsharp", "synpred152_cspsharp", 
		"eventName", "generalChoiceExpr", "synpred51_cspsharp", "synpred134_cspsharp", 
		"synpred112_cspsharp", "paralDef", "synpred37_cspsharp", "synpred40_cspsharp", 
		"synpred38_cspsharp", "define", "methods_fields_call", "synpred47_cspsharp", 
		"atomicExpr", "synpred22_cspsharp", "additiveExpression", "caseCondition", 
		"synpred96_cspsharp", "synpred89_cspsharp", "synpred113_cspsharp", "synpred27_cspsharp", 
		"synpred10_cspsharp", "synpred79_cspsharp", "arrayExpression", "synpred23_cspsharp", 
		"unaryExpressionNotPlusMinus", "expression", "synpred158_cspsharp", "channelExpr", 
		"synpred107_cspsharp", "synpred86_cspsharp", "synpred5_cspsharp", "synpred164_cspsharp", 
		"hidingExpr", "synpred167_cspsharp", "synpred121_cspsharp", "alphabet", 
		"ifExpr", "synpred78_cspsharp", "synpred35_cspsharp", "synpred106_cspsharp", 
		"synpred60_cspsharp", "synpred119_cspsharp", "parallelExpr", "synpred21_cspsharp", 
		"whileExpression", "synpred103_cspsharp", "synpred41_cspsharp", "synpred94_cspsharp", 
		"synpred162_cspsharp", "ifBlock", "synpred59_cspsharp", "synpred125_cspsharp", 
		"synpred136_cspsharp", "synpred159_cspsharp", "synpred102_cspsharp", "ifExprs", 
		"conditionalAndExpression", "synpred4_cspsharp", "synpred108_cspsharp", 
		"synpred118_cspsharp", "synpred88_cspsharp", "synpred117_cspsharp", "eventM", 
		"synpred157_cspsharp", "synpred129_cspsharp", "synpred74_cspsharp", "eventExpr", 
		"synpred32_cspsharp", "dparameter", "synpred98_cspsharp", "synpred64_cspsharp", 
		"synpred9_cspsharp", "synpred31_cspsharp", "synpred105_cspsharp", "synpred90_cspsharp", 
		"interleaveExpr", "synpred116_cspsharp", "synpred133_cspsharp", "synpred175_cspsharp", 
		"synpred49_cspsharp", "conditionalOrExpression", "internalChoiceExpr", 
		"synpred92_cspsharp", "dstatement", "synpred172_cspsharp", "synpred166_cspsharp", 
		"synpred75_cspsharp", "synpred1_cspsharp", "synpred170_cspsharp", "synpred55_cspsharp", 
		"synpred13_cspsharp", "synpred36_cspsharp", "synpred115_cspsharp", "synpred81_cspsharp", 
		"synpred2_cspsharp", "synpred61_cspsharp", "synpred43_cspsharp", "synpred3_cspsharp", 
		"synpred123_cspsharp", "synpred151_cspsharp", "synpred58_cspsharp", "synpred138_cspsharp", 
		"synpred18_cspsharp", "synpred124_cspsharp", "synpred179_cspsharp", "synpred132_cspsharp", 
		"synpred122_cspsharp", "synpred165_cspsharp", "synpred130_cspsharp", "synpred72_cspsharp", 
		"synpred137_cspsharp", "synpred34_cspsharp", "synpred141_cspsharp", "synpred97_cspsharp", 
		"letDefintion", "synpred99_cspsharp", "synpred54_cspsharp", "synpred154_cspsharp", 
		"synpred171_cspsharp", "synpred85_cspsharp", "conditionalXorExpression", 
		"synpred28_cspsharp", "synpred111_cspsharp", "assertion", "synpred26_cspsharp", 
		"synpred62_cspsharp", "recordExpression", "synpred29_cspsharp", "synpred42_cspsharp", 
		"synpred101_cspsharp", "synpred127_cspsharp", "synpred180_cspsharp", "ifExpression", 
		"synpred150_cspsharp", "synpred135_cspsharp", "synpred114_cspsharp", "synpred39_cspsharp", 
		"synpred67_cspsharp", "synpred140_cspsharp", "guardExpr", "synpred176_cspsharp", 
		"synpred142_cspsharp", "synpred80_cspsharp", "synpred25_cspsharp", "synpred155_cspsharp", 
		"synpred15_cspsharp", "synpred120_cspsharp", "synpred68_cspsharp", "synpred91_cspsharp", 
		"synpred17_cspsharp", "withClause", "block", "recordElement", "synpred144_cspsharp", 
		"synpred48_cspsharp", "synpred143_cspsharp", "synpred147_cspsharp", "varaibleRange", 
		"synpred44_cspsharp", "synpred30_cspsharp", "synpred148_cspsharp", "synpred161_cspsharp", 
		"synpred33_cspsharp", "synpred110_cspsharp", "synpred16_cspsharp", "synpred87_cspsharp", 
		"library", "synpred53_cspsharp", "synpred93_cspsharp", "synpred45_cspsharp", 
		"argumentExpression", "synpred65_cspsharp", "synpred160_cspsharp", "synpred84_cspsharp", 
		"synpred57_cspsharp", "synpred128_cspsharp", "synpred153_cspsharp", "multiplicativeExpression", 
		"synpred177_cspsharp", "synpred109_cspsharp", "paralDef2", "synpred63_cspsharp", 
		"synpred7_cspsharp", "definitionRef", "synpred178_cspsharp", "synpred73_cspsharp"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, true, false, false, false, true, false, false, false, false, 
		    false, false, true, true, false, true, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, true, false, false, 
		    true, false, false, false, false, true, false, false, true, false, 
		    false, false, false, false, true, false, false, true, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public cspsharpParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public cspsharpParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public cspsharpParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return cspsharpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "G:\\workspace\\PAT\\grammar\\cspsharp.g"; }



	// $ANTLR start "specification"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:7:1: specification : ( specBody ) EOF ;
	public final void specification() throws  {
		try { dbg.enterRule(getGrammarFileName(), "specification");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:9:13: ( ( specBody ) EOF )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:9:15: ( specBody ) EOF
			{
			dbg.location(9,15);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:9:15: ( specBody )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:9:16: specBody
			{
			dbg.location(9,16);
			pushFollow(FOLLOW_specBody_in_specification42);
			specBody();
			state._fsp--;
			if (state.failed) return;
			}
			dbg.location(9,26);
			match(input,EOF,FOLLOW_EOF_in_specification45); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specification");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "specification"



	// $ANTLR start "specBody"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:15:1: specBody : ( library | letDefintion | definition | assertion | alphabet | define | channel );
	public final void specBody() throws  {
		try { dbg.enterRule(getGrammarFileName(), "specBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:16:18: ( library | letDefintion | definition | assertion | alphabet | define | channel )
			int alt1=7;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			switch ( input.LA(1) ) {
			case 12:
				{
				switch ( input.LA(2) ) {
				case 71:
				case 72:
					{
					alt1=1;
					}
					break;
				case 53:
					{
					alt1=4;
					}
					break;
				case 52:
					{
					alt1=5;
					}
					break;
				case 61:
					{
					alt1=6;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 67:
			case 82:
				{
				alt1=2;
				}
				break;
			case ID:
				{
				alt1=3;
				}
				break;
			case EOF:
			case 65:
				{
				alt1=6;
				}
				break;
			case 57:
				{
				alt1=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:16:20: library
					{
					dbg.location(16,20);
					pushFollow(FOLLOW_library_in_specBody87);
					library();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:17:20: letDefintion
					{
					dbg.location(17,20);
					pushFollow(FOLLOW_letDefintion_in_specBody108);
					letDefintion();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:18:20: definition
					{
					dbg.location(18,20);
					pushFollow(FOLLOW_definition_in_specBody131);
					definition();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:19:20: assertion
					{
					dbg.location(19,20);
					pushFollow(FOLLOW_assertion_in_specBody152);
					assertion();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:20:20: alphabet
					{
					dbg.location(20,20);
					pushFollow(FOLLOW_alphabet_in_specBody173);
					alphabet();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:21:20: define
					{
					dbg.location(21,20);
					pushFollow(FOLLOW_define_in_specBody194);
					define();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:22:20: channel
					{
					dbg.location(22,20);
					pushFollow(FOLLOW_channel_in_specBody215);
					channel();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(23, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "specBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "specBody"



	// $ANTLR start "library"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:27:1: library : ( '#' 'import' STRING ';' | '#' 'include' STRING ';' );
	public final void library() throws  {
		try { dbg.enterRule(getGrammarFileName(), "library");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:28:19: ( '#' 'import' STRING ';' | '#' 'include' STRING ';' )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==12) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==71) ) {
					alt2=1;
				}
				else if ( (LA2_1==72) ) {
					alt2=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:28:21: '#' 'import' STRING ';'
					{
					dbg.location(28,21);
					match(input,12,FOLLOW_12_in_library262); if (state.failed) return;dbg.location(28,25);
					match(input,71,FOLLOW_71_in_library264); if (state.failed) return;dbg.location(28,34);
					match(input,STRING,FOLLOW_STRING_in_library266); if (state.failed) return;dbg.location(28,41);
					match(input,31,FOLLOW_31_in_library268); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:30:15: '#' 'include' STRING ';'
					{
					dbg.location(30,15);
					match(input,12,FOLLOW_12_in_library286); if (state.failed) return;dbg.location(30,19);
					match(input,72,FOLLOW_72_in_library288); if (state.failed) return;dbg.location(30,29);
					match(input,STRING,FOLLOW_STRING_in_library290); if (state.failed) return;dbg.location(30,36);
					match(input,31,FOLLOW_31_in_library292); if (state.failed) return;
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
		dbg.location(32, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "library");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "library"



	// $ANTLR start "channel"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:36:1: channel : 'channel' ID ( '[' additiveExpression ']' )? additiveExpression ';' ;
	public final void channel() throws  {
		try { dbg.enterRule(getGrammarFileName(), "channel");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:38:14: ( 'channel' ID ( '[' additiveExpression ']' )? additiveExpression ';' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:38:16: 'channel' ID ( '[' additiveExpression ']' )? additiveExpression ';'
			{
			dbg.location(38,16);
			match(input,57,FOLLOW_57_in_channel333); if (state.failed) return;dbg.location(38,26);
			match(input,ID,FOLLOW_ID_in_channel335); if (state.failed) return;dbg.location(38,29);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:38:29: ( '[' additiveExpression ']' )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==46) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:38:30: '[' additiveExpression ']'
					{
					dbg.location(38,30);
					match(input,46,FOLLOW_46_in_channel338); if (state.failed) return;dbg.location(38,34);
					pushFollow(FOLLOW_additiveExpression_in_channel340);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(38,53);
					match(input,50,FOLLOW_50_in_channel342); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(38,59);
			pushFollow(FOLLOW_additiveExpression_in_channel346);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(38,78);
			match(input,31,FOLLOW_31_in_channel348); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "channel");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "channel"



	// $ANTLR start "assertion"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:44:1: assertion : '#' 'assert' definitionRef ( ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ ) | 'deadlockfree' | 'nonterminating' | 'divergencefree' | 'deterministic' | 'reaches' ID ( withClause )? | 'refines' definitionRef | 'refines' '<F>' definitionRef | 'refines' '<FD>' definitionRef ) ';' ;
	public final void assertion() throws  {
		try { dbg.enterRule(getGrammarFileName(), "assertion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:46:14: ( '#' 'assert' definitionRef ( ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ ) | 'deadlockfree' | 'nonterminating' | 'divergencefree' | 'deterministic' | 'reaches' ID ( withClause )? | 'refines' definitionRef | 'refines' '<F>' definitionRef | 'refines' '<FD>' definitionRef ) ';' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:46:16: '#' 'assert' definitionRef ( ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ ) | 'deadlockfree' | 'nonterminating' | 'divergencefree' | 'deterministic' | 'reaches' ID ( withClause )? | 'refines' definitionRef | 'refines' '<F>' definitionRef | 'refines' '<FD>' definitionRef ) ';'
			{
			dbg.location(46,16);
			match(input,12,FOLLOW_12_in_assertion388); if (state.failed) return;dbg.location(46,20);
			match(input,53,FOLLOW_53_in_assertion390); if (state.failed) return;dbg.location(46,29);
			pushFollow(FOLLOW_definitionRef_in_assertion392);
			definitionRef();
			state._fsp--;
			if (state.failed) return;dbg.location(48,15);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:48:15: ( ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ ) | 'deadlockfree' | 'nonterminating' | 'divergencefree' | 'deterministic' | 'reaches' ID ( withClause )? | 'refines' definitionRef | 'refines' '<F>' definitionRef | 'refines' '<FD>' definitionRef )
			int alt6=9;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
			case 88:
				{
				alt6=1;
				}
				break;
			case 59:
				{
				alt6=2;
				}
				break;
			case 77:
				{
				alt6=3;
				}
				break;
			case 63:
				{
				alt6=4;
				}
				break;
			case 62:
				{
				alt6=5;
				}
				break;
			case 78:
				{
				alt6=6;
				}
				break;
			case 79:
				{
				switch ( input.LA(2) ) {
				case 36:
					{
					alt6=8;
					}
					break;
				case 37:
					{
					alt6=9;
					}
					break;
				case ID:
					{
					alt6=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 7, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:50:18: ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ )
					{
					dbg.location(50,18);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:50:18: ( '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+ )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:50:20: '|=' ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+
					{
					dbg.location(50,20);
					match(input,88,FOLLOW_88_in_assertion431); if (state.failed) return;dbg.location(50,25);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:50:25: ( '(' | ')' | '[]' | '<>' | ID | STRING | '!' | '?' | '&&' | '||' | 'xor' | '->' | '<->' | '/\\\\' | '\\\\/' | '.' | INT )+
					int cnt4=0;
					try { dbg.enterSubRule(4);

					loop4:
					while (true) {
						int alt4=2;
						try { dbg.enterDecision(4, decisionCanBacktrack[4]);

						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ID && LA4_0 <= INT)||LA4_0==STRING||LA4_0==10||LA4_0==15||(LA4_0 >= 17 && LA4_0 <= 18)||(LA4_0 >= 25 && LA4_0 <= 26)||LA4_0==29||LA4_0==33||LA4_0==35||LA4_0==42||(LA4_0 >= 48 && LA4_0 <= 49)||LA4_0==85||LA4_0==89) ) {
							alt4=1;
						}

						} finally {dbg.exitDecision(4);}

						switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:
							{
							dbg.location(50,25);
							if ( (input.LA(1) >= ID && input.LA(1) <= INT)||input.LA(1)==STRING||input.LA(1)==10||input.LA(1)==15||(input.LA(1) >= 17 && input.LA(1) <= 18)||(input.LA(1) >= 25 && input.LA(1) <= 26)||input.LA(1)==29||input.LA(1)==33||input.LA(1)==35||input.LA(1)==42||(input.LA(1) >= 48 && input.LA(1) <= 49)||input.LA(1)==85||input.LA(1)==89 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								dbg.recognitionException(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(4, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt4++;
					}
					} finally {dbg.exitSubRule(4);}

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:51:35: 'deadlockfree'
					{
					dbg.location(51,35);
					match(input,59,FOLLOW_59_in_assertion539); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:52:35: 'nonterminating'
					{
					dbg.location(52,35);
					match(input,77,FOLLOW_77_in_assertion576); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:53:35: 'divergencefree'
					{
					dbg.location(53,35);
					match(input,63,FOLLOW_63_in_assertion617); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:54:35: 'deterministic'
					{
					dbg.location(54,35);
					match(input,62,FOLLOW_62_in_assertion658); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:55:35: 'reaches' ID ( withClause )?
					{
					dbg.location(55,35);
					match(input,78,FOLLOW_78_in_assertion694); if (state.failed) return;dbg.location(55,45);
					match(input,ID,FOLLOW_ID_in_assertion696); if (state.failed) return;dbg.location(55,48);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:55:48: ( withClause )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==84) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:55:48: withClause
							{
							dbg.location(55,48);
							pushFollow(FOLLOW_withClause_in_assertion698);
							withClause();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:56:35: 'refines' definitionRef
					{
					dbg.location(56,35);
					match(input,79,FOLLOW_79_in_assertion735); if (state.failed) return;dbg.location(56,45);
					pushFollow(FOLLOW_definitionRef_in_assertion737);
					definitionRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:57:35: 'refines' '<F>' definitionRef
					{
					dbg.location(57,35);
					match(input,79,FOLLOW_79_in_assertion773); if (state.failed) return;dbg.location(57,45);
					match(input,36,FOLLOW_36_in_assertion775); if (state.failed) return;dbg.location(57,51);
					pushFollow(FOLLOW_definitionRef_in_assertion777);
					definitionRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:58:35: 'refines' '<FD>' definitionRef
					{
					dbg.location(58,35);
					match(input,79,FOLLOW_79_in_assertion813); if (state.failed) return;dbg.location(58,45);
					match(input,37,FOLLOW_37_in_assertion815); if (state.failed) return;dbg.location(58,52);
					pushFollow(FOLLOW_definitionRef_in_assertion817);
					definitionRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(62,14);
			match(input,31,FOLLOW_31_in_assertion852); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assertion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assertion"



	// $ANTLR start "withClause"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:68:1: withClause : 'with' ( 'min' | 'max' ) '(' expression ')' ;
	public final void withClause() throws  {
		try { dbg.enterRule(getGrammarFileName(), "withClause");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:69:21: ( 'with' ( 'min' | 'max' ) '(' expression ')' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:69:23: 'with' ( 'min' | 'max' ) '(' expression ')'
			{
			dbg.location(69,23);
			match(input,84,FOLLOW_84_in_withClause897); if (state.failed) return;dbg.location(69,30);
			if ( (input.LA(1) >= 74 && input.LA(1) <= 75) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(69,46);
			match(input,17,FOLLOW_17_in_withClause907); if (state.failed) return;dbg.location(69,50);
			pushFollow(FOLLOW_expression_in_withClause909);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(69,61);
			match(input,18,FOLLOW_18_in_withClause911); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "withClause");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "withClause"



	// $ANTLR start "definitionRef"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:74:1: definitionRef : ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )? ;
	public final void definitionRef() throws  {
		try { dbg.enterRule(getGrammarFileName(), "definitionRef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:15: ( ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )? )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:17: ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )?
			{
			dbg.location(76,17);
			match(input,ID,FOLLOW_ID_in_definitionRef958); if (state.failed) return;dbg.location(76,20);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:20: ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==17) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:21: '(' ( argumentExpression ( ',' argumentExpression )* )? ')'
					{
					dbg.location(76,21);
					match(input,17,FOLLOW_17_in_definitionRef961); if (state.failed) return;dbg.location(76,25);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:25: ( argumentExpression ( ',' argumentExpression )* )?
					int alt8=2;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= ID && LA8_0 <= INT)||LA8_0==10||LA8_0==15||LA8_0==17||LA8_0==20||LA8_0==23||LA8_0==46||LA8_0==55||LA8_0==66||LA8_0==76||LA8_0==81||LA8_0==85||LA8_0==89) ) {
						alt8=1;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:26: argumentExpression ( ',' argumentExpression )*
							{
							dbg.location(76,26);
							pushFollow(FOLLOW_argumentExpression_in_definitionRef964);
							argumentExpression();
							state._fsp--;
							if (state.failed) return;dbg.location(76,44);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:44: ( ',' argumentExpression )*
							try { dbg.enterSubRule(7);

							loop7:
							while (true) {
								int alt7=2;
								try { dbg.enterDecision(7, decisionCanBacktrack[7]);

								int LA7_0 = input.LA(1);
								if ( (LA7_0==22) ) {
									alt7=1;
								}

								} finally {dbg.exitDecision(7);}

								switch (alt7) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:76:45: ',' argumentExpression
									{
									dbg.location(76,45);
									match(input,22,FOLLOW_22_in_definitionRef966); if (state.failed) return;dbg.location(76,49);
									pushFollow(FOLLOW_argumentExpression_in_definitionRef968);
									argumentExpression();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop7;
								}
							}
							} finally {dbg.exitSubRule(7);}

							}
							break;

					}
					} finally {dbg.exitSubRule(8);}
					dbg.location(76,72);
					match(input,18,FOLLOW_18_in_definitionRef974); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definitionRef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definitionRef"



	// $ANTLR start "alphabet"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:82:1: alphabet : '#' 'alphabet' ID '{' eventList ( ',' eventList )* '}' ';' ;
	public final void alphabet() throws  {
		try { dbg.enterRule(getGrammarFileName(), "alphabet");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:84:14: ( '#' 'alphabet' ID '{' eventList ( ',' eventList )* '}' ';' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:84:16: '#' 'alphabet' ID '{' eventList ( ',' eventList )* '}' ';'
			{
			dbg.location(84,16);
			match(input,12,FOLLOW_12_in_alphabet1017); if (state.failed) return;dbg.location(84,20);
			match(input,52,FOLLOW_52_in_alphabet1019); if (state.failed) return;dbg.location(84,31);
			match(input,ID,FOLLOW_ID_in_alphabet1021); if (state.failed) return;dbg.location(84,34);
			match(input,86,FOLLOW_86_in_alphabet1023); if (state.failed) return;dbg.location(84,38);
			pushFollow(FOLLOW_eventList_in_alphabet1025);
			eventList();
			state._fsp--;
			if (state.failed) return;dbg.location(84,48);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:84:48: ( ',' eventList )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==22) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:84:49: ',' eventList
					{
					dbg.location(84,49);
					match(input,22,FOLLOW_22_in_alphabet1028); if (state.failed) return;dbg.location(84,53);
					pushFollow(FOLLOW_eventList_in_alphabet1030);
					eventList();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(84,66);
			match(input,91,FOLLOW_91_in_alphabet1035); if (state.failed) return;dbg.location(84,70);
			match(input,31,FOLLOW_31_in_alphabet1037); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "alphabet");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "alphabet"



	// $ANTLR start "define"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:90:1: define : (| 'enum' '{' a= ID ( ',' b= ID )* '}' ';' | '#' 'define' ID ( dparameter )? dstatement ';' );
	public final void define() throws  {
		Token a=null;
		Token b=null;

		try { dbg.enterRule(getGrammarFileName(), "define");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:91:3: (| 'enum' '{' a= ID ( ',' b= ID )* '}' ';' | '#' 'define' ID ( dparameter )? dstatement ';' )
			int alt13=3;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case EOF:
				{
				alt13=1;
				}
				break;
			case 65:
				{
				alt13=2;
				}
				break;
			case 12:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:97:14: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:97:16: 'enum' '{' a= ID ( ',' b= ID )* '}' ';'
					{
					dbg.location(97,16);
					match(input,65,FOLLOW_65_in_define1104); if (state.failed) return;dbg.location(97,23);
					match(input,86,FOLLOW_86_in_define1106); if (state.failed) return;dbg.location(97,28);
					a=(Token)match(input,ID,FOLLOW_ID_in_define1110); if (state.failed) return;dbg.location(97,31);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:97:31: ( ',' b= ID )*
					try { dbg.enterSubRule(11);

					loop11:
					while (true) {
						int alt11=2;
						try { dbg.enterDecision(11, decisionCanBacktrack[11]);

						int LA11_0 = input.LA(1);
						if ( (LA11_0==22) ) {
							alt11=1;
						}

						} finally {dbg.exitDecision(11);}

						switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:97:32: ',' b= ID
							{
							dbg.location(97,32);
							match(input,22,FOLLOW_22_in_define1112); if (state.failed) return;dbg.location(97,37);
							b=(Token)match(input,ID,FOLLOW_ID_in_define1116); if (state.failed) return;
							}
							break;

						default :
							break loop11;
						}
					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(97,43);
					match(input,91,FOLLOW_91_in_define1120); if (state.failed) return;dbg.location(97,48);
					match(input,31,FOLLOW_31_in_define1123); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:99:16: '#' 'define' ID ( dparameter )? dstatement ';'
					{
					dbg.location(99,16);
					match(input,12,FOLLOW_12_in_define1142); if (state.failed) return;dbg.location(99,20);
					match(input,61,FOLLOW_61_in_define1144); if (state.failed) return;dbg.location(99,29);
					match(input,ID,FOLLOW_ID_in_define1146); if (state.failed) return;dbg.location(99,32);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:99:32: ( dparameter )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==17) ) {
						int LA12_1 = input.LA(2);
						if ( (synpred43_cspsharp()) ) {
							alt12=1;
						}
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:99:32: dparameter
							{
							dbg.location(99,32);
							pushFollow(FOLLOW_dparameter_in_define1148);
							dparameter();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(99,44);
					pushFollow(FOLLOW_dstatement_in_define1151);
					dstatement();
					state._fsp--;
					if (state.failed) return;dbg.location(99,55);
					match(input,31,FOLLOW_31_in_define1153); if (state.failed) return;
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
		dbg.location(101, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "define");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "define"



	// $ANTLR start "dparameter"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:104:7: dparameter : ( '(' ID ( ',' ID )* ')' )=> '(' ID ( ',' ID )* ')' ;
	public final void dparameter() throws  {
		try { dbg.enterRule(getGrammarFileName(), "dparameter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 6);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:105:19: ( ( '(' ID ( ',' ID )* ')' )=> '(' ID ( ',' ID )* ')' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:105:21: ( '(' ID ( ',' ID )* ')' )=> '(' ID ( ',' ID )* ')'
			{
			dbg.location(105,52);
			match(input,17,FOLLOW_17_in_dparameter1223); if (state.failed) return;dbg.location(105,56);
			match(input,ID,FOLLOW_ID_in_dparameter1225); if (state.failed) return;dbg.location(105,59);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:105:59: ( ',' ID )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==22) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:105:60: ',' ID
					{
					dbg.location(105,60);
					match(input,22,FOLLOW_22_in_dparameter1228); if (state.failed) return;dbg.location(105,64);
					match(input,ID,FOLLOW_ID_in_dparameter1230); if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(105,70);
			match(input,18,FOLLOW_18_in_dparameter1235); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(107, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dparameter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dparameter"



	// $ANTLR start "dstatement"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:110:7: dstatement : ( block | expression );
	public final void dstatement() throws  {
		try { dbg.enterRule(getGrammarFileName(), "dstatement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 6);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:111:18: ( block | expression )
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==86) ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= ID && LA15_0 <= INT)||LA15_0==10||LA15_0==15||LA15_0==17||LA15_0==20||LA15_0==23||LA15_0==55||LA15_0==66||LA15_0==76||LA15_0==81||LA15_0==85||LA15_0==89) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:111:20: block
					{
					dbg.location(111,20);
					pushFollow(FOLLOW_block_in_dstatement1289);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:112:20: expression
					{
					dbg.location(112,20);
					pushFollow(FOLLOW_expression_in_dstatement1312);
					expression();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(113, 17);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "dstatement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "dstatement"



	// $ANTLR start "block"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:117:1: block : '{' (s= statement )* (e= expression )? '}' ;
	public final void block() throws  {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:12: ( '{' (s= statement )* (e= expression )? '}' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:14: '{' (s= statement )* (e= expression )? '}'
			{
			dbg.location(119,14);
			match(input,86,FOLLOW_86_in_block1353); if (state.failed) return;dbg.location(119,18);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:18: (s= statement )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				switch ( input.LA(1) ) {
				case 89:
					{
					int LA16_1 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 15:
					{
					int LA16_2 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 85:
					{
					int LA16_3 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 20:
					{
					int LA16_4 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 23:
					{
					int LA16_5 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 10:
					{
					int LA16_6 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case INT:
					{
					int LA16_7 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 81:
					{
					int LA16_8 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 66:
					{
					int LA16_9 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 55:
					{
					int LA16_10 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 76:
					{
					int LA16_11 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case ID:
					{
					int LA16_12 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 17:
					{
					int LA16_13 = input.LA(2);
					if ( (synpred48_cspsharp()) ) {
						alt16=1;
					}

					}
					break;
				case 31:
				case 68:
				case 82:
				case 83:
				case 86:
					{
					alt16=1;
					}
					break;
				}
				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:19: s= statement
					{
					dbg.location(119,20);
					pushFollow(FOLLOW_statement_in_block1358);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(119,33);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:33: (e= expression )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= ID && LA17_0 <= INT)||LA17_0==10||LA17_0==15||LA17_0==17||LA17_0==20||LA17_0==23||LA17_0==55||LA17_0==66||LA17_0==76||LA17_0==81||LA17_0==85||LA17_0==89) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:34: e= expression
					{
					dbg.location(119,35);
					pushFollow(FOLLOW_expression_in_block1365);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(119,49);
			match(input,91,FOLLOW_91_in_block1369); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(121, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:125:1: statement : ( block | localVariableDeclaration | ifExpression | whileExpression | ( expression ';' )=> expression ';' | ';' );
	public final void statement() throws  {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:127:11: ( block | localVariableDeclaration | ifExpression | whileExpression | ( expression ';' )=> expression ';' | ';' )
			int alt18=6;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==86) ) {
				alt18=1;
			}
			else if ( (LA18_0==82) ) {
				alt18=2;
			}
			else if ( (LA18_0==68) ) {
				alt18=3;
			}
			else if ( (LA18_0==83) ) {
				alt18=4;
			}
			else if ( (LA18_0==89) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==15) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==85) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==20) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==23) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==10) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==INT) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==81) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==66) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==55) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==76) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==ID) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==17) && (synpred54_cspsharp())) {
				alt18=5;
			}
			else if ( (LA18_0==31) ) {
				alt18=6;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:127:13: block
					{
					dbg.location(127,13);
					pushFollow(FOLLOW_block_in_statement1405);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:129:13: localVariableDeclaration
					{
					dbg.location(129,13);
					pushFollow(FOLLOW_localVariableDeclaration_in_statement1420);
					localVariableDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:131:13: ifExpression
					{
					dbg.location(131,13);
					pushFollow(FOLLOW_ifExpression_in_statement1435);
					ifExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:133:13: whileExpression
					{
					dbg.location(133,13);
					pushFollow(FOLLOW_whileExpression_in_statement1450);
					whileExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:135:13: ( expression ';' )=> expression ';'
					{
					dbg.location(135,33);
					pushFollow(FOLLOW_expression_in_statement1473);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(135,44);
					match(input,31,FOLLOW_31_in_statement1475); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:137:13: ';'
					{
					dbg.location(137,13);
					match(input,31,FOLLOW_31_in_statement1490); if (state.failed) return;
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
		dbg.location(139, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "localVariableDeclaration"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:145:1: localVariableDeclaration : ( 'var' ID ( '=' expression )? ';' | 'var' ID '=' recordExpression ';' | 'var' ID ( '[' expression ']' )+ ( '=' recordExpression )? ';' );
	public final void localVariableDeclaration() throws  {
		try { dbg.enterRule(getGrammarFileName(), "localVariableDeclaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:146:17: ( 'var' ID ( '=' expression )? ';' | 'var' ID '=' recordExpression ';' | 'var' ID ( '[' expression ']' )+ ( '=' recordExpression )? ';' )
			int alt22=3;
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==82) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==ID) ) {
					switch ( input.LA(3) ) {
					case 38:
						{
						int LA22_3 = input.LA(4);
						if ( (LA22_3==46) ) {
							alt22=2;
						}
						else if ( ((LA22_3 >= ID && LA22_3 <= INT)||LA22_3==10||LA22_3==15||LA22_3==17||LA22_3==20||LA22_3==23||LA22_3==55||LA22_3==66||LA22_3==76||LA22_3==81||LA22_3==85||LA22_3==89) ) {
							alt22=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 22, 3, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 31:
						{
						alt22=1;
						}
						break;
					case 46:
						{
						alt22=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:146:19: 'var' ID ( '=' expression )? ';'
					{
					dbg.location(146,19);
					match(input,82,FOLLOW_82_in_localVariableDeclaration1531); if (state.failed) return;dbg.location(146,25);
					match(input,ID,FOLLOW_ID_in_localVariableDeclaration1533); if (state.failed) return;dbg.location(146,28);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:146:28: ( '=' expression )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==38) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:146:29: '=' expression
							{
							dbg.location(146,29);
							match(input,38,FOLLOW_38_in_localVariableDeclaration1536); if (state.failed) return;dbg.location(146,33);
							pushFollow(FOLLOW_expression_in_localVariableDeclaration1538);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(146,46);
					match(input,31,FOLLOW_31_in_localVariableDeclaration1542); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:148:13: 'var' ID '=' recordExpression ';'
					{
					dbg.location(148,13);
					match(input,82,FOLLOW_82_in_localVariableDeclaration1557); if (state.failed) return;dbg.location(148,19);
					match(input,ID,FOLLOW_ID_in_localVariableDeclaration1559); if (state.failed) return;dbg.location(148,22);
					match(input,38,FOLLOW_38_in_localVariableDeclaration1561); if (state.failed) return;dbg.location(148,26);
					pushFollow(FOLLOW_recordExpression_in_localVariableDeclaration1563);
					recordExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(148,43);
					match(input,31,FOLLOW_31_in_localVariableDeclaration1565); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:150:13: 'var' ID ( '[' expression ']' )+ ( '=' recordExpression )? ';'
					{
					dbg.location(150,13);
					match(input,82,FOLLOW_82_in_localVariableDeclaration1580); if (state.failed) return;dbg.location(150,19);
					match(input,ID,FOLLOW_ID_in_localVariableDeclaration1582); if (state.failed) return;dbg.location(150,22);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:150:22: ( '[' expression ']' )+
					int cnt20=0;
					try { dbg.enterSubRule(20);

					loop20:
					while (true) {
						int alt20=2;
						try { dbg.enterDecision(20, decisionCanBacktrack[20]);

						int LA20_0 = input.LA(1);
						if ( (LA20_0==46) ) {
							alt20=1;
						}

						} finally {dbg.exitDecision(20);}

						switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:150:23: '[' expression ']'
							{
							dbg.location(150,23);
							match(input,46,FOLLOW_46_in_localVariableDeclaration1585); if (state.failed) return;dbg.location(150,27);
							pushFollow(FOLLOW_expression_in_localVariableDeclaration1587);
							expression();
							state._fsp--;
							if (state.failed) return;dbg.location(150,38);
							match(input,50,FOLLOW_50_in_localVariableDeclaration1589); if (state.failed) return;
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(20, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt20++;
					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(150,44);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:150:44: ( '=' recordExpression )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==38) ) {
						alt21=1;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:150:45: '=' recordExpression
							{
							dbg.location(150,45);
							match(input,38,FOLLOW_38_in_localVariableDeclaration1594); if (state.failed) return;dbg.location(150,49);
							pushFollow(FOLLOW_recordExpression_in_localVariableDeclaration1596);
							recordExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(150,68);
					match(input,31,FOLLOW_31_in_localVariableDeclaration1600); if (state.failed) return;
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
		dbg.location(152, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "localVariableDeclaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "localVariableDeclaration"



	// $ANTLR start "expression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:156:1: expression : conditionalOrExpression ( '=' expression )? ;
	public final void expression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(156, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:11: ( conditionalOrExpression ( '=' expression )? )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:13: conditionalOrExpression ( '=' expression )?
			{
			dbg.location(158,13);
			pushFollow(FOLLOW_conditionalOrExpression_in_expression1635);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(158,37);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:37: ( '=' expression )?
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==38) ) {
				int LA23_1 = input.LA(2);
				if ( (synpred60_cspsharp()) ) {
					alt23=1;
				}
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:38: '=' expression
					{
					dbg.location(158,38);
					match(input,38,FOLLOW_38_in_expression1638); if (state.failed) return;dbg.location(158,42);
					pushFollow(FOLLOW_expression_in_expression1640);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(23);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(160, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "conditionalOrExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:164:1: conditionalOrExpression : ( '||' indexedExpression | conditionalAndExpression ( '||' conditionalAndExpression )* );
	public final void conditionalOrExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "conditionalOrExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(164, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:166:11: ( '||' indexedExpression | conditionalAndExpression ( '||' conditionalAndExpression )* )
			int alt25=2;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==89) ) {
				alt25=1;
			}
			else if ( ((LA25_0 >= ID && LA25_0 <= INT)||LA25_0==10||LA25_0==15||LA25_0==17||LA25_0==20||LA25_0==23||LA25_0==55||LA25_0==66||LA25_0==76||LA25_0==81||LA25_0==85) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:166:13: '||' indexedExpression
					{
					dbg.location(166,13);
					match(input,89,FOLLOW_89_in_conditionalOrExpression1687); if (state.failed) return;dbg.location(166,18);
					pushFollow(FOLLOW_indexedExpression_in_conditionalOrExpression1689);
					indexedExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:168:13: conditionalAndExpression ( '||' conditionalAndExpression )*
					{
					dbg.location(168,13);
					pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1704);
					conditionalAndExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(168,38);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:168:38: ( '||' conditionalAndExpression )*
					try { dbg.enterSubRule(24);

					loop24:
					while (true) {
						int alt24=2;
						try { dbg.enterDecision(24, decisionCanBacktrack[24]);

						int LA24_0 = input.LA(1);
						if ( (LA24_0==89) ) {
							int LA24_2 = input.LA(2);
							if ( (synpred62_cspsharp()) ) {
								alt24=1;
							}

						}

						} finally {dbg.exitDecision(24);}

						switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:168:40: '||' conditionalAndExpression
							{
							dbg.location(168,40);
							match(input,89,FOLLOW_89_in_conditionalOrExpression1708); if (state.failed) return;dbg.location(168,45);
							pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression1710);
							conditionalAndExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop24;
						}
					}
					} finally {dbg.exitSubRule(24);}

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
		dbg.location(170, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditionalOrExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditionalOrExpression"



	// $ANTLR start "conditionalAndExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:174:1: conditionalAndExpression : ( '&&' indexedExpression | conditionalXorExpression ( '&&' conditionalXorExpression )* );
	public final void conditionalAndExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "conditionalAndExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(174, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:176:11: ( '&&' indexedExpression | conditionalXorExpression ( '&&' conditionalXorExpression )* )
			int alt27=2;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==15) ) {
				alt27=1;
			}
			else if ( ((LA27_0 >= ID && LA27_0 <= INT)||LA27_0==10||LA27_0==17||LA27_0==20||LA27_0==23||LA27_0==55||LA27_0==66||LA27_0==76||LA27_0==81||LA27_0==85) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:176:13: '&&' indexedExpression
					{
					dbg.location(176,13);
					match(input,15,FOLLOW_15_in_conditionalAndExpression1757); if (state.failed) return;dbg.location(176,18);
					pushFollow(FOLLOW_indexedExpression_in_conditionalAndExpression1759);
					indexedExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:178:13: conditionalXorExpression ( '&&' conditionalXorExpression )*
					{
					dbg.location(178,13);
					pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1774);
					conditionalXorExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(178,38);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:178:38: ( '&&' conditionalXorExpression )*
					try { dbg.enterSubRule(26);

					loop26:
					while (true) {
						int alt26=2;
						try { dbg.enterDecision(26, decisionCanBacktrack[26]);

						int LA26_0 = input.LA(1);
						if ( (LA26_0==15) ) {
							int LA26_2 = input.LA(2);
							if ( (synpred64_cspsharp()) ) {
								alt26=1;
							}

						}

						} finally {dbg.exitDecision(26);}

						switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:178:40: '&&' conditionalXorExpression
							{
							dbg.location(178,40);
							match(input,15,FOLLOW_15_in_conditionalAndExpression1778); if (state.failed) return;dbg.location(178,45);
							pushFollow(FOLLOW_conditionalXorExpression_in_conditionalAndExpression1780);
							conditionalXorExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}
					} finally {dbg.exitSubRule(26);}

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
		dbg.location(180, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditionalAndExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditionalAndExpression"



	// $ANTLR start "conditionalXorExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:184:1: conditionalXorExpression : ( 'xor' indexedExpression | bitwiseLogicExpression ( 'xor' bitwiseLogicExpression )* );
	public final void conditionalXorExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "conditionalXorExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(184, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:186:11: ( 'xor' indexedExpression | bitwiseLogicExpression ( 'xor' bitwiseLogicExpression )* )
			int alt29=2;
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==85) ) {
				alt29=1;
			}
			else if ( ((LA29_0 >= ID && LA29_0 <= INT)||LA29_0==10||LA29_0==17||LA29_0==20||LA29_0==23||LA29_0==55||LA29_0==66||LA29_0==76||LA29_0==81) ) {
				alt29=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:186:13: 'xor' indexedExpression
					{
					dbg.location(186,13);
					match(input,85,FOLLOW_85_in_conditionalXorExpression1816); if (state.failed) return;dbg.location(186,19);
					pushFollow(FOLLOW_indexedExpression_in_conditionalXorExpression1818);
					indexedExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:188:13: bitwiseLogicExpression ( 'xor' bitwiseLogicExpression )*
					{
					dbg.location(188,13);
					pushFollow(FOLLOW_bitwiseLogicExpression_in_conditionalXorExpression1833);
					bitwiseLogicExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(188,36);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:188:36: ( 'xor' bitwiseLogicExpression )*
					try { dbg.enterSubRule(28);

					loop28:
					while (true) {
						int alt28=2;
						try { dbg.enterDecision(28, decisionCanBacktrack[28]);

						int LA28_0 = input.LA(1);
						if ( (LA28_0==85) ) {
							alt28=1;
						}

						} finally {dbg.exitDecision(28);}

						switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:188:38: 'xor' bitwiseLogicExpression
							{
							dbg.location(188,38);
							match(input,85,FOLLOW_85_in_conditionalXorExpression1837); if (state.failed) return;dbg.location(188,44);
							pushFollow(FOLLOW_bitwiseLogicExpression_in_conditionalXorExpression1839);
							bitwiseLogicExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop28;
						}
					}
					} finally {dbg.exitSubRule(28);}

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
		dbg.location(190, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditionalXorExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditionalXorExpression"



	// $ANTLR start "indexedExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:194:1: indexedExpression : ( paralDef ( ';' paralDef )* ) '@' expression ;
	public final void indexedExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "indexedExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:17: ( ( paralDef ( ';' paralDef )* ) '@' expression )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:19: ( paralDef ( ';' paralDef )* ) '@' expression
			{
			dbg.location(195,19);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:19: ( paralDef ( ';' paralDef )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:20: paralDef ( ';' paralDef )*
			{
			dbg.location(195,20);
			pushFollow(FOLLOW_paralDef_in_indexedExpression1881);
			paralDef();
			state._fsp--;
			if (state.failed) return;dbg.location(195,29);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:29: ( ';' paralDef )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==31) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:195:30: ';' paralDef
					{
					dbg.location(195,30);
					match(input,31,FOLLOW_31_in_indexedExpression1884); if (state.failed) return;dbg.location(195,34);
					pushFollow(FOLLOW_paralDef_in_indexedExpression1886);
					paralDef();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}

			}
			dbg.location(195,47);
			match(input,43,FOLLOW_43_in_indexedExpression1892); if (state.failed) return;dbg.location(195,51);
			pushFollow(FOLLOW_expression_in_indexedExpression1894);
			expression();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(196, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "indexedExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "indexedExpression"



	// $ANTLR start "bitwiseLogicExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:200:1: bitwiseLogicExpression : equalityExpression ( ( '&' | '|' | '^' ) equalityExpression )* ;
	public final void bitwiseLogicExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "bitwiseLogicExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:201:17: ( equalityExpression ( ( '&' | '|' | '^' ) equalityExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:201:19: equalityExpression ( ( '&' | '|' | '^' ) equalityExpression )*
			{
			dbg.location(201,19);
			pushFollow(FOLLOW_equalityExpression_in_bitwiseLogicExpression1940);
			equalityExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(201,38);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:201:38: ( ( '&' | '|' | '^' ) equalityExpression )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==16||LA31_0==51||LA31_0==87) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:201:40: ( '&' | '|' | '^' ) equalityExpression
					{
					dbg.location(201,40);
					if ( input.LA(1)==16||input.LA(1)==51||input.LA(1)==87 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(201,60);
					pushFollow(FOLLOW_equalityExpression_in_bitwiseLogicExpression1958);
					equalityExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(203, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bitwiseLogicExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "bitwiseLogicExpression"



	// $ANTLR start "equalityExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:207:1: equalityExpression : relationalExpression ( ( '==' | '!=' ) relationalExpression )* ;
	public final void equalityExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "equalityExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:209:13: ( relationalExpression ( ( '==' | '!=' ) relationalExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:209:15: relationalExpression ( ( '==' | '!=' ) relationalExpression )*
			{
			dbg.location(209,15);
			pushFollow(FOLLOW_relationalExpression_in_equalityExpression1996);
			relationalExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(209,36);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:209:36: ( ( '==' | '!=' ) relationalExpression )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==11||LA32_0==39) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:209:38: ( '==' | '!=' ) relationalExpression
					{
					dbg.location(209,38);
					if ( input.LA(1)==11||input.LA(1)==39 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(209,50);
					pushFollow(FOLLOW_relationalExpression_in_equalityExpression2006);
					relationalExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(211, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "equalityExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "equalityExpression"



	// $ANTLR start "relationalExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:215:1: relationalExpression : additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* ;
	public final void relationalExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "relationalExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(215, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:217:13: ( additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:217:15: additiveExpression ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
			{
			dbg.location(217,15);
			pushFollow(FOLLOW_additiveExpression_in_relationalExpression2056);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(217,34);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:217:34: ( ( '<' | '>' | '<=' | '>=' ) additiveExpression )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==32||LA33_0==34||(LA33_0 >= 40 && LA33_0 <= 41)) ) {
					alt33=1;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:217:36: ( '<' | '>' | '<=' | '>=' ) additiveExpression
					{
					dbg.location(217,36);
					if ( input.LA(1)==32||input.LA(1)==34||(input.LA(1) >= 40 && input.LA(1) <= 41) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(217,62);
					pushFollow(FOLLOW_additiveExpression_in_relationalExpression2076);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(219, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relationalExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "relationalExpression"



	// $ANTLR start "additiveExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:223:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
	public final void additiveExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "additiveExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(223, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:225:13: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:225:15: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
			{
			dbg.location(225,15);
			pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2126);
			multiplicativeExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(225,40);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:225:40: ( ( '+' | '-' ) multiplicativeExpression )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				int LA34_0 = input.LA(1);
				if ( (LA34_0==20||LA34_0==23) ) {
					alt34=1;
				}

				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:225:42: ( '+' | '-' ) multiplicativeExpression
					{
					dbg.location(225,42);
					if ( input.LA(1)==20||input.LA(1)==23 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(225,54);
					pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression2138);
					multiplicativeExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(227, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "additiveExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "additiveExpression"



	// $ANTLR start "multiplicativeExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:229:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
	public final void multiplicativeExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "multiplicativeExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(229, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:231:13: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:231:15: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
			{
			dbg.location(231,15);
			pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2175);
			unaryExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(231,31);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:231:31: ( ( '*' | '/' | '%' ) unaryExpression )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=2;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==14||LA35_0==19||LA35_0==28) ) {
					alt35=1;
				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:231:33: ( '*' | '/' | '%' ) unaryExpression
					{
					dbg.location(231,33);
					if ( input.LA(1)==14||input.LA(1)==19||input.LA(1)==28 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(231,52);
					pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression2192);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(233, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multiplicativeExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multiplicativeExpression"



	// $ANTLR start "unaryExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:235:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '!' unaryExpressionNotPlusMinus | unaryExpressionNotPlusMinus ( '++' | '--' )? );
	public final void unaryExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "unaryExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(235, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:237:13: ( '+' unaryExpression | '-' unaryExpression | '!' unaryExpressionNotPlusMinus | unaryExpressionNotPlusMinus ( '++' | '--' )? )
			int alt37=4;
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			switch ( input.LA(1) ) {
			case 20:
				{
				alt37=1;
				}
				break;
			case 23:
				{
				alt37=2;
				}
				break;
			case 10:
				{
				alt37=3;
				}
				break;
			case ID:
			case INT:
			case 17:
			case 55:
			case 66:
			case 76:
			case 81:
				{
				alt37=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:237:15: '+' unaryExpression
					{
					dbg.location(237,15);
					match(input,20,FOLLOW_20_in_unaryExpression2229); if (state.failed) return;dbg.location(237,19);
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression2231);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:239:15: '-' unaryExpression
					{
					dbg.location(239,15);
					match(input,23,FOLLOW_23_in_unaryExpression2248); if (state.failed) return;dbg.location(239,19);
					pushFollow(FOLLOW_unaryExpression_in_unaryExpression2250);
					unaryExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:241:15: '!' unaryExpressionNotPlusMinus
					{
					dbg.location(241,15);
					match(input,10,FOLLOW_10_in_unaryExpression2267); if (state.failed) return;dbg.location(241,19);
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2269);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:243:15: unaryExpressionNotPlusMinus ( '++' | '--' )?
					{
					dbg.location(243,15);
					pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2286);
					unaryExpressionNotPlusMinus();
					state._fsp--;
					if (state.failed) return;dbg.location(243,43);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:243:43: ( '++' | '--' )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==21||LA36_0==24) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:
							{
							dbg.location(243,43);
							if ( input.LA(1)==21||input.LA(1)==24 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								dbg.recognitionException(mse);
								throw mse;
							}
							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

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
		dbg.location(249, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryExpression"



	// $ANTLR start "arrayExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:253:1: arrayExpression : ID ( '[' conditionalOrExpression ']' )+ ;
	public final void arrayExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "arrayExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(253, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:255:12: ( ID ( '[' conditionalOrExpression ']' )+ )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:255:14: ID ( '[' conditionalOrExpression ']' )+
			{
			dbg.location(255,14);
			match(input,ID,FOLLOW_ID_in_arrayExpression2351); if (state.failed) return;dbg.location(255,17);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:255:17: ( '[' conditionalOrExpression ']' )+
			int cnt38=0;
			try { dbg.enterSubRule(38);

			loop38:
			while (true) {
				int alt38=2;
				try { dbg.enterDecision(38, decisionCanBacktrack[38]);

				int LA38_0 = input.LA(1);
				if ( (LA38_0==46) ) {
					alt38=1;
				}

				} finally {dbg.exitDecision(38);}

				switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:255:18: '[' conditionalOrExpression ']'
					{
					dbg.location(255,18);
					match(input,46,FOLLOW_46_in_arrayExpression2354); if (state.failed) return;dbg.location(255,22);
					pushFollow(FOLLOW_conditionalOrExpression_in_arrayExpression2356);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(255,46);
					match(input,50,FOLLOW_50_in_arrayExpression2358); if (state.failed) return;
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(38, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt38++;
			}
			} finally {dbg.exitSubRule(38);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(257, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayExpression"



	// $ANTLR start "unaryExpressionNotPlusMinus"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:261:1: unaryExpressionNotPlusMinus : ( INT | 'true' | 'false' | 'call' '(' ID ( ',' argumentExpression )* ')' | 'new' ID '(' ( argumentExpression ( ',' argumentExpression )* )? ')' |var= ID methods_fields_call |a1= arrayExpression ( methods_fields_call )? | '(' conditionalOrExpression ')' | ID );
	public final void unaryExpressionNotPlusMinus() throws  {
		Token var=null;

		try { dbg.enterRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(261, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:263:11: ( INT | 'true' | 'false' | 'call' '(' ID ( ',' argumentExpression )* ')' | 'new' ID '(' ( argumentExpression ( ',' argumentExpression )* )? ')' |var= ID methods_fields_call |a1= arrayExpression ( methods_fields_call )? | '(' conditionalOrExpression ')' | ID )
			int alt43=9;
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt43=1;
				}
				break;
			case 81:
				{
				alt43=2;
				}
				break;
			case 66:
				{
				alt43=3;
				}
				break;
			case 55:
				{
				alt43=4;
				}
				break;
			case 76:
				{
				alt43=5;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case 26:
					{
					int LA43_8 = input.LA(3);
					if ( (LA43_8==ID) ) {
						int LA43_12 = input.LA(4);
						if ( (LA43_12==17) ) {
							alt43=6;
						}
						else if ( (LA43_12==EOF||LA43_12==11||(LA43_12 >= 13 && LA43_12 <= 16)||(LA43_12 >= 18 && LA43_12 <= 26)||LA43_12==28||LA43_12==32||LA43_12==34||(LA43_12 >= 38 && LA43_12 <= 41)||LA43_12==46||LA43_12==51||(LA43_12 >= 85 && LA43_12 <= 87)||LA43_12==89||LA43_12==91) ) {
							alt43=9;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 43, 12, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA43_8==INT||LA43_8==10||LA43_8==15||LA43_8==17||LA43_8==20||LA43_8==23||LA43_8==55||LA43_8==66||LA43_8==76||LA43_8==81||LA43_8==85||LA43_8==89) ) {
						alt43=9;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 8, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 13:
					{
					alt43=6;
					}
					break;
				case 46:
					{
					alt43=7;
					}
					break;
				case EOF:
				case 11:
				case 14:
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 27:
				case 28:
				case 30:
				case 31:
				case 32:
				case 34:
				case 38:
				case 39:
				case 40:
				case 41:
				case 50:
				case 51:
				case 85:
				case 86:
				case 87:
				case 89:
				case 91:
					{
					alt43=9;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 6, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 17:
				{
				alt43=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:263:13: INT
					{
					dbg.location(263,13);
					match(input,INT,FOLLOW_INT_in_unaryExpressionNotPlusMinus2395); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:264:13: 'true'
					{
					dbg.location(264,13);
					match(input,81,FOLLOW_81_in_unaryExpressionNotPlusMinus2409); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:265:13: 'false'
					{
					dbg.location(265,13);
					match(input,66,FOLLOW_66_in_unaryExpressionNotPlusMinus2424); if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:266:13: 'call' '(' ID ( ',' argumentExpression )* ')'
					{
					dbg.location(266,13);
					match(input,55,FOLLOW_55_in_unaryExpressionNotPlusMinus2440); if (state.failed) return;dbg.location(266,20);
					match(input,17,FOLLOW_17_in_unaryExpressionNotPlusMinus2442); if (state.failed) return;dbg.location(266,24);
					match(input,ID,FOLLOW_ID_in_unaryExpressionNotPlusMinus2444); if (state.failed) return;dbg.location(266,27);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:266:27: ( ',' argumentExpression )*
					try { dbg.enterSubRule(39);

					loop39:
					while (true) {
						int alt39=2;
						try { dbg.enterDecision(39, decisionCanBacktrack[39]);

						int LA39_0 = input.LA(1);
						if ( (LA39_0==22) ) {
							alt39=1;
						}

						} finally {dbg.exitDecision(39);}

						switch (alt39) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:266:28: ',' argumentExpression
							{
							dbg.location(266,28);
							match(input,22,FOLLOW_22_in_unaryExpressionNotPlusMinus2447); if (state.failed) return;dbg.location(266,32);
							pushFollow(FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2449);
							argumentExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop39;
						}
					}
					} finally {dbg.exitSubRule(39);}
					dbg.location(266,53);
					match(input,18,FOLLOW_18_in_unaryExpressionNotPlusMinus2453); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:267:13: 'new' ID '(' ( argumentExpression ( ',' argumentExpression )* )? ')'
					{
					dbg.location(267,13);
					match(input,76,FOLLOW_76_in_unaryExpressionNotPlusMinus2468); if (state.failed) return;dbg.location(267,19);
					match(input,ID,FOLLOW_ID_in_unaryExpressionNotPlusMinus2470); if (state.failed) return;dbg.location(267,22);
					match(input,17,FOLLOW_17_in_unaryExpressionNotPlusMinus2472); if (state.failed) return;dbg.location(267,26);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:267:26: ( argumentExpression ( ',' argumentExpression )* )?
					int alt41=2;
					try { dbg.enterSubRule(41);
					try { dbg.enterDecision(41, decisionCanBacktrack[41]);

					int LA41_0 = input.LA(1);
					if ( ((LA41_0 >= ID && LA41_0 <= INT)||LA41_0==10||LA41_0==15||LA41_0==17||LA41_0==20||LA41_0==23||LA41_0==46||LA41_0==55||LA41_0==66||LA41_0==76||LA41_0==81||LA41_0==85||LA41_0==89) ) {
						alt41=1;
					}
					} finally {dbg.exitDecision(41);}

					switch (alt41) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:267:27: argumentExpression ( ',' argumentExpression )*
							{
							dbg.location(267,27);
							pushFollow(FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2475);
							argumentExpression();
							state._fsp--;
							if (state.failed) return;dbg.location(267,46);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:267:46: ( ',' argumentExpression )*
							try { dbg.enterSubRule(40);

							loop40:
							while (true) {
								int alt40=2;
								try { dbg.enterDecision(40, decisionCanBacktrack[40]);

								int LA40_0 = input.LA(1);
								if ( (LA40_0==22) ) {
									alt40=1;
								}

								} finally {dbg.exitDecision(40);}

								switch (alt40) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:267:47: ',' argumentExpression
									{
									dbg.location(267,47);
									match(input,22,FOLLOW_22_in_unaryExpressionNotPlusMinus2478); if (state.failed) return;dbg.location(267,51);
									pushFollow(FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2480);
									argumentExpression();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop40;
								}
							}
							} finally {dbg.exitSubRule(40);}

							}
							break;

					}
					} finally {dbg.exitSubRule(41);}
					dbg.location(267,74);
					match(input,18,FOLLOW_18_in_unaryExpressionNotPlusMinus2486); if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:268:12: var= ID methods_fields_call
					{
					dbg.location(268,15);
					var=(Token)match(input,ID,FOLLOW_ID_in_unaryExpressionNotPlusMinus2502); if (state.failed) return;dbg.location(268,19);
					pushFollow(FOLLOW_methods_fields_call_in_unaryExpressionNotPlusMinus2504);
					methods_fields_call();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:269:13: a1= arrayExpression ( methods_fields_call )?
					{
					dbg.location(269,15);
					pushFollow(FOLLOW_arrayExpression_in_unaryExpressionNotPlusMinus2521);
					arrayExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(269,32);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:269:32: ( methods_fields_call )?
					int alt42=2;
					try { dbg.enterSubRule(42);
					try { dbg.enterDecision(42, decisionCanBacktrack[42]);

					int LA42_0 = input.LA(1);
					if ( (LA42_0==26) ) {
						int LA42_1 = input.LA(2);
						if ( (LA42_1==ID) ) {
							int LA42_4 = input.LA(3);
							if ( (LA42_4==17) ) {
								alt42=1;
							}
						}
					}
					else if ( (LA42_0==13) ) {
						alt42=1;
					}
					} finally {dbg.exitDecision(42);}

					switch (alt42) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:269:32: methods_fields_call
							{
							dbg.location(269,32);
							pushFollow(FOLLOW_methods_fields_call_in_unaryExpressionNotPlusMinus2523);
							methods_fields_call();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(42);}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:271:13: '(' conditionalOrExpression ')'
					{
					dbg.location(271,13);
					match(input,17,FOLLOW_17_in_unaryExpressionNotPlusMinus2547); if (state.failed) return;dbg.location(271,17);
					pushFollow(FOLLOW_conditionalOrExpression_in_unaryExpressionNotPlusMinus2549);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(271,41);
					match(input,18,FOLLOW_18_in_unaryExpressionNotPlusMinus2551); if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:272:13: ID
					{
					dbg.location(272,13);
					match(input,ID,FOLLOW_ID_in_unaryExpressionNotPlusMinus2565); if (state.failed) return;
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
		dbg.location(274, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unaryExpressionNotPlusMinus");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "unaryExpressionNotPlusMinus"



	// $ANTLR start "methods_fields_call"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:278:1: methods_fields_call : ( '.' method= ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' ) | '$' method= ID );
	public final void methods_fields_call() throws  {
		Token method=null;

		try { dbg.enterRule(getGrammarFileName(), "methods_fields_call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(278, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:16: ( '.' method= ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' ) | '$' method= ID )
			int alt46=2;
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==26) ) {
				alt46=1;
			}
			else if ( (LA46_0==13) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:18: '.' method= ID ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )
					{
					dbg.location(279,18);
					match(input,26,FOLLOW_26_in_methods_fields_call2605); if (state.failed) return;dbg.location(279,28);
					method=(Token)match(input,ID,FOLLOW_ID_in_methods_fields_call2609); if (state.failed) return;dbg.location(279,32);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:32: ( '(' ( argumentExpression ( ',' argumentExpression )* )? ')' )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:33: '(' ( argumentExpression ( ',' argumentExpression )* )? ')'
					{
					dbg.location(279,33);
					match(input,17,FOLLOW_17_in_methods_fields_call2612); if (state.failed) return;dbg.location(279,37);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:37: ( argumentExpression ( ',' argumentExpression )* )?
					int alt45=2;
					try { dbg.enterSubRule(45);
					try { dbg.enterDecision(45, decisionCanBacktrack[45]);

					int LA45_0 = input.LA(1);
					if ( ((LA45_0 >= ID && LA45_0 <= INT)||LA45_0==10||LA45_0==15||LA45_0==17||LA45_0==20||LA45_0==23||LA45_0==46||LA45_0==55||LA45_0==66||LA45_0==76||LA45_0==81||LA45_0==85||LA45_0==89) ) {
						alt45=1;
					}
					} finally {dbg.exitDecision(45);}

					switch (alt45) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:38: argumentExpression ( ',' argumentExpression )*
							{
							dbg.location(279,38);
							pushFollow(FOLLOW_argumentExpression_in_methods_fields_call2615);
							argumentExpression();
							state._fsp--;
							if (state.failed) return;dbg.location(279,57);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:57: ( ',' argumentExpression )*
							try { dbg.enterSubRule(44);

							loop44:
							while (true) {
								int alt44=2;
								try { dbg.enterDecision(44, decisionCanBacktrack[44]);

								int LA44_0 = input.LA(1);
								if ( (LA44_0==22) ) {
									alt44=1;
								}

								} finally {dbg.exitDecision(44);}

								switch (alt44) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:279:58: ',' argumentExpression
									{
									dbg.location(279,58);
									match(input,22,FOLLOW_22_in_methods_fields_call2618); if (state.failed) return;dbg.location(279,62);
									pushFollow(FOLLOW_argumentExpression_in_methods_fields_call2620);
									argumentExpression();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop44;
								}
							}
							} finally {dbg.exitSubRule(44);}

							}
							break;

					}
					} finally {dbg.exitSubRule(45);}
					dbg.location(279,86);
					match(input,18,FOLLOW_18_in_methods_fields_call2627); if (state.failed) return;
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:281:12: '$' method= ID
					{
					dbg.location(281,12);
					match(input,13,FOLLOW_13_in_methods_fields_call2643); if (state.failed) return;dbg.location(281,22);
					method=(Token)match(input,ID,FOLLOW_ID_in_methods_fields_call2647); if (state.failed) return;
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
		dbg.location(283, 9);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "methods_fields_call");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "methods_fields_call"



	// $ANTLR start "letDefintion"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:287:1: letDefintion : ( ( 'var' | 'hvar' ) ( '<' userType= ID '>' )? name= ID ( varaibleRange )? ( '=' ( expression | '*' ) )? ';' | ( 'var' | 'hvar' ) ID '=' recordExpression ';' | ( 'var' | 'hvar' ) ID ( '[' expression ']' )+ ( '=' ( recordExpression | '*' ) )? ';' );
	public final void letDefintion() throws  {
		Token userType=null;
		Token name=null;

		try { dbg.enterRule(getGrammarFileName(), "letDefintion");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(287, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:9: ( ( 'var' | 'hvar' ) ( '<' userType= ID '>' )? name= ID ( varaibleRange )? ( '=' ( expression | '*' ) )? ';' | ( 'var' | 'hvar' ) ID '=' recordExpression ';' | ( 'var' | 'hvar' ) ID ( '[' expression ']' )+ ( '=' ( recordExpression | '*' ) )? ';' )
			int alt54=3;
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			int LA54_0 = input.LA(1);
			if ( (LA54_0==67||LA54_0==82) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==ID) ) {
					switch ( input.LA(3) ) {
					case 38:
						{
						int LA54_4 = input.LA(4);
						if ( (LA54_4==46) ) {
							alt54=2;
						}
						else if ( ((LA54_4 >= ID && LA54_4 <= INT)||LA54_4==10||LA54_4==15||LA54_4==17||(LA54_4 >= 19 && LA54_4 <= 20)||LA54_4==23||LA54_4==55||LA54_4==66||LA54_4==76||LA54_4==81||LA54_4==85||LA54_4==89) ) {
							alt54=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 54, 4, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 46:
						{
						alt54=3;
						}
						break;
					case 30:
					case 31:
						{
						alt54=1;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 54, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA54_1==32) ) {
					alt54=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:11: ( 'var' | 'hvar' ) ( '<' userType= ID '>' )? name= ID ( varaibleRange )? ( '=' ( expression | '*' ) )? ';'
					{
					dbg.location(289,11);
					if ( input.LA(1)==67||input.LA(1)==82 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(289,26);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:26: ( '<' userType= ID '>' )?
					int alt47=2;
					try { dbg.enterSubRule(47);
					try { dbg.enterDecision(47, decisionCanBacktrack[47]);

					int LA47_0 = input.LA(1);
					if ( (LA47_0==32) ) {
						alt47=1;
					}
					} finally {dbg.exitDecision(47);}

					switch (alt47) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:27: '<' userType= ID '>'
							{
							dbg.location(289,27);
							match(input,32,FOLLOW_32_in_letDefintion2688); if (state.failed) return;dbg.location(289,39);
							userType=(Token)match(input,ID,FOLLOW_ID_in_letDefintion2692); if (state.failed) return;dbg.location(289,43);
							match(input,40,FOLLOW_40_in_letDefintion2694); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(47);}
					dbg.location(289,53);
					name=(Token)match(input,ID,FOLLOW_ID_in_letDefintion2700); if (state.failed) return;dbg.location(289,57);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:57: ( varaibleRange )?
					int alt48=2;
					try { dbg.enterSubRule(48);
					try { dbg.enterDecision(48, decisionCanBacktrack[48]);

					int LA48_0 = input.LA(1);
					if ( (LA48_0==30) ) {
						alt48=1;
					}
					} finally {dbg.exitDecision(48);}

					switch (alt48) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:57: varaibleRange
							{
							dbg.location(289,57);
							pushFollow(FOLLOW_varaibleRange_in_letDefintion2702);
							varaibleRange();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(48);}
					dbg.location(289,72);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:72: ( '=' ( expression | '*' ) )?
					int alt50=2;
					try { dbg.enterSubRule(50);
					try { dbg.enterDecision(50, decisionCanBacktrack[50]);

					int LA50_0 = input.LA(1);
					if ( (LA50_0==38) ) {
						alt50=1;
					}
					} finally {dbg.exitDecision(50);}

					switch (alt50) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:73: '=' ( expression | '*' )
							{
							dbg.location(289,73);
							match(input,38,FOLLOW_38_in_letDefintion2706); if (state.failed) return;dbg.location(289,77);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:77: ( expression | '*' )
							int alt49=2;
							try { dbg.enterSubRule(49);
							try { dbg.enterDecision(49, decisionCanBacktrack[49]);

							int LA49_0 = input.LA(1);
							if ( ((LA49_0 >= ID && LA49_0 <= INT)||LA49_0==10||LA49_0==15||LA49_0==17||LA49_0==20||LA49_0==23||LA49_0==55||LA49_0==66||LA49_0==76||LA49_0==81||LA49_0==85||LA49_0==89) ) {
								alt49=1;
							}
							else if ( (LA49_0==19) ) {
								alt49=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 49, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(49);}

							switch (alt49) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:78: expression
									{
									dbg.location(289,78);
									pushFollow(FOLLOW_expression_in_letDefintion2709);
									expression();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:289:89: '*'
									{
									dbg.location(289,89);
									match(input,19,FOLLOW_19_in_letDefintion2711); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(49);}

							}
							break;

					}
					} finally {dbg.exitSubRule(50);}
					dbg.location(289,97);
					match(input,31,FOLLOW_31_in_letDefintion2717); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:291:11: ( 'var' | 'hvar' ) ID '=' recordExpression ';'
					{
					dbg.location(291,11);
					if ( input.LA(1)==67||input.LA(1)==82 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(291,26);
					match(input,ID,FOLLOW_ID_in_letDefintion2737); if (state.failed) return;dbg.location(291,54);
					match(input,38,FOLLOW_38_in_letDefintion2741); if (state.failed) return;dbg.location(291,58);
					pushFollow(FOLLOW_recordExpression_in_letDefintion2743);
					recordExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(291,75);
					match(input,31,FOLLOW_31_in_letDefintion2745); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:10: ( 'var' | 'hvar' ) ID ( '[' expression ']' )+ ( '=' ( recordExpression | '*' ) )? ';'
					{
					dbg.location(293,10);
					if ( input.LA(1)==67||input.LA(1)==82 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(293,25);
					match(input,ID,FOLLOW_ID_in_letDefintion2763); if (state.failed) return;dbg.location(293,28);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:28: ( '[' expression ']' )+
					int cnt51=0;
					try { dbg.enterSubRule(51);

					loop51:
					while (true) {
						int alt51=2;
						try { dbg.enterDecision(51, decisionCanBacktrack[51]);

						int LA51_0 = input.LA(1);
						if ( (LA51_0==46) ) {
							alt51=1;
						}

						} finally {dbg.exitDecision(51);}

						switch (alt51) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:29: '[' expression ']'
							{
							dbg.location(293,29);
							match(input,46,FOLLOW_46_in_letDefintion2766); if (state.failed) return;dbg.location(293,33);
							pushFollow(FOLLOW_expression_in_letDefintion2768);
							expression();
							state._fsp--;
							if (state.failed) return;dbg.location(293,44);
							match(input,50,FOLLOW_50_in_letDefintion2770); if (state.failed) return;
							}
							break;

						default :
							if ( cnt51 >= 1 ) break loop51;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(51, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt51++;
					}
					} finally {dbg.exitSubRule(51);}
					dbg.location(293,75);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:75: ( '=' ( recordExpression | '*' ) )?
					int alt53=2;
					try { dbg.enterSubRule(53);
					try { dbg.enterDecision(53, decisionCanBacktrack[53]);

					int LA53_0 = input.LA(1);
					if ( (LA53_0==38) ) {
						alt53=1;
					}
					} finally {dbg.exitDecision(53);}

					switch (alt53) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:76: '=' ( recordExpression | '*' )
							{
							dbg.location(293,76);
							match(input,38,FOLLOW_38_in_letDefintion2777); if (state.failed) return;dbg.location(293,80);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:80: ( recordExpression | '*' )
							int alt52=2;
							try { dbg.enterSubRule(52);
							try { dbg.enterDecision(52, decisionCanBacktrack[52]);

							int LA52_0 = input.LA(1);
							if ( (LA52_0==46) ) {
								alt52=1;
							}
							else if ( (LA52_0==19) ) {
								alt52=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 52, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(52);}

							switch (alt52) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:81: recordExpression
									{
									dbg.location(293,81);
									pushFollow(FOLLOW_recordExpression_in_letDefintion2780);
									recordExpression();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:293:98: '*'
									{
									dbg.location(293,98);
									match(input,19,FOLLOW_19_in_letDefintion2782); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(52);}

							}
							break;

					}
					} finally {dbg.exitSubRule(53);}
					dbg.location(293,106);
					match(input,31,FOLLOW_31_in_letDefintion2788); if (state.failed) return;
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
		dbg.location(295, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "letDefintion");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "letDefintion"



	// $ANTLR start "varaibleRange"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:299:1: varaibleRange : ':' '{' ( additiveExpression )? '..' ( additiveExpression )? '}' ;
	public final void varaibleRange() throws  {
		try { dbg.enterRule(getGrammarFileName(), "varaibleRange");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(299, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:15: ( ':' '{' ( additiveExpression )? '..' ( additiveExpression )? '}' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:17: ':' '{' ( additiveExpression )? '..' ( additiveExpression )? '}'
			{
			dbg.location(300,17);
			match(input,30,FOLLOW_30_in_varaibleRange2824); if (state.failed) return;dbg.location(300,21);
			match(input,86,FOLLOW_86_in_varaibleRange2826); if (state.failed) return;dbg.location(300,25);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:25: ( additiveExpression )?
			int alt55=2;
			try { dbg.enterSubRule(55);
			try { dbg.enterDecision(55, decisionCanBacktrack[55]);

			int LA55_0 = input.LA(1);
			if ( ((LA55_0 >= ID && LA55_0 <= INT)||LA55_0==10||LA55_0==17||LA55_0==20||LA55_0==23||LA55_0==55||LA55_0==66||LA55_0==76||LA55_0==81) ) {
				alt55=1;
			}
			} finally {dbg.exitDecision(55);}

			switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:26: additiveExpression
					{
					dbg.location(300,26);
					pushFollow(FOLLOW_additiveExpression_in_varaibleRange2829);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(300,47);
			match(input,27,FOLLOW_27_in_varaibleRange2833); if (state.failed) return;dbg.location(300,52);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:52: ( additiveExpression )?
			int alt56=2;
			try { dbg.enterSubRule(56);
			try { dbg.enterDecision(56, decisionCanBacktrack[56]);

			int LA56_0 = input.LA(1);
			if ( ((LA56_0 >= ID && LA56_0 <= INT)||LA56_0==10||LA56_0==17||LA56_0==20||LA56_0==23||LA56_0==55||LA56_0==66||LA56_0==76||LA56_0==81) ) {
				alt56=1;
			}
			} finally {dbg.exitDecision(56);}

			switch (alt56) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:300:53: additiveExpression
					{
					dbg.location(300,53);
					pushFollow(FOLLOW_additiveExpression_in_varaibleRange2836);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(56);}
			dbg.location(300,74);
			match(input,91,FOLLOW_91_in_varaibleRange2840); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(301, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varaibleRange");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "varaibleRange"



	// $ANTLR start "argumentExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:305:1: argumentExpression : ( conditionalOrExpression | recordExpression );
	public final void argumentExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "argumentExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(305, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:306:14: ( conditionalOrExpression | recordExpression )
			int alt57=2;
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( ((LA57_0 >= ID && LA57_0 <= INT)||LA57_0==10||LA57_0==15||LA57_0==17||LA57_0==20||LA57_0==23||LA57_0==55||LA57_0==66||LA57_0==76||LA57_0==81||LA57_0==85||LA57_0==89) ) {
				alt57=1;
			}
			else if ( (LA57_0==46) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:306:16: conditionalOrExpression
					{
					dbg.location(306,16);
					pushFollow(FOLLOW_conditionalOrExpression_in_argumentExpression2893);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:308:10: recordExpression
					{
					dbg.location(308,10);
					pushFollow(FOLLOW_recordExpression_in_argumentExpression2905);
					recordExpression();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(309, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "argumentExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "argumentExpression"



	// $ANTLR start "ifExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:315:1: ifExpression : 'if' '(' expression ')' statement ( 'else' statement )? ;
	public final void ifExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "ifExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(315, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:8: ( 'if' '(' expression ')' statement ( 'else' statement )? )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:11: 'if' '(' expression ')' statement ( 'else' statement )?
			{
			dbg.location(317,11);
			match(input,68,FOLLOW_68_in_ifExpression2954); if (state.failed) return;dbg.location(317,16);
			match(input,17,FOLLOW_17_in_ifExpression2956); if (state.failed) return;dbg.location(317,20);
			pushFollow(FOLLOW_expression_in_ifExpression2958);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(317,31);
			match(input,18,FOLLOW_18_in_ifExpression2960); if (state.failed) return;dbg.location(317,35);
			pushFollow(FOLLOW_statement_in_ifExpression2962);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(317,45);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:45: ( 'else' statement )?
			int alt58=2;
			try { dbg.enterSubRule(58);
			try { dbg.enterDecision(58, decisionCanBacktrack[58]);

			int LA58_0 = input.LA(1);
			if ( (LA58_0==64) ) {
				int LA58_1 = input.LA(2);
				if ( (synpred118_cspsharp()) ) {
					alt58=1;
				}
			}
			} finally {dbg.exitDecision(58);}

			switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:46: 'else' statement
					{
					dbg.location(317,46);
					match(input,64,FOLLOW_64_in_ifExpression2965); if (state.failed) return;dbg.location(317,53);
					pushFollow(FOLLOW_statement_in_ifExpression2967);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(58);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(319, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifExpression"



	// $ANTLR start "whileExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:323:1: whileExpression : 'while' '(' expression ')' statement ;
	public final void whileExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "whileExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(323, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:325:7: ( 'while' '(' expression ')' statement )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:325:9: 'while' '(' expression ')' statement
			{
			dbg.location(325,9);
			match(input,83,FOLLOW_83_in_whileExpression3007); if (state.failed) return;dbg.location(325,17);
			match(input,17,FOLLOW_17_in_whileExpression3009); if (state.failed) return;dbg.location(325,21);
			pushFollow(FOLLOW_expression_in_whileExpression3011);
			expression();
			state._fsp--;
			if (state.failed) return;dbg.location(325,32);
			match(input,18,FOLLOW_18_in_whileExpression3013); if (state.failed) return;dbg.location(325,36);
			pushFollow(FOLLOW_statement_in_whileExpression3015);
			statement();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(327, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "whileExpression"



	// $ANTLR start "recordExpression"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:331:1: recordExpression : '[' recordElement ( ',' recordElement )* ']' ;
	public final void recordExpression() throws  {
		try { dbg.enterRule(getGrammarFileName(), "recordExpression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(331, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:333:7: ( '[' recordElement ( ',' recordElement )* ']' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:333:9: '[' recordElement ( ',' recordElement )* ']'
			{
			dbg.location(333,9);
			match(input,46,FOLLOW_46_in_recordExpression3041); if (state.failed) return;dbg.location(333,13);
			pushFollow(FOLLOW_recordElement_in_recordExpression3043);
			recordElement();
			state._fsp--;
			if (state.failed) return;dbg.location(333,27);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:333:27: ( ',' recordElement )*
			try { dbg.enterSubRule(59);

			loop59:
			while (true) {
				int alt59=2;
				try { dbg.enterDecision(59, decisionCanBacktrack[59]);

				int LA59_0 = input.LA(1);
				if ( (LA59_0==22) ) {
					alt59=1;
				}

				} finally {dbg.exitDecision(59);}

				switch (alt59) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:333:28: ',' recordElement
					{
					dbg.location(333,28);
					match(input,22,FOLLOW_22_in_recordExpression3046); if (state.failed) return;dbg.location(333,32);
					pushFollow(FOLLOW_recordElement_in_recordExpression3048);
					recordElement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop59;
				}
			}
			} finally {dbg.exitSubRule(59);}
			dbg.location(333,48);
			match(input,50,FOLLOW_50_in_recordExpression3052); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(335, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "recordExpression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "recordExpression"



	// $ANTLR start "recordElement"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:339:1: recordElement : ( ( expression ( '(' e2= expression ')' )? )=>e1= expression ( '(' e2= expression ')' )? |e1= expression '..' e2= expression );
	public final void recordElement() throws  {
		try { dbg.enterRule(getGrammarFileName(), "recordElement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(339, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:6: ( ( expression ( '(' e2= expression ')' )? )=>e1= expression ( '(' e2= expression ')' )? |e1= expression '..' e2= expression )
			int alt61=2;
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			switch ( input.LA(1) ) {
			case 89:
				{
				int LA61_1 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 15:
				{
				int LA61_2 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 85:
				{
				int LA61_3 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 20:
				{
				int LA61_4 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 23:
				{
				int LA61_5 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 10:
				{
				int LA61_6 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case INT:
				{
				int LA61_7 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 81:
				{
				int LA61_8 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 66:
				{
				int LA61_9 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 55:
				{
				int LA61_10 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 76:
				{
				int LA61_11 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case ID:
				{
				int LA61_12 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			case 17:
				{
				int LA61_13 = input.LA(2);
				if ( (synpred121_cspsharp()) ) {
					alt61=1;
				}
				else if ( (true) ) {
					alt61=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:8: ( expression ( '(' e2= expression ')' )? )=>e1= expression ( '(' e2= expression ')' )?
					{
					dbg.location(341,51);
					pushFollow(FOLLOW_expression_in_recordElement3096);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(341,63);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:63: ( '(' e2= expression ')' )?
					int alt60=2;
					try { dbg.enterSubRule(60);
					try { dbg.enterDecision(60, decisionCanBacktrack[60]);

					int LA60_0 = input.LA(1);
					if ( (LA60_0==17) ) {
						alt60=1;
					}
					} finally {dbg.exitDecision(60);}

					switch (alt60) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:64: '(' e2= expression ')'
							{
							dbg.location(341,64);
							match(input,17,FOLLOW_17_in_recordElement3099); if (state.failed) return;dbg.location(341,70);
							pushFollow(FOLLOW_expression_in_recordElement3103);
							expression();
							state._fsp--;
							if (state.failed) return;dbg.location(341,82);
							match(input,18,FOLLOW_18_in_recordElement3105); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(60);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:343:8: e1= expression '..' e2= expression
					{
					dbg.location(343,10);
					pushFollow(FOLLOW_expression_in_recordElement3120);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(343,22);
					match(input,27,FOLLOW_27_in_recordElement3122); if (state.failed) return;dbg.location(343,29);
					pushFollow(FOLLOW_expression_in_recordElement3126);
					expression();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(345, 5);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "recordElement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "recordElement"



	// $ANTLR start "definition"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:349:1: definition : ID ( '(' ( parameter ( ',' parameter )* )? ')' )? '=' interleaveExpr ';' ;
	public final void definition() throws  {
		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(349, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:13: ( ID ( '(' ( parameter ( ',' parameter )* )? ')' )? '=' interleaveExpr ';' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:15: ID ( '(' ( parameter ( ',' parameter )* )? ')' )? '=' interleaveExpr ';'
			{
			dbg.location(351,15);
			match(input,ID,FOLLOW_ID_in_definition3157); if (state.failed) return;dbg.location(351,18);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:18: ( '(' ( parameter ( ',' parameter )* )? ')' )?
			int alt64=2;
			try { dbg.enterSubRule(64);
			try { dbg.enterDecision(64, decisionCanBacktrack[64]);

			int LA64_0 = input.LA(1);
			if ( (LA64_0==17) ) {
				alt64=1;
			}
			} finally {dbg.exitDecision(64);}

			switch (alt64) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:19: '(' ( parameter ( ',' parameter )* )? ')'
					{
					dbg.location(351,19);
					match(input,17,FOLLOW_17_in_definition3160); if (state.failed) return;dbg.location(351,23);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:23: ( parameter ( ',' parameter )* )?
					int alt63=2;
					try { dbg.enterSubRule(63);
					try { dbg.enterDecision(63, decisionCanBacktrack[63]);

					int LA63_0 = input.LA(1);
					if ( (LA63_0==ID) ) {
						alt63=1;
					}
					} finally {dbg.exitDecision(63);}

					switch (alt63) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:24: parameter ( ',' parameter )*
							{
							dbg.location(351,24);
							pushFollow(FOLLOW_parameter_in_definition3163);
							parameter();
							state._fsp--;
							if (state.failed) return;dbg.location(351,33);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:33: ( ',' parameter )*
							try { dbg.enterSubRule(62);

							loop62:
							while (true) {
								int alt62=2;
								try { dbg.enterDecision(62, decisionCanBacktrack[62]);

								int LA62_0 = input.LA(1);
								if ( (LA62_0==22) ) {
									alt62=1;
								}

								} finally {dbg.exitDecision(62);}

								switch (alt62) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:351:34: ',' parameter
									{
									dbg.location(351,34);
									match(input,22,FOLLOW_22_in_definition3165); if (state.failed) return;dbg.location(351,38);
									pushFollow(FOLLOW_parameter_in_definition3167);
									parameter();
									state._fsp--;
									if (state.failed) return;
									}
									break;

								default :
									break loop62;
								}
							}
							} finally {dbg.exitSubRule(62);}

							}
							break;

					}
					} finally {dbg.exitSubRule(63);}
					dbg.location(351,52);
					match(input,18,FOLLOW_18_in_definition3173); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(64);}
			dbg.location(351,58);
			match(input,38,FOLLOW_38_in_definition3177); if (state.failed) return;dbg.location(351,62);
			pushFollow(FOLLOW_interleaveExpr_in_definition3179);
			interleaveExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(351,77);
			match(input,31,FOLLOW_31_in_definition3181); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(353, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definition"



	// $ANTLR start "parameter"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:357:1: parameter : ID ( varaibleRange )? ;
	public final void parameter() throws  {
		try { dbg.enterRule(getGrammarFileName(), "parameter");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(357, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:358:19: ( ID ( varaibleRange )? )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:358:21: ID ( varaibleRange )?
			{
			dbg.location(358,21);
			match(input,ID,FOLLOW_ID_in_parameter3225); if (state.failed) return;dbg.location(358,24);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:358:24: ( varaibleRange )?
			int alt65=2;
			try { dbg.enterSubRule(65);
			try { dbg.enterDecision(65, decisionCanBacktrack[65]);

			int LA65_0 = input.LA(1);
			if ( (LA65_0==30) ) {
				alt65=1;
			}
			} finally {dbg.exitDecision(65);}

			switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:358:24: varaibleRange
					{
					dbg.location(358,24);
					pushFollow(FOLLOW_varaibleRange_in_parameter3227);
					varaibleRange();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(65);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(360, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parameter");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parameter"



	// $ANTLR start "interleaveExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:364:1: interleaveExpr : ( parallelExpr ( '|||' parallelExpr )* | '|||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr | '|||' paralDef2 '@' interleaveExpr );
	public final void interleaveExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "interleaveExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(364, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:13: ( parallelExpr ( '|||' parallelExpr )* | '|||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr | '|||' paralDef2 '@' interleaveExpr )
			int alt68=3;
			try { dbg.enterDecision(68, decisionCanBacktrack[68]);

			int LA68_0 = input.LA(1);
			if ( (LA68_0==35||(LA68_0 >= 47 && LA68_0 <= 48)||LA68_0==58||LA68_0==89) ) {
				alt68=1;
			}
			else if ( (LA68_0==90) ) {
				int LA68_2 = input.LA(2);
				if ( (LA68_2==ID) ) {
					alt68=2;
				}
				else if ( (LA68_2==86) ) {
					alt68=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(68);}

			switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:15: parallelExpr ( '|||' parallelExpr )*
					{
					dbg.location(366,15);
					pushFollow(FOLLOW_parallelExpr_in_interleaveExpr3277);
					parallelExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(366,28);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:28: ( '|||' parallelExpr )*
					try { dbg.enterSubRule(66);

					loop66:
					while (true) {
						int alt66=2;
						try { dbg.enterDecision(66, decisionCanBacktrack[66]);

						int LA66_0 = input.LA(1);
						if ( (LA66_0==90) ) {
							int LA66_2 = input.LA(2);
							if ( (synpred127_cspsharp()) ) {
								alt66=1;
							}

						}

						} finally {dbg.exitDecision(66);}

						switch (alt66) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:29: '|||' parallelExpr
							{
							dbg.location(366,29);
							match(input,90,FOLLOW_90_in_interleaveExpr3280); if (state.failed) return;dbg.location(366,35);
							pushFollow(FOLLOW_parallelExpr_in_interleaveExpr3282);
							parallelExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop66;
						}
					}
					} finally {dbg.exitSubRule(66);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:368:15: '|||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr
					{
					dbg.location(368,15);
					match(input,90,FOLLOW_90_in_interleaveExpr3321); if (state.failed) return;dbg.location(368,21);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:368:21: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:368:22: paralDef ( ';' paralDef )*
					{
					dbg.location(368,22);
					pushFollow(FOLLOW_paralDef_in_interleaveExpr3324);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(368,31);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:368:31: ( ';' paralDef )*
					try { dbg.enterSubRule(67);

					loop67:
					while (true) {
						int alt67=2;
						try { dbg.enterDecision(67, decisionCanBacktrack[67]);

						int LA67_0 = input.LA(1);
						if ( (LA67_0==31) ) {
							alt67=1;
						}

						} finally {dbg.exitDecision(67);}

						switch (alt67) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:368:32: ';' paralDef
							{
							dbg.location(368,32);
							match(input,31,FOLLOW_31_in_interleaveExpr3327); if (state.failed) return;dbg.location(368,36);
							pushFollow(FOLLOW_paralDef_in_interleaveExpr3329);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop67;
						}
					}
					} finally {dbg.exitSubRule(67);}

					}
					dbg.location(368,49);
					match(input,43,FOLLOW_43_in_interleaveExpr3335); if (state.failed) return;dbg.location(368,53);
					pushFollow(FOLLOW_interleaveExpr_in_interleaveExpr3337);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:370:15: '|||' paralDef2 '@' interleaveExpr
					{
					dbg.location(370,15);
					match(input,90,FOLLOW_90_in_interleaveExpr3354); if (state.failed) return;dbg.location(370,21);
					pushFollow(FOLLOW_paralDef2_in_interleaveExpr3356);
					paralDef2();
					state._fsp--;
					if (state.failed) return;dbg.location(370,31);
					match(input,43,FOLLOW_43_in_interleaveExpr3358); if (state.failed) return;dbg.location(370,35);
					pushFollow(FOLLOW_interleaveExpr_in_interleaveExpr3360);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(372, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "interleaveExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "interleaveExpr"



	// $ANTLR start "parallelExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:376:1: parallelExpr : ( generalChoiceExpr ( '||' generalChoiceExpr )* | '||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr );
	public final void parallelExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "parallelExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(376, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:13: ( generalChoiceExpr ( '||' generalChoiceExpr )* | '||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr )
			int alt71=2;
			try { dbg.enterDecision(71, decisionCanBacktrack[71]);

			int LA71_0 = input.LA(1);
			if ( (LA71_0==35||(LA71_0 >= 47 && LA71_0 <= 48)||LA71_0==58) ) {
				alt71=1;
			}
			else if ( (LA71_0==89) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(71);}

			switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:15: generalChoiceExpr ( '||' generalChoiceExpr )*
					{
					dbg.location(378,15);
					pushFollow(FOLLOW_generalChoiceExpr_in_parallelExpr3419);
					generalChoiceExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(378,33);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:33: ( '||' generalChoiceExpr )*
					try { dbg.enterSubRule(69);

					loop69:
					while (true) {
						int alt69=2;
						try { dbg.enterDecision(69, decisionCanBacktrack[69]);

						int LA69_0 = input.LA(1);
						if ( (LA69_0==89) ) {
							int LA69_2 = input.LA(2);
							if ( (synpred131_cspsharp()) ) {
								alt69=1;
							}

						}

						} finally {dbg.exitDecision(69);}

						switch (alt69) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:34: '||' generalChoiceExpr
							{
							dbg.location(378,34);
							match(input,89,FOLLOW_89_in_parallelExpr3422); if (state.failed) return;dbg.location(378,39);
							pushFollow(FOLLOW_generalChoiceExpr_in_parallelExpr3424);
							generalChoiceExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop69;
						}
					}
					} finally {dbg.exitSubRule(69);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:380:15: '||' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr
					{
					dbg.location(380,15);
					match(input,89,FOLLOW_89_in_parallelExpr3443); if (state.failed) return;dbg.location(380,20);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:380:20: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:380:21: paralDef ( ';' paralDef )*
					{
					dbg.location(380,21);
					pushFollow(FOLLOW_paralDef_in_parallelExpr3446);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(380,30);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:380:30: ( ';' paralDef )*
					try { dbg.enterSubRule(70);

					loop70:
					while (true) {
						int alt70=2;
						try { dbg.enterDecision(70, decisionCanBacktrack[70]);

						int LA70_0 = input.LA(1);
						if ( (LA70_0==31) ) {
							alt70=1;
						}

						} finally {dbg.exitDecision(70);}

						switch (alt70) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:380:31: ';' paralDef
							{
							dbg.location(380,31);
							match(input,31,FOLLOW_31_in_parallelExpr3449); if (state.failed) return;dbg.location(380,35);
							pushFollow(FOLLOW_paralDef_in_parallelExpr3451);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop70;
						}
					}
					} finally {dbg.exitSubRule(70);}

					}
					dbg.location(380,48);
					match(input,43,FOLLOW_43_in_parallelExpr3457); if (state.failed) return;dbg.location(380,52);
					pushFollow(FOLLOW_interleaveExpr_in_parallelExpr3459);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(382, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parallelExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parallelExpr"



	// $ANTLR start "paralDef"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:386:1: paralDef : ID ':' '{' additiveExpression ( ( ',' additiveExpression )* | '..' additiveExpression ) '}' ;
	public final void paralDef() throws  {
		try { dbg.enterRule(getGrammarFileName(), "paralDef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(386, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:13: ( ID ':' '{' additiveExpression ( ( ',' additiveExpression )* | '..' additiveExpression ) '}' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:15: ID ':' '{' additiveExpression ( ( ',' additiveExpression )* | '..' additiveExpression ) '}'
			{
			dbg.location(388,15);
			match(input,ID,FOLLOW_ID_in_paralDef3509); if (state.failed) return;dbg.location(388,18);
			match(input,30,FOLLOW_30_in_paralDef3511); if (state.failed) return;dbg.location(388,22);
			match(input,86,FOLLOW_86_in_paralDef3513); if (state.failed) return;dbg.location(388,26);
			pushFollow(FOLLOW_additiveExpression_in_paralDef3515);
			additiveExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(388,45);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:45: ( ( ',' additiveExpression )* | '..' additiveExpression )
			int alt73=2;
			try { dbg.enterSubRule(73);
			try { dbg.enterDecision(73, decisionCanBacktrack[73]);

			int LA73_0 = input.LA(1);
			if ( (LA73_0==22||LA73_0==91) ) {
				alt73=1;
			}
			else if ( (LA73_0==27) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(73);}

			switch (alt73) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:46: ( ',' additiveExpression )*
					{
					dbg.location(388,46);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:46: ( ',' additiveExpression )*
					try { dbg.enterSubRule(72);

					loop72:
					while (true) {
						int alt72=2;
						try { dbg.enterDecision(72, decisionCanBacktrack[72]);

						int LA72_0 = input.LA(1);
						if ( (LA72_0==22) ) {
							alt72=1;
						}

						} finally {dbg.exitDecision(72);}

						switch (alt72) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:47: ',' additiveExpression
							{
							dbg.location(388,47);
							match(input,22,FOLLOW_22_in_paralDef3519); if (state.failed) return;dbg.location(388,51);
							pushFollow(FOLLOW_additiveExpression_in_paralDef3521);
							additiveExpression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop72;
						}
					}
					} finally {dbg.exitSubRule(72);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:388:74: '..' additiveExpression
					{
					dbg.location(388,74);
					match(input,27,FOLLOW_27_in_paralDef3527); if (state.failed) return;dbg.location(388,79);
					pushFollow(FOLLOW_additiveExpression_in_paralDef3529);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(73);}
			dbg.location(388,100);
			match(input,91,FOLLOW_91_in_paralDef3533); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(392, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paralDef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paralDef"



	// $ANTLR start "paralDef2"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:396:1: paralDef2 : ( '{' '..' '}' | '{' additiveExpression '}' );
	public final void paralDef2() throws  {
		try { dbg.enterRule(getGrammarFileName(), "paralDef2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(396, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:398:13: ( '{' '..' '}' | '{' additiveExpression '}' )
			int alt74=2;
			try { dbg.enterDecision(74, decisionCanBacktrack[74]);

			int LA74_0 = input.LA(1);
			if ( (LA74_0==86) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==27) ) {
					alt74=1;
				}
				else if ( ((LA74_1 >= ID && LA74_1 <= INT)||LA74_1==10||LA74_1==17||LA74_1==20||LA74_1==23||LA74_1==55||LA74_1==66||LA74_1==76||LA74_1==81) ) {
					alt74=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(74);}

			switch (alt74) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:398:15: '{' '..' '}'
					{
					dbg.location(398,15);
					match(input,86,FOLLOW_86_in_paralDef23618); if (state.failed) return;dbg.location(398,19);
					match(input,27,FOLLOW_27_in_paralDef23620); if (state.failed) return;dbg.location(398,24);
					match(input,91,FOLLOW_91_in_paralDef23622); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:400:15: '{' additiveExpression '}'
					{
					dbg.location(400,15);
					match(input,86,FOLLOW_86_in_paralDef23639); if (state.failed) return;dbg.location(400,19);
					pushFollow(FOLLOW_additiveExpression_in_paralDef23641);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(400,38);
					match(input,91,FOLLOW_91_in_paralDef23643); if (state.failed) return;
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
		dbg.location(402, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "paralDef2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "paralDef2"



	// $ANTLR start "generalChoiceExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:406:1: generalChoiceExpr : ( internalChoiceExpr ( '[]' internalChoiceExpr )* | '[]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr );
	public final void generalChoiceExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "generalChoiceExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(406, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:13: ( internalChoiceExpr ( '[]' internalChoiceExpr )* | '[]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr )
			int alt77=2;
			try { dbg.enterDecision(77, decisionCanBacktrack[77]);

			int LA77_0 = input.LA(1);
			if ( (LA77_0==35||LA77_0==47||LA77_0==58) ) {
				alt77=1;
			}
			else if ( (LA77_0==48) ) {
				alt77=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(77);}

			switch (alt77) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:15: internalChoiceExpr ( '[]' internalChoiceExpr )*
					{
					dbg.location(408,15);
					pushFollow(FOLLOW_internalChoiceExpr_in_generalChoiceExpr3681);
					internalChoiceExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(408,33);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:33: ( '[]' internalChoiceExpr )*
					try { dbg.enterSubRule(75);

					loop75:
					while (true) {
						int alt75=2;
						try { dbg.enterDecision(75, decisionCanBacktrack[75]);

						int LA75_0 = input.LA(1);
						if ( (LA75_0==48) ) {
							int LA75_2 = input.LA(2);
							if ( (synpred137_cspsharp()) ) {
								alt75=1;
							}

						}

						} finally {dbg.exitDecision(75);}

						switch (alt75) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:34: '[]' internalChoiceExpr
							{
							dbg.location(408,34);
							match(input,48,FOLLOW_48_in_generalChoiceExpr3683); if (state.failed) return;dbg.location(408,39);
							pushFollow(FOLLOW_internalChoiceExpr_in_generalChoiceExpr3685);
							internalChoiceExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop75;
						}
					}
					} finally {dbg.exitSubRule(75);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:410:15: '[]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr
					{
					dbg.location(410,15);
					match(input,48,FOLLOW_48_in_generalChoiceExpr3704); if (state.failed) return;dbg.location(410,20);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:410:20: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:410:21: paralDef ( ';' paralDef )*
					{
					dbg.location(410,21);
					pushFollow(FOLLOW_paralDef_in_generalChoiceExpr3707);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(410,30);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:410:30: ( ';' paralDef )*
					try { dbg.enterSubRule(76);

					loop76:
					while (true) {
						int alt76=2;
						try { dbg.enterDecision(76, decisionCanBacktrack[76]);

						int LA76_0 = input.LA(1);
						if ( (LA76_0==31) ) {
							alt76=1;
						}

						} finally {dbg.exitDecision(76);}

						switch (alt76) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:410:31: ';' paralDef
							{
							dbg.location(410,31);
							match(input,31,FOLLOW_31_in_generalChoiceExpr3710); if (state.failed) return;dbg.location(410,35);
							pushFollow(FOLLOW_paralDef_in_generalChoiceExpr3712);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop76;
						}
					}
					} finally {dbg.exitSubRule(76);}

					}
					dbg.location(410,48);
					match(input,43,FOLLOW_43_in_generalChoiceExpr3718); if (state.failed) return;dbg.location(410,52);
					pushFollow(FOLLOW_interleaveExpr_in_generalChoiceExpr3720);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(412, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "generalChoiceExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "generalChoiceExpr"



	// $ANTLR start "internalChoiceExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:416:1: internalChoiceExpr : ( externalChoiceExpr ( '<>' externalChoiceExpr )* | '<>' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr );
	public final void internalChoiceExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "internalChoiceExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(416, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:13: ( externalChoiceExpr ( '<>' externalChoiceExpr )* | '<>' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr )
			int alt80=2;
			try { dbg.enterDecision(80, decisionCanBacktrack[80]);

			int LA80_0 = input.LA(1);
			if ( (LA80_0==47||LA80_0==58) ) {
				alt80=1;
			}
			else if ( (LA80_0==35) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(80);}

			switch (alt80) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:15: externalChoiceExpr ( '<>' externalChoiceExpr )*
					{
					dbg.location(418,15);
					pushFollow(FOLLOW_externalChoiceExpr_in_internalChoiceExpr3771);
					externalChoiceExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(418,34);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:34: ( '<>' externalChoiceExpr )*
					try { dbg.enterSubRule(78);

					loop78:
					while (true) {
						int alt78=2;
						try { dbg.enterDecision(78, decisionCanBacktrack[78]);

						int LA78_0 = input.LA(1);
						if ( (LA78_0==35) ) {
							int LA78_2 = input.LA(2);
							if ( (synpred140_cspsharp()) ) {
								alt78=1;
							}

						}

						} finally {dbg.exitDecision(78);}

						switch (alt78) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:35: '<>' externalChoiceExpr
							{
							dbg.location(418,35);
							match(input,35,FOLLOW_35_in_internalChoiceExpr3774); if (state.failed) return;dbg.location(418,40);
							pushFollow(FOLLOW_externalChoiceExpr_in_internalChoiceExpr3776);
							externalChoiceExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop78;
						}
					}
					} finally {dbg.exitSubRule(78);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:420:15: '<>' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr
					{
					dbg.location(420,15);
					match(input,35,FOLLOW_35_in_internalChoiceExpr3795); if (state.failed) return;dbg.location(420,20);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:420:20: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:420:21: paralDef ( ';' paralDef )*
					{
					dbg.location(420,21);
					pushFollow(FOLLOW_paralDef_in_internalChoiceExpr3798);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(420,30);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:420:30: ( ';' paralDef )*
					try { dbg.enterSubRule(79);

					loop79:
					while (true) {
						int alt79=2;
						try { dbg.enterDecision(79, decisionCanBacktrack[79]);

						int LA79_0 = input.LA(1);
						if ( (LA79_0==31) ) {
							alt79=1;
						}

						} finally {dbg.exitDecision(79);}

						switch (alt79) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:420:31: ';' paralDef
							{
							dbg.location(420,31);
							match(input,31,FOLLOW_31_in_internalChoiceExpr3801); if (state.failed) return;dbg.location(420,35);
							pushFollow(FOLLOW_paralDef_in_internalChoiceExpr3803);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop79;
						}
					}
					} finally {dbg.exitSubRule(79);}

					}
					dbg.location(420,48);
					match(input,43,FOLLOW_43_in_internalChoiceExpr3809); if (state.failed) return;dbg.location(420,52);
					pushFollow(FOLLOW_interleaveExpr_in_internalChoiceExpr3811);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(422, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "internalChoiceExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "internalChoiceExpr"



	// $ANTLR start "externalChoiceExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:426:1: externalChoiceExpr : ( interruptExpr ( '[*]' interruptExpr )* | '[*]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr );
	public final void externalChoiceExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "externalChoiceExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(426, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:428:13: ( interruptExpr ( '[*]' interruptExpr )* | '[*]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr )
			int alt83=2;
			try { dbg.enterDecision(83, decisionCanBacktrack[83]);

			int LA83_0 = input.LA(1);
			if ( (LA83_0==58) ) {
				alt83=1;
			}
			else if ( (LA83_0==47) ) {
				alt83=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(83);}

			switch (alt83) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:428:15: interruptExpr ( '[*]' interruptExpr )*
					{
					dbg.location(428,15);
					pushFollow(FOLLOW_interruptExpr_in_externalChoiceExpr3859);
					interruptExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(428,29);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:428:29: ( '[*]' interruptExpr )*
					try { dbg.enterSubRule(81);

					loop81:
					while (true) {
						int alt81=2;
						try { dbg.enterDecision(81, decisionCanBacktrack[81]);

						int LA81_0 = input.LA(1);
						if ( (LA81_0==47) ) {
							alt81=1;
						}

						} finally {dbg.exitDecision(81);}

						switch (alt81) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:428:30: '[*]' interruptExpr
							{
							dbg.location(428,30);
							match(input,47,FOLLOW_47_in_externalChoiceExpr3862); if (state.failed) return;dbg.location(428,36);
							pushFollow(FOLLOW_interruptExpr_in_externalChoiceExpr3864);
							interruptExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop81;
						}
					}
					} finally {dbg.exitSubRule(81);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:430:15: '[*]' ( paralDef ( ';' paralDef )* ) '@' interleaveExpr
					{
					dbg.location(430,15);
					match(input,47,FOLLOW_47_in_externalChoiceExpr3883); if (state.failed) return;dbg.location(430,21);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:430:21: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:430:22: paralDef ( ';' paralDef )*
					{
					dbg.location(430,22);
					pushFollow(FOLLOW_paralDef_in_externalChoiceExpr3886);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(430,31);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:430:31: ( ';' paralDef )*
					try { dbg.enterSubRule(82);

					loop82:
					while (true) {
						int alt82=2;
						try { dbg.enterDecision(82, decisionCanBacktrack[82]);

						int LA82_0 = input.LA(1);
						if ( (LA82_0==31) ) {
							alt82=1;
						}

						} finally {dbg.exitDecision(82);}

						switch (alt82) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:430:32: ';' paralDef
							{
							dbg.location(430,32);
							match(input,31,FOLLOW_31_in_externalChoiceExpr3889); if (state.failed) return;dbg.location(430,36);
							pushFollow(FOLLOW_paralDef_in_externalChoiceExpr3891);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop82;
						}
					}
					} finally {dbg.exitSubRule(82);}

					}
					dbg.location(430,49);
					match(input,43,FOLLOW_43_in_externalChoiceExpr3897); if (state.failed) return;dbg.location(430,53);
					pushFollow(FOLLOW_interleaveExpr_in_externalChoiceExpr3899);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(432, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "externalChoiceExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "externalChoiceExpr"



	// $ANTLR start "interruptExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:434:1: interruptExpr : hidingExpr ( 'interrupt' hidingExpr )* ;
	public final void interruptExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "interruptExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(434, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:436:13: ( hidingExpr ( 'interrupt' hidingExpr )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:436:15: hidingExpr ( 'interrupt' hidingExpr )*
			{
			dbg.location(436,15);
			pushFollow(FOLLOW_hidingExpr_in_interruptExpr3934);
			hidingExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(436,26);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:436:26: ( 'interrupt' hidingExpr )*
			try { dbg.enterSubRule(84);

			loop84:
			while (true) {
				int alt84=2;
				try { dbg.enterDecision(84, decisionCanBacktrack[84]);

				int LA84_0 = input.LA(1);
				if ( (LA84_0==73) ) {
					alt84=1;
				}

				} finally {dbg.exitDecision(84);}

				switch (alt84) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:436:27: 'interrupt' hidingExpr
					{
					dbg.location(436,27);
					match(input,73,FOLLOW_73_in_interruptExpr3937); if (state.failed) return;dbg.location(436,39);
					pushFollow(FOLLOW_hidingExpr_in_interruptExpr3939);
					hidingExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop84;
				}
			}
			} finally {dbg.exitSubRule(84);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(438, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "interruptExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "interruptExpr"



	// $ANTLR start "hidingExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:442:1: hidingExpr : sequentialExpr ;
	public final void hidingExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "hidingExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(442, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:444:13: ( sequentialExpr )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:444:16: sequentialExpr
			{
			dbg.location(444,16);
			pushFollow(FOLLOW_sequentialExpr_in_hidingExpr3981);
			sequentialExpr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(448, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "hidingExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "hidingExpr"



	// $ANTLR start "sequentialExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:452:1: sequentialExpr : 'dd' ;
	public final void sequentialExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "sequentialExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(452, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:453:2: ( 'dd' )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:453:4: 'dd'
			{
			dbg.location(453,4);
			match(input,58,FOLLOW_58_in_sequentialExpr4031); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(454, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "sequentialExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "sequentialExpr"



	// $ANTLR start "guardExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:460:1: guardExpr : channelExpr ;
	public final void guardExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "guardExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(460, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:461:13: ( channelExpr )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:461:15: channelExpr
			{
			dbg.location(461,15);
			pushFollow(FOLLOW_channelExpr_in_guardExpr4068);
			channelExpr();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(464, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "guardExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "guardExpr"



	// $ANTLR start "channelExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:468:1: channelExpr : ( ID ( '[' additiveExpression ']' )? channelExpr_refactor | eventExpr );
	public final void channelExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "channelExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(468, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:470:13: ( ID ( '[' additiveExpression ']' )? channelExpr_refactor | eventExpr )
			int alt86=2;
			try { dbg.enterDecision(86, decisionCanBacktrack[86]);

			int LA86_0 = input.LA(1);
			if ( (LA86_0==ID) ) {
				int LA86_1 = input.LA(2);
				if ( (LA86_1==10||LA86_1==42||LA86_1==46) ) {
					alt86=1;
				}
				else if ( ((LA86_1 >= 25 && LA86_1 <= 26)||LA86_1==86) ) {
					alt86=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA86_0==17||LA86_0==56||LA86_0==58||(LA86_0 >= 68 && LA86_0 <= 70)||LA86_0==80||LA86_0==86) ) {
				alt86=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(86);}

			switch (alt86) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:470:15: ID ( '[' additiveExpression ']' )? channelExpr_refactor
					{
					dbg.location(470,15);
					match(input,ID,FOLLOW_ID_in_channelExpr4119); if (state.failed) return;dbg.location(470,18);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:470:18: ( '[' additiveExpression ']' )?
					int alt85=2;
					try { dbg.enterSubRule(85);
					try { dbg.enterDecision(85, decisionCanBacktrack[85]);

					int LA85_0 = input.LA(1);
					if ( (LA85_0==46) ) {
						alt85=1;
					}
					} finally {dbg.exitDecision(85);}

					switch (alt85) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:470:19: '[' additiveExpression ']'
							{
							dbg.location(470,19);
							match(input,46,FOLLOW_46_in_channelExpr4122); if (state.failed) return;dbg.location(470,23);
							pushFollow(FOLLOW_additiveExpression_in_channelExpr4124);
							additiveExpression();
							state._fsp--;
							if (state.failed) return;dbg.location(470,41);
							match(input,50,FOLLOW_50_in_channelExpr4125); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(85);}
					dbg.location(470,48);
					pushFollow(FOLLOW_channelExpr_refactor_in_channelExpr4130);
					channelExpr_refactor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:472:15: eventExpr
					{
					dbg.location(472,15);
					pushFollow(FOLLOW_eventExpr_in_channelExpr4147);
					eventExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(474, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "channelExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "channelExpr"



	// $ANTLR start "channelExpr_refactor"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:475:1: channelExpr_refactor : ( '!' expression ( '.' expression )* '->' channelExpr | '?' ( '[' conditionalOrExpression ']' )? expression ( '.' expression )* '->' channelExpr );
	public final void channelExpr_refactor() throws  {
		try { dbg.enterRule(getGrammarFileName(), "channelExpr_refactor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(475, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:476:2: ( '!' expression ( '.' expression )* '->' channelExpr | '?' ( '[' conditionalOrExpression ']' )? expression ( '.' expression )* '->' channelExpr )
			int alt90=2;
			try { dbg.enterDecision(90, decisionCanBacktrack[90]);

			int LA90_0 = input.LA(1);
			if ( (LA90_0==10) ) {
				alt90=1;
			}
			else if ( (LA90_0==42) ) {
				alt90=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(90);}

			switch (alt90) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:476:4: '!' expression ( '.' expression )* '->' channelExpr
					{
					dbg.location(476,4);
					match(input,10,FOLLOW_10_in_channelExpr_refactor4169); if (state.failed) return;dbg.location(476,8);
					pushFollow(FOLLOW_expression_in_channelExpr_refactor4171);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(476,19);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:476:19: ( '.' expression )*
					try { dbg.enterSubRule(87);

					loop87:
					while (true) {
						int alt87=2;
						try { dbg.enterDecision(87, decisionCanBacktrack[87]);

						int LA87_0 = input.LA(1);
						if ( (LA87_0==26) ) {
							alt87=1;
						}

						} finally {dbg.exitDecision(87);}

						switch (alt87) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:476:20: '.' expression
							{
							dbg.location(476,20);
							match(input,26,FOLLOW_26_in_channelExpr_refactor4174); if (state.failed) return;dbg.location(476,24);
							pushFollow(FOLLOW_expression_in_channelExpr_refactor4176);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop87;
						}
					}
					} finally {dbg.exitSubRule(87);}
					dbg.location(476,38);
					match(input,25,FOLLOW_25_in_channelExpr_refactor4181); if (state.failed) return;dbg.location(476,43);
					pushFollow(FOLLOW_channelExpr_in_channelExpr_refactor4183);
					channelExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:477:5: '?' ( '[' conditionalOrExpression ']' )? expression ( '.' expression )* '->' channelExpr
					{
					dbg.location(477,5);
					match(input,42,FOLLOW_42_in_channelExpr_refactor4189); if (state.failed) return;dbg.location(477,9);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:477:9: ( '[' conditionalOrExpression ']' )?
					int alt88=2;
					try { dbg.enterSubRule(88);
					try { dbg.enterDecision(88, decisionCanBacktrack[88]);

					int LA88_0 = input.LA(1);
					if ( (LA88_0==46) ) {
						alt88=1;
					}
					} finally {dbg.exitDecision(88);}

					switch (alt88) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:477:10: '[' conditionalOrExpression ']'
							{
							dbg.location(477,10);
							match(input,46,FOLLOW_46_in_channelExpr_refactor4192); if (state.failed) return;dbg.location(477,14);
							pushFollow(FOLLOW_conditionalOrExpression_in_channelExpr_refactor4194);
							conditionalOrExpression();
							state._fsp--;
							if (state.failed) return;dbg.location(477,38);
							match(input,50,FOLLOW_50_in_channelExpr_refactor4196); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(88);}
					dbg.location(477,44);
					pushFollow(FOLLOW_expression_in_channelExpr_refactor4200);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(477,55);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:477:55: ( '.' expression )*
					try { dbg.enterSubRule(89);

					loop89:
					while (true) {
						int alt89=2;
						try { dbg.enterDecision(89, decisionCanBacktrack[89]);

						int LA89_0 = input.LA(1);
						if ( (LA89_0==26) ) {
							alt89=1;
						}

						} finally {dbg.exitDecision(89);}

						switch (alt89) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:477:56: '.' expression
							{
							dbg.location(477,56);
							match(input,26,FOLLOW_26_in_channelExpr_refactor4203); if (state.failed) return;dbg.location(477,60);
							pushFollow(FOLLOW_expression_in_channelExpr_refactor4205);
							expression();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop89;
						}
					}
					} finally {dbg.exitSubRule(89);}
					dbg.location(477,74);
					match(input,25,FOLLOW_25_in_channelExpr_refactor4210); if (state.failed) return;dbg.location(477,79);
					pushFollow(FOLLOW_channelExpr_in_channelExpr_refactor4212);
					channelExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(478, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "channelExpr_refactor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "channelExpr_refactor"



	// $ANTLR start "eventExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:481:1: eventExpr : ( eventM ( block )? '->' channelExpr | block '->' channelExpr | '(' eventM ( ',' eventM )* ')' '->' channelExpr | caseExpr );
	public final void eventExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "eventExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(481, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:483:13: ( eventM ( block )? '->' channelExpr | block '->' channelExpr | '(' eventM ( ',' eventM )* ')' '->' channelExpr | caseExpr )
			int alt93=4;
			try { dbg.enterDecision(93, decisionCanBacktrack[93]);

			switch ( input.LA(1) ) {
			case ID:
			case 80:
				{
				alt93=1;
				}
				break;
			case 86:
				{
				alt93=2;
				}
				break;
			case 17:
				{
				alt93=3;
				}
				break;
			case 56:
			case 58:
			case 68:
			case 69:
			case 70:
				{
				alt93=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(93);}

			switch (alt93) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:483:15: eventM ( block )? '->' channelExpr
					{
					dbg.location(483,15);
					pushFollow(FOLLOW_eventM_in_eventExpr4238);
					eventM();
					state._fsp--;
					if (state.failed) return;dbg.location(483,22);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:483:22: ( block )?
					int alt91=2;
					try { dbg.enterSubRule(91);
					try { dbg.enterDecision(91, decisionCanBacktrack[91]);

					int LA91_0 = input.LA(1);
					if ( (LA91_0==86) ) {
						alt91=1;
					}
					} finally {dbg.exitDecision(91);}

					switch (alt91) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:483:23: block
							{
							dbg.location(483,23);
							pushFollow(FOLLOW_block_in_eventExpr4241);
							block();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(91);}
					dbg.location(483,31);
					match(input,25,FOLLOW_25_in_eventExpr4245); if (state.failed) return;dbg.location(483,36);
					pushFollow(FOLLOW_channelExpr_in_eventExpr4247);
					channelExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:485:15: block '->' channelExpr
					{
					dbg.location(485,15);
					pushFollow(FOLLOW_block_in_eventExpr4264);
					block();
					state._fsp--;
					if (state.failed) return;dbg.location(485,21);
					match(input,25,FOLLOW_25_in_eventExpr4266); if (state.failed) return;dbg.location(485,26);
					pushFollow(FOLLOW_channelExpr_in_eventExpr4268);
					channelExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:487:15: '(' eventM ( ',' eventM )* ')' '->' channelExpr
					{
					dbg.location(487,15);
					match(input,17,FOLLOW_17_in_eventExpr4286); if (state.failed) return;dbg.location(487,19);
					pushFollow(FOLLOW_eventM_in_eventExpr4288);
					eventM();
					state._fsp--;
					if (state.failed) return;dbg.location(487,26);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:487:26: ( ',' eventM )*
					try { dbg.enterSubRule(92);

					loop92:
					while (true) {
						int alt92=2;
						try { dbg.enterDecision(92, decisionCanBacktrack[92]);

						int LA92_0 = input.LA(1);
						if ( (LA92_0==22) ) {
							alt92=1;
						}

						} finally {dbg.exitDecision(92);}

						switch (alt92) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:487:27: ',' eventM
							{
							dbg.location(487,27);
							match(input,22,FOLLOW_22_in_eventExpr4291); if (state.failed) return;dbg.location(487,31);
							pushFollow(FOLLOW_eventM_in_eventExpr4293);
							eventM();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop92;
						}
					}
					} finally {dbg.exitSubRule(92);}
					dbg.location(487,40);
					match(input,18,FOLLOW_18_in_eventExpr4297); if (state.failed) return;dbg.location(487,44);
					match(input,25,FOLLOW_25_in_eventExpr4299); if (state.failed) return;dbg.location(487,49);
					pushFollow(FOLLOW_channelExpr_in_eventExpr4301);
					channelExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:489:15: caseExpr
					{
					dbg.location(489,15);
					pushFollow(FOLLOW_caseExpr_in_eventExpr4318);
					caseExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(491, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eventExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eventExpr"



	// $ANTLR start "caseExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:495:1: caseExpr : ( 'case' '{' ( caseCondition )+ ( 'default' ':' interleaveExpr )? '}' | ifExpr );
	public final void caseExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "caseExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(495, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:495:9: ( 'case' '{' ( caseCondition )+ ( 'default' ':' interleaveExpr )? '}' | ifExpr )
			int alt96=2;
			try { dbg.enterDecision(96, decisionCanBacktrack[96]);

			int LA96_0 = input.LA(1);
			if ( (LA96_0==56) ) {
				alt96=1;
			}
			else if ( (LA96_0==58||(LA96_0 >= 68 && LA96_0 <= 70)) ) {
				alt96=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(96);}

			switch (alt96) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:495:11: 'case' '{' ( caseCondition )+ ( 'default' ':' interleaveExpr )? '}'
					{
					dbg.location(495,11);
					match(input,56,FOLLOW_56_in_caseExpr4342); if (state.failed) return;dbg.location(497,15);
					match(input,86,FOLLOW_86_in_caseExpr4359); if (state.failed) return;dbg.location(499,25);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:499:25: ( caseCondition )+
					int cnt94=0;
					try { dbg.enterSubRule(94);

					loop94:
					while (true) {
						int alt94=2;
						try { dbg.enterDecision(94, decisionCanBacktrack[94]);

						int LA94_0 = input.LA(1);
						if ( ((LA94_0 >= ID && LA94_0 <= INT)||LA94_0==10||LA94_0==15||LA94_0==17||LA94_0==20||LA94_0==23||LA94_0==55||LA94_0==66||LA94_0==76||LA94_0==81||LA94_0==85||LA94_0==89) ) {
							alt94=1;
						}

						} finally {dbg.exitDecision(94);}

						switch (alt94) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:499:25: caseCondition
							{
							dbg.location(499,25);
							pushFollow(FOLLOW_caseCondition_in_caseExpr4386);
							caseCondition();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt94 >= 1 ) break loop94;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(94, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt94++;
					}
					} finally {dbg.exitSubRule(94);}
					dbg.location(501,25);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:501:25: ( 'default' ':' interleaveExpr )?
					int alt95=2;
					try { dbg.enterSubRule(95);
					try { dbg.enterDecision(95, decisionCanBacktrack[95]);

					int LA95_0 = input.LA(1);
					if ( (LA95_0==60) ) {
						alt95=1;
					}
					} finally {dbg.exitDecision(95);}

					switch (alt95) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:501:26: 'default' ':' interleaveExpr
							{
							dbg.location(501,26);
							match(input,60,FOLLOW_60_in_caseExpr4415); if (state.failed) return;dbg.location(501,36);
							match(input,30,FOLLOW_30_in_caseExpr4417); if (state.failed) return;dbg.location(501,41);
							pushFollow(FOLLOW_interleaveExpr_in_caseExpr4420);
							interleaveExpr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(95);}
					dbg.location(503,16);
					match(input,91,FOLLOW_91_in_caseExpr4440); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:505:15: ifExpr
					{
					dbg.location(505,15);
					pushFollow(FOLLOW_ifExpr_in_caseExpr4457);
					ifExpr();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(507, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "caseExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "caseExpr"



	// $ANTLR start "caseCondition"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:509:1: caseCondition : ( conditionalOrExpression ':' interleaveExpr ) ;
	public final void caseCondition() throws  {
		try { dbg.enterRule(getGrammarFileName(), "caseCondition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(509, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:511:13: ( ( conditionalOrExpression ':' interleaveExpr ) )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:511:15: ( conditionalOrExpression ':' interleaveExpr )
			{
			dbg.location(511,15);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:511:15: ( conditionalOrExpression ':' interleaveExpr )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:511:16: conditionalOrExpression ':' interleaveExpr
			{
			dbg.location(511,16);
			pushFollow(FOLLOW_conditionalOrExpression_in_caseCondition4493);
			conditionalOrExpression();
			state._fsp--;
			if (state.failed) return;dbg.location(511,40);
			match(input,30,FOLLOW_30_in_caseCondition4495); if (state.failed) return;dbg.location(511,44);
			pushFollow(FOLLOW_interleaveExpr_in_caseCondition4497);
			interleaveExpr();
			state._fsp--;
			if (state.failed) return;
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
		dbg.location(513, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "caseCondition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "caseCondition"



	// $ANTLR start "ifExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:515:1: ifExpr : ( 'dd' | ifExprs );
	public final void ifExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "ifExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(515, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:515:9: ( 'dd' | ifExprs )
			int alt97=2;
			try { dbg.enterDecision(97, decisionCanBacktrack[97]);

			int LA97_0 = input.LA(1);
			if ( (LA97_0==58) ) {
				alt97=1;
			}
			else if ( ((LA97_0 >= 68 && LA97_0 <= 70)) ) {
				alt97=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(97);}

			switch (alt97) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:515:12: 'dd'
					{
					dbg.location(515,12);
					match(input,58,FOLLOW_58_in_ifExpr4522); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:517:15: ifExprs
					{
					dbg.location(517,15);
					pushFollow(FOLLOW_ifExprs_in_ifExpr4541);
					ifExprs();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(519, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifExpr"



	// $ANTLR start "ifExprs"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:523:1: ifExprs : ( 'if' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )? | 'ifa' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )? | 'ifb' '(' conditionalOrExpression ')' '{' interleaveExpr '}' );
	public final void ifExprs() throws  {
		try { dbg.enterRule(getGrammarFileName(), "ifExprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(523, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:525:13: ( 'if' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )? | 'ifa' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )? | 'ifb' '(' conditionalOrExpression ')' '{' interleaveExpr '}' )
			int alt100=3;
			try { dbg.enterDecision(100, decisionCanBacktrack[100]);

			switch ( input.LA(1) ) {
			case 68:
				{
				alt100=1;
				}
				break;
			case 69:
				{
				alt100=2;
				}
				break;
			case 70:
				{
				alt100=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(100);}

			switch (alt100) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:525:15: 'if' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )?
					{
					dbg.location(525,15);
					match(input,68,FOLLOW_68_in_ifExprs4579); if (state.failed) return;dbg.location(525,20);
					match(input,17,FOLLOW_17_in_ifExprs4581); if (state.failed) return;dbg.location(525,24);
					pushFollow(FOLLOW_conditionalOrExpression_in_ifExprs4583);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(525,48);
					match(input,18,FOLLOW_18_in_ifExprs4585); if (state.failed) return;dbg.location(525,52);
					match(input,86,FOLLOW_86_in_ifExprs4587); if (state.failed) return;dbg.location(525,56);
					pushFollow(FOLLOW_interleaveExpr_in_ifExprs4589);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(525,72);
					match(input,91,FOLLOW_91_in_ifExprs4592); if (state.failed) return;dbg.location(525,76);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:525:76: ( 'else' ifBlock )?
					int alt98=2;
					try { dbg.enterSubRule(98);
					try { dbg.enterDecision(98, decisionCanBacktrack[98]);

					int LA98_0 = input.LA(1);
					if ( (LA98_0==64) ) {
						alt98=1;
					}
					} finally {dbg.exitDecision(98);}

					switch (alt98) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:525:77: 'else' ifBlock
							{
							dbg.location(525,77);
							match(input,64,FOLLOW_64_in_ifExprs4595); if (state.failed) return;dbg.location(525,84);
							pushFollow(FOLLOW_ifBlock_in_ifExprs4597);
							ifBlock();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(98);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:527:15: 'ifa' '(' conditionalOrExpression ')' '{' interleaveExpr '}' ( 'else' ifBlock )?
					{
					dbg.location(527,15);
					match(input,69,FOLLOW_69_in_ifExprs4618); if (state.failed) return;dbg.location(527,21);
					match(input,17,FOLLOW_17_in_ifExprs4620); if (state.failed) return;dbg.location(527,25);
					pushFollow(FOLLOW_conditionalOrExpression_in_ifExprs4622);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(527,49);
					match(input,18,FOLLOW_18_in_ifExprs4624); if (state.failed) return;dbg.location(527,53);
					match(input,86,FOLLOW_86_in_ifExprs4626); if (state.failed) return;dbg.location(527,57);
					pushFollow(FOLLOW_interleaveExpr_in_ifExprs4628);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(527,73);
					match(input,91,FOLLOW_91_in_ifExprs4631); if (state.failed) return;dbg.location(527,77);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:527:77: ( 'else' ifBlock )?
					int alt99=2;
					try { dbg.enterSubRule(99);
					try { dbg.enterDecision(99, decisionCanBacktrack[99]);

					int LA99_0 = input.LA(1);
					if ( (LA99_0==64) ) {
						alt99=1;
					}
					} finally {dbg.exitDecision(99);}

					switch (alt99) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:527:78: 'else' ifBlock
							{
							dbg.location(527,78);
							match(input,64,FOLLOW_64_in_ifExprs4634); if (state.failed) return;dbg.location(527,85);
							pushFollow(FOLLOW_ifBlock_in_ifExprs4636);
							ifBlock();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(99);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:529:15: 'ifb' '(' conditionalOrExpression ')' '{' interleaveExpr '}'
					{
					dbg.location(529,15);
					match(input,70,FOLLOW_70_in_ifExprs4657); if (state.failed) return;dbg.location(529,21);
					match(input,17,FOLLOW_17_in_ifExprs4659); if (state.failed) return;dbg.location(529,25);
					pushFollow(FOLLOW_conditionalOrExpression_in_ifExprs4661);
					conditionalOrExpression();
					state._fsp--;
					if (state.failed) return;dbg.location(529,49);
					match(input,18,FOLLOW_18_in_ifExprs4663); if (state.failed) return;dbg.location(529,53);
					match(input,86,FOLLOW_86_in_ifExprs4665); if (state.failed) return;dbg.location(529,57);
					pushFollow(FOLLOW_interleaveExpr_in_ifExprs4667);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(529,73);
					match(input,91,FOLLOW_91_in_ifExprs4670); if (state.failed) return;
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
		dbg.location(531, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifExprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifExprs"



	// $ANTLR start "ifBlock"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:535:1: ifBlock : ( ifExprs | '{' interleaveExpr '}' );
	public final void ifBlock() throws  {
		try { dbg.enterRule(getGrammarFileName(), "ifBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(535, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:537:13: ( ifExprs | '{' interleaveExpr '}' )
			int alt101=2;
			try { dbg.enterDecision(101, decisionCanBacktrack[101]);

			int LA101_0 = input.LA(1);
			if ( ((LA101_0 >= 68 && LA101_0 <= 70)) ) {
				alt101=1;
			}
			else if ( (LA101_0==86) ) {
				alt101=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(101);}

			switch (alt101) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:537:15: ifExprs
					{
					dbg.location(537,15);
					pushFollow(FOLLOW_ifExprs_in_ifBlock4710);
					ifExprs();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:539:15: '{' interleaveExpr '}'
					{
					dbg.location(539,15);
					match(input,86,FOLLOW_86_in_ifBlock4727); if (state.failed) return;dbg.location(539,19);
					pushFollow(FOLLOW_interleaveExpr_in_ifBlock4729);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(539,34);
					match(input,91,FOLLOW_91_in_ifBlock4731); if (state.failed) return;
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
		dbg.location(541, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "atomicExpr"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:545:1: atomicExpr : ( atom | 'atomic' '{' interleaveExpr '}' );
	public final void atomicExpr() throws  {
		try { dbg.enterRule(getGrammarFileName(), "atomicExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(545, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:547:13: ( atom | 'atomic' '{' interleaveExpr '}' )
			int alt102=2;
			try { dbg.enterDecision(102, decisionCanBacktrack[102]);

			int LA102_0 = input.LA(1);
			if ( (LA102_0==ID||LA102_0==17||(LA102_0 >= 44 && LA102_0 <= 45)||LA102_0==53) ) {
				alt102=1;
			}
			else if ( (LA102_0==54) ) {
				alt102=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(102);}

			switch (alt102) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:547:15: atom
					{
					dbg.location(547,15);
					pushFollow(FOLLOW_atom_in_atomicExpr4771);
					atom();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:549:15: 'atomic' '{' interleaveExpr '}'
					{
					dbg.location(549,15);
					match(input,54,FOLLOW_54_in_atomicExpr4789); if (state.failed) return;dbg.location(549,24);
					match(input,86,FOLLOW_86_in_atomicExpr4791); if (state.failed) return;dbg.location(549,28);
					pushFollow(FOLLOW_interleaveExpr_in_atomicExpr4793);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(549,44);
					match(input,91,FOLLOW_91_in_atomicExpr4796); if (state.failed) return;
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
		dbg.location(551, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atomicExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atomicExpr"



	// $ANTLR start "atom"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:1: atom : ( ID ( '(' ( expression ( ',' expression )* )? ')' )? | 'Skip' ( '(' ')' )? | 'Stop' ( '(' ')' )? | 'assert' '(' expression ')' | '(' interleaveExpr ')' );
	public final void atom() throws  {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(555, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:8: ( ID ( '(' ( expression ( ',' expression )* )? ')' )? | 'Skip' ( '(' ')' )? | 'Stop' ( '(' ')' )? | 'assert' '(' expression ')' | '(' interleaveExpr ')' )
			int alt108=5;
			try { dbg.enterDecision(108, decisionCanBacktrack[108]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt108=1;
				}
				break;
			case 44:
				{
				alt108=2;
				}
				break;
			case 45:
				{
				alt108=3;
				}
				break;
			case 53:
				{
				alt108=4;
				}
				break;
			case 17:
				{
				alt108=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(108);}

			switch (alt108) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:12: ID ( '(' ( expression ( ',' expression )* )? ')' )?
					{
					dbg.location(555,12);
					match(input,ID,FOLLOW_ID_in_atom4825); if (state.failed) return;dbg.location(555,16);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:16: ( '(' ( expression ( ',' expression )* )? ')' )?
					int alt105=2;
					try { dbg.enterSubRule(105);
					try { dbg.enterDecision(105, decisionCanBacktrack[105]);

					int LA105_0 = input.LA(1);
					if ( (LA105_0==17) ) {
						alt105=1;
					}
					} finally {dbg.exitDecision(105);}

					switch (alt105) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:17: '(' ( expression ( ',' expression )* )? ')'
							{
							dbg.location(555,17);
							match(input,17,FOLLOW_17_in_atom4829); if (state.failed) return;dbg.location(555,21);
							// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:21: ( expression ( ',' expression )* )?
							int alt104=2;
							try { dbg.enterSubRule(104);
							try { dbg.enterDecision(104, decisionCanBacktrack[104]);

							int LA104_0 = input.LA(1);
							if ( ((LA104_0 >= ID && LA104_0 <= INT)||LA104_0==10||LA104_0==15||LA104_0==17||LA104_0==20||LA104_0==23||LA104_0==55||LA104_0==66||LA104_0==76||LA104_0==81||LA104_0==85||LA104_0==89) ) {
								alt104=1;
							}
							} finally {dbg.exitDecision(104);}

							switch (alt104) {
								case 1 :
									dbg.enterAlt(1);

									// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:22: expression ( ',' expression )*
									{
									dbg.location(555,22);
									pushFollow(FOLLOW_expression_in_atom4832);
									expression();
									state._fsp--;
									if (state.failed) return;dbg.location(555,33);
									// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:33: ( ',' expression )*
									try { dbg.enterSubRule(103);

									loop103:
									while (true) {
										int alt103=2;
										try { dbg.enterDecision(103, decisionCanBacktrack[103]);

										int LA103_0 = input.LA(1);
										if ( (LA103_0==22) ) {
											alt103=1;
										}

										} finally {dbg.exitDecision(103);}

										switch (alt103) {
										case 1 :
											dbg.enterAlt(1);

											// G:\\workspace\\PAT\\grammar\\cspsharp.g:555:34: ',' expression
											{
											dbg.location(555,34);
											match(input,22,FOLLOW_22_in_atom4835); if (state.failed) return;dbg.location(555,38);
											pushFollow(FOLLOW_expression_in_atom4837);
											expression();
											state._fsp--;
											if (state.failed) return;
											}
											break;

										default :
											break loop103;
										}
									}
									} finally {dbg.exitSubRule(103);}

									}
									break;

							}
							} finally {dbg.exitSubRule(104);}
							dbg.location(555,55);
							match(input,18,FOLLOW_18_in_atom4845); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(105);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:557:17: 'Skip' ( '(' ')' )?
					{
					dbg.location(557,17);
					match(input,44,FOLLOW_44_in_atom4866); if (state.failed) return;dbg.location(557,24);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:557:24: ( '(' ')' )?
					int alt106=2;
					try { dbg.enterSubRule(106);
					try { dbg.enterDecision(106, decisionCanBacktrack[106]);

					int LA106_0 = input.LA(1);
					if ( (LA106_0==17) ) {
						alt106=1;
					}
					} finally {dbg.exitDecision(106);}

					switch (alt106) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:557:25: '(' ')'
							{
							dbg.location(557,25);
							match(input,17,FOLLOW_17_in_atom4869); if (state.failed) return;dbg.location(557,29);
							match(input,18,FOLLOW_18_in_atom4871); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(106);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:559:17: 'Stop' ( '(' ')' )?
					{
					dbg.location(559,17);
					match(input,45,FOLLOW_45_in_atom4892); if (state.failed) return;dbg.location(559,24);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:559:24: ( '(' ')' )?
					int alt107=2;
					try { dbg.enterSubRule(107);
					try { dbg.enterDecision(107, decisionCanBacktrack[107]);

					int LA107_0 = input.LA(1);
					if ( (LA107_0==17) ) {
						alt107=1;
					}
					} finally {dbg.exitDecision(107);}

					switch (alt107) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:559:25: '(' ')'
							{
							dbg.location(559,25);
							match(input,17,FOLLOW_17_in_atom4895); if (state.failed) return;dbg.location(559,29);
							match(input,18,FOLLOW_18_in_atom4897); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(107);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:561:17: 'assert' '(' expression ')'
					{
					dbg.location(561,17);
					match(input,53,FOLLOW_53_in_atom4918); if (state.failed) return;dbg.location(561,26);
					match(input,17,FOLLOW_17_in_atom4920); if (state.failed) return;dbg.location(561,30);
					pushFollow(FOLLOW_expression_in_atom4922);
					expression();
					state._fsp--;
					if (state.failed) return;dbg.location(561,41);
					match(input,18,FOLLOW_18_in_atom4924); if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:563:17: '(' interleaveExpr ')'
					{
					dbg.location(563,17);
					match(input,17,FOLLOW_17_in_atom4943); if (state.failed) return;dbg.location(563,21);
					pushFollow(FOLLOW_interleaveExpr_in_atom4945);
					interleaveExpr();
					state._fsp--;
					if (state.failed) return;dbg.location(563,36);
					match(input,18,FOLLOW_18_in_atom4947); if (state.failed) return;
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
		dbg.location(565, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "eventM"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:569:1: eventM : ( eventName | 'tau' );
	public final void eventM() throws  {
		try { dbg.enterRule(getGrammarFileName(), "eventM");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(569, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:571:13: ( eventName | 'tau' )
			int alt109=2;
			try { dbg.enterDecision(109, decisionCanBacktrack[109]);

			int LA109_0 = input.LA(1);
			if ( (LA109_0==ID) ) {
				alt109=1;
			}
			else if ( (LA109_0==80) ) {
				alt109=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(109);}

			switch (alt109) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:571:16: eventName
					{
					dbg.location(571,16);
					pushFollow(FOLLOW_eventName_in_eventM4986);
					eventName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:573:15: 'tau'
					{
					dbg.location(573,15);
					match(input,80,FOLLOW_80_in_eventM5003); if (state.failed) return;
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
		dbg.location(575, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eventM");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eventM"



	// $ANTLR start "eventList"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:579:1: eventList : ( eventName | ( paralDef ( ';' paralDef )* ) '@' eventName );
	public final void eventList() throws  {
		try { dbg.enterRule(getGrammarFileName(), "eventList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(579, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:581:13: ( eventName | ( paralDef ( ';' paralDef )* ) '@' eventName )
			int alt111=2;
			try { dbg.enterDecision(111, decisionCanBacktrack[111]);

			int LA111_0 = input.LA(1);
			if ( (LA111_0==ID) ) {
				int LA111_1 = input.LA(2);
				if ( (LA111_1==30) ) {
					alt111=2;
				}
				else if ( (LA111_1==EOF||LA111_1==22||LA111_1==26||LA111_1==91) ) {
					alt111=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 111, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(111);}

			switch (alt111) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:581:15: eventName
					{
					dbg.location(581,15);
					pushFollow(FOLLOW_eventName_in_eventList5042);
					eventName();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:582:21: ( paralDef ( ';' paralDef )* ) '@' eventName
					{
					dbg.location(582,21);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:582:21: ( paralDef ( ';' paralDef )* )
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:582:22: paralDef ( ';' paralDef )*
					{
					dbg.location(582,22);
					pushFollow(FOLLOW_paralDef_in_eventList5066);
					paralDef();
					state._fsp--;
					if (state.failed) return;dbg.location(582,31);
					// G:\\workspace\\PAT\\grammar\\cspsharp.g:582:31: ( ';' paralDef )*
					try { dbg.enterSubRule(110);

					loop110:
					while (true) {
						int alt110=2;
						try { dbg.enterDecision(110, decisionCanBacktrack[110]);

						int LA110_0 = input.LA(1);
						if ( (LA110_0==31) ) {
							alt110=1;
						}

						} finally {dbg.exitDecision(110);}

						switch (alt110) {
						case 1 :
							dbg.enterAlt(1);

							// G:\\workspace\\PAT\\grammar\\cspsharp.g:582:32: ';' paralDef
							{
							dbg.location(582,32);
							match(input,31,FOLLOW_31_in_eventList5069); if (state.failed) return;dbg.location(582,36);
							pushFollow(FOLLOW_paralDef_in_eventList5071);
							paralDef();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop110;
						}
					}
					} finally {dbg.exitSubRule(110);}

					}
					dbg.location(582,49);
					match(input,43,FOLLOW_43_in_eventList5077); if (state.failed) return;dbg.location(582,53);
					pushFollow(FOLLOW_eventName_in_eventList5079);
					eventName();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(584, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eventList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eventList"



	// $ANTLR start "eventName"
	// G:\\workspace\\PAT\\grammar\\cspsharp.g:588:1: eventName : ID ( '.' additiveExpression )* ;
	public final void eventName() throws  {
		try { dbg.enterRule(getGrammarFileName(), "eventName");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(588, 0);

		try {
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:590:13: ( ID ( '.' additiveExpression )* )
			dbg.enterAlt(1);

			// G:\\workspace\\PAT\\grammar\\cspsharp.g:590:15: ID ( '.' additiveExpression )*
			{
			dbg.location(590,15);
			match(input,ID,FOLLOW_ID_in_eventName5117); if (state.failed) return;dbg.location(590,18);
			// G:\\workspace\\PAT\\grammar\\cspsharp.g:590:18: ( '.' additiveExpression )*
			try { dbg.enterSubRule(112);

			loop112:
			while (true) {
				int alt112=2;
				try { dbg.enterDecision(112, decisionCanBacktrack[112]);

				int LA112_0 = input.LA(1);
				if ( (LA112_0==26) ) {
					alt112=1;
				}

				} finally {dbg.exitDecision(112);}

				switch (alt112) {
				case 1 :
					dbg.enterAlt(1);

					// G:\\workspace\\PAT\\grammar\\cspsharp.g:590:20: '.' additiveExpression
					{
					dbg.location(590,20);
					match(input,26,FOLLOW_26_in_eventName5121); if (state.failed) return;dbg.location(590,24);
					pushFollow(FOLLOW_additiveExpression_in_eventName5123);
					additiveExpression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop112;
				}
			}
			} finally {dbg.exitSubRule(112);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(592, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eventName");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "eventName"

	// $ANTLR start synpred43_cspsharp
	public final void synpred43_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:99:32: ( dparameter )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:99:32: dparameter
		{
		dbg.location(99,32);
		pushFollow(FOLLOW_dparameter_in_synpred43_cspsharp1148);
		dparameter();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_cspsharp

	// $ANTLR start synpred48_cspsharp
	public final void synpred48_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:19: (s= statement )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:119:19: s= statement
		{
		dbg.location(119,20);
		pushFollow(FOLLOW_statement_in_synpred48_cspsharp1358);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_cspsharp

	// $ANTLR start synpred54_cspsharp
	public final void synpred54_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:135:13: ( expression ';' )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:135:14: expression ';'
		{
		dbg.location(135,14);
		pushFollow(FOLLOW_expression_in_synpred54_cspsharp1466);
		expression();
		state._fsp--;
		if (state.failed) return;dbg.location(135,25);
		match(input,31,FOLLOW_31_in_synpred54_cspsharp1468); if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_cspsharp

	// $ANTLR start synpred60_cspsharp
	public final void synpred60_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:38: ( '=' expression )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:158:38: '=' expression
		{
		dbg.location(158,38);
		match(input,38,FOLLOW_38_in_synpred60_cspsharp1638); if (state.failed) return;dbg.location(158,42);
		pushFollow(FOLLOW_expression_in_synpred60_cspsharp1640);
		expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_cspsharp

	// $ANTLR start synpred62_cspsharp
	public final void synpred62_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:168:40: ( '||' conditionalAndExpression )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:168:40: '||' conditionalAndExpression
		{
		dbg.location(168,40);
		match(input,89,FOLLOW_89_in_synpred62_cspsharp1708); if (state.failed) return;dbg.location(168,45);
		pushFollow(FOLLOW_conditionalAndExpression_in_synpred62_cspsharp1710);
		conditionalAndExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred62_cspsharp

	// $ANTLR start synpred64_cspsharp
	public final void synpred64_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:178:40: ( '&&' conditionalXorExpression )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:178:40: '&&' conditionalXorExpression
		{
		dbg.location(178,40);
		match(input,15,FOLLOW_15_in_synpred64_cspsharp1778); if (state.failed) return;dbg.location(178,45);
		pushFollow(FOLLOW_conditionalXorExpression_in_synpred64_cspsharp1780);
		conditionalXorExpression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred64_cspsharp

	// $ANTLR start synpred118_cspsharp
	public final void synpred118_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:46: ( 'else' statement )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:317:46: 'else' statement
		{
		dbg.location(317,46);
		match(input,64,FOLLOW_64_in_synpred118_cspsharp2965); if (state.failed) return;dbg.location(317,53);
		pushFollow(FOLLOW_statement_in_synpred118_cspsharp2967);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred118_cspsharp

	// $ANTLR start synpred121_cspsharp
	public final void synpred121_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:8: ( expression ( '(' e2= expression ')' )? )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:9: expression ( '(' e2= expression ')' )?
		{
		dbg.location(341,9);
		pushFollow(FOLLOW_expression_in_synpred121_cspsharp3078);
		expression();
		state._fsp--;
		if (state.failed) return;dbg.location(341,20);
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:20: ( '(' e2= expression ')' )?
		int alt135=2;
		try { dbg.enterSubRule(135);
		try { dbg.enterDecision(135, decisionCanBacktrack[135]);

		int LA135_0 = input.LA(1);
		if ( (LA135_0==17) ) {
			alt135=1;
		}
		} finally {dbg.exitDecision(135);}

		switch (alt135) {
			case 1 :
				dbg.enterAlt(1);

				// G:\\workspace\\PAT\\grammar\\cspsharp.g:341:21: '(' e2= expression ')'
				{
				dbg.location(341,21);
				match(input,17,FOLLOW_17_in_synpred121_cspsharp3081); if (state.failed) return;dbg.location(341,27);
				pushFollow(FOLLOW_expression_in_synpred121_cspsharp3085);
				expression();
				state._fsp--;
				if (state.failed) return;dbg.location(341,39);
				match(input,18,FOLLOW_18_in_synpred121_cspsharp3087); if (state.failed) return;
				}
				break;

		}
		} finally {dbg.exitSubRule(135);}

		}

	}
	// $ANTLR end synpred121_cspsharp

	// $ANTLR start synpred127_cspsharp
	public final void synpred127_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:29: ( '|||' parallelExpr )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:366:29: '|||' parallelExpr
		{
		dbg.location(366,29);
		match(input,90,FOLLOW_90_in_synpred127_cspsharp3280); if (state.failed) return;dbg.location(366,35);
		pushFollow(FOLLOW_parallelExpr_in_synpred127_cspsharp3282);
		parallelExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred127_cspsharp

	// $ANTLR start synpred131_cspsharp
	public final void synpred131_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:34: ( '||' generalChoiceExpr )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:378:34: '||' generalChoiceExpr
		{
		dbg.location(378,34);
		match(input,89,FOLLOW_89_in_synpred131_cspsharp3422); if (state.failed) return;dbg.location(378,39);
		pushFollow(FOLLOW_generalChoiceExpr_in_synpred131_cspsharp3424);
		generalChoiceExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred131_cspsharp

	// $ANTLR start synpred137_cspsharp
	public final void synpred137_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:34: ( '[]' internalChoiceExpr )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:408:34: '[]' internalChoiceExpr
		{
		dbg.location(408,34);
		match(input,48,FOLLOW_48_in_synpred137_cspsharp3683); if (state.failed) return;dbg.location(408,39);
		pushFollow(FOLLOW_internalChoiceExpr_in_synpred137_cspsharp3685);
		internalChoiceExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred137_cspsharp

	// $ANTLR start synpred140_cspsharp
	public final void synpred140_cspsharp_fragment() throws  {
		// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:35: ( '<>' externalChoiceExpr )
		dbg.enterAlt(1);

		// G:\\workspace\\PAT\\grammar\\cspsharp.g:418:35: '<>' externalChoiceExpr
		{
		dbg.location(418,35);
		match(input,35,FOLLOW_35_in_synpred140_cspsharp3774); if (state.failed) return;dbg.location(418,40);
		pushFollow(FOLLOW_externalChoiceExpr_in_synpred140_cspsharp3776);
		externalChoiceExpr();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred140_cspsharp

	// Delegated rules

	public final boolean synpred48_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred48_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred43_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred137_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred137_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred64_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred60_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred140_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred140_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred121_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred121_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred54_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred131_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred131_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred127_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred118_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred118_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_cspsharp() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred62_cspsharp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_specBody_in_specification42 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_specification45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_library_in_specBody87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_letDefintion_in_specBody108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_specBody131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertion_in_specBody152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alphabet_in_specBody173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_define_in_specBody194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_channel_in_specBody215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_library262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_library264 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_library266 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_library268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_library286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_library288 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_STRING_in_library290 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_library292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_channel333 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_channel335 = new BitSet(new long[]{0x0080400000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_46_in_channel338 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_channel340 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_channel342 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_channel346 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_channel348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_assertion388 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_53_in_assertion390 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_definitionRef_in_assertion392 = new BitSet(new long[]{0xC800000000000000L,0x000000000100E000L});
	public static final BitSet FOLLOW_88_in_assertion431 = new BitSet(new long[]{0x0003040A26068560L,0x0000000002200000L});
	public static final BitSet FOLLOW_59_in_assertion539 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_77_in_assertion576 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_63_in_assertion617 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_62_in_assertion658 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_78_in_assertion694 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_assertion696 = new BitSet(new long[]{0x0000000080000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_withClause_in_assertion698 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_79_in_assertion735 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_definitionRef_in_assertion737 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_79_in_assertion773 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_assertion775 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_definitionRef_in_assertion777 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_79_in_assertion813 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_assertion815 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_definitionRef_in_assertion817 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assertion852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_withClause897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
	public static final BitSet FOLLOW_set_in_withClause899 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_withClause907 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_withClause909 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_withClause911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_definitionRef958 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_definitionRef961 = new BitSet(new long[]{0x0080400000968460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_definitionRef964 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_definitionRef966 = new BitSet(new long[]{0x0080400000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_definitionRef968 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_definitionRef974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_alphabet1017 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_alphabet1019 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_alphabet1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_alphabet1023 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_eventList_in_alphabet1025 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_22_in_alphabet1028 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_eventList_in_alphabet1030 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_alphabet1035 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_alphabet1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_define1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_define1106 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_define1110 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_22_in_define1112 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_define1116 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_define1120 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_define1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_define1142 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_61_in_define1144 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_define1146 = new BitSet(new long[]{0x0080000000928460L,0x0000000002621004L});
	public static final BitSet FOLLOW_dparameter_in_define1148 = new BitSet(new long[]{0x0080000000928460L,0x0000000002621004L});
	public static final BitSet FOLLOW_dstatement_in_define1151 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_define1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_dparameter1223 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_dparameter1225 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_dparameter1228 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_dparameter1230 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_dparameter1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_dstatement1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_dstatement1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_block1353 = new BitSet(new long[]{0x0080000080928460L,0x000000000A6E1014L});
	public static final BitSet FOLLOW_statement_in_block1358 = new BitSet(new long[]{0x0080000080928460L,0x000000000A6E1014L});
	public static final BitSet FOLLOW_expression_in_block1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_block1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_statement1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpression_in_statement1435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileExpression_in_statement1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement1473 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_statement1475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_statement1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_localVariableDeclaration1531 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_localVariableDeclaration1533 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_38_in_localVariableDeclaration1536 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_localVariableDeclaration1538 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_localVariableDeclaration1542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_localVariableDeclaration1557 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_localVariableDeclaration1559 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_localVariableDeclaration1561 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_recordExpression_in_localVariableDeclaration1563 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_localVariableDeclaration1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_localVariableDeclaration1580 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_localVariableDeclaration1582 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_localVariableDeclaration1585 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_localVariableDeclaration1587 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_localVariableDeclaration1589 = new BitSet(new long[]{0x0000404080000000L});
	public static final BitSet FOLLOW_38_in_localVariableDeclaration1594 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_recordExpression_in_localVariableDeclaration1596 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_localVariableDeclaration1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_expression1635 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_expression1638 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_expression1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_conditionalOrExpression1687 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_indexedExpression_in_conditionalOrExpression1689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1704 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_conditionalOrExpression1708 = new BitSet(new long[]{0x0080000000928460L,0x0000000000221004L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_15_in_conditionalAndExpression1757 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_indexedExpression_in_conditionalAndExpression1759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1774 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_conditionalAndExpression1778 = new BitSet(new long[]{0x0080000000920460L,0x0000000000221004L});
	public static final BitSet FOLLOW_conditionalXorExpression_in_conditionalAndExpression1780 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_85_in_conditionalXorExpression1816 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_indexedExpression_in_conditionalXorExpression1818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitwiseLogicExpression_in_conditionalXorExpression1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_conditionalXorExpression1837 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_bitwiseLogicExpression_in_conditionalXorExpression1839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_paralDef_in_indexedExpression1881 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_indexedExpression1884 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_indexedExpression1886 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_indexedExpression1892 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_indexedExpression1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseLogicExpression1940 = new BitSet(new long[]{0x0008000000010002L,0x0000000000800000L});
	public static final BitSet FOLLOW_set_in_bitwiseLogicExpression1944 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_equalityExpression_in_bitwiseLogicExpression1958 = new BitSet(new long[]{0x0008000000010002L,0x0000000000800000L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1996 = new BitSet(new long[]{0x0000008000000802L});
	public static final BitSet FOLLOW_set_in_equalityExpression2000 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression2006 = new BitSet(new long[]{0x0000008000000802L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2056 = new BitSet(new long[]{0x0000030500000002L});
	public static final BitSet FOLLOW_set_in_relationalExpression2060 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression2076 = new BitSet(new long[]{0x0000030500000002L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2126 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_set_in_additiveExpression2130 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression2138 = new BitSet(new long[]{0x0000000000900002L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2175 = new BitSet(new long[]{0x0000000010084002L});
	public static final BitSet FOLLOW_set_in_multiplicativeExpression2179 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression2192 = new BitSet(new long[]{0x0000000010084002L});
	public static final BitSet FOLLOW_20_in_unaryExpression2229 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_unaryExpression2248 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression2250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_unaryExpression2267 = new BitSet(new long[]{0x0080000000020060L,0x0000000000021004L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression2286 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_ID_in_arrayExpression2351 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_arrayExpression2354 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_arrayExpression2356 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_arrayExpression2358 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_INT_in_unaryExpressionNotPlusMinus2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_unaryExpressionNotPlusMinus2409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_unaryExpressionNotPlusMinus2424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unaryExpressionNotPlusMinus2440 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_unaryExpressionNotPlusMinus2442 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_unaryExpressionNotPlusMinus2444 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_unaryExpressionNotPlusMinus2447 = new BitSet(new long[]{0x0080400000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2449 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_unaryExpressionNotPlusMinus2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_unaryExpressionNotPlusMinus2468 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_unaryExpressionNotPlusMinus2470 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_unaryExpressionNotPlusMinus2472 = new BitSet(new long[]{0x0080400000968460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2475 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_unaryExpressionNotPlusMinus2478 = new BitSet(new long[]{0x0080400000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_unaryExpressionNotPlusMinus2480 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_unaryExpressionNotPlusMinus2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unaryExpressionNotPlusMinus2502 = new BitSet(new long[]{0x0000000004002000L});
	public static final BitSet FOLLOW_methods_fields_call_in_unaryExpressionNotPlusMinus2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayExpression_in_unaryExpressionNotPlusMinus2521 = new BitSet(new long[]{0x0000000004002002L});
	public static final BitSet FOLLOW_methods_fields_call_in_unaryExpressionNotPlusMinus2523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unaryExpressionNotPlusMinus2547 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_unaryExpressionNotPlusMinus2549 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_unaryExpressionNotPlusMinus2551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unaryExpressionNotPlusMinus2565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_methods_fields_call2605 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_methods_fields_call2609 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_methods_fields_call2612 = new BitSet(new long[]{0x0080400000968460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_methods_fields_call2615 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_methods_fields_call2618 = new BitSet(new long[]{0x0080400000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_argumentExpression_in_methods_fields_call2620 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_methods_fields_call2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_methods_fields_call2643 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_methods_fields_call2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_letDefintion2681 = new BitSet(new long[]{0x0000000100000020L});
	public static final BitSet FOLLOW_32_in_letDefintion2688 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_letDefintion2692 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_letDefintion2694 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_letDefintion2700 = new BitSet(new long[]{0x00000040C0000000L});
	public static final BitSet FOLLOW_varaibleRange_in_letDefintion2702 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_38_in_letDefintion2706 = new BitSet(new long[]{0x00800000009A8460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_letDefintion2709 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_19_in_letDefintion2711 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_letDefintion2717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_letDefintion2731 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_letDefintion2737 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_letDefintion2741 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_recordExpression_in_letDefintion2743 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_letDefintion2745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_letDefintion2757 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_letDefintion2763 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_letDefintion2766 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_letDefintion2768 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_letDefintion2770 = new BitSet(new long[]{0x0000404080000000L});
	public static final BitSet FOLLOW_38_in_letDefintion2777 = new BitSet(new long[]{0x0000400000080000L});
	public static final BitSet FOLLOW_recordExpression_in_letDefintion2780 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_19_in_letDefintion2782 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_letDefintion2788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_varaibleRange2824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_varaibleRange2826 = new BitSet(new long[]{0x0080000008920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_varaibleRange2829 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_varaibleRange2833 = new BitSet(new long[]{0x0080000000920460L,0x0000000008021004L});
	public static final BitSet FOLLOW_additiveExpression_in_varaibleRange2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_varaibleRange2840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_argumentExpression2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordExpression_in_argumentExpression2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ifExpression2954 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ifExpression2956 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_ifExpression2958 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifExpression2960 = new BitSet(new long[]{0x0080000080928460L,0x00000000026E1014L});
	public static final BitSet FOLLOW_statement_in_ifExpression2962 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ifExpression2965 = new BitSet(new long[]{0x0080000080928460L,0x00000000026E1014L});
	public static final BitSet FOLLOW_statement_in_ifExpression2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_whileExpression3007 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_whileExpression3009 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_whileExpression3011 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whileExpression3013 = new BitSet(new long[]{0x0080000080928460L,0x00000000026E1014L});
	public static final BitSet FOLLOW_statement_in_whileExpression3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_recordExpression3041 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_recordElement_in_recordExpression3043 = new BitSet(new long[]{0x0004000000400000L});
	public static final BitSet FOLLOW_22_in_recordExpression3046 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_recordElement_in_recordExpression3048 = new BitSet(new long[]{0x0004000000400000L});
	public static final BitSet FOLLOW_50_in_recordExpression3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recordElement3096 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_recordElement3099 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_recordElement3103 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_recordElement3105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_recordElement3120 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_recordElement3122 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_recordElement3126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_definition3157 = new BitSet(new long[]{0x0000004000020000L});
	public static final BitSet FOLLOW_17_in_definition3160 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_parameter_in_definition3163 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_definition3165 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_parameter_in_definition3167 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_definition3173 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition3177 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_definition3179 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_definition3181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_parameter3225 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_varaibleRange_in_parameter3227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parallelExpr_in_interleaveExpr3277 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_interleaveExpr3280 = new BitSet(new long[]{0x0401800800000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_parallelExpr_in_interleaveExpr3282 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_interleaveExpr3321 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_interleaveExpr3324 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_interleaveExpr3327 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_interleaveExpr3329 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_interleaveExpr3335 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_interleaveExpr3337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_interleaveExpr3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_paralDef2_in_interleaveExpr3356 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_interleaveExpr3358 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_interleaveExpr3360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_generalChoiceExpr_in_parallelExpr3419 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_parallelExpr3422 = new BitSet(new long[]{0x0401800800000000L});
	public static final BitSet FOLLOW_generalChoiceExpr_in_parallelExpr3424 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_parallelExpr3443 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_parallelExpr3446 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_parallelExpr3449 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_parallelExpr3451 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_parallelExpr3457 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_parallelExpr3459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_paralDef3509 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_paralDef3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_paralDef3513 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_paralDef3515 = new BitSet(new long[]{0x0000000008400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_22_in_paralDef3519 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_paralDef3521 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_paralDef3527 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_paralDef3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_paralDef3533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_paralDef23618 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_paralDef23620 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_paralDef23622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_paralDef23639 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_paralDef23641 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_paralDef23643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalChoiceExpr_in_generalChoiceExpr3681 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_generalChoiceExpr3683 = new BitSet(new long[]{0x0400800800000000L});
	public static final BitSet FOLLOW_internalChoiceExpr_in_generalChoiceExpr3685 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_generalChoiceExpr3704 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_generalChoiceExpr3707 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_generalChoiceExpr3710 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_generalChoiceExpr3712 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_generalChoiceExpr3718 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_generalChoiceExpr3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_externalChoiceExpr_in_internalChoiceExpr3771 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_internalChoiceExpr3774 = new BitSet(new long[]{0x0400800000000000L});
	public static final BitSet FOLLOW_externalChoiceExpr_in_internalChoiceExpr3776 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_internalChoiceExpr3795 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_internalChoiceExpr3798 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_internalChoiceExpr3801 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_internalChoiceExpr3803 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_internalChoiceExpr3809 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_internalChoiceExpr3811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interruptExpr_in_externalChoiceExpr3859 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_externalChoiceExpr3862 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_interruptExpr_in_externalChoiceExpr3864 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_externalChoiceExpr3883 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_externalChoiceExpr3886 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_externalChoiceExpr3889 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_externalChoiceExpr3891 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_externalChoiceExpr3897 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_externalChoiceExpr3899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hidingExpr_in_interruptExpr3934 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_interruptExpr3937 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_hidingExpr_in_interruptExpr3939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_sequentialExpr_in_hidingExpr3981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_sequentialExpr4031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_channelExpr_in_guardExpr4068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_channelExpr4119 = new BitSet(new long[]{0x0000440000000400L});
	public static final BitSet FOLLOW_46_in_channelExpr4122 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_channelExpr4124 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_channelExpr4125 = new BitSet(new long[]{0x0000040000000400L});
	public static final BitSet FOLLOW_channelExpr_refactor_in_channelExpr4130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventExpr_in_channelExpr4147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_channelExpr_refactor4169 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_channelExpr_refactor4171 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_26_in_channelExpr_refactor4174 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_channelExpr_refactor4176 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_25_in_channelExpr_refactor4181 = new BitSet(new long[]{0x0500000000020020L,0x0000000000410070L});
	public static final BitSet FOLLOW_channelExpr_in_channelExpr_refactor4183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_channelExpr_refactor4189 = new BitSet(new long[]{0x0080400000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_46_in_channelExpr_refactor4192 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_channelExpr_refactor4194 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_channelExpr_refactor4196 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_channelExpr_refactor4200 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_26_in_channelExpr_refactor4203 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_channelExpr_refactor4205 = new BitSet(new long[]{0x0000000006000000L});
	public static final BitSet FOLLOW_25_in_channelExpr_refactor4210 = new BitSet(new long[]{0x0500000000020020L,0x0000000000410070L});
	public static final BitSet FOLLOW_channelExpr_in_channelExpr_refactor4212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventM_in_eventExpr4238 = new BitSet(new long[]{0x0000000002000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_block_in_eventExpr4241 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_eventExpr4245 = new BitSet(new long[]{0x0500000000020020L,0x0000000000410070L});
	public static final BitSet FOLLOW_channelExpr_in_eventExpr4247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_eventExpr4264 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_eventExpr4266 = new BitSet(new long[]{0x0500000000020020L,0x0000000000410070L});
	public static final BitSet FOLLOW_channelExpr_in_eventExpr4268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_eventExpr4286 = new BitSet(new long[]{0x0000000000000020L,0x0000000000010000L});
	public static final BitSet FOLLOW_eventM_in_eventExpr4288 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_eventExpr4291 = new BitSet(new long[]{0x0000000000000020L,0x0000000000010000L});
	public static final BitSet FOLLOW_eventM_in_eventExpr4293 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_eventExpr4297 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_eventExpr4299 = new BitSet(new long[]{0x0500000000020020L,0x0000000000410070L});
	public static final BitSet FOLLOW_channelExpr_in_eventExpr4301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseExpr_in_eventExpr4318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_caseExpr4342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_caseExpr4359 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_caseCondition_in_caseExpr4386 = new BitSet(new long[]{0x1080000000928460L,0x000000000A221004L});
	public static final BitSet FOLLOW_60_in_caseExpr4415 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_caseExpr4417 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_caseExpr4420 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_caseExpr4440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExpr_in_caseExpr4457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_caseCondition4493 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_caseCondition4495 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_caseCondition4497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ifExpr4522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExprs_in_ifExpr4541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ifExprs4579 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ifExprs4581 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_ifExprs4583 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifExprs4585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_ifExprs4587 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_ifExprs4589 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_ifExprs4592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ifExprs4595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400070L});
	public static final BitSet FOLLOW_ifBlock_in_ifExprs4597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ifExprs4618 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ifExprs4620 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_ifExprs4622 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifExprs4624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_ifExprs4626 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_ifExprs4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_ifExprs4631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_ifExprs4634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400070L});
	public static final BitSet FOLLOW_ifBlock_in_ifExprs4636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_ifExprs4657 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_ifExprs4659 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_conditionalOrExpression_in_ifExprs4661 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifExprs4663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_ifExprs4665 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_ifExprs4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_ifExprs4670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifExprs_in_ifBlock4710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_ifBlock4727 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_ifBlock4729 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_ifBlock4731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomicExpr4771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_atomicExpr4789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_atomicExpr4791 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_atomicExpr4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_atomicExpr4796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom4825 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_atom4829 = new BitSet(new long[]{0x0080000000968460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_atom4832 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_22_in_atom4835 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_atom4837 = new BitSet(new long[]{0x0000000000440000L});
	public static final BitSet FOLLOW_18_in_atom4845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_atom4866 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_atom4869 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom4871 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_atom4892 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_atom4895 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom4897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_atom4918 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_atom4920 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_atom4922 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom4924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_atom4943 = new BitSet(new long[]{0x0401800800000000L,0x0000000006000000L});
	public static final BitSet FOLLOW_interleaveExpr_in_atom4945 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom4947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventName_in_eventM4986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_eventM5003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventName_in_eventList5042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paralDef_in_eventList5066 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_31_in_eventList5069 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paralDef_in_eventList5071 = new BitSet(new long[]{0x0000080080000000L});
	public static final BitSet FOLLOW_43_in_eventList5077 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_eventName_in_eventList5079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_eventName5117 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_eventName5121 = new BitSet(new long[]{0x0080000000920460L,0x0000000000021004L});
	public static final BitSet FOLLOW_additiveExpression_in_eventName5123 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_dparameter_in_synpred43_cspsharp1148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_synpred48_cspsharp1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred54_cspsharp1466 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_synpred54_cspsharp1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_synpred60_cspsharp1638 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_synpred60_cspsharp1640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_synpred62_cspsharp1708 = new BitSet(new long[]{0x0080000000928460L,0x0000000000221004L});
	public static final BitSet FOLLOW_conditionalAndExpression_in_synpred62_cspsharp1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_synpred64_cspsharp1778 = new BitSet(new long[]{0x0080000000920460L,0x0000000000221004L});
	public static final BitSet FOLLOW_conditionalXorExpression_in_synpred64_cspsharp1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_synpred118_cspsharp2965 = new BitSet(new long[]{0x0080000080928460L,0x00000000026E1014L});
	public static final BitSet FOLLOW_statement_in_synpred118_cspsharp2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred121_cspsharp3078 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_synpred121_cspsharp3081 = new BitSet(new long[]{0x0080000000928460L,0x0000000002221004L});
	public static final BitSet FOLLOW_expression_in_synpred121_cspsharp3085 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred121_cspsharp3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_synpred127_cspsharp3280 = new BitSet(new long[]{0x0401800800000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_parallelExpr_in_synpred127_cspsharp3282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_synpred131_cspsharp3422 = new BitSet(new long[]{0x0401800800000000L});
	public static final BitSet FOLLOW_generalChoiceExpr_in_synpred131_cspsharp3424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_synpred137_cspsharp3683 = new BitSet(new long[]{0x0400800800000000L});
	public static final BitSet FOLLOW_internalChoiceExpr_in_synpred137_cspsharp3685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_synpred140_cspsharp3774 = new BitSet(new long[]{0x0400800000000000L});
	public static final BitSet FOLLOW_externalChoiceExpr_in_synpred140_cspsharp3776 = new BitSet(new long[]{0x0000000000000002L});
}
