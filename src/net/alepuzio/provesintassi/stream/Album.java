package net.alepuzio.provesintassi.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * da https://codingjam.it/java-8-uno-sguardo-agli-stream/ 
 * pero' ho problemi di compilazione per la jdk (immagino)
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

	@SuppressWarnings("rawtypes")
	public List inizializeList() {
		List<Album> albums = new ArrayList<>();
		albums.add(new Album("Pink Floyd", "The Division Bell", 1994, "Cluster One", "What Do You Want from Me",
				"Poles Apart", "Marooned", "A Great Day for Freedom", "Wearing the Inside Out", "Take It Back",
				"Coming Back to Life", "Keep Talking", "Lost for Words", "High Hopes"));
		return albums;
	}



}