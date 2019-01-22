import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double amount, totalSum = 0;

		System.out.println("Enter amount : ");

		amount = sc.nextDouble();

		do {
			//System.out.println(totalSum);

			totalSum += amount;
		} while (totalSum < 1000);
		
		System.out.println("Total Sum = " + totalSum);


	}

}
