package employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.ListIterator;

import myScanner.MS3;

public class EmployeeTester {
	private static final String PATH = "list.txt";

	public static void main(String[] args) {

		ArrayList<Employee> employees = loadList();

		int choise = 0;
		final int MENU = 7;

		do {

			System.out.println(
					"\n***  Employee Tester Menu  ***\r\n" +
					"1.	List All Employee\r\n" +
					"2.	Add Employee\r\n" +
					"3.	Delete Employee\r\n" +
					"4.	List Employee by category\r\n" +
					"5.	Edit Employee\r\n" +
					"6.	Save List\r\n" +
					MENU + ".	Quit\r\n");

			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.DONT_FILL);

			switch (choise) {
			case 1:
				listAllEmployee(employees);
				break;
			case 2:
				addEmployee(employees);
				break;
			case 3:
				deleteEmployee(employees);
				break;
			case 4:
				listEmployeeCategory(employees);
				break;
			case 5:
				editEmployee(employees);
				break;
			case 6:
				saveList(employees);
				break;
			}

		} while (choise != MENU);

		System.out.println("Bye Bye :)");

	}

	private static void editEmployee(ArrayList<Employee> employees) {

		int id = MS3.getInt("\tEnter ID of employee to edit : ", 1, employees.get(employees.size() - 1).getEmpId());

		boolean edited = false;

		for (int i = 0; i < employees.size(); i++) 
			if (employees.get(i).getEmpId() == id) {
				Employee emp = employees.get(i);
				String answer;
				
				// all employee heve
				System.out.println("Current employee first name: " + emp.getFirstName());
				answer = MS3.getString("Enter new first name (Enter - don't change): ", MS3.DONT_FILL, "");
				if (answer.length() > 0)
					emp.setFirstName(answer);

				System.out.println("Current employee surname: " + emp.getSurName());
				answer = MS3.getString("Enter new surname (Enter - don't change): ", MS3.DONT_FILL, "");
				if (answer.length() > 0)
					emp.setSurName(answer);

				System.out.println("Current employee phone nr: " + emp.getPhoneNo());
				answer = MS3.getString("Enter new phone nr (Enter - don't change): ", MS3.DONT_FILL, "");
				if (answer.length() > 0)
					emp.setPhoneNo(answer);
				
				// unique for Developer
				if (emp instanceof Developer) {
					Developer dev = (Developer)emp;
					
					System.out.println("Current developer level: " + dev.getLevel());
					answer = MS3.getString("Enter new level (Enter - don't change): ", MS3.DONT_FILL, "");
					if (answer.length() > 0)
						try {
							int level = Integer.parseInt(answer);
							if (level >= 0 && level <=9 )
								dev.setLevel(level);
							else
								System.out.println("Level beyond the acceptable range");
						} catch (Exception e) {
							System.out.println("This is not a level (Integer)");
						}
					
					// unique for Menager
				} else if (emp instanceof Menager) {
					Menager men = (Menager)emp;

					System.out.println("Current menager department: " + men.getDepartment());
					answer = MS3.getString("Enter new department (Enter - don't change): ", MS3.DONT_FILL, "");
					if (answer.length() > 0)
						men.setDepartment(answer);

					System.out.println("Current menager bonus: " + ((men.getBonus()) ? "Yes" : "No") );
					answer = MS3.getString("Enter new bonus (Y / N / Enter - don't change): ", MS3.DONT_FILL, "");
					if (answer.length() > 0)
						if (answer.toLowerCase().equals("y"))
							men.setBonus(true);
						else if (answer.toLowerCase().equals("n"))
							men.setBonus(false);

				}

				System.out.println(emp);
				edited = true;
			}
		
		if (!edited)
			System.out.println("There is no employee in the list with such an ID");
		
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<Employee> loadList() {

		ArrayList<Employee> employees = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
			employees = (ArrayList<Employee>) ois.readObject();
			int last = employees.get(employees.size()-1).getEmpId();
			Employee.setStartIdEmpolyee(last + 1);
			System.out.println("List loaded");

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			employees.add(new Developer("Jon", "Doe", "0877-333333", 5));
			employees.add(new Developer("Anna", "D'ark", "0877-999999", 3));
			employees.add(new Menager("Jeny", "Mc'Donalds", "0877-111111", "Logistic", true));
			employees.add(new Menager("Emma", "Dan", "0877-555555", "IT", false));
		}
		
		return employees;
	}

	private static void saveList(ArrayList<Employee> employees) {
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
			oos.writeObject(employees);
			System.out.println("Save");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void listAllEmployee(ArrayList<Employee> employees) {
		for (Employee employee : employees)
			System.out.println(employee);

	}

	private static void listEmployeeCategory(ArrayList<Employee> employees) {

		System.out.println("   a.  List Developer\r\n   b.  List Menager\r\n");

		char choise = MS3.getChar("Choise type of Employee : ", MS3.DONT_FILL, "ab");

		for (Employee employee : employees)
			if ((choise == 'a' && (employee instanceof Developer)) || (choise == 'b' && (employee instanceof Menager)))
				System.out.println(employee);
	}

	private static void deleteEmployee(ArrayList<Employee> employees) {

		int id = MS3.getInt("\tEnter ID of employee to delete : ", 1, employees.get(employees.size() - 1).getEmpId());
		boolean removed = false;

		for (int i = 0; i < employees.size(); i++)
			if (employees.get(i).getEmpId() == id) {
				System.out.println("Remove " + employees.get(i));
				employees.remove(i);
				removed = true;
				break;
			}
			
		if (!removed)
			System.out.println("There is no employee in the list with such an ID");
	}

	private static void addEmployee(ArrayList<Employee> employees) {

		System.out.println("   a.  Add Developer\r\n   b.  Add Menager\r\n");

		char choise = MS3.getChar("Choise type of Employee : ", MS3.DONT_FILL, "ab");

		System.out.println("\nEnter details of " + ((choise == 'a') ? "Developer" : "Menager"));

		// All employee has
		String fName = MS3.getString("\tType first name : ", MS3.STRINGS.FIRST_NAME);
		String sName = MS3.getString("\tType  surname   : ", MS3.STRINGS.SURNAME);
		String phone = MS3.getString("\tType phone nr.  : ", "0877-123456", "0877-987654", "0877-555555", "0877-000000");

		switch (choise) {
		case 'a':
			// unique for Developer
			int level = MS3.getInt("\tType    level   : ", 9);
			employees.add(new Developer(fName, sName, phone, level));
			break;
		case 'b':
			// unique for Menager
			String dep = MS3.getString("\tType department : ", MS3.STRINGS.DEPARTMENT);
			String ans = MS3.getString("\tAdd bonus? (y/n): ", MS3.STRINGS.YES_NO);
			boolean bonus = ans == "Yes";
			employees.add(new Menager(fName, sName, phone, dep, bonus));
		}
		System.out.println("\nAdded " + employees.get(employees.size() - 1));

	}

}
