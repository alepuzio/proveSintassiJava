package net.alepuzio.provesintassi.lambda.informit;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class DescentingSalary {
	public DescentingSalary(ListEmployee employee) {
		super();
		this.employee = employee;
	}

	private ListEmployee employee;
	
	
	public List<Employee> execute(){
		return this.employee.employes()
				.stream()
				.sorted(
						Comparator.comparing (Employee::salary)
						.thenComparing (Employee::name)
						)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList())
				;
	}

}
