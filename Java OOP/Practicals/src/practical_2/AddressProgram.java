package practical_2;

import myScanner.MS3;

public class AddressProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create obj 
		Address address = new Address(
				MS3.getString("Enter the address line 1: "),
				MS3.getString("Enter the address line 2: "),
				MS3.getString("Enter the address line 3: "),
				MS3.getString("Enter the address town  : "));
		System.out.println(address);

		int choise = 0;
		final int MENU = 2;
		
		do {
			System.out.println(
					"\n***Address Menu***\r\n" + 
					"1.	To String\r\n" + 
					"2.	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.CAN_NOT_BE_ZERO);
			
			switch (choise) {
			case 1:
				System.out.print(address);
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
