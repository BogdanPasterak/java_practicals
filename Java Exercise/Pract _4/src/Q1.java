import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int nr1, nr2, sum, hoursWork, hours, minutes, duration;
		double rate, wages;
		
		// A
		System.out.println("--- Sum of two integer ---");
		System.out.print("Enter integer nr 1: ");
		nr1 =sc.nextInt();
		System.out.print("Enter integer nr 2: ");
		nr2 =sc.nextInt();
		sum = nr1 + nr2;
		System.out.println("Sum of "+ nr1 + " and " + nr2 + " is " + sum);
		
		// B
		System.out.println("\n--- Calculate wages ---");
		System.out.print("Enter the hours worked: ");
		hoursWork = sc.nextInt();
		System.out.print("Enter the rate: ");
		rate = sc.nextDouble();
		wages = hoursWork * rate;
		System.out.printf("The wages is : %.2f%n%n", wages);
		
		// C
		System.out.println("\n--- Calculate minutes of film ---");
		System.out.print("Enter the hours of film: ");
		hours = sc.nextInt();
		System.out.print("Enter the minutes of film: ");
		minutes = sc.nextInt();
		duration = hours * 60 + minutes;
		System.out.println("Film duration in minutes is " + duration);
		
		
	}

}
