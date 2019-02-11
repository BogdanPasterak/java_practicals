package differentCoat;

import java.util.ArrayList;

public class PaintShopMenu {
	// vesion for object stream
	// private final static String PATH = "customerList.ser";
	private final static String PATH = "customerList.txt";
	
	public static void main(String[] args) {
		
		// load if avaliable customer list
		ArrayList<Customer> customerList = CalculateMenu.loadList(PATH);
		
		// variable to hold the user's response
		int choise;
		
		// main loop with Menu
		do {
			System.out.println("\n------------   Different Coat   ---------------------");
			System.out.println("            *** Menu Options ***");
			System.out.println("  1.  Process and Display Paint Required Calculations");
			System.out.println("  2.  Search for Customer Measurements");
			System.out.println("  3.  Remove Customer Measurements");
			System.out.println("  4.  Display all Customers details");
			System.out.println("  5.  Edit Customer details");
			System.out.println("  6.  Write Customer list to file");
			System.out.println("  0.  Quit");
			System.out.println("------------------------------------------------------");
			
			// take the choise int between 0 and 6
			choise = MyScanner.getInt06();
			
			// call to the appropriate method
			switch (choise) {
			case 1:
				CalculateMenu.newCustomer(customerList);
				break;
			case 2:
				CalculateMenu.searchCustomer(customerList);
				break;
			case 3:
				CalculateMenu.removeCustomer(customerList);
				break;
			case 4:
				CalculateMenu.displayCustomers(customerList);
				break;
			case 5:
				CalculateMenu.editCustomer(customerList);
				break;
			case 6:
				CalculateMenu.saveList(customerList, PATH);
				break;
			case 0:
				System.out.println("See you later");
				break;
			}
			
			// repeat until you have chosen 0
		} while ( choise > 0 );
		
	}


}