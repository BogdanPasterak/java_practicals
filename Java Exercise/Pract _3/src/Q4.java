import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name;
		double pricePerGallon, totalAmount;
		int initialReading, finalReading;
		
		System.out.print("Enter you name: ");
		name =sc.nextLine();
		System.out.print("Enter price per gallon: ");
		pricePerGallon = sc.nextDouble();
		System.out.print("Enter total price for fill up: ");
		totalAmount =sc.nextDouble();
		System.out.print("Enter initial odometer value: ");
		initialReading = sc.nextInt();
		System.out.print("Enter final odometer value: ");
		finalReading = sc.nextInt();
		
	}

}
