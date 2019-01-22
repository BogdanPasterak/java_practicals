import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double value;

		System.out.println("Enter the Richter Scale Value : ");
		value = keyIn.nextDouble();


		if (value > 8)
			System.out.println("Most structures fall.");
		else if (value > 7)
			System.out.println("Many buildings destroyed.");
		else if (value > 6)
			System.out.println("Many buildings damaged.");
		else if (value > 4.5)
			System.out.println("Damage to poorly constructed buildings.");
		else if (value > 3.5)
			System.out.println("Felt by many people, no destruction.");
		else if (value >= 0)
			System.out.println("Generally not felt.");
		else
			System.out.println("Negative numbers are not valid.");

	}

}
