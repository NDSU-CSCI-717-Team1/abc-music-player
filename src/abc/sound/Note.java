package abc.sound;

/**
 * Immutable music data type to represent the note played from the abc file
 * @author sriram
 *
 */

public class Note {

	// Abstraction function: Note function represents the particular thing to be played, which is denoted by a letter
	// Rep invariant: A note must have a non-negative duration
	
	private final double duration;
	private final Pitch pitch;
	
	/**
	 * Constructs an instance of a note
	 * @param duration specifies the length of the note
	 * @param Pitch represents the pitch of the note
	 */
	public Note(double duration, Pitch pitch) {
		this.duration = duration;
		this.pitch = pitch;
	}
	
	// Checks if the duration of a note is greater than 0
	private void checkRep() {
		assert duration > 0;
	}
	
	/**
	 * @return the length of the note play
	 */
	public double getLength() {
		return duration;
	}
	
	/**
	 * 
	 * @return the note pitch
	 */
	public Pitch getPitch() {
		return pitch;
	}
	
}