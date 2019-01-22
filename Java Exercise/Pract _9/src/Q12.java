import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		char ch;
		int number1, number2, answer;

		System.out.print("Enter the number 1 : ");
		number1 = sc.nextInt();

		System.out.print("Enter the number 2 : ");
		number2 = sc.nextInt();
		
		sc.nextLine();

		System.out.print("Enter the operator ( +, -, *, /, % ): ");
		ch = sc.nextLine().charAt(0);
		
		switch (ch) {
		case '+':
			answer = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + answer);
			break;
		case '-':
			answer = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + answer);
			break;
		case '*':
			answer = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + answer);
			break;
		case '/':
			answer = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + answer);
			break;
		case '%':
			answer = number1 % number2;
			System.out.println(number1 + " % " + number2 + " = " + answer);
			break;

		default:
			System.out.println("Incorrect Option Chosen.");
			break;
		}

	}

}
