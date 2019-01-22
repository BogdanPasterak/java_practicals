import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a, b, temp;
		
		System.out.print("Enter int a : ");
		a = sc.nextInt();
		System.out.print("Enter int b : ");
		b = sc.nextInt();
		
		System.out.println("Before swapping : a, b = " + a + ", " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping : a, b = " + a + ", " + b);
	}

}
