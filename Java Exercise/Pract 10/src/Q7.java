import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int value;

		System.out.println("Enter positive integer value");

		value = sc.nextInt();

		while (value < 0) {
			System.out.println("The value is not positive integer");
			System.out.println("Enter positive integer value");

			value = sc.nextInt();
		}
		System.out.println("value = " + value);

	}

}
