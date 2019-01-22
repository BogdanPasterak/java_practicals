import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyIn = new Scanner(System.in);
		//Declare Variables
		int billId;
		float bill, amount;
		String custId;
		
		//Get Input
		
		//System.out.println("Enter ID bill : ");
		//billId = keyIn.nextInt();
		billId = 101;
		//System.out.println("Enter ID customer : ");
		//custId = keyIn.nextLine();
		custId = "C1001";
		
		System.out.println("Enter a bill : ");
		bill = keyIn.nextFloat();
		
		
		
		if(bill > 10000)
			amount = bill * .9f;
		else
			amount = bill * .95f;
			
		System.out.printf("Total amount = € %.2f", amount);
			

	}

}
