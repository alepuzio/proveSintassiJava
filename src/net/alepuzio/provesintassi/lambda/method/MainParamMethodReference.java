package net.alepuzio.provesintassi.lambda.method;

public class MainParamMethodReference {

	public static void main(String[] args){
		Finder f = String::indexOf;
		System.out.println(f.find("string lunghissima ËKFJASDVPIDNPVIDSNPIVNDFPIV AKJÚ KÚ ", "lun"));
	}
}

interface Finder {
	public int find(String s1, String s2);
}
