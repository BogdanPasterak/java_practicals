import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int result;


		do {
			System.out.println("Enter your result : ");

			result = sc.nextInt();
			if (result < 0 || result > 100)
				System.out.println("The result is invalid !");
		} while (result < 0 || result > 100);
		
		System.out.println("Valid result = " + result);


	}

}
