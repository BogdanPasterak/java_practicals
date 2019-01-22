import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int totalInches, inches, feet;
		String answer;
		
		System.out.print("Enter you height in inches : ");
		totalInches = sc.nextInt();
		feet = totalInches / 12;
		inches = totalInches % 12;
		answer = "You height is " + feet + " feet" +
				((feet > 1) ? "s" : "") +
				" and " + inches + " inch" +
				((inches > 1) ? "es.": ".");
		System.out.println(answer);

	}

}
