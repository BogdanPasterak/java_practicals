import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, i = 0, sum = 0;

		System.out.println("Enter number greater than 0");

		n = sc.nextInt();

		if (n > 0) {

			while (i <= n) {
				// System.out.println(i);
				sum += i;
				i++;
			}
			System.out.println("Sum = " + sum);
			
		} else {
			System.out.println("The number is not greater than 0");
		}
	}

}
