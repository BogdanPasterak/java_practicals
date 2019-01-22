import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double number1, number2;

		System.out.println("Enter the number 1 : ");
		number1 = keyIn.nextDouble();

		System.out.println("Enter the number 2 : ");
		number2 = keyIn.nextDouble();

		if (number1 > number2)
			System.out.println("The number 1 is bigger than number 2");
		else if (number1 < number2)
			System.out.println("The number 2 is bigger than number 1");
		else
			System.out.println("The numbers are equals");

	}

}
