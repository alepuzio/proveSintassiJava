package net.alepuzio.provesintassi.lambda.harvard;

import java.util.StringJoiner;

public class PrintStringJoiner {

	public static void main(String[] args) {
		StringJoiner stj = new StringJoiner(",");
		stj.add("Saket");
        stj.add("John");
        stj.add("Franklin");
        stj.add("Ricky");
        stj.add("Trevor");
        System.out.println(stj);
        
        stj = new StringJoiner(",", "(", ")");
        stj.add("Saket");
        stj.add("John");
        stj.add("Franklin");
        stj.add("Ricky");
        stj.add("Trevor");
        System.out.println(stj);
	}
	
	

}
