package net.alepuzio.provesintassi.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface TenSongsBefore2000 {

	public List<String> list(List<Album> albums);

	class Java7 implements TenSongsBefore2000 {

		public List<String> list(List<Album> albums) {
			int limit = 10;
			List<String> songs = new ArrayList<>();
			for (Album album : albums) {
				if (album.getYear() < 2000) {
					songs.addAll(album.getSongs());
				}
			}
			Collections.sort(songs);
			for (int i = 0; i < limit; i++) {
				System.out.println(songs.get(i));
			}
			return songs;
		}
	}

	class Java8 implements TenSongsBefore2000 {

		public List<String> list(List<Album> albums) {
			Stream<String> songs = albums.stream().filter(album -> album.getYear() < 2000)
					.flatMap(album -> album.getSongs().stream()).sorted().limit(10);
			songs.forEach(System.out::println);
			return songs.collect(Collectors.toList());
		}
	}
}
