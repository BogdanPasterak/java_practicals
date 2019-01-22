import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int digit, n1, n2, n3, n4, n5, n6;
		
		System.out.print("Enter six non-negative digits: ");
		digit = sc.nextInt();
		
		n6 = digit % 10;
		digit /= 10;
		n5 = digit % 10;
		digit /= 10;
		n4 = digit % 10;
		digit /= 10;
		n3 = digit % 10;
		digit /= 10;
		n2 = digit % 10;
		n1 = digit / 10;
		
		System.out.println( n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

	}

}
