package net.alepuzio.provesintassi.generics.method;

public class TypeParameters {
	public static <T> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (@SuppressWarnings("unused") T e : anArray)
//	        if (e > elem)  // compiler error
	            ++count;
	    return count;
	}
	
	/**
	 * posso dichiarare il tipo di interfaccia
	 * anche dentro la declarazione
	 * del parametro di ritorno
	 * */
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}
}

/*public*/
interface Comparable<T> {
    public int compareTo(T o);
}