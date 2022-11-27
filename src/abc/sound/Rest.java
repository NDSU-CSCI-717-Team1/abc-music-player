package abc.sound;

public class Rest {

	private final int duration;
	
	
	// Rep invariant: Duration must be non-negative
	// Abstraction function: Rest represents the amount of pause controlled by the duration.
	
	public Rest(int duration) {
		this.duration = duration;
	}
	
	private void checkRep() {
		assert duration >= 0;
	}
	
	public String toString() {
		return "z" + duration;
	}
}