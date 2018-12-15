package com.learn.warburton.entity;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public final class Album implements Performance {

	private String name;
	private List<Track> tracks;
	private List<Artist> musicians;

	public Album(String name, List<Track> tracks, List<Artist> musicians) {
		Objects.requireNonNull(name);
		Objects.requireNonNull(tracks);
		Objects.requireNonNull(musicians);
		this.name = name;
		this.tracks = tracks;
		this.musicians = musicians;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public String getName() {
		return name;
	}

	public Stream<Artist> getMusicians() {
		return musicians.stream();
	}

}
