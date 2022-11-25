package abc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import abc.parser.AbcParser.PitchContext;
import abc.sound.Pitch;

public class Music {

	private final int tempo;
	private final int meter;
	private final ArrayList<Note> notes = new ArrayList<>();
	private int currentTick = 0;

	public Music(int tempo, int meter) {
		this.tempo = tempo;
		this.meter = meter;
	}

	public void appendNote(Character accidental, char basenote, String octave, String numerator, String denominator) {
		int intDenom = denominator == null ? 1 : Integer.valueOf(denominator);
		int intNumer = numerator == null ? 1 : Integer.valueOf(numerator);
		int length = intNumer * tempo / intDenom;
		Pitch p = new Pitch(Character.toUpperCase(basenote));
		handleOctave(p, octave);
		if (accidental != null && accidental.equals('^')) {
			p.transpose(1);
		} else if (accidental != null && accidental.equals('_')) {
			p.transpose(-1);
		}
		notes.add(new Note(p.toMidiNote(), currentTick, length));
		currentTick += length;
	}
	
	// Assumes all mutli-notes and tuplets are of length 1 meter
	public void appendMultiNoteOrTuplet(List<PitchContext> pitches) {
		int length = tempo;
		for (PitchContext pitch : pitches) {
			Pitch p = new Pitch(Character.toUpperCase(pitch.basenote().getText().charAt(0)));
			if (pitch.octave() != null) {
				handleOctave(p, pitch.octave().getText());
			}
			if (pitch.accidental() != null && pitch.accidental().equals('^')) {
				p.transpose(1);
			} else if (pitch.accidental() != null && pitch.accidental().equals('_')) {
				p.transpose(-1);
			}
			notes.add(new Note(p.toMidiNote(), currentTick, length));
		}
		currentTick += length;
	}
	
	public void handleOctave(Pitch p, String octave) {
		Stream.ofNullable(octave).flatMap(oct -> oct.chars().mapToObj(c -> (char) c)).filter(c -> c == '\'')
			.forEach(x -> p.transpose(Pitch.OCTAVE));
		Stream.ofNullable(octave).flatMap(oct -> oct.chars().mapToObj(c -> (char) c)).filter(c -> c == ',')
			.forEach(x -> p.transpose(-Pitch.OCTAVE));
	}
	
	public void appendRest(String numerator, String denominator) {
		int intDenom = denominator == null ? 1 : Integer.valueOf(denominator);
		int intNumer = numerator == null ? 1 : Integer.valueOf(numerator);
		int length = intNumer * tempo / intDenom;
		notes.add(new Note(0, currentTick, length));
	}

	public void advanceTime(int increment) {
		currentTick += increment;
	}

	public int getTempo() {
		return tempo;
	}

	public int getMeter() {
		return meter;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}
}
