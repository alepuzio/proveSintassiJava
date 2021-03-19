package net.alepuzio.provesintassi.stream.step;

import java.util.List;
import java.util.stream.Collectors;

import net.alepuzio.provesintassi.stream.Album;

public class EsempioDestinazioneStream {

	public double terminalOperationAvgSong(List<Album> albums) {
		double avgSong = albums.stream().mapToInt(
				album -> album.getSongs().size())/* trasformo Stream di Album in Stream numerico*/
				.average().getAsDouble();
		return avgSong;
	}

	public List<String> terminalOperationAuthors(List<Album> albums) {
		List<String> authors = albums.stream().filter(
				album -> album.getYear() < 2000).map(Album::getAuthor)
				.collect(Collectors.toList());
		return authors;
	}

}
