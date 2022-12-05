package abc.model;

public class Note {
	
	private final Integer pitch;
	private final Integer startTick;
	private final Integer numTicks;

	public Note(int note, int startTick, int numTicks) {
		this.pitch = note;
		this.startTick = startTick;
		this.numTicks = numTicks;
	}
	
	public Integer getPitch() {
		return pitch;
	}

	public Integer getStartTick() {
		return startTick;
	}

	public Integer getNumTicks() {
		return numTicks;
	}
}
