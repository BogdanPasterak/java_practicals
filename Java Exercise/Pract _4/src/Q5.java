import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double item1, item2, item3, brutto, discount, amount;
		
		System.out.print("Enter the price of the first product : ");
		item1 = sc.nextDouble();
		System.out.print("Enter the price of the secound product : ");
		item2 = sc.nextDouble();
		System.out.print("Enter the price of the third product : ");
		item3 = sc.nextDouble();
		brutto = item1 + item2 + item3;
		discount = brutto * 0.1;
		amount = brutto - discount;
		
		System.out.println("Total price = " + brutto);
		System.out.printf("Discount = %.2f%n", discount);
		System.out.printf("Price = %.2f%n", amount);
	}

}
