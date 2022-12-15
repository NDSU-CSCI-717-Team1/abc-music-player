package abc.sound;

/**
 * @author sriram
 * Helps with performing repeat operation.
 **/
public class RepeatBar {
	
	private final RepeatBar baseMeasure;
	private final RepeatBar firstColon;
	private final RepeatBar secondColon;
	private final boolean repeat;
	private final int duration;
	
	// Abstraction function:
	// - Divides up the music segments into bars
	// 
	// Representation invariant:
	// duration >= 0
	// Repeated measures with no alternate ends have same firstEnding and secondEnding
	// If there are alternate ends, then firstEnding and secondEnding are different
	
	/**
	 * 
	 * @param firstColon left first Repeat element
	 * @param secondColon right second repeat element
	 * @param repeat represents if the measure is repeated
	 */
	public RepeatBar(RepeatBar baseMeasure, RepeatBar firstColon, RepeatBar secondColon, boolean repeat, int duration) {
		this.baseMeasure = baseMeasure;
		this.firstColon = firstColon;
		this.secondColon = secondColon;
		this.repeat = repeat;
		this.duration = duration;
	}
	
	/*
	 * Makes sure representation invariant is obeyed
	 */
	private void checkRep() {
		assert(this.duration >= 0);
	}
	
	public int duration() {
		checkRep();
		return this.duration;
	}
	
	public String toString() {
		return this.baseMeasure.toString() + "1: " + this.firstColon.toString() + "2: " + this.secondColon.toString() + this.repeat;
	}

}
