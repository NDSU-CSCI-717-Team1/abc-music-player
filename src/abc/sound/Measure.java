package abc.sound;

import java.util.*;

/**
 * Represents the Measure music data type.
 * @author sriram
 *
 */
public class Measure {

	private int duration; 
	private List<MusicElement> musicElements = new ArrayList<MusicElement>();
	
	// Abstraction function: Represents a musical collection as a list of elements
	// Rep invariant: The duration must be greater than or equal to 0 as well as the list of
	// musical elements
	/**
	 * Constructs an instance of a measure.
	 */
	public Measure(boolean measureRepeat, int duration, List<MusicElement> musicElements) {
		this.duration = duration;
		this.musicElements = musicElements;
	}
	
	
	/**
	 * Checks that the rep invariant is met
	 */
	private void checkRep() {
		
		assert this.duration >= 0;
		assert this.musicElements.size() >= 0;
	}
	
	public int getDuration() {
		checkRep();
		return duration;
	}
	
	/**
	 * 
	 * @return a String of the measure that will repeat with a colon and vertical line appended to the end
	 */
	public String toString() {
		String addString = "";
		for (MusicElement elements: this.musicElements) {
			addString += elements.toString() + "";
		}
		return addString;
	}
}