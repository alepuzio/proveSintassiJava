package net.alepuzio.provesintassi.generics.map;


/**
 * from https://docs.oracle.com/javase/tutorial/java/generics/types.html
 * */
public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	public static void main(String[] a){
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

		System.out.println(String.format("Type of p1: %s", p1.toString()));
		System.out.println(String.format("Type of p2: %s", p2.toString()));

		System.out.println("Diamond operator");
		
		Pair<String, Integer> p3 = new OrderedPair<>("Even", 8);
		Pair<String, String>  p4 = new OrderedPair<>("hello", "world");
		
		System.out.println(String.format("Type of p3: %s", p3.toString()));
		System.out.println(String.format("Type of p4: %s", p4.toString()));

		//doesn't compile in java 8	
		//OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>(null));

	}
}