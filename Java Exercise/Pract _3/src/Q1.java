import java.util.Scanner;//Imports Code That Allows Values Typed At The Keyboard To Be Used In Java Programs
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardIn = new Scanner(System.in);
		
		//Declare Variables
		
		String firstName;
		String surname;
		
		//Get Input
		
		System.out.println("What Is Your First Name?");
		firstName = keyboardIn.nextLine();
		System.out.println("What Is Your Surname?");
		surname = keyboardIn.nextLine();
		
		//Output
		
		System.out.println("Hi " + firstName + " " + surname + ", How Are You?");
	}

}
