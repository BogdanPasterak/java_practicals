package employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Developer d1, d2;
		Menager m1, m2;
		
		d1 = new Developer();
		d1.setFirstName("Jon");
		d1.setSurName("Doe");
		d1.setPhoneNo("0877-123456");
		d1.setLevel(5);
		
		d2 = new Developer("Bogdan", "Pasterak", "0877-999999", 3);
		
		m1 = new Menager();
		m1.setFirstName("Jeny");
		m1.setSurName("Mc'Donalds");
		m1.setPhoneNo("0877-111111");
		m1.setDepartment("Logistic");
		m1.setBonus(true);
		
		m2 = new Menager("Emma", "Dan", "0877-555555", "IT", false);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(m1);
		System.out.println(m2);
		

	}

}
