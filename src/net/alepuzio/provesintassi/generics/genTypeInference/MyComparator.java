package net.alepuzio.provesintassi.generics.genTypeInference;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] v) {
		Object a = 5;
		Object b = 6;
		Comparator rawComp = new MyComparator();
		int comp = rawComp.compare(a, b);
		System.out.println("comp:"+comp);
	}
}
