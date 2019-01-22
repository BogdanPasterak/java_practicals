import java.util.Scanner;

public class Q1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		int grade;
		
		//Get Input
		
		System.out.println("Enter an exam grade: ");
		grade = keyIn.nextInt();
		
		if (grade < 0  || grade > 100 )
			System.out.println("Grade is no valid");
		else if(grade >= 40)
			System.out.println("Congratulations – you have passed!!!”");
		else
			System.out.println("Try agein.");
			


	}

}
