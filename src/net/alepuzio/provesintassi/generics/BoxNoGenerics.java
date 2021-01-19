package net.alepuzio.provesintassi.generics;

/**
 * Class before the generics in JDK 1.5
 * */
public class BoxNoGenerics {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}
