import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String capital, answer;
		int multyply;
		double between;
		
		System.out.println("What city is the capital of France?");
		capital = sc.next();
		System.out.println("What is 6 multiplied by 7?");
		multyply = sc.nextInt();
		System.out.println("Enter a number between 0.0 and 1.0");
		between = sc.nextDouble();
		System.out.println("Is there anything else you would like to say?");
		sc.nextLine();
		answer = sc.nextLine();
		
	}

}
