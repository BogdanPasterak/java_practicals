package inherit;

public class Employee {

	double salary;
	
	public void run() {
		System.out.println("Runing ...");
	}
	
	public void walk() {
		System.out.println("Walking ...");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
