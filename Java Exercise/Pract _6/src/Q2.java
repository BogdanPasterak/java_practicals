import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables

		double grade;

		System.out.println("Enter your grade : ");
		grade = keyIn.nextDouble();

		if (grade > 50) {
			System.out.println("Congratulations – you have passed!!!");
		} else {
			System.out.println("You have failed – you must take this course again");
		}

	}

}
