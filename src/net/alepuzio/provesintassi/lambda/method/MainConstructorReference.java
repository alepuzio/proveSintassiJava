package net.alepuzio.provesintassi.lambda.method;

public class MainConstructorReference {

	public static void main(String[] args) {
		Factory factory = String::new;
		System.out.println(factory.create(null));
	}

}
interface Factory {
    public String create(char[] val);
}