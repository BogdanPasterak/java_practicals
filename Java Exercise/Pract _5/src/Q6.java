import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		
		double miles, allowance, expenses;
		
		//Get Input
		
		System.out.println("Enter the miles : ");
		miles = keyIn.nextDouble();
		System.out.println("Enter allowance per mile : ");
		allowance = keyIn.nextDouble();
		
		expenses = miles * allowance;
		
		if(miles > 150)
			expenses += 100;
		if(expenses < 50)
			expenses += expenses * .06;
			
		System.out.printf("Total amount = € %.2f", expenses);
			

	}

}
