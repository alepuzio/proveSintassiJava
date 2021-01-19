package net.alepuzio.provesintassi.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * da https://codingjam.it/java-8-uno-sguardo-agli-stream/ pero' ho problemi di
 * compilazione
 */
public class Album {
	private String author;
	private List<String> songs;
	private int year;
	private String title;

	public Album(String author, String title, int year, String... songs) {
		this.author = author;
		this.year = year;
		this.title = title;
		this.songs = new ArrayList<String>(Arrays.asList(songs));
	}

	public String getAuthor() {
		return author;
	}

	public List<String> getSongs() {
		return songs;
	}

	public int getYear() {
		return year;
	}

	public String getTitle() {
		return title;
	}

	public List inizializeList() {
		List<Album> albums = new ArrayList<>();
		albums.add(new Album("Pink Floyd", "The Division Bell", 1994, "Cluster One", "What Do You Want from Me",
				"Poles Apart", "Marooned", "A Great Day for Freedom", "Wearing the Inside Out", "Take It Back",
				"Coming Back to Life", "Keep Talking", "Lost for Words", "High Hopes"));
		return albums;
	}

	public List pre2000InJava7(List<Album> albums) {
		for (Album album : albums) {
			if (album.getYear() < 2000) {
				System.out.println(album.getAuthor());
			}
		}
		return albums;
	}

	public List pre2000InJava8(List<Album> albums) {
		albums.stream().filter(album -> album.getYear() < 2000).map(Album::getAuthor).forEach(System.out::println);
		return albums;
	}

	public IntStream exampleIntegerNumericStream() {
		IntStream intStream = IntStream.range(1, 10);
		return intStream;
	}

	public DoubleStream exampleDoubleNumericStream() {
		DoubleStream doubleStream = new Random().doubles();
		return doubleStream;
	}

	public Stream<Path> examplePathStream() throws IOException {
		Stream<Path> pathStream = Files.list(Paths.get("c:\\"));
		return pathStream;
	}

	public double terminalOperationAvgSong(List<Album> albums) {
		double avgSong = albums.stream().mapToInt(album -> album.getSongs().size())// trasformo
																					// Stream
																					// in
																					// Stream
																					// numerico
				.average().getAsDouble();
		return avgSong;
	}

	public List<String> terminalOperationAuthors(List<Album> albums) {
		List<String> authors = albums.stream().filter(album -> album.getYear() < 2000).map(Album::getAuthor)
				.collect(Collectors.toList());
		return authors;
	}

	public Stream intermediateOperation(List<Album> albums) {
		Stream<Album> stream1 = albums.stream();
		Stream<Album> stream2 = stream1.filter(album -> album.getYear() < 2000);
		Stream<String> stream3 = stream2.map(Album::getAuthor);
		stream3.forEach(System.out::println);
		return stream3;
	}

	public List<String> tenSongsBefore2000InJava7(List<Album> albums) {
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
	
	public List<String> tenSongsBefore2000InJava8(List<Album> albums) {
		Stream<String> songs = albums.stream()
		.filter(album -> album.getYear() < 2000)
		.flatMap(album -> album.getSongs().stream())
		.sorted()
		.limit(10);
		songs.forEach(System.out::println);
		return songs.collect(Collectors.toList());
	}
}