package differentCoat;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintShopMenu {
	
	public static void main(String[] args) {
		
		// initialize scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		// load if avaliable customer list
		ArrayList<Customer> customerList = CalculateMenu.loadList();
		
		// variable to hold the user's response
		String choise;
		
		// main loop with Menu
		do {
			System.out.println("------------   Different Coat   ---------------------");
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
				CalculateMenu.searchCustomer();
				break;
			case "3":
				CalculateMenu.removeCustomer();
				break;
			case "4":
				CalculateMenu.displayCustomers();
				break;
			case "5":
				CalculateMenu.saveList(customerList);
				break;
				// if incorrect option
			default:
				System.out.println("Incorrect option, select options between 0 and 5");
			}
			
		} while (! choise.equals("0"));
		
	}


}
