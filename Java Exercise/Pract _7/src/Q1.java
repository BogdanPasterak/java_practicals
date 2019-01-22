import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double number;

		System.out.println("Enter the number : ");
		number = keyIn.nextDouble();

		if (number < 0)
			System.out.println("The number is negative");
		else if (number > 0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is 0");

	}

}
