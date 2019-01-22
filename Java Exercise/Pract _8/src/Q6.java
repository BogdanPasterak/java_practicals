import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char ch;
		double number1, number2;

		System.out.print("Calculation Menu:\n" + "   1. ADD\n" + "   2. SUBTRACT\n" + "Please Enter Choice: ");

		ch = sc.nextLine().charAt(0);

		if (ch == '1' || ch == '2') {
			System.out.println("Enter the number 1 : ");
			number1 = sc.nextDouble();

			System.out.println("Enter the number 2 : ");
			number2 = sc.nextDouble();

			if (ch == '1')
				System.out.println("Sum of numbers is " + (number1 + number2));
			else
				System.out.println("Diference of numbers is " + (number2 - number1));
		} else
			System.out.println("Incorrect Option Chosen.");

	}

}
