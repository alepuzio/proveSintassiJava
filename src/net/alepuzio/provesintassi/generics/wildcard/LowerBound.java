package net.alepuzio.provesintassi.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
	public static void addNumbers(List<? super Integer> list) {
	    for (int i = 1; i <= 10; i++) {
	        list.add(i);
	    }
	}
	public static void main(String[] args) {
		List<Integer> listInteger = new ArrayList<Integer>();
		addNumbers(listInteger);
		System.out.println(listInteger);
		
		listeConGenerics();
	}
	
	/**
	 *  OK. List<? extends Integer> is a subtype of List<? extends Number>
	 * Ma Number e' una classe astratta non implementata da Integer
	 * */
	@SuppressWarnings("unused")
	private static void listeConGenerics() {
		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number>  numList = intList;
	}

}
