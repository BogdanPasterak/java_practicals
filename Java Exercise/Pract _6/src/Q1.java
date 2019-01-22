import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double accountBalance;

		System.out.println("Enter your balance : ");
		accountBalance = keyIn.nextDouble();

		if (accountBalance < 0) {
			System.out.println("Your account is overdrawn");
		} else {
			System.out.println("Your account is in credit");
		}

	}

}
