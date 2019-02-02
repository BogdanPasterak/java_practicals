import java.util.Scanner;

/**
 * 
 * @author Bogdan Pasterak Assessment Object Oriented Programing JAVA Level 3
 *         (7540-037/7630-321) 28 Jan 2019
 *
 */
// class testnewDate according to the convention, it should be called
// TestNewDate
public class testnewDate {
	static Scanner sc;
	static newDate nDate;

	public static void main(String[] args) {

		// new scanner
		sc = new Scanner(System.in);
		nDate = new newDate();
		String choise;

		// main loop
		do {
			// print menu
			System.out.println("-----------------------");
			System.out.println("\tMENU");
			System.out.println("  1.  Leap year");
			System.out.println("  2.  Julian date");
			System.out.println("  3.  Days elapsed");
			System.out.println("  4.  Age");
			System.out.println("  5.  Quit");
			System.out.println("-----------------------");

			// user selection
			System.out.print("Choose options : ");
			choise = sc.nextLine();
			System.out.println();

			switch (choise) {
			case "1":
				testLeapYear();
				break;
			case "2":
				testJulianDate();
				break;
			case "3":
				testDaysElapsed();
				break;
			case "4":
				testAge();
				break;
			case "5":
				break;
			default:
				System.out.println("Incorrect option, try again");
			}

		} while (!choise.equals("5"));
		System.out.println("Completion of the program !");

	}

	// Testing leapYear method
	private static void testLeapYear() {
		int year = 0;

		// user type year
		do {
			System.out.print("Enter a year (yyyy) : ");
			// try / catch for invalid Integer
			try {
				int number = Integer.parseInt(sc.nextLine());
				// range of valid year
				if (number < 1000 || number > 3000)
					System.out.println("A year in the range of 1000 to 3000");
				else
					// success
					year = number;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Try again. The year must be a number");
			}
		} while (year == 0);

		System.out.print("\nYear " + year + " is ");
		if (nDate.leapYear(year))
			System.out.println("LEAP YEAR");
		else
			System.out.println("NOT A LEAP YEAR");
	}

	private static void testJulianDate() {
		int[] date;
		boolean valid;

		do {
			// user type date
			date = getDate();
			// asaign value
			int day = date[0];
			int month = date[1];
			int year = date[2];

			// for valid date print Julian date, else message
			valid = nDate.validDate(day, month, year);
			if (valid)
				System.out.println("\nJulian date is : " + nDate.julianDate(day, month, year));
			else
				System.out.println("\nINVALID DATE");
		} while (!valid);
	}

	private static void testDaysElapsed() {
		int[] start, end;
		boolean valid = true;

		// get two dates and valid
		do {
			if (!valid)
				System.out.println("INVALID DATE");
			else
				System.out.println("START DATE");
			start = getDate();
			valid = nDate.validDate(start[0], start[1], start[2]);
		} while (!valid);
		
		// valid is TRUE
		do {
			if (!valid)
				System.out.println("INVALID DATE");
			else
				System.out.println("END DATE");
			end = getDate();
			valid = nDate.validDate(end[0], end[1], end[2]);
		} while (!valid);

		// if dates are valid print number of days between
		System.out.println("\nDays elapsed : " + nDate.daysElapsed(start[0], start[1], start[2],
																	end[0], end[1], end[2]));
	}

	private static void testAge() {
		int[] birth;
		boolean valid;

		do {
			// get birth date
			System.out.println("Enter the date of birth");
			birth = getDate();
			valid = nDate.validDate(birth[0], birth[1], birth[2]);
			if (valid)
				System.out.println("\nYour age is " + nDate.ageDate(birth[0], birth[1], birth[2]));
			else
				System.out.println("\nINVALID DATE");
		} while (!valid);
	}

	// get date from user helper metchod
	private static int[] getDate() {
		boolean ok = false;
		int year = 0, month = 0, day = 0;
		String date;

		// user type date
		do {
			System.out.print("Enter a date (dd-mm-yyyy) : ");
			// get String and remove all spaces
			date = sc.nextLine().replaceAll(" ", "");
			if (date.length() == 10 && date.charAt(2) == '-' && date.charAt(2) == '-') {
				// try / catch for invalid Integer
				try {
					day = Integer.parseInt(date.substring(0, 2));
					month = Integer.parseInt(date.substring(3, 5));
					year = Integer.parseInt(date.substring(6));
					// success
					ok = true;
				} catch (NumberFormatException e) {
					System.out.println(e.getMessage());
					System.out.println("Try again. Invalid number");
				}
			} else {
				System.out.println("Invalid format. Try again.");
			}
		} while (!ok);

		// return array
		return new int[] { day, month, year };
	}

}
