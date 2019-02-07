package differentCoat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CalculateMenu {
	private static final String HEADER = "List of clients Different Coat";
	
	public static void newCustomer(ArrayList<Customer> customerList) {
		String name, phone;
		char roomType;	// avaliable S,R,C
		double[] dimensions;
		double surface = 0;
		int cans;
		
		name = MyScanner.getString("Enter the customer's name: ");
		phone = MyScanner.getString("Enter the customer's phone No: ");
		roomType = MyScanner.getRoomType();
		dimensions = MyScanner.getDimensions(roomType);
		
		// calculate dependent surface
		switch (roomType) {
		case 'S':
			surface = SurfaceCalculator.squareRoom(dimensions[0], dimensions[1]);
			break;
		case 'R':
			surface = SurfaceCalculator.rectangularRoom(dimensions[0], dimensions[1], dimensions[2]);
			break;
		case 'C':
			surface = SurfaceCalculator.cylindricalRoom(dimensions[0], dimensions[1]);
			break;
		}
		// calculate required cans of paint
		cans = PaintRequiredCalculator.numberOfCans(surface);
		
		// adding new customer
		customerList.add(new Customer(name, phone, cans));
	}

	public static void searchCustomer(ArrayList<Customer> customerList) {
		int index;
		
		index = getIndexCustomer(customerList);
		
		System.out.println("\n" + customerList.get(index));
	}

	public static void removeCustomer(ArrayList<Customer> customerList) {
		int index;
		
		index = getIndexCustomer(customerList);
		
		System.out.println("\nRemmove " + customerList.get(index));
		customerList.remove(index);
	}

	public static void displayCustomers(ArrayList<Customer> customerList) {
		System.out.println("\n---- All Customers details ----");
		for (Customer customer : customerList) {
			System.out.println("\n" + customer);
		}
		
	}

	public static void editCustomer(ArrayList<Customer> customerList) {
		int index;
		
		index = getIndexCustomer(customerList);
		Customer customer = customerList.get(index);
		
		System.out.println("  --- Edit Customer with ID: " + customer.getId() + " ---");
		
		String name = MyScanner.getStringOrEmpty("\n  Type new name (Enter - skip): ");
		if (name.length() > 0)
			customer.setName(name);
		
		String phone = MyScanner.getStringOrEmpty("\n  Type new phone No (Enter - skip): ");
		if (phone.length() > 0)
			customer.setName(phone);
		
		// add calculation
		Character roomType = MyScanner.getRoomTypeOrEmpty();
		
		
		
		
		
		
		
		
		
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
				printWriter.println(customer.toSave());
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
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
			if (bufferedReader.readLine().equals(HEADER))
				while ((customerLine = bufferedReader.readLine()) != null) {
					// adding customer, getNewCustomer can throw eception
					customerList.add(Customer.getNewCustomer(customerLine));
				}
			else
				throw new IOException("This is not a list of Different Coat clients");
			System.out.println("List loaded");
		} catch (IncorrectObjectTypeExeption e1 ) {
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
	
	private static int getIndexCustomer(ArrayList<Customer> customerList) {
		int idToSearch;
		
		// until you enter the correct id number
		do {
			idToSearch = MyScanner.getInt("Enter ID customer: ");
			
			for (int i = 0; i < customerList.size(); i++)
				if (customerList.get(i).getId() == idToSearch) {
					return i;
				}
			System.out.println("There is no client with id " + idToSearch);
		} while ( true );
	}


}