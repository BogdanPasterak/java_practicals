

import myScanner.MyScanner2;
import myScanner.MyScanner2.STRINGS;

public class Q_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, firstName, surname;
		String[] parts;
		
		name = MyScanner2.getString("Enter your name", MyScanner2.STRINGS.NAME);
		System.out.println("Your name ->" + name + "<-");
		
		parts = name.split(" ");
		firstName = parts[0];
		surname = parts[parts.length - 1];
		
		System.out.println("Your first name: " + firstName);
		System.out.println("Your surname: " + surname);
		

	}

}
