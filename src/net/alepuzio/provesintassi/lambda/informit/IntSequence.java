package net.alepuzio.provesintassi.lambda.informit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntSequence {
	private int one, two, three, four, five, six;
	
	public IntSequence(int one, int two, int three, int four, int five, int six) {
		super();
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
		this.six = six;
	}

	public List<Integer> list(){
		final int[] numbers = {this.one, this.two, this.three, this.four, this.five, this.six};
		return Arrays
				.stream(numbers)
				.boxed()/*every element is a boxed Integer*/
				.collect(Collectors.toList())
				;
	}
}
