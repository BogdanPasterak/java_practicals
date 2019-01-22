import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		int grade;

		System.out.println("Enter your grade : ");
		grade = keyIn.nextInt();


		if (grade < 40)
			System.out.println("Fail");
		else if (grade < 55)
			System.out.println("Pass");
		else if (grade < 70)
			System.out.println("Merit");
		else
			System.out.println("Distinction");


	}

}
