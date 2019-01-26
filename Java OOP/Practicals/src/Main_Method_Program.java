
public class Main_Method_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add1 = new Address("Line 1", "Line 2", "Line 3" , "Lifford");
		Employee e1 = new Employee(1, "Shaun", "12345A", "Tutor", add1, 10000);
		System.out.println("E1: \n" + e1.toString());
		System.out.println("");
		
		Employee e2 = new Employee(2, "Paul", "12345B", "Tutor", "Line 1", "Line 2", "Line 3" , "Derry", 10000);
		System.out.println("E2: \n" + e2.toString());
		
	}

}
