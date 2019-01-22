import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double rate, hours, wages ;

		System.out.println("Enter your rate : ");
		rate = keyIn.nextDouble();

		System.out.println("Enter your hours : ");
		hours = keyIn.nextInt();

		wages = rate * hours;

		if (hours > 38) 
			wages += (hours - 38) * rate / 2;

		
		
		System.out.printf("Your total wages = € %.2f", wages);

	}

}
