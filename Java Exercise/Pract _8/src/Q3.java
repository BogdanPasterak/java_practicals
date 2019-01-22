import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		int age;
		//double price;
		
		//Get Input
		
		System.out.println("Enter your age : ");
		age = keyIn.nextInt();
		
		if (age < 0 )
			System.out.println("Age is no valid");
		else if(age < 12)
			System.out.println("Free");
		else if (age < 18 )
			System.out.println("€ 5.00");
		else if (age > 65 )
			System.out.println("€ 4.50");
		else
			System.out.println("€ 6.00");
			

	}

}
