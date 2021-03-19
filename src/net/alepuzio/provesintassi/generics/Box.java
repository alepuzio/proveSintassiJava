package net.alepuzio.provesintassi.generics;

/**
 * Generic version of the Box class.
 * 
 * @param <T>
 *            the type of the value being boxed
 */
public class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] a) {
		genericsString();
		
		genericsInt();
		
		uncheckedGenerics();

	}

	@SuppressWarnings("unchecked")
	private static void uncheckedGenerics() {
		Box<String> stringBox = new Box<>();
		@SuppressWarnings("rawtypes")
		Box rawBox = stringBox;
		rawBox.set(8);  // warning: unchecked invocation to set(T)
	}
	
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private static void genericsInt() {
		Box rawBox = new Box(); // rawBox is a raw type of Box<T>	
		Box<Integer> intBox = rawBox; // warning: unchecked conversion
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void genericsString() {
		Box<String> stringBox = new Box<>();
		Box rawBox = stringBox;               // OK
	}
}
