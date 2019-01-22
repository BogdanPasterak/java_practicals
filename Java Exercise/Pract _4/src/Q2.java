import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, sum;
		
		System.out.println("Test Data:");
		System.out.print("Input an integer between 0 and 1000: ");
		i = sc.nextInt();
		
		sum = i % 10;
		sum += (i % 100) / 10;
		sum += (i % 1000) / 100;
		sum = (i == 1000) ? 1 : sum;
		
		System.out.println("Sum of the digits: " + sum);

	}

}
