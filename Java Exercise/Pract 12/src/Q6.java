import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, sum = 0;

		System.out.println("Enter number greater than 0");

		n = sc.nextInt();

		if (n > 0) {

			for (int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("Sum = " + sum);
			
		} else {
			System.out.println("The number is not greater than 0");
		}


	}

}
