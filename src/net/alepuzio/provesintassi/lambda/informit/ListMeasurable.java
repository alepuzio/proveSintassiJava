package net.alepuzio.provesintassi.lambda.informit;

import java.util.Arrays;
import java.util.List;

public class ListMeasurable implements Measurables {

	private Measurable[] employees = null;
	
	public ListMeasurable(Measurable[] measurables ){
		this.employees = measurables;
	}
	
	private List<Measurable> measurables(){
		return Arrays.asList(this.employees);
	}
	
	public Double avg(){
		return this.measurables().stream().mapToDouble( a -> a.getMeasure() ).average().getAsDouble();
	}	
	
	public Measurable largest(){
		return this.measurables().stream()
				.max( (a,b) -> ((int)(a.getMeasure() - b.getMeasure())))
						.get();
		
	}
}
