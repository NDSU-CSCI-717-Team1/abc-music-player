package abc.model;

public class Note {
	
	private final Integer pitch;
	private final Integer startTick;
	private final Integer numTicks;
	private final Boolean skipOnRepeat;

	public Note(int note, int startTick, int numTicks, Boolean skipOnRepeat) {
		this.pitch = note;
		this.startTick = startTick;
		this.numTicks = numTicks;
		this.skipOnRepeat = skipOnRepeat;
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

	public Boolean skipOnRepeat() {
		return skipOnRepeat;
	}
}
