package net.alepuzio.provesintassi.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapPollutionExample {

	public static void main(String[] args) {

		List<String> stringListA = new ArrayList<String>();
		ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");

		List<String> stringListB = new ArrayList<String>();
		ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");

		List<List<String>> listOfStringLists = new ArrayList<List<String>>();
		/*
		 * Type safety: A generic array of List<String> is created for a varargs
		 * parameter
		 */
		ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
		ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
	}
}

class ArrayBuilder {

	public static <T> void addToList(List<T> listArg, T... elements) {
		for (T x : elements) {
			listArg.add(x);
		}
	}

	public static void faultyMethod(List<String>... l) {
		Object[] objectArray = l; // Valid
		objectArray[0] = Arrays.asList(42);
		/*
		 * Exception in thread "main" java.lang.ClassCastException:
		 * java.lang.Integer cannot be cast to java.lang.String
		 */
		// String s = l[0].get(0);
	}

}