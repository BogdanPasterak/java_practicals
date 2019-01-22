import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int result;

		System.out.println("Enter your result : ");

		result = sc.nextInt();

		while (result < 0 || result > 100) {
			System.out.println("The result is invalid !");
			System.out.println("Enter your result : ");

			result = sc.nextInt();
		}
		
		System.out.println("Valid result = " + result);

		
	}

}
