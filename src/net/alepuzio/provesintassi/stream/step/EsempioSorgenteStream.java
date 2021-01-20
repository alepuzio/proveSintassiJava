package net.alepuzio.provesintassi.stream.step;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EsempioSorgenteStream {

	
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

}
