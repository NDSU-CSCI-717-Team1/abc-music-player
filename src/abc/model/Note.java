package abc.model;

public class Note {
	
	private final Integer note;
	private final Integer startTick;
	private final Integer numTicks;

	public Note(int note, int startTick, int numTicks) {
		this.note = note;
		this.startTick = startTick;
		this.numTicks = numTicks;
	}
	
	public Integer getNote() {
		return note;
	}

	public Integer getStartTick() {
		return startTick;
	}

	public Integer getNumTicks() {
		return numTicks;
	}
}
