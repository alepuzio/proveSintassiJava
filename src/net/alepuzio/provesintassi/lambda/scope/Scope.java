package net.alepuzio.provesintassi.lambda.scope;

class Scope {

	private String outOfScope = "outOfScope";
	
	public void scopeInMethod() {
		String MainScope = "inScope";
		MyFactory factory = (input)-> String.format("%s %s", new String(input), MainScope);
		char[] charInput = {'a','b'};
		System.out.println(factory.create( charInput  ));
		/*outOfScope = ""; compile time error because this variable is changed, after the runtime
		use of the lamdba expression
		*/
	}
	public void scopeOutOfMethod() {
		MyFactory factory = (input)-> String.format("%s %s", new String(input), outOfScope);
		char[] charInput = {'a','b'};
		System.out.println(factory.create( charInput  ));
		outOfScope = "";/* no compile or run time error because this variable 
		(attribute of a class) is changed, after the runtime
		use of the lamdba expression
		*/
	}

}
interface MyFactory {
    public String create(char[] chars);
}