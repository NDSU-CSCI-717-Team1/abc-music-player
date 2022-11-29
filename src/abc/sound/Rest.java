package abc.sound;


/**
 * Immutable music data type to represent a rest played from the abc file
 * @author sriram
 *
 */

public class Rest {

	private final int duration;
	
	// Abstraction function: Rest represents the amount of pause controlled by the duration.
	// Rep invariant: Duration must be non-negative
	
	public Rest(int duration) {
		this.duration = duration;
	}
	
	// checks if the length of the Rest object is greater than or equal to 0 in time
	private void checkRep() {
		assert duration >= 0;
	}
	
	/**
	 * 
	 * @return string value of the rest duration
	 */
	public String toString() {
		return "z" + duration;
	}
}