import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.print("Enter the character : ");
		ch = sc.next().charAt(0);
		double d = 253.259441665;
		
		System.out.println("The ASCII value of \'" + ch + "\' is: " + (int)ch );
		System.out.printf("Value %.2f", d);
		
	}

}
