package net.alepuzio.provesintassi.lambda.informit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntSequence {
	private int one, two, three, four, five, six;
	private int limit;
	
	public IntSequence(int one, int two, int three, int four, int five, int six) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
		this.six = six;
	}

	public IntSequence(int newLimit) {
		this.limit = newLimit;
	}
	
	public List<Integer> list(){
		final int[] numbers = {this.one, this.two, this.three, this.four, this.five, this.six};
		return Arrays
				.stream(numbers)
				.boxed()/*every element is a boxed Integer*/
				.collect(Collectors.toList())
				;
	}
	
	public List<Integer> infiniteList(){
		return IntStream.iterate( 0, i -> i+1).limit(this.limit).boxed().collect(Collectors.toList());
	}
}
