import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		int grade;

		System.out.println("Enter your grade : ");
		grade = keyIn.nextInt();


		if (grade < 0 || grade > 100)
			System.out.println("Inlegal value of grade");
		else if (grade < 40)
			System.out.println("Fail");
		else if (grade < 55)
			System.out.println("Pass");
		else if (grade < 70)
			System.out.println("Merit");
		else
			System.out.println("Distinction");

	}

}
