package net.alepuzio.provesintassi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface ContaAlbum {
	@SuppressWarnings("rawtypes")
	public List parallelism(List<Album> albums);
}

class Unsupport implements ContaAlbum {

	@SuppressWarnings("rawtypes")
	public List parallelism(List<Album> albums) {
		List<String> results = new ArrayList<>();
		albums.parallelStream().flatMap(album -> album.getSongs().stream()).forEach(album -> results.add(album)); 
		/*Attenzione, gli stream paralleli sono non deterministici */
		return results;
	}
}

class Support implements ContaAlbum {

	@SuppressWarnings("rawtypes")
	public List parallelism(List<Album> albums) {
		List<String> results2 = albums.parallelStream().flatMap(album -> album.getSongs().stream())
				.collect(Collectors.toList());
		return results2;
	}

}