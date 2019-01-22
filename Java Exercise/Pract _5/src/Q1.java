import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		
		double accountBalance;
		
		//Get Input
		
		System.out.println("Enter Account Balance: ");
		accountBalance = keyIn.nextDouble();
		
		if(accountBalance < 0)
		{
			System.out.println("You are overdrawn...");
		}
		

	}

}
