package practical_2;

import myScanner.MS3;

public class SmartHomeProgram {

	public static void main(String[] args) {

		// create obj 
		SmartHome sh = new SmartHome(
				MS3.getDouble("Enter the temperature: ", 5, 35));
		System.out.println(sh);

		int choise = 0;
		final int MENU = 3;
		
		do {
			System.out.println(
					"\n***SmartHome Menu***\r\n" + 
					"1.	Set Temperature\r\n" + 
					"2.	To String\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.DONT_FILL);
			System.out.println();
			
			switch (choise) {
			case 1:
				sh.setTemperature(MS3.getDouble("Enter the temperature: ", 5, 35));
				break;
			case 2:
				System.out.println(sh);
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
