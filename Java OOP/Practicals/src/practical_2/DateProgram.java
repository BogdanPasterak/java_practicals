package practical_2;

import myScanner.MS3;

public class DateProgram {
	public static void main(String[] args) {

		// create obj 
		Date date = new Date(
				MS3.getInt("Enter the day: ", 1, 31),
				MS3.getInt("Enter the mount: ", 1, 12),
				MS3.getInt("Enter the year: ", 1000, 2500));
		System.out.println(date);

		int choise = 0;
		final int MENU = 7;
		
		do {
			System.out.println(
					"\n*** Date Menu***\r\n" + 
					"1.	Valid Date\r\n" + 
					"2.	Get Julian Date\r\n" + 
					"3.	Add Date\r\n" + 
					"4.	Subtract Date\r\n" + 
					"5.	To Long Date\r\n" + 
					"6.	To Short Date\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.DONT_FILL);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println((date.validDate()) ? "Valid": "Invalid");
				break;
			case 2:
				System.out.println(date.getJulianDate());
				break;
			case 3:
				System.out.println(date.addDate(MS3.getInt("Enter number days to add", 5000)));
				break;
			case 4:
				System.out.println(date.subtractDate(MS3.getInt("Enter number days to subtract", 5000)));
				break;
			case 5:
				System.out.println(date.toLongDate());
				break;
			case 6:
				System.out.println(date.toShortData());
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
