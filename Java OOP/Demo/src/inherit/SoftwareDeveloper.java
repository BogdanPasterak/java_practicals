package inherit;

public class SoftwareDeveloper extends Employee{

	double bonus;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void talkAboutJava() {
		System.out.println("I love Java !");
	}
	
	@Override
	public void setSalary(double salary) {
		this.salary = salary + 10000;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary: " + salary + "  Bonus: " + bonus;
	}

	public static void main(String[] args) {


		Employee em = new Employee();
		em.setSalary(30000);
		
		SoftwareDeveloper sd = new SoftwareDeveloper();
		
		sd.setBonus(30000);
		sd.setSalary(30000);
		sd.walk();
		sd.run();
		sd.talkAboutJava();

		System.out.println("General Employee");
		System.out.println(em.getSalary());
		System.out.println("SW Employee");
		System.out.println(sd.getSalary());
		System.out.println(sd.getBonus());
		System.out.println(sd);
		
		

	}

}
