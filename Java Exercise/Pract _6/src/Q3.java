import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		int number1, number2;

		System.out.println("Enter the number 1 : ");
		number1 = keyIn.nextInt();

		System.out.println("Enter the number 2 : ");
		number2 = keyIn.nextInt();

		if (number1 % number2 == 0) {
			System.out.println("The second number entered divides evenly into the first number");
		} else {
			System.out.println("The second number entered does not divide the first number equally");
		}
	}

}
