import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);

		// Declare Variables
		int hours, minutes;
		String s = " AM";

		System.out.println("Enter the hours : ");
		hours = keyIn.nextInt();
		System.out.println("Enter the minutes : ");
		minutes = keyIn.nextInt();

		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) 
			System.out.println("Time format invalid");
		else {
			if (hours > 11)
				s = " PM";
			if (hours > 12)
				hours -= 12;
			System.out.println("Time is " + hours +
					((minutes<10) ? ":0" : ":") +
					minutes + s);
		}
		
	}

}
