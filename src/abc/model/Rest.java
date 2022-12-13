package abc.model;


/**
 * Immutable music data type to represent a rest played from the abc file
 * @author sriram
 *
 */

public class Rest {

	private Fraction duration;
	
	// Abstraction function: Rest represents the amount of pause controlled by the duration.
	// Rep invariant: Duration must be non-negative
	
	public Rest() {
		
	}
	public Rest(Fraction duration) {
		this.duration = duration;
	}
	
	public Fraction getDuration() {
		return duration;
	}
	public void setDuration(Fraction duration) {
		this.duration = duration;
	}
	// checks if the length of the Rest object is greater than or equal to 0 in time
	private void checkRep() {
		assert Integer.parseInt(duration.numerator) >= 0;
		assert Integer.parseInt(duration.denominator) >= 0;
	}
	
	/**
	 * 
	 * @return string value of the rest duration
	 */
	public String toString() {
		return "z" + duration;
	}
}