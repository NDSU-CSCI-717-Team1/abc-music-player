package abc.model;

import java.util.stream.Stream;

import abc.parser.AbcParser.PitchContext;

/**
 * A class to represent the accidentals
 *
 */
public class Accidental {

	PitchContext pitchContext;
	
	public Accidental() {
		
	}
	

	public Accidental(PitchContext pitchContext) {
		this.pitchContext = pitchContext;
	}
	
	public void setAccidental(PitchContext pitchContext) {
		this.pitchContext = pitchContext;
	}
	
	public PitchContext getAccidental() {
		return this.pitchContext;
	}
	
	public Character transcribe(PitchContext p) {
		return Stream.of(p.accidental()).filter(it -> it != null).map(it -> it.getText().charAt(0))
		.findFirst().orElse(null);
	}
	
}


