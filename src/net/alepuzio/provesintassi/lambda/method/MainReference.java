package net.alepuzio.provesintassi.lambda.method;

public class MainReference {

	public static void main(String[] args) {
		char[] charInput = { 'a', 'b' };
		new MethodReference(charInput).referenceMethod();
		new MethodReference(charInput).notReferenceMethod();
	}
}



