import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		
		double book1, book2, book3, total;
		
		//Get Input
		
		System.out.println("Enter the price of book 1 : ");
		book1 = keyIn.nextDouble();
		System.out.println("Enter the price of book 2 : ");
		book2 = keyIn.nextDouble();
		System.out.println("Enter the price of book 3 : ");
		book3 = keyIn.nextDouble();
		
		total = book1 + book2 + book3;
		
		if(total > 50)
			total *= 0.9;
			
		System.out.printf("Total amount = € %.2f", total);
			
		
		
		
	}

}
