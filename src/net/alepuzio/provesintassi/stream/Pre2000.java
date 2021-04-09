package net.alepuzio.provesintassi.stream;

import java.util.List;

public interface Pre2000 {
	@SuppressWarnings("rawtypes")
	public List list(List<Album> albums);
}

class Java7 implements Pre2000 {
	@SuppressWarnings("rawtypes")
	public List list(List<Album> albums) {
		for (Album album : albums) {
			if (album.getYear() < 2000) {
				System.out.println(album.getAuthor());
			}
		}
		return albums;
	}
}

class Java8 implements Pre2000 {
	@SuppressWarnings("rawtypes")
	public List list(List<Album> albums) {
		albums.stream().filter(album -> album.getYear() < 2000)
		.map(Album::getAuthor)
		.forEach(System.out::println);
		return albums;
	}

}