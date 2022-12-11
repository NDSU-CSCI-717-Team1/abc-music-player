package abc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import abc.parser.AbcParser.PitchContext;
import abc.sound.Pitch;

/*
 * Holds fields parsed from AST for later placement into SequencePlayer.
 */
public class Music {

	private final int tempo;
	private final int meter;
	private int repeatStartTick = 0;

	private final ArrayList<Note> notes = new ArrayList<>();
	private int currentTick;

	public Music(int tempo, int meter) {
		this.tempo = tempo;
		this.meter = meter;
		this.currentTick = 0;
	}

	public void appendNote(Character accidental, char basenote, String octave, String numerator, String denominator) {
		int intDenom = denominator == null ? 1 : Integer.valueOf(denominator);
		int intNumer = numerator == null ? 1 : Integer.valueOf(numerator);
		int length = (intNumer * meter) / (intDenom);
		int transpose = getOctave(octave);
		if (Character.isLowerCase(basenote)) {
			transpose += Pitch.OCTAVE;
		}
		if (accidental != null && accidental.equals('^')) {
			transpose++;
		} else if (accidental != null && accidental.equals('_')) {
			transpose--;
		}
		int p = new Pitch(Character.toUpperCase(basenote)).transpose(transpose).toMidiNote();
		notes.add(new Note(p, currentTick, length));
		currentTick += length;
	}

	// Assumes all mutli-notes and tuplets are of length 1 meter
	public void appendMultiNoteOrTuplet(List<PitchContext> pitches, boolean isTuplet) {
		int length = meter / pitches.size();
		for (PitchContext pitch : pitches) {
			int transpose = 0;
			if (Character.isLowerCase(pitch.basenote().getText().charAt(0))) {
				transpose += Pitch.OCTAVE;
			}
			if (pitch.octave() != null) {
				transpose += getOctave(pitch.octave().getText());
			}
			if (pitch.accidental() != null && pitch.accidental().getText().equals("^")) {
				transpose++;
			} else if (pitch.accidental() != null && pitch.accidental().getText().equals("_")) {
				transpose--;
			}
			int p = new Pitch(Character.toUpperCase(pitch.basenote().getText().charAt(0))).transpose(transpose)
					.toMidiNote();
			notes.add(new Note(p, currentTick, length));
			if (isTuplet) {
				currentTick += length;
			}
		}
		if (!isTuplet) {
			currentTick += meter;
		}
	}

	public int getOctave(String octave) {
		int upCount = (int) Stream.ofNullable(octave).flatMap(oct -> oct.chars().mapToObj(c -> (char) c))
				.filter(c -> c == '\'').count();
		int downCount = (int) Stream.ofNullable(octave).flatMap(oct -> oct.chars().mapToObj(c -> (char) c))
				.filter(c -> c == ',').count();
		return (upCount - downCount) * 12;
	}

	public void appendRest(String numerator, String denominator) {
		int intDenom = denominator == null ? 1 : Integer.valueOf(denominator);
		int intNumer = numerator == null ? 1 : Integer.valueOf(numerator);
		int length = (intNumer * meter) / (intDenom);
		notes.add(new Note(0, currentTick, length));
		currentTick += length;
	}

	public void handleRepeat() {
		int endIndex = notes.size();
		int startIndex = IntStream.range(0, notes.size())
				.filter(i -> this.repeatStartTick == notes.get(i).getStartTick()).findFirst()
				.orElseThrow(() -> new RuntimeException());
		int localNoteStartTick = notes.get(0).getStartTick();
		for (int i = startIndex; i <= endIndex; i++) {
			Note repeated = notes.get(i);
			if (localNoteStartTick != repeated.getStartTick()) {
				currentTick += (repeated.getStartTick() - localNoteStartTick);
				localNoteStartTick = repeated.getStartTick();
			}
			notes.add(new Note(repeated.getPitch(), currentTick, repeated.getNumTicks()));
		}
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

	public int getRepeatStartTick() {
		return repeatStartTick;
	}

	public void setRepeatStartTick() {
		this.repeatStartTick = this.currentTick;
	}

}
