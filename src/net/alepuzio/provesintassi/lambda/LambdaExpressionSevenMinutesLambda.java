package net.alepuzio.provesintassi.lambda;

import java.util.*;
import java.util.function.Consumer;


public class LambdaExpressionSevenMinutesLambda {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
		strings.forEach((String s) -> System.out.print(s));
	}
}