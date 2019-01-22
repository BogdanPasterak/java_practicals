import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.println("Enter your grade (A - F or a - f) : ");
		grade = sc.nextLine().toUpperCase().charAt(0);
		
		if (grade == 'A')
			System.out.println("Excellent Student.");
		else if (grade == 'B')
			System.out.println("Good Student.");
		else if (grade == 'C' || grade == 'D')
			System.out.println("Fair Student.");
		else if (grade == 'E' || grade == 'F')
			System.out.println("Poor Student.");
		else
			System.out.println("Invalid Grade.");

	}

}
