package net.alepuzio.provesintassi.lambda.harvard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Implement {
	private List<Double> array;

	Implement(List<Double> newArray) {
		this.array = newArray;
	}

	double avg() {
		double sum = this.array.stream().reduce((a, b) -> a + b).get();
		double number = this.array.stream().count();
		return sum / number;
	}

	double max() {
		return this.array.stream().max(Comparator.comparingDouble(i -> i)).get();
	}

	double min() {
		return this.array.stream().min(Comparator.comparingDouble(i -> i)).get();
	}

	double sum() {
		return this.array.stream().reduce((a, b) -> (a + b)).get();
	}

	public static void main(String[] args) {
		List<Double> firstList = new ArrayList<Double>();
		Double[] numbers = { new Double(1), new Double(2), new Double(3), new Double(4), new Double(5), new Double(6),
				new Double(7), new Double(8), new Double(9), new Double(10) };
		Collections.addAll(firstList, numbers);
		Implement arrayProcessor = new Implement(firstList);
		System.out.println("Sum of first list (should be 55): " + arrayProcessor.sum());
		System.out.println("Average of first list (should be 5.5): " + arrayProcessor.avg());
		System.out.println("Minimum of first list (should be 1 ): " + arrayProcessor.min());
		System.out.println("Maximum of first list (should be 10.0): " + arrayProcessor.max());
	}

}