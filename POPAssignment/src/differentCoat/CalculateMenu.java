package differentCoat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculateMenu {
	private static final String HEADER = "List of clients Different Coat";
	private static Scanner scanner = new Scanner(System.in); 
	
	public static void newCustomer() {
		
	}

	public static void searchCustomer(ArrayList<Customer> customerList) {
		boolean find = false;
		int idToDisplay = -1;
		do {
			try {
				System.out.print("Enter ID customer : ");
				idToDisplay = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter corect ID number");
			}
		} while (idToDisplay == -1);
		
		for (int i = 0; i < customerList.size(); i++)
			if (customerList.get(i).getId() == idToDisplay) {
				System.out.println("\n" + customerList.get(i));
				find = true;
			}
		if ( ! find )
			System.out.println("There is no client with id " + idToDisplay);
	}

	public static void removeCustomer(ArrayList<Customer> customerList) {
		boolean find = false;
		int idToRemove = -1;
		do {
			try {
				System.out.print("Enter ID customer : ");
				idToRemove = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter corect ID number");
			}
		} while (idToRemove == -1);
		
		for (int i = 0; i < customerList.size(); i++)
			if (customerList.get(i).getId() == idToRemove) {
				System.out.println("\nRemmove " + customerList.get(i));
				find = true;
				customerList.remove(idToRemove);
			}
		if ( ! find )
			System.out.println("There is no client with id " + idToRemove);

	}

	public static void displayCustomers(ArrayList<Customer> customerList) {
		for (Customer customer : customerList) {
			System.out.println("\n" + customer);
		}
		
	}

	public static void saveList(ArrayList<Customer> customerList, final String PATH) {
		
		// try / catch with source
		/*
		// OO save
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
			oos.writeObject(customerList);
			System.out.println("The customer list save is successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		// change to text record
		try (PrintWriter printWriter = new PrintWriter(PATH)) {
			printWriter.println(HEADER);
			for (Customer customer : customerList) {
				printWriter.print(customer.getId());
				printWriter.print('\t');
				printWriter.print(customer.getName());
				printWriter.print('\t');
				printWriter.print(customer.getPhone());
				printWriter.print('\t');
				printWriter.println(customer.getPaintCans());
			}
			System.out.println("Data saved to a file : " + PATH);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static ArrayList<Customer> loadList(final String PATH) {

		// cleate list of customer
		ArrayList<Customer> customerList = new ArrayList<>();
		
		// try / catch with source
		/*
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
			// read list from File
			customerList = (ArrayList<Customer>) ois.readObject();
			// get id of last one customer on the list
			int last = customerList.get(customerList.size()-1).getId();
			// the new customer will have an increases of one ID
			Customer.setStartId(last + 1);
			System.out.println("List loaded");

		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
			System.out.println("I create a temporary list with three clients");
			customerList.add(new Customer("Jon Doe", "0877-333333", 5));
			customerList.add(new Customer("Anna D'ark", "0877-999999", 3));
			customerList.add(new Customer("Jeny Mc'Donalds", "0877-111111", 7));
		}
		*/
		// Input for text file
		String customerLine;
		String[] customerDetails;
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
			if (bufferedReader.readLine().equals(HEADER))
				while ((customerLine = bufferedReader.readLine()) != null) {
					customerDetails = customerLine.split("\t");
					if (customerDetails.length == 4) {
						// id of customer is ignored
						Integer.parseInt(customerDetails[0]);
						int cans = Integer.parseInt(customerDetails[3]);
						// adding new customer
						customerList.add(new Customer(customerDetails[1], customerDetails[2], cans));
					} else
						throw new IncompatibleClassChangeError("Data doesn't match the customer type");
				}
			else
				throw new IOException("Data doesn't match the customers list");
			System.out.println("List loaded");
		} catch (IncompatibleClassChangeError | NumberFormatException e1 ) {
			System.err.println(e1.getMessage());
			System.out.println("I add temporary to list one client");
			customerList.add(new Customer("Bogdan Pasterak", "0877-000000", 9));
		} catch (IOException e2) {
			System.err.println(e2.getMessage());
			System.out.println("I add temporary to list three clients");
			customerList.add(new Customer("Jon Doe", "0877-333333", 5));
			customerList.add(new Customer("Anna D'ark", "0877-999999", 3));
			customerList.add(new Customer("Jeny Mc'Donalds", "0877-111111", 7));
		}

		return customerList;
	}

}
