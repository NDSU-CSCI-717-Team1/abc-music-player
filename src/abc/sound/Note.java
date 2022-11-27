package abc.sound;

public class Note {

	// Abstraction function: Note function represents the particular thing to be played, which is denoted by a letter
	// Rep invariant: A note must have a non-negative duration
	
	private final double duration;
	private final Pitch pitch;
	
	public Note(double duration, Pitch pitch) {
		this.duration = duration;
		this.pitch = pitch;
	}
	
	private void checkRep() {
		assert duration > 0;
	}
	
}