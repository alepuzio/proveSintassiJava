package net.alepuzio.provesintassi.lambda.informit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListEmployee {

private Employee[] employes = null;
	
	public ListEmployee(Employee[] newEmployes ){
		this.employes = newEmployes;
	}

	public List<Employee> bySalary(){
		Comparator<Employee> bySalary = Comparator.comparing( Employee::salary).thenComparing(Employee::name);
		return this.employes()
				.stream()
				.sorted(bySalary)
				.collect(Collectors.toList())
				;
				
	}
	
	protected List<Employee> employes(){
		return Arrays.asList(this.employes);
	}

}

