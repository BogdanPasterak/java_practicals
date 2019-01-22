import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyIn = new Scanner(System.in);
		
		//Declare Variables
		String name;
		int age, height;
		
		//Get Input
		
		System.out.println("Enter name: ");
		name = keyIn.nextLine();
		System.out.println("Enter age: ");
		age = keyIn.nextInt();
		System.out.println("Enter height: ");
		height = keyIn.nextInt();
		
		if (age >= 20 && age <= 30 && height >= 160 && height <= 170 )
			System.out.println(name + " is a suspect and should be interrogated");
		else
			System.out.println(name + " is not a suspect and should be released");

	}

}
