import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double amount, totalSum = 0;

		System.out.println("Enter amount : ");

		amount = sc.nextDouble();

		while (totalSum < 1000) {
			//System.out.println(totalSum);

			totalSum += amount;
		}
		
		System.out.println("Total Sum = " + totalSum);

	}

}
