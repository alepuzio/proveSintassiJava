package net.alepuzio.provesintassi.stream.creation;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

class Factory {
	Stream<String> create() {
		Stream<String> streamEmpty = Stream.empty();
		return streamEmpty;
	}
}

class Coll {
	private Collection<String> streamOfCollection;

	Coll(Collection<String> newCollection) {
		this.streamOfCollection = newCollection;
	}

	Stream<String> create() {
		return this.streamOfCollection.stream();
	}
}

class Array {
	private String[] array = null;

	Array(String[] newArray) {
		this.array = newArray;
	}

	Stream<String> entire() {
		return Arrays.stream(array);
	}

	Stream<String> partial(int begin, int end) {
		return Arrays.stream(array, begin, end);
	}
}

class BuilderABC {

	Stream<String> create() {
		return Stream.<String> builder().add("a").add("b").add("c").build();
	}
}

class Generate {
	private int limit = 0;
	Generate(int newLimit) {
		this.limit = newLimit;
	}
	Stream<String> create() {
		return Stream.generate(() -> "element").limit(this.limit);
	}
}

class  Iterate{
	private int limit = -1;
	private int start = -1;
	private int step = -1;
	
	Iterate(int newStart, int newStep, int newLimit) {
		this.limit = newLimit;
	}
	
	Stream<Integer> create() {
		return Stream.iterate(this.start, n -> n + this.step).limit(this.limit);
	}
}