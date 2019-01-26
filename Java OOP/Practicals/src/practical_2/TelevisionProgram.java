package practical_2;

import myScanner.MS3;

public class TelevisionProgram {

	public static void main(String[] args) {
		
		// create obj 
		Television t = new Television();

		int choise = 0;
		final int MENU = 5;
		
		do {
			System.out.println(
					"\n*** Television Menu***\r\n" + 
					"1.	Get Current Channel\r\n" + 
					"2.	Plus One\r\n" + 
					"3.	Minus One\r\n" + 
					"4.	Set Channel\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.CAN_NOT_BE_ZERO);
			
			switch (choise) {
			case 1:
				System.out.println("Current Channel : " + t.getChannel());
				break;
			case 2:
				t.plusOne();
				System.out.println("Plus 1 Chanel");
				break;
			case 3:
				t.minusOne();
				System.out.println("Minus 1 Chanel");
				break;
			case 4:
				t.setChannel(MS3.getInt("Type which channel : ", 1, 100));
				System.out.println("Change Chanel");
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
