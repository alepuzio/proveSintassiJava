package net.alepuzio.provesintassi.lambda;

import java.util.*;

/***
 * 
 * from https://codingjam.it/java-8-lambda-in-7-minuti-o-quasi/
 */
public class SevenMinutesLambda {

	// come da tutorial
//	public static void main(String[] args) {
//		List strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
//		for (int i = 0; i < strings.size(); i++) {
//			System.out.print(strings.get(i));
//		}
//	}
	
	private final List strings;
	
	public SevenMinutesLambda(){
		this.strings = Arrays.asList("Lambda ", "expressions ", "are ", "cool");
	}

	public List visualization() {
		for (int i = 0; i < strings.size(); i++) {
			System.out.print(strings.get(i));
		}
		return strings;
	}

}
