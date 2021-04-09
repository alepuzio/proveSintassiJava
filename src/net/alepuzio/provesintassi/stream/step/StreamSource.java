package net.alepuzio.provesintassi.stream.step;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSource {

	
	public IntStream exampleIntegerNumericStream(int start, int end) {
		IntStream intStream = IntStream.range(start, end);//build a stream between start and end (end is excluced) 
		return intStream;
	}
	public IntStream exampleIntegerNumericStreamExtrems(int start, int end) {
		IntStream intStream = IntStream.rangeClosed(start, end);//build a stream between 1 and 10 (included) 
		return intStream;
	}

	public IntSummaryStatistics exampleIntSummaryStatistics(int start, int end) {
		IntSummaryStatistics intStream = IntStream.rangeClosed(start, end).summaryStatistics();//build a stream between 1 and 10 (included) 
		return intStream;
	}
	public DoubleStream exampleDoubleNumericStream(int res, long seed) {
		Random random = new Random(); random.setSeed(seed);
		DoubleStream doubleStream = new Random().doubles(res);
		return doubleStream;
	}

	public Stream<Path> examplePathStream() throws IOException {
		Stream<Path> pathStream = Files.list(Paths.get("c:\\"));
		return pathStream;
	}

}
