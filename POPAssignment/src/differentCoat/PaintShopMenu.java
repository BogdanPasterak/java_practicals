package differentCoat;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintShopMenu {
	// vesion for object stream
	// private final static String PATH = "customerList.ser";
	private final static String PATH = "customerList.txt";
	
	public static void main(String[] args) {
		
		// initialize scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// load if avaliable customer list
		ArrayList<Customer> customerList = CalculateMenu.loadList(PATH);
		
		// variable to hold the user's response
		String choise;
		
		// main loop with Menu
		do {
			System.out.println("\n------------   Different Coat   ---------------------");
			System.out.println("            *** Menu Options ***");
			System.out.println("  1.  Process and Display Paint Required Calculations");
			System.out.println("  2.  Search for Customer Measurements");
			System.out.println("  3.  Remove Customer Measurements");
			System.out.println("  4.  Display all Customers details");
			System.out.println("  5.  Write Customer list to file");
			System.out.println("  0.  Quit");
			System.out.println("------------------------------------------------------");
			
			// take the choise
			System.out.print("Your choice : ");
			choise = scanner.nextLine();
			
			// call to the appropriate method
			switch (choise) {
			case "1":
				CalculateMenu.newCustomer();
				break;
			case "2":
				CalculateMenu.searchCustomer(customerList);
				break;
			case "3":
				CalculateMenu.removeCustomer(customerList);
				break;
			case "4":
				CalculateMenu.displayCustomers(customerList);
				break;
			case "5":
				CalculateMenu.saveList(customerList, PATH);
				break;
				// if incorrect option
			case "0":
				System.out.println("See you later");
				break;
			default:
				System.out.println("Incorrect option, select options between 0 and 5");
			}
			
			// repeat until you have chosen 0
		} while (! choise.equals("0"));
		
	}


}
