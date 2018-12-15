package com.learn.warburton.entity;

import static java.util.stream.Stream.concat;

import java.util.stream.Stream;

public interface Performance {
	String getName();

	Stream<Artist> getMusicians();

	default Stream<Artist> getAllMusicians() {
		return getAllMusicians().flatMap(artist -> {
			return concat(Stream.of(artist), artist.getMembers());
		});
	}
}
