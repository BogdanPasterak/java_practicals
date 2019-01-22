import myScanner.MyScanner2;

public class MetricConvertWithMyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number, answer;
		int choice;
		
		number = MyScanner2.getDouble("Enter a number: ");
		
		printMenu();
		
		choice = MyScanner2.getInt("Enter you choice: ", 1, 4);
		System.out.println();
		
		switch (choice) {
		case 1:
			answer = inchesConvert(number);
			System.out.println(number + " inches equals " + answer + " centimeters");
			break;

		case 2:
			answer = feetConvert(number);
			System.out.println(number + " feet equals " + answer + " centimeters");
			break;

		case 3:
			answer = yardsConvert(number);
			System.out.println(number + " yards equals " + answer + " meters");
			break;

		case 4:
			answer = milesConvert(number);
			System.out.println(number + " miles equals " + answer + " kilometers");
			break;

		default:
			System.out.println("Bad choice !");
			break;
		}
		
	}
	
	public static double feetConvert(double n) {
		//  feet to centimetre
		return n * 30;
	}

	public static double inchesConvert(double n) {
		// inches to centimetre
		return n * 2.54;
	}

	public static double yardsConvert(double n) {
		// yards to centimetre
		return n * 0.91;
	}

	public static double milesConvert(double n) {
		// miles to centimetre
		return n * 1.6;
	}

	public static void printMenu() {
		// Display menu
		System.out.println("\nConvert:");
		System.out.println("1. Inches to Centimeters");
		System.out.println("2. Feet to Centimeters");
		System.out.println("3. Yards to Meterss");
		System.out.println("4. Miles to Kilometers\n");
	}

}
