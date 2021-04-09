package net.alepuzio.provesintassi.lambda;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerSevenMinutesLambda {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
		//iterazione interna
		strings.forEach(new Consumer<String>() {
			public void accept(String s) {
				System.out.print(s);
			}
		});
	}
}

