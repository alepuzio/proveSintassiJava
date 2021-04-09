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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return String.format("Employee name=[%s],salary=[%s]", this.name,this.salary);
	}
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	private String name;
	private Double salary;

}
