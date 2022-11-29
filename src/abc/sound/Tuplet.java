package abc.sound;

import java.util.*;
/**
 * Immutable music data type to represent a tuplet from the abc file.
 * @author sriram
 *
 */
public class Tuplet {
	
	public enum TupletForm {
		Duplet,
		Triplet,
		Quadruplet
	}
	
	private TupletForm form;
	private List<MusicElement> tupletNotes;

	// Abstraction function: Represents the notes to be played by the tuplet based on the tuplet configuration
	// Rep invariant: The list must not be empty as no rests are allowed
	public Tuplet(TupletForm form, List<MusicElement> tupletNotes) {
		this.form = form;
		this.tupletNotes = tupletNotes;
	}
	
	/**
	 * 
	 * @return the form of the tuplet as per the enums
	 */
	public TupletForm getForm() {
		return form;
	}
	
	/**
	 * 
	 * @return the list of tuplet notes
	 */
	public List<MusicElement> getTupletNotes(){
		return tupletNotes;
	}
	
	/**
	 * @return a string representation of the tuplet
	 */
	public String toString() {
		return "(";
	}
}
