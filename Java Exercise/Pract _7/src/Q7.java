import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables
		double grade;

		System.out.println("Enter your grade : ");
		grade = keyIn.nextDouble();

		if (grade > 100 || grade < 0) {
			System.out.println("Not valid grade");
		} else if (grade >= 40) {
			System.out.println("Congratulations – you have passed!!!");
		} else {
			System.out.println("You have failed – you must try again");
		}

	}

}
