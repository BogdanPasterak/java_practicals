import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int value, limit;

		System.out.print("Enter a positive value: ");
		value = sc.nextInt();

		System.out.print("Enter an upper limit: ");
		limit = sc.nextInt();

		System.out.println("\nThe multiples of " + value + " between " + value + " and " + limit + " (inclusive) are:");

		for (int i = value; i <= limit; i += value) {
			System.out.print(i + "\t");
			if ((i / value) % 5 == 0)
				System.out.println();
		}

	}

}
