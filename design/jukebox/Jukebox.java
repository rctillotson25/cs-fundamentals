package jukebox;

import java.util.List;

public enum Jukebox {
	INSTANCE;

	private Track currentTrack;
	private CD currentCD;
	private List<CD> selection;

	private Jukebox() {
		this.currentCD = null;
		this.currentTrack = null;
		this.selection = initSelection();
	}

	private List<CD> initSelection() {
		return null;
	}
	public List<CD> getSelection() {
		return selection;
	}

	public Track getCurrentTrack() {
		return currentTrack;
	}

	public void printTracklist() {
		for(CD disc : selection) {
			System.out.println("DISC: " + disc.getName());
			for(Track track : disc.getTracks()) {
				System.out.println("Track: " + track.getName());
			}
		}
	}
}
