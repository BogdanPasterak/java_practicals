import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double euro, pounds;
		
		System.out.print("How much euro do you want to exchange : ");
		euro = sc.nextDouble();
		pounds = euro * .88;
		System.out.printf("You have %.2f pounds.", pounds);

	}

}
