package net.alepuzio.provesintassi.lambda.method;

public class MainParamMethodReference {

	public static void main(String[] args){
		Finder f = String::indexOf;
		System.out.println(f.find("string lunghissima �KFJASDVPIDNPVIDSNPIVNDFPIV AKJ� K� ", "lun"));
	}
}

interface Finder {
	public int find(String s1, String s2);
}
