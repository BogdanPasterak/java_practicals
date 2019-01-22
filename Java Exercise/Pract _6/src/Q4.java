import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		int number1, number2, sum;

		System.out.println("Enter the number 1 : ");
		number1 = keyIn.nextInt();

		System.out.println("Enter the number 2 : ");
		number2 = keyIn.nextInt();

		System.out.println("Enter the sum of numbers : ");
		sum = keyIn.nextInt();

		if (number1 + number2 == sum) {
			System.out.println("Well done. " + sum + " is the correct answer.");
		} else {
			System.out.println("Sorry, you are wrong. The correct answer is " + (number1 + number2));
		}

	}

}
