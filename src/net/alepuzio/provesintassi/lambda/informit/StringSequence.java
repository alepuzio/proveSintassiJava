package net.alepuzio.provesintassi.lambda.informit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSequence {

	private List<String> input;
	
	
	public StringSequence(List<String> newInput) {
		super();
		this.input = newInput;
	}


	public List<String> luckySort(Comparator<String> comp){
		boolean sorted = false;
		List<String> copy = new ArrayList<String>(this.input);
		final List<String> res = this.input
				 .stream()
				 .sorted( (a,b) -> comp.compare(a, b) )
				 .collect(Collectors.toList());
		
		while(!sorted){
			Collections.shuffle(copy);
			sorted = copy.equals(res);
		}
		return copy;
	}
}
