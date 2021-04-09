package net.alepuzio.provesintassi.lambda.informit;

import java.util.Arrays;
import java.util.List;

public class ListMeasurable implements Measurables {


	public Double avg(){
		return this.measurables()
				.stream()
				.mapToDouble( a -> a.getMeasure() )
				.average()
				.getAsDouble();
	}	
	
	public Measurable largest(){
		return this.measurables()
				.stream()
				.max( (a,b) -> ((int)(a.getMeasure() - b.getMeasure())))/*cato to int because of the signature of public int compareTo(Objecta ,b)*/
				.get();
	}
	
	private List<Measurable> measurables(){
		return Arrays.asList(this.employees);
	}

	public ListMeasurable(Measurable[] measurables ){
		this.employees = measurables;
	}

	private Measurable[] employees = null;

}
