package net.alepuzio.provesintassi.lambda;

import java.util.*;

public class MethodReferenceSevenMinutesLambda {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
		strings.forEach(System.out::print);
	}
}