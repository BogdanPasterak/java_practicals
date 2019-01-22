import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char ch;
		double number1, number2, answer;

		System.out.print("Calculation Menu:\n" + 
						"   1. ADD\n" + 
						"   2. SUBTRACT\n" + 
						"Please Enter Choice: ");

		ch = sc.nextLine().charAt(0);

		if (ch == '1' || ch == '2') {
			System.out.print("Enter the number 1 : ");
			number1 = sc.nextDouble();

			System.out.print("Enter the number 2 : ");
			number2 = sc.nextDouble();

			switch (ch) {
			case '1':
				answer = number1 + number2;
				System.out.println("Sum of numbers is " + answer);
				break;
			case '2':
				answer = number2 - number1;
				System.out.println("Diference of numbers is " + answer);
			}
			
		} else
			System.out.println("Incorrect Option Chosen.");


	}

}
