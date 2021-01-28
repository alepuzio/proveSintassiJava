package net.alepuzio.provesintassi.lambda;

import java.util.*;

public class GenericsSevenMinutesLambda {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
		for (String element : strings) {
			System.out.print(element);
		}
	}
}