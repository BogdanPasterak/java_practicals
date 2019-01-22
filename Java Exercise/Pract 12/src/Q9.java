import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		double avarage, sum = 0;

		System.out.print("Please Enter A Number: ");
		number = sc.nextInt();

		if (number > 0) {

			System.out.println("\nNumber\tSquare\tCube");

			for (int i = 1; i <= number; i++) {
				System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));

			}

		} else {
			System.out.println("The number is not greater than 0");
		}

	}

}
