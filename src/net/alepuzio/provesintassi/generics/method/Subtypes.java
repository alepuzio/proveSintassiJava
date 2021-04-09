package net.alepuzio.provesintassi.generics.method;

import net.alepuzio.provesintassi.generics.bound.*;

public class Subtypes {

	public static void someMethod(Number n) { /* ... */ }
	
	@SuppressWarnings("unused")
	public static void main(String[] a){
		Object someObject = new Object();
		Integer someInteger = new Integer(10);
		someObject = someInteger;   // OK
		someMethod(new Integer(10));   // OK
		someMethod(new Double(10.1));   // OK
		Box<Number> box = new Box<Number>();
		//box.add(new Integer(10));   // OK ma e' un KO da me
		//box.add(new Double(10.1));  // OK ma e' un KO da me
	}
}
