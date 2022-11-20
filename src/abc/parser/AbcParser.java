// Generated from java-escape by ANTLR 4.11.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AbcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, NEW_LINE=47, WHITESPACE=48, DIGIT=49, UNKNOWN=50;
	public static final int
		RULE_keynote = 0, RULE_key = 1, RULE_tempo = 2, RULE_meter_fraction = 3, 
		RULE_meter = 4, RULE_note_length_strict = 5, RULE_field_number = 6, RULE_field_title = 7, 
		RULE_field_composer = 8, RULE_field_default_length = 9, RULE_field_meter = 10, 
		RULE_field_tempo = 11, RULE_field_voice = 12, RULE_field_key = 13, RULE_other_fields = 14, 
		RULE_abc_header = 15, RULE_abc_music = 16, RULE_abc_line = 17, RULE_element = 18, 
		RULE_note_element = 19, RULE_note = 20, RULE_note_or_rest = 21, RULE_pitch = 22, 
		RULE_octave = 23, RULE_note_length = 24, RULE_rest = 25, RULE_tuplet_element = 26, 
		RULE_tuplet_spec = 27, RULE_multi_note = 28, RULE_barline = 29, RULE_nth_repeat = 30, 
		RULE_mid_tune_field = 31, RULE_comment = 32, RULE_end_of_line = 33, RULE_basenote = 34, 
		RULE_accidental = 35, RULE_key_accidental = 36, RULE_mode_minor = 37, 
		RULE_abc_tune = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"keynote", "key", "tempo", "meter_fraction", "meter", "note_length_strict", 
			"field_number", "field_title", "field_composer", "field_default_length", 
			"field_meter", "field_tempo", "field_voice", "field_key", "other_fields", 
			"abc_header", "abc_music", "abc_line", "element", "note_element", "note", 
			"note_or_rest", "pitch", "octave", "note_length", "rest", "tuplet_element", 
			"tuplet_spec", "multi_note", "barline", "nth_repeat", "mid_tune_field", 
			"comment", "end_of_line", "basenote", "accidental", "key_accidental", 
			"mode_minor", "abc_tune"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'/'", "'C'", "'C|'", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", 
			"'Q:'", "'V:'", "'K:'", "'''", "','", "'z'", "'('", "'['", "']'", "'|'", 
			"'||'", "'[|'", "'|]'", "':|'", "'|:'", "'[1'", "'[2'", "'%'", "'D'", 
			"'E'", "'F'", "'G'", "'A'", "'B'", "'c'", "'d'", "'e'", "'f'", "'g'", 
			"'a'", "'b'", "'^'", "'^^'", "'_'", "'__'", "'#'", "'m'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "NEW_LINE", 
			"WHITESPACE", "DIGIT", "UNKNOWN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    // This method makes the parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        // To prevent any reports to standard error, add this line:
	        //removeErrorListeners();
	        
	        addErrorListener(new BaseErrorListener() {
	            public void syntaxError(Recognizer<?, ?> recognizer,
	                                    Object offendingSymbol, 
	                                    int line, int charPositionInLine,
	                                    String msg, RecognitionException e) {
	                throw new ParseCancellationException(msg, e);
	            }
	        });
	    }

	public AbcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeynoteContext extends ParserRuleContext {
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public Key_accidentalContext key_accidental() {
			return getRuleContext(Key_accidentalContext.class,0);
		}
		public KeynoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keynote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKeynote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKeynote(this);
		}
	}

	public final KeynoteContext keynote() throws RecognitionException {
		KeynoteContext _localctx = new KeynoteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_keynote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			basenote();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__44) {
				{
				setState(79);
				key_accidental();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public KeynoteContext keynote() {
			return getRuleContext(KeynoteContext.class,0);
		}
		public Mode_minorContext mode_minor() {
			return getRuleContext(Mode_minorContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			keynote();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(83);
				mode_minor();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TempoContext extends ParserRuleContext {
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AbcParser.DIGIT, i);
		}
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			meter_fraction();
			setState(87);
			match(T__0);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				match(DIGIT);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Meter_fractionContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AbcParser.DIGIT, i);
		}
		public Meter_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeter_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeter_fraction(this);
		}
	}

	public final Meter_fractionContext meter_fraction() throws RecognitionException {
		Meter_fractionContext _localctx = new Meter_fractionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_meter_fraction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(DIGIT);
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(98);
			match(T__1);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				match(DIGIT);
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeterContext extends ParserRuleContext {
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(104);
				match(T__2);
				}
				break;
			case T__3:
				{
				setState(105);
				match(T__3);
				}
				break;
			case DIGIT:
				{
				setState(106);
				meter_fraction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Note_length_strictContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AbcParser.DIGIT, i);
		}
		public Note_length_strictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_length_strict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_length_strict(this);
		}
	}

	public final Note_length_strictContext note_length_strict() throws RecognitionException {
		Note_length_strictContext _localctx = new Note_length_strictContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note_length_strict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(DIGIT);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(114);
			match(T__1);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(DIGIT);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_numberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(AbcParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(AbcParser.WHITESPACE, i);
		}
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__4);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(121);
				match(WHITESPACE);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(DIGIT);
			setState(128);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_titleContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(AbcParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(AbcParser.NEW_LINE, i);
		}
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_title);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__5);
			setState(132); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(131);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEW_LINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(136);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_composerContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(AbcParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(AbcParser.NEW_LINE, i);
		}
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_composer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__6);
			setState(140); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEW_LINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(144);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_default_lengthContext extends ParserRuleContext {
		public Note_length_strictContext note_length_strict() {
			return getRuleContext(Note_length_strictContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__7);
			setState(147);
			note_length_strict();
			setState(148);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_meterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__8);
			setState(151);
			meter();
			setState(152);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_tempoContext extends ParserRuleContext {
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			tempo();
			setState(156);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_voiceContext extends ParserRuleContext {
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public List<TerminalNode> NEW_LINE() { return getTokens(AbcParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(AbcParser.NEW_LINE, i);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_field_voice);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__10);
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NEW_LINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(164);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Field_keyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public End_of_lineContext end_of_line() {
			return getRuleContext(End_of_lineContext.class,0);
		}
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__11);
			setState(167);
			key();
			setState(168);
			end_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_other_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(170);
				field_composer();
				}
				break;
			case T__7:
				{
				setState(171);
				field_default_length();
				}
				break;
			case T__8:
				{
				setState(172);
				field_meter();
				}
				break;
			case T__9:
				{
				setState(173);
				field_tempo();
				}
				break;
			case T__10:
				{
				setState(174);
				field_voice();
				}
				break;
			case T__26:
				{
				setState(175);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Abc_headerContext extends ParserRuleContext {
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			field_number();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(179);
				comment();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			field_title();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 134221696L) != 0) {
				{
				{
				setState(186);
				other_fields();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Abc_musicContext extends ParserRuleContext {
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				abc_line();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 457396836861962L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Abc_lineContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(AbcParser.NEW_LINE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_abc_line);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__14:
			case T__15:
			case T__16:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case NEW_LINE:
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 316659214286858L) != 0) {
					{
					{
					setState(199);
					element();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(NEW_LINE);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				mid_tune_field();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public BarlineContext barline() {
			return getRuleContext(BarlineContext.class,0);
		}
		public Nth_repeatContext nth_repeat() {
			return getRuleContext(Nth_repeatContext.class,0);
		}
		public TerminalNode WHITESPACE() { return getToken(AbcParser.WHITESPACE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_element);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__14:
			case T__16:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				note_element();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				tuplet_element();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				barline();
				}
				break;
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				nth_repeat();
				}
				break;
			case WHITESPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(WHITESPACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Note_elementContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_note_element);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__14:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				note();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				multi_note();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			note_or_rest();
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(222);
				note_length();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Note_or_restContext extends ParserRuleContext {
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_note_or_rest);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				pitch();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				rest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PitchContext extends ParserRuleContext {
		public BasenoteContext basenote() {
			return getRuleContext(BasenoteContext.class,0);
		}
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833282L) != 0) {
				{
				setState(229);
				accidental();
				}
			}

			setState(232);
			basenote();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(233);
				octave();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OctaveContext extends ParserRuleContext {
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitOctave(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_octave);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					match(T__12);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 );
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(241);
					match(T__13);
					}
					}
					setState(244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Note_lengthContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(AbcParser.DIGIT, i);
		}
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_note_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					match(DIGIT);
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(255);
				match(T__1);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIGIT) {
					{
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(256);
						match(DIGIT);
						}
						}
						setState(259); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DIGIT );
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestContext extends ParserRuleContext {
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuplet_elementContext extends ParserRuleContext {
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			tuplet_spec();
			setState(269); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(268);
					note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(AbcParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__15);
			setState(274);
			match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_noteContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__16);
			setState(278); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(277);
				note();
				}
				}
				setState(280); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 35184103686154L) != 0 );
			setState(282);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BarlineContext extends ParserRuleContext {
		public BarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBarline(this);
		}
	}

	public final BarlineContext barline() throws RecognitionException {
		BarlineContext _localctx = new BarlineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_barline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nth_repeatContext extends ParserRuleContext {
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitNth_repeat(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nth_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			field_voice();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> NEW_LINE() { return getTokens(AbcParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(AbcParser.NEW_LINE, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__26);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 2111062325329918L) != 0) {
				{
				{
				setState(291);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEW_LINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(NEW_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class End_of_lineContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(AbcParser.NEW_LINE, 0); }
		public End_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterEnd_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitEnd_of_line(this);
		}
	}

	public final End_of_lineContext end_of_line() throws RecognitionException {
		End_of_lineContext _localctx = new End_of_lineContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_end_of_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(299);
				comment();
				}
				break;
			case NEW_LINE:
				{
				setState(300);
				match(NEW_LINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasenoteContext extends ParserRuleContext {
		public BasenoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basenote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterBasenote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitBasenote(this);
		}
	}

	public final BasenoteContext basenote() throws RecognitionException {
		BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_basenote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2198754820104L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccidentalContext extends ParserRuleContext {
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32985348833282L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Key_accidentalContext extends ParserRuleContext {
		public Key_accidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterKey_accidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitKey_accidental(this);
		}
	}

	public final Key_accidentalContext key_accidental() throws RecognitionException {
		Key_accidentalContext _localctx = new Key_accidentalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_key_accidental);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__44) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mode_minorContext extends ParserRuleContext {
		public Mode_minorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mode_minor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterMode_minor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitMode_minor(this);
		}
	}

	public final Mode_minorContext mode_minor() throws RecognitionException {
		Mode_minorContext _localctx = new Mode_minorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mode_minor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcListener ) ((AbcListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			abc_header();
			setState(312);
			abc_music();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0003\u0000Q\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002Z\b\u0002\u000b\u0002\f\u0002"+
		"[\u0001\u0003\u0004\u0003_\b\u0003\u000b\u0003\f\u0003`\u0001\u0003\u0001"+
		"\u0003\u0004\u0003e\b\u0003\u000b\u0003\f\u0003f\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0004\u0005o\b\u0005\u000b"+
		"\u0005\f\u0005p\u0001\u0005\u0001\u0005\u0004\u0005u\b\u0005\u000b\u0005"+
		"\f\u0005v\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006"+
		"~\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u0085\b\u0007\u000b\u0007\f\u0007\u0086\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0004\b\u008d\b\b\u000b\b\f\b\u008e\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\f\u00a1"+
		"\b\f\u000b\f\f\f\u00a2\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00b1\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00b5\b"+
		"\u000f\n\u000f\f\u000f\u00b8\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00bc\b\u000f\n\u000f\f\u000f\u00bf\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0004\u0010\u00c4\b\u0010\u000b\u0010\f\u0010\u00c5\u0001\u0011"+
		"\u0005\u0011\u00c9\b\u0011\n\u0011\f\u0011\u00cc\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00d1\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d8\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00dc\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00e0"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00e4\b\u0015\u0001\u0016"+
		"\u0003\u0016\u00e7\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00eb\b"+
		"\u0016\u0001\u0017\u0004\u0017\u00ee\b\u0017\u000b\u0017\f\u0017\u00ef"+
		"\u0001\u0017\u0004\u0017\u00f3\b\u0017\u000b\u0017\f\u0017\u00f4\u0003"+
		"\u0017\u00f7\b\u0017\u0001\u0018\u0004\u0018\u00fa\b\u0018\u000b\u0018"+
		"\f\u0018\u00fb\u0003\u0018\u00fe\b\u0018\u0001\u0018\u0001\u0018\u0004"+
		"\u0018\u0102\b\u0018\u000b\u0018\f\u0018\u0103\u0003\u0018\u0106\b\u0018"+
		"\u0003\u0018\u0108\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u010e\b\u001a\u000b\u001a\f\u001a\u010f\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u0117\b\u001c\u000b"+
		"\u001c\f\u001c\u0118\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u0125"+
		"\b \n \f \u0128\t \u0001 \u0001 \u0001!\u0001!\u0003!\u012e\b!\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0006"+
		"\u0001\u0000//\u0001\u0000\u0013\u0018\u0001\u0000\u0019\u001a\u0002\u0000"+
		"\u0003\u0003\u001c(\u0002\u0000\u0001\u0001),\u0002\u0000((--\u0140\u0000"+
		"N\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004V\u0001"+
		"\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000"+
		"\u0000\nn\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e\u0082"+
		"\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u0092"+
		"\u0001\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u009a"+
		"\u0001\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u00a6"+
		"\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000\u001e\u00b2"+
		"\u0001\u0000\u0000\u0000 \u00c3\u0001\u0000\u0000\u0000\"\u00d0\u0001"+
		"\u0000\u0000\u0000$\u00d7\u0001\u0000\u0000\u0000&\u00db\u0001\u0000\u0000"+
		"\u0000(\u00dd\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,"+
		"\u00e6\u0001\u0000\u0000\u0000.\u00f6\u0001\u0000\u0000\u00000\u00fd\u0001"+
		"\u0000\u0000\u00002\u0109\u0001\u0000\u0000\u00004\u010b\u0001\u0000\u0000"+
		"\u00006\u0111\u0001\u0000\u0000\u00008\u0114\u0001\u0000\u0000\u0000:"+
		"\u011c\u0001\u0000\u0000\u0000<\u011e\u0001\u0000\u0000\u0000>\u0120\u0001"+
		"\u0000\u0000\u0000@\u0122\u0001\u0000\u0000\u0000B\u012d\u0001\u0000\u0000"+
		"\u0000D\u012f\u0001\u0000\u0000\u0000F\u0131\u0001\u0000\u0000\u0000H"+
		"\u0133\u0001\u0000\u0000\u0000J\u0135\u0001\u0000\u0000\u0000L\u0137\u0001"+
		"\u0000\u0000\u0000NP\u0003D\"\u0000OQ\u0003H$\u0000PO\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000Q\u0001\u0001\u0000\u0000\u0000RT\u0003"+
		"\u0000\u0000\u0000SU\u0003J%\u0000TS\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0003\u0006\u0003\u0000"+
		"WY\u0005\u0001\u0000\u0000XZ\u00051\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\\u0005\u0001\u0000\u0000\u0000]_\u00051\u0000\u0000^]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0005\u0002\u0000\u0000"+
		"ce\u00051\u0000\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0007\u0001\u0000"+
		"\u0000\u0000hl\u0005\u0003\u0000\u0000il\u0005\u0004\u0000\u0000jl\u0003"+
		"\u0006\u0003\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000mo\u00051\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0005\u0002"+
		"\u0000\u0000su\u00051\u0000\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000b"+
		"\u0001\u0000\u0000\u0000x|\u0005\u0005\u0000\u0000y{\u00050\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u00051\u0000\u0000\u0080\u0081\u0003B!"+
		"\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0084\u0005\u0006\u0000\u0000"+
		"\u0083\u0085\b\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0003B!\u0000\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008c\u0005"+
		"\u0007\u0000\u0000\u008b\u008d\b\u0000\u0000\u0000\u008c\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0003B!\u0000\u0091\u0011\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094\u0003\n\u0005\u0000\u0094"+
		"\u0095\u0003B!\u0000\u0095\u0013\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"\t\u0000\u0000\u0097\u0098\u0003\b\u0004\u0000\u0098\u0099\u0003B!\u0000"+
		"\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000\u009b"+
		"\u009c\u0003\u0004\u0002\u0000\u009c\u009d\u0003B!\u0000\u009d\u0017\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0005\u000b\u0000\u0000\u009f\u00a1\b\u0000"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003B!\u0000"+
		"\u00a5\u0019\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\f\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0002\u0001\u0000\u00a8\u00a9\u0003B!\u0000\u00a9\u001b\u0001"+
		"\u0000\u0000\u0000\u00aa\u00b1\u0003\u0010\b\u0000\u00ab\u00b1\u0003\u0012"+
		"\t\u0000\u00ac\u00b1\u0003\u0014\n\u0000\u00ad\u00b1\u0003\u0016\u000b"+
		"\u0000\u00ae\u00b1\u0003\u0018\f\u0000\u00af\u00b1\u0003@ \u0000\u00b0"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u001d\u0001\u0000\u0000\u0000\u00b2\u00b6\u0003\f\u0006\u0000\u00b3\u00b5"+
		"\u0003@ \u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bd\u0003\u000e\u0007\u0000\u00ba\u00bc\u0003\u001c"+
		"\u000e\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0003\u001a\r\u0000\u00c1\u001f\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003\"\u0011\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6!\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0003$\u0012\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d1\u0005/\u0000\u0000\u00ce\u00d1\u0003"+
		">\u001f\u0000\u00cf\u00d1\u0003@ \u0000\u00d0\u00ca\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1#\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003&\u0013\u0000\u00d3"+
		"\u00d8\u00034\u001a\u0000\u00d4\u00d8\u0003:\u001d\u0000\u00d5\u00d8\u0003"+
		"<\u001e\u0000\u00d6\u00d8\u00050\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8%\u0001\u0000\u0000\u0000\u00d9\u00dc\u0003(\u0014\u0000\u00da"+
		"\u00dc\u00038\u001c\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\'\u0001\u0000\u0000\u0000\u00dd\u00df\u0003"+
		"*\u0015\u0000\u00de\u00e0\u00030\u0018\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0)\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0003,\u0016\u0000\u00e2\u00e4\u00032\u0019\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4+\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0003F#\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ea\u0003D\"\u0000\u00e9\u00eb\u0003.\u0017\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"-\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005\r\u0000\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005\u000e\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00ed\u0001\u0000\u0000\u0000\u00f6\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f7/\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005"+
		"1\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0107\u0001\u0000"+
		"\u0000\u0000\u00ff\u0105\u0005\u0002\u0000\u0000\u0100\u0102\u00051\u0000"+
		"\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0101\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000\u0000"+
		"\u0000\u0107\u00ff\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u01081\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u000f\u0000\u0000"+
		"\u010a3\u0001\u0000\u0000\u0000\u010b\u010d\u00036\u001b\u0000\u010c\u010e"+
		"\u0003&\u0013\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001"+
		"\u0000\u0000\u0000\u01105\u0001\u0000\u0000\u0000\u0111\u0112\u0005\u0010"+
		"\u0000\u0000\u0112\u0113\u00051\u0000\u0000\u01137\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0005\u0011\u0000\u0000\u0115\u0117\u0003(\u0014\u0000\u0116"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0012\u0000\u0000\u011b"+
		"9\u0001\u0000\u0000\u0000\u011c\u011d\u0007\u0001\u0000\u0000\u011d;\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0007\u0002\u0000\u0000\u011f=\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0003\u0018\f\u0000\u0121?\u0001\u0000\u0000"+
		"\u0000\u0122\u0126\u0005\u001b\u0000\u0000\u0123\u0125\b\u0000\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u0005/\u0000\u0000\u012aA\u0001\u0000\u0000\u0000\u012b\u012e"+
		"\u0003@ \u0000\u012c\u012e\u0005/\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012eC\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0007\u0003\u0000\u0000\u0130E\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0007\u0004\u0000\u0000\u0132G\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0007\u0005\u0000\u0000\u0134I\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0005.\u0000\u0000\u0136K\u0001\u0000\u0000\u0000\u0137\u0138\u0003\u001e"+
		"\u000f\u0000\u0138\u0139\u0003 \u0010\u0000\u0139M\u0001\u0000\u0000\u0000"+
		"$PT[`fkpv|\u0086\u008e\u00a2\u00b0\u00b6\u00bd\u00c5\u00ca\u00d0\u00d7"+
		"\u00db\u00df\u00e3\u00e6\u00ea\u00ef\u00f4\u00f6\u00fb\u00fd\u0103\u0105"+
		"\u0107\u010f\u0118\u0126\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}