package net.alepuzio.provesintassi.lambda.informit;

public class Employee implements Measurable {

	@Override
	public double getMeasure() {
		return this.salary()*1000;
	}

	
	public String name() {
		return name;
	}

	public Double salary() {
		return salary;
	}

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	private String name;
	private Double salary;

}
