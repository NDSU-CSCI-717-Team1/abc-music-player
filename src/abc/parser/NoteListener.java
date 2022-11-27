package abc.parser;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import abc.model.Music;
import abc.parser.AbcParser.Abc_headerContext;
import abc.parser.AbcParser.Abc_lineContext;
import abc.parser.AbcParser.Abc_musicContext;
import abc.parser.AbcParser.Abc_tuneContext;
import abc.parser.AbcParser.AccidentalContext;
import abc.parser.AbcParser.BarlineContext;
import abc.parser.AbcParser.BasenoteContext;
import abc.parser.AbcParser.CommentContext;
import abc.parser.AbcParser.ElementContext;
import abc.parser.AbcParser.End_of_lineContext;
import abc.parser.AbcParser.Field_composerContext;
import abc.parser.AbcParser.Field_default_lengthContext;
import abc.parser.AbcParser.Field_keyContext;
import abc.parser.AbcParser.Field_meterContext;
import abc.parser.AbcParser.Field_numberContext;
import abc.parser.AbcParser.Field_tempoContext;
import abc.parser.AbcParser.Field_titleContext;
import abc.parser.AbcParser.Field_voiceContext;
import abc.parser.AbcParser.KeyContext;
import abc.parser.AbcParser.Key_accidentalContext;
import abc.parser.AbcParser.KeynoteContext;
import abc.parser.AbcParser.MeterContext;
import abc.parser.AbcParser.Meter_fractionContext;
import abc.parser.AbcParser.Mid_tune_fieldContext;
import abc.parser.AbcParser.Mode_minorContext;
import abc.parser.AbcParser.Multi_noteContext;
import abc.parser.AbcParser.NoteContext;
import abc.parser.AbcParser.Note_elementContext;
import abc.parser.AbcParser.Note_lengthContext;
import abc.parser.AbcParser.Note_length_strictContext;
import abc.parser.AbcParser.Note_or_restContext;
import abc.parser.AbcParser.Nth_repeatContext;
import abc.parser.AbcParser.OctaveContext;
import abc.parser.AbcParser.Other_fieldsContext;
import abc.parser.AbcParser.PitchContext;
import abc.parser.AbcParser.RestContext;
import abc.parser.AbcParser.TempoContext;
import abc.parser.AbcParser.Tuplet_elementContext;
import abc.parser.AbcParser.Tuplet_specContext;
import abc.sound.SequencePlayer;

public class NoteListener extends AbcBaseListener {

	private SequencePlayer player;
	private int tempo;
	private Music music;

	public Music getMusic() {
		return music;
	}

	public NoteListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterKeynote(KeynoteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitKeynote(KeynoteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterKey(KeyContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitKey(KeyContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTempo(TempoContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTempo(TempoContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMeter_fraction(Meter_fractionContext ctx) {
		String meterFraction = ctx.getText();
		Integer denomintaor = Integer.parseInt(ctx.DIGIT().get(1).getText());
		this.music = new Music(this.tempo, denomintaor);
	}

	@Override
	public void exitMeter_fraction(Meter_fractionContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMeter(MeterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMeter(MeterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNote_length_strict(Note_length_strictContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitNote_length_strict(Note_length_strictContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_number(Field_numberContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_number(Field_numberContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_title(Field_titleContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_title(Field_titleContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_composer(Field_composerContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_composer(Field_composerContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_default_length(Field_default_lengthContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_default_length(Field_default_lengthContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_meter(Field_meterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_meter(Field_meterContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_tempo(Field_tempoContext ctx) {
		// TODO Auto-generated method stub
		String field = ctx.tempo().getText();
		if (field.contains("=")) {
			this.tempo = Integer.valueOf(field.substring(field.lastIndexOf("=") + 1));
		} else {
			this.tempo = Integer.valueOf(ctx.tempo().getText());
		}
	}

	@Override
	public void exitField_tempo(Field_tempoContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_voice(Field_voiceContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_voice(Field_voiceContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterField_key(Field_keyContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitField_key(Field_keyContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterOther_fields(Other_fieldsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitOther_fields(Other_fieldsContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAbc_header(Abc_headerContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAbc_header(Abc_headerContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAbc_music(Abc_musicContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAbc_music(Abc_musicContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAbc_line(Abc_lineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAbc_line(Abc_lineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterElement(ElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitElement(ElementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNote_element(Note_elementContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void exitNote_element(Note_elementContext ctx) {
		// TODO Auto-generated method stub
	}

	@Override
	public void enterNote(NoteContext ctx) {
		if (ctx.parent.parent.getClass().equals(Tuplet_elementContext.class)) {
			return; // Don't handle notes for tuplets as they will be done separately.
		} else if (ctx.parent.parent.getClass().equals(Multi_noteContext.class)) {
			return; // Don't handle notes for multi_notes as they will be done separately.
		}
		List<String> digits = ctx.note_length().DIGIT().stream().map(it -> it.getText()).collect(Collectors.toList());
		boolean isFraction = ctx.note_length().getText().contains("/");
		String numerator = null;
		String denominator = null;
		if (isFraction && !digits.isEmpty()) {
			numerator = digits.size() > 1 ? digits.get(0) : null;
			System.out.println(ctx.getText() + digits);
			denominator = digits.size() > 1 ? digits.get(1) : digits.get(0);
		} else {
			numerator = digits.size() > 0 ? digits.get(0) : null;
		}
		if (ctx.note_or_rest().rest() != null) {
			music.appendRest(numerator, denominator);
		} else {
			PitchContext p = ctx.note_or_rest().pitch();
			Character accidental = Stream.of(p.accidental()).filter(it -> it != null).map(it -> it.getText().charAt(0))
					.findFirst().orElse(null);
			char basenote = p.basenote().getText().charAt(0); // Basenote must exist at this point post-rest processing
			String octave = Stream.of(p.octave()).filter(it -> it != null)
					.map(it -> new String(it.getText().toCharArray())).findFirst().orElse(null);
			music.appendNote(accidental, basenote, octave, numerator, denominator);
		}
	}

	@Override
	public void exitNote(NoteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNote_or_rest(Note_or_restContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitNote_or_rest(Note_or_restContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterPitch(PitchContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitPitch(PitchContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterOctave(OctaveContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitOctave(OctaveContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNote_length(Note_lengthContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitNote_length(Note_lengthContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterRest(RestContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitRest(RestContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTuplet_element(Tuplet_elementContext ctx) {
		List<PitchContext> pitches = ctx.note_element().stream().map(it -> it.note().note_or_rest().pitch()).collect(Collectors.toList());
		music.appendMultiNoteOrTuplet(pitches);
	}

	@Override
	public void exitTuplet_element(Tuplet_elementContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterTuplet_spec(Tuplet_specContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitTuplet_spec(Tuplet_specContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMulti_note(Multi_noteContext ctx) {
		List<PitchContext> pitches = ctx.note().stream().map(it -> it.note_or_rest().pitch()).collect(Collectors.toList());
		music.appendMultiNoteOrTuplet(pitches);

	}

	@Override
	public void exitMulti_note(Multi_noteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterBarline(BarlineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitBarline(BarlineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterNth_repeat(Nth_repeatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitNth_repeat(Nth_repeatContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMid_tune_field(Mid_tune_fieldContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMid_tune_field(Mid_tune_fieldContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterComment(CommentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitComment(CommentContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterEnd_of_line(End_of_lineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitEnd_of_line(End_of_lineContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterBasenote(BasenoteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitBasenote(BasenoteContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAccidental(AccidentalContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAccidental(AccidentalContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterKey_accidental(Key_accidentalContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitKey_accidental(Key_accidentalContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterMode_minor(Mode_minorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitMode_minor(Mode_minorContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterAbc_tune(Abc_tuneContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAbc_tune(Abc_tuneContext ctx) {
		// TODO Auto-generated method stub

	}

}
