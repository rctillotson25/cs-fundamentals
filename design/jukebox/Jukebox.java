package jukebox;


public enum Jukebox {
	INSTANCE;

	private Track currentTrack;
	private CD currentCD;
	private List<CD> selection;

	private Jukebox() {
		this.CD = null;
		this.Track = null;	
	}

	public List<CD> getSelection() {
		return selection;
	}

	public Track getCurrentTrack; {
			
	}
}
