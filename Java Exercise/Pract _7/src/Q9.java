import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables
		int hours, minutes;

		System.out.println("Enter the hours : ");
		hours = keyIn.nextInt();
		System.out.println("Enter the minutes : ");
		minutes = keyIn.nextInt();

		if (hours < 0) 
			System.out.println("Hours Invalid (< 0)");
		else if (hours > 23)
			System.out.println("Hours Invalid (> 23)");
		else
			System.out.println("Hours Valid");
		
		if (minutes < 0) 
			System.out.println("Minutes  Invalid (< 0)");
		else if (minutes > 59)
			System.out.println("Minutes Invalid (> 59)");
		else
			System.out.println("Minutes Valid");
		

	}

}
