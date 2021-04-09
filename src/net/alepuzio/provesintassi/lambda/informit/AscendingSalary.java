package net.alepuzio.provesintassi.lambda.informit;

import java.util.List;
import java.util.stream.Collectors;

public class AscendingSalary {

	public AscendingSalary(ListEmployee employee) {
		super();
		this.employee = employee;
	}

	private ListEmployee employee;
	
	
	public List<Employee> execute(){
		return this.employee.bySalary()
				.stream()
				.sorted( (a,b) -> (int)(a.salary() - b.salary()) )
				.collect(Collectors.toList());
	}

}
