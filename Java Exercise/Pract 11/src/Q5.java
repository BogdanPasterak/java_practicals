import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int value = 0;


		do {
			System.out.println("Enter positive integer value");

			value = sc.nextInt();
			if (value < 0)
				System.out.println("The value is not positive integer");
		} while (value < 0);
		
		System.out.println("value = " + value);


	}

}
