package jukebox;

import java.util.List;

public class CD {

	private int id;
	private String name;
	private List<Track> tracks;

	public CD(int id, String name, List<Track> tracks) {
		this.id = id;
		this.name = name;
		this.tracks = tracks;
	}	

	public List<Track> getTracks() {
		return tracks;
	}
	
	public String getName() {
		return name;
	}

	public STring getId() {
		return id;
	}
}
