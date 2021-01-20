package net.alepuzio.provesintassi.stream.step;

import java.util.List;
import java.util.stream.Stream;

import net.alepuzio.provesintassi.stream.Album;

public class EsempioIntermediateOperation {

	public Stream intermediateOperation(List<Album> albums) {
		/* una volta che uso uno stream non posso piu' utilizzarlo di nuovo */
		Stream<Album> stream1 = albums.stream();
		Stream<Album> stream2 = stream1.filter(album -> album.getYear() < 2000);
		Stream<String> stream3 = stream2.map(Album::getAuthor);
		stream3.forEach(System.out::println);
		return stream3;
	}

}
