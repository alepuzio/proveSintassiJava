package net.alepuzio.provesintassi.lambda.method;

class MethodReference {

	private char[] charInput = null;

	MethodReference(char[] newCharInput) {
		this.charInput = newCharInput;
	}

	void notReferenceMethod() {
		MyPrinter printer = (input) -> System.out.println(String.format("[%s] %s", new String(input), "notReferenceMethod"));
		printer.print(charInput);
	}

	void referenceMethod() {
		MyPrinter printer =  System.out::println;
		printer.print(String.format("[%s] %s", new String(charInput), "referenceMethod").toCharArray());
	}

}

interface MyPrinter {
	public void print(char[] chars);
}