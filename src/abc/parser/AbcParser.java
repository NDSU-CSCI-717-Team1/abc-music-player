// Generated from Abc.g4 by ANTLR 4.5.1

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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, 
    T__30=31, T__31=32, NEW_LINE=33, TEXT=34, WHITESPACE=35, DIGIT=36;
  public static final int
    RULE_comment = 0, RULE_end_of_line = 1, RULE_basenote = 2, RULE_accidental = 3, 
    RULE_key_accidental = 4, RULE_mode_minor = 5, RULE_keynote = 6, RULE_key = 7, 
    RULE_tempo = 8, RULE_meter_fraction = 9, RULE_meter = 10, RULE_note_length_strict = 11, 
    RULE_field_number = 12, RULE_field_title = 13, RULE_field_composer = 14, 
    RULE_field_default_length = 15, RULE_field_meter = 16, RULE_field_tempo = 17, 
    RULE_field_voice = 18, RULE_field_key = 19, RULE_other_fields = 20, 
    RULE_abc_header = 21, RULE_abc_tune = 22;
  public static final String[] ruleNames = {
    "comment", "end_of_line", "basenote", "accidental", "key_accidental", 
    "mode_minor", "keynote", "key", "tempo", "meter_fraction", "meter", 
    "note_length_strict", "field_number", "field_title", "field_composer", 
    "field_default_length", "field_meter", "field_tempo", "field_voice", 
    "field_key", "other_fields", "abc_header", "abc_tune"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'%'", "'C'", "'D'", "'E'", "'F'", "'G'", "'A'", "'B'", "'c'", 
    "'d'", "'e'", "'f'", "'g'", "'a'", "'b'", "'^'", "'^^'", "'_'", "'__'", 
    "'='", "'#'", "'m'", "'/'", "'C|'", "'X:'", "'T:'", "'C:'", "'L:'", 
    "'M:'", "'Q:'", "'V:'", "'K:'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, "NEW_LINE", "TEXT", 
    "WHITESPACE", "DIGIT"
  };
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
  public String getGrammarFileName() { return "Abc.g4"; }

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
  public static class CommentContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
    public TerminalNode NEW_LINE() { return getToken(AbcParser.NEW_LINE, 0); }
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
    enterRule(_localctx, 0, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(46);
      match(T__0);
      setState(47);
      match(TEXT);
      setState(48);
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

  public static class End_of_lineContext extends ParserRuleContext {
    public TerminalNode NEW_LINE() { return getToken(AbcParser.NEW_LINE, 0); }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
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
    enterRule(_localctx, 2, RULE_end_of_line);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(52);
      switch (_input.LA(1)) {
      case NEW_LINE:
        {
        setState(50);
        match(NEW_LINE);
        }
        break;
      case T__0:
        {
        setState(51);
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
    enterRule(_localctx, 4, RULE_basenote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(54);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
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
    enterRule(_localctx, 6, RULE_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(56);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
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
    enterRule(_localctx, 8, RULE_key_accidental);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(58);
      _la = _input.LA(1);
      if ( !(_la==T__14 || _la==T__20) ) {
      _errHandler.recoverInline(this);
      } else {
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
    enterRule(_localctx, 10, RULE_mode_minor);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(60);
      match(T__21);
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
    enterRule(_localctx, 12, RULE_keynote);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(62);
      basenote();
      setState(64);
      _la = _input.LA(1);
      if (_la==T__14 || _la==T__20) {
        {
        setState(63);
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
    enterRule(_localctx, 14, RULE_key);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(66);
      keynote();
      setState(68);
      _la = _input.LA(1);
      if (_la==T__21) {
        {
        setState(67);
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
    enterRule(_localctx, 16, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(70);
      meter_fraction();
      setState(71);
      match(T__19);
      setState(73); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(72);
        match(DIGIT);
        }
        }
        setState(75); 
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
    enterRule(_localctx, 18, RULE_meter_fraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(78); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(77);
        match(DIGIT);
        }
        }
        setState(80); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(82);
      match(T__22);
      setState(84); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(83);
        match(DIGIT);
        }
        }
        setState(86); 
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
    enterRule(_localctx, 20, RULE_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(91);
      switch (_input.LA(1)) {
      case T__1:
        {
        setState(88);
        match(T__1);
        }
        break;
      case T__23:
        {
        setState(89);
        match(T__23);
        }
        break;
      case DIGIT:
        {
        setState(90);
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
    enterRule(_localctx, 22, RULE_note_length_strict);
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
      match(T__22);
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

  public static class Field_numberContext extends ParserRuleContext {
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(AbcParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(AbcParser.DIGIT, i);
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
    enterRule(_localctx, 24, RULE_field_number);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(104);
      match(T__24);
      setState(106); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(105);
        match(DIGIT);
        }
        }
        setState(108); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(110);
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

  public static class Field_titleContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
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
    enterRule(_localctx, 26, RULE_field_title);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      match(T__25);
      setState(113);
      match(TEXT);
      setState(114);
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

  public static class Field_composerContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
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
    enterRule(_localctx, 28, RULE_field_composer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(116);
      match(T__26);
      setState(117);
      match(TEXT);
      setState(118);
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
    enterRule(_localctx, 30, RULE_field_default_length);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      match(T__27);
      setState(121);
      note_length_strict();
      setState(122);
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
    enterRule(_localctx, 32, RULE_field_meter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(124);
      match(T__28);
      setState(125);
      meter();
      setState(126);
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
    enterRule(_localctx, 34, RULE_field_tempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(128);
      match(T__29);
      setState(129);
      tempo();
      setState(130);
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

  public static class Field_voiceContext extends ParserRuleContext {
    public TerminalNode TEXT() { return getToken(AbcParser.TEXT, 0); }
    public End_of_lineContext end_of_line() {
      return getRuleContext(End_of_lineContext.class,0);
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
    enterRule(_localctx, 36, RULE_field_voice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(132);
      match(T__30);
      setState(133);
      match(TEXT);
      setState(134);
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
    enterRule(_localctx, 38, RULE_field_key);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(136);
      match(T__31);
      setState(137);
      key();
      setState(138);
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
    enterRule(_localctx, 40, RULE_other_fields);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(146);
      switch (_input.LA(1)) {
      case T__26:
        {
        setState(140);
        field_composer();
        }
        break;
      case T__27:
        {
        setState(141);
        field_default_length();
        }
        break;
      case T__28:
        {
        setState(142);
        field_meter();
        }
        break;
      case T__29:
        {
        setState(143);
        field_tempo();
        }
        break;
      case T__30:
        {
        setState(144);
        field_voice();
        }
        break;
      case T__0:
        {
        setState(145);
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
    enterRule(_localctx, 42, RULE_abc_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(148);
      field_number();
      setState(152);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0) {
        {
        {
        setState(149);
        comment();
        }
        }
        setState(154);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(155);
      field_title();
      setState(159);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
        {
        {
        setState(156);
        other_fields();
        }
        }
        setState(161);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(162);
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

  public static class Abc_tuneContext extends ParserRuleContext {
    public Abc_headerContext abc_header() {
      return getRuleContext(Abc_headerContext.class,0);
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
    enterRule(_localctx, 44, RULE_abc_tune);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(164);
      abc_header();
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00a9\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
      "\30\3\2\3\2\3\2\3\2\3\3\3\3\5\3\67\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
      "\3\7\3\b\3\b\5\bC\n\b\3\t\3\t\5\tG\n\t\3\n\3\n\3\n\6\nL\n\n\r\n\16"+
      "\nM\3\13\6\13Q\n\13\r\13\16\13R\3\13\3\13\6\13W\n\13\r\13\16\13X\3"+
      "\f\3\f\3\f\5\f^\n\f\3\r\6\ra\n\r\r\r\16\rb\3\r\3\r\6\rg\n\r\r\r\16"+
      "\rh\3\16\3\16\6\16m\n\16\r\16\16\16n\3\16\3\16\3\17\3\17\3\17\3\17"+
      "\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
      "\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
      "\3\26\3\26\3\26\3\26\5\26\u0095\n\26\3\27\3\27\7\27\u0099\n\27\f\27"+
      "\16\27\u009c\13\27\3\27\3\27\7\27\u00a0\n\27\f\27\16\27\u00a3\13\27"+
      "\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
      "\34\36 \"$&(*,.\2\5\3\2\4\21\3\2\22\26\4\2\21\21\27\27\u00a3\2\60"+
      "\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\f>\3\2\2\2"+
      "\16@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24P\3\2\2\2\26]\3\2\2\2\30`\3"+
      "\2\2\2\32j\3\2\2\2\34r\3\2\2\2\36v\3\2\2\2 z\3\2\2\2\"~\3\2\2\2$\u0082"+
      "\3\2\2\2&\u0086\3\2\2\2(\u008a\3\2\2\2*\u0094\3\2\2\2,\u0096\3\2\2"+
      "\2.\u00a6\3\2\2\2\60\61\7\3\2\2\61\62\7$\2\2\62\63\7#\2\2\63\3\3\2"+
      "\2\2\64\67\7#\2\2\65\67\5\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3"+
      "\2\2\289\t\2\2\29\7\3\2\2\2:;\t\3\2\2;\t\3\2\2\2<=\t\4\2\2=\13\3\2"+
      "\2\2>?\7\30\2\2?\r\3\2\2\2@B\5\6\4\2AC\5\n\6\2BA\3\2\2\2BC\3\2\2\2"+
      "C\17\3\2\2\2DF\5\16\b\2EG\5\f\7\2FE\3\2\2\2FG\3\2\2\2G\21\3\2\2\2"+
      "HI\5\24\13\2IK\7\26\2\2JL\7&\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3"+
      "\2\2\2N\23\3\2\2\2OQ\7&\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2"+
      "\2ST\3\2\2\2TV\7\31\2\2UW\7&\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
      "\2\2\2Y\25\3\2\2\2Z^\7\4\2\2[^\7\32\2\2\\^\5\24\13\2]Z\3\2\2\2][\3"+
      "\2\2\2]\\\3\2\2\2^\27\3\2\2\2_a\7&\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
      "\2bc\3\2\2\2cd\3\2\2\2df\7\31\2\2eg\7&\2\2fe\3\2\2\2gh\3\2\2\2hf\3"+
      "\2\2\2hi\3\2\2\2i\31\3\2\2\2jl\7\33\2\2km\7&\2\2lk\3\2\2\2mn\3\2\2"+
      "\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\4\3\2q\33\3\2\2\2rs\7\34\2\2"+
      "st\7$\2\2tu\5\4\3\2u\35\3\2\2\2vw\7\35\2\2wx\7$\2\2xy\5\4\3\2y\37"+
      "\3\2\2\2z{\7\36\2\2{|\5\30\r\2|}\5\4\3\2}!\3\2\2\2~\177\7\37\2\2\177"+
      "\u0080\5\26\f\2\u0080\u0081\5\4\3\2\u0081#\3\2\2\2\u0082\u0083\7 "+
      "\2\2\u0083\u0084\5\22\n\2\u0084\u0085\5\4\3\2\u0085%\3\2\2\2\u0086"+
      "\u0087\7!\2\2\u0087\u0088\7$\2\2\u0088\u0089\5\4\3\2\u0089\'\3\2\2"+
      "\2\u008a\u008b\7\"\2\2\u008b\u008c\5\20\t\2\u008c\u008d\5\4\3\2\u008d"+
      ")\3\2\2\2\u008e\u0095\5\36\20\2\u008f\u0095\5 \21\2\u0090\u0095\5"+
      "\"\22\2\u0091\u0095\5$\23\2\u0092\u0095\5&\24\2\u0093\u0095\5\2\2"+
      "\2\u0094\u008e\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0094"+
      "\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095+\3\2"+
      "\2\2\u0096\u009a\5\32\16\2\u0097\u0099\5\2\2\2\u0098\u0097\3\2\2\2"+
      "\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
      "\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\5\34\17\2\u009e\u00a0"+
      "\5*\26\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2"+
      "\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
      "\u00a5\5(\25\2\u00a5-\3\2\2\2\u00a6\u00a7\5,\27\2\u00a7/\3\2\2\2\17"+
      "\66BFMRX]bhn\u0094\u009a\u00a1";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}