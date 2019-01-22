import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double hours, rate, pay;

		System.out.println("Enter your rate : ");
		rate = keyIn.nextDouble();

		System.out.println("Enter your hours : ");
		hours = keyIn.nextInt();

		pay = hours * rate;

		if (hours >= 46)
			pay *= 1.2;
		else if (hours >= 41)
			pay *= 1.15;
		else if (hours >= 38)
			pay *= 1.1;
		
		
		System.out.printf("Your total wages = € %.2f", pay);

	}

}
