package net.alepuzio.provesintassi.stream.creation;

import java.util.Arrays;
import java.util.stream.Stream;

public class MainStream {

	public static void main(String[] args) {
		Stream<String> empty = new Factory().create();
		Stream<String> collection = new Coll( Arrays.asList("a", "b", "c")).create();
		Stream<String> entire = new Array(new String[]{"a", "b", "c"}).entire();
		Stream<String> partial = new Array(new String[]{"a", "b", "c"}).partial(1, 2);
		Stream<String> abc = new BuilderABC().create();
		Stream<String> limit = new Generate(10).create();
		Stream<Integer> iterate = new Iterate(40, 2, 80).create();
		System.out.println("iterate:"+iterate.count());
	}

}
