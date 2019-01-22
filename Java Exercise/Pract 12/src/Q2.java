import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, sum = 0;

		System.out.println("Enter number greater than 0");

		n = sc.nextInt();

		if (n > 0) {

			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
			
		} else {
			System.out.println("The number is not greater than 0");
		}

	}

}
