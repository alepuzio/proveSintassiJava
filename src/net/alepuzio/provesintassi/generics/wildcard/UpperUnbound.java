package net.alepuzio.provesintassi.generics.wildcard;
/**
 * da https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html
 * **/
import java.util.Arrays;
import java.util.List;

public class UpperUnbound {
	public static void printList(List<Object> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	public static void printList2(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		/*
		 * printList(li);//compile error 
		 * printList(ls);//compile error
		 */
		printList2(li);
		printList2(ls);
	}

}
