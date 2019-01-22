import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables
		double temp;

		System.out.println("Enter temperature of water : ");
		temp = keyIn.nextDouble();

		if (temp < 0)
			System.out.println("ICE");
		else if (temp <= 100)
			System.out.println("WATER");
		else
			System.out.println("STEAM");

	}

}
