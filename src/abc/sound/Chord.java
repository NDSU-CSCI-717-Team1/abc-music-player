package abc.sound;

public class Chord {

	private final int duration;
	private final int numberOfNotes;
	
	// Abstraction function: Chord represents a group of notes collectively played as a single note
	
	public Chord(int duration, int numberOfNotes) {
		this.duration = duration;
		this.numberOfNotes = numberOfNotes;
	}
	
	private void checkRep() {
		assert numberOfNotes > 0;
	}
	
	public String toString() {
		return "[" + "]";
	}
}