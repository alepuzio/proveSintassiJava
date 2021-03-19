package net.alepuzio.provesintassi.lambda.diamond;

public class Main {

	public static void main(String[] args) {
		InterfaceStaticDefault myInterface = (String text) -> {
			System.out.println(text + " in InterfaceStaticDefault");
		};
		myInterface.printIt("test diamonds problem");

		InterfaceDefault interfaceDefault = (String text) -> {
			System.out.println(text + " in InterfaceDefault");
		};
		interfaceDefault.printIt("test diamonds problem");
/**
 * in pre-java8 way I need to declare and instantiate an implementing class
 * => more code
 * */
	}
}
