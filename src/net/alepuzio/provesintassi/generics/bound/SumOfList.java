package net.alepuzio.provesintassi.generics.bound;

/**
 *da https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html
 *quale differenza tra ? extends Number e U extends Number
 * */
import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list) {
			s += n.doubleValue();
		}
		return s;
	}

	public static void main(String[] a) {
		print();
		print2();
	}

	/**
	 * A list of Double values can use the same sumOfList method.The following
	 * code prints sum=7.0:
	 */
	private static void print2() {
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
	}

	/**
	 * The following code, using a list of Integer objects, prints sum=6.0:
	 **/
	private static void print() {
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
	}
}
