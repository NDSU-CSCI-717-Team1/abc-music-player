package abc.sound;

/**
 * Immutable music data type to represent the chord played from the abc file
 * @author sriram
 *
 */

public class Chord {

	private final int duration;
	private final int numberOfNotes;
	
	// Abstraction function: Chord represents a group of notes collectively played as a single note
	// Rep invariant: The duration must be greater than 0.
	
	public Chord(int duration, int numberOfNotes) {
		this.duration = duration;
		this.numberOfNotes = numberOfNotes;
	}
	
	// Checks if the number of notes the chord plays is greater than 0 to classify as a chord
	private void checkRep() {
		assert duration >= 0;
		assert numberOfNotes > 0;
	}
	
	/**
	 * @return a String with bracket enclosure of the chord notes
	 */
	public String toString() {
		return "[" + "]";
	}
}