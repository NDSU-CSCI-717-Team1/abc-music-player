package abc.sound;

import java.util.List;

import abc.sound.Tuplet.TupletForm;

/**
 * An immutable data type to represent the type of music note, rest, etc.
 * @author sriram
 *
 */
public interface MusicElement {
	
	/**
	 * Datatype definitions
	 * MusicElement = Chord(int duration, int numberOfNotes)
	 * 				  Measure(boolean measureRepeat, int duration, List<MusicElement> musicElements) 
	 * 				  Note(double duration, Pitch pitch)
	 * 				  Rest(int duration)
	 * 				  Tuplet(TupletForm form, List<MusicElement> tupletNotes)s
	 */
	
	/**
	 * Gets the duration of the element
	 * @return gets the duration
	 */
	public int getDuration();
	
	/**
	 * 
	 * @return if measure repeat is true
	 */
	public boolean isMeasureRepeat();

}
