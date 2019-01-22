import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.println("Enter your grade (A - F or a - f) : ");
		grade = sc.nextLine().toUpperCase().charAt(0);
		
		switch (grade) {
		case 'A':
			System.out.println("Excellent Student.");
			break;
		case 'B':
			System.out.println("Good Student.");
			break;
		case 'C': case 'D':
			System.out.println("Fair Student.");
			break;
		case 'E': case 'F':
			System.out.println("Poor Student.");
			break;

		default:
			System.out.println("Invalid Grade.");
			break;
		}

	}

}
