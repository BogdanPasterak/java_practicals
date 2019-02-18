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
		
		// get customer details
		System.out.println("\n  --- Enter details of client ---");
		name = MyScanner.getString("  Enter the customer's name: ");
		phone = MyScanner.getPhone(false);
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
		
		System.out.println("\nAdded " + customerList.get(customerList.size()-1));
	}

	public static void searchCustomer(ArrayList<Customer> customerList) {
		int index;
		
		// get avaliable index
		index = getIndexCustomer(customerList);
		
		// print using toString()
		if (index != -1)
			System.out.println("\n" + customerList.get(index));
		else 
			System.out.println("The list of clients is empty");
	}

	public static void removeCustomer(ArrayList<Customer> customerList) {
		int index;
		
		// get avaliable index
		index = getIndexCustomer(customerList);

		if (index != -1) {
			// Print and remove client
			System.out.println("\nRemmove " + customerList.get(index));
			customerList.remove(index);
		}
		else 
			System.out.println("The list of clients is empty");
	}

	public static void displayCustomers(ArrayList<Customer> customerList) {
		
		System.out.println("\n---- All Customers details ----");
		// Print all on list
		for (Customer customer : customerList) {
			System.out.println("\n" + customer);
		}
		
	}

	public static void editCustomer(ArrayList<Customer> customerList) {
		// variable
		int index;
		Customer customer;
		String name, phone;
		Character roomType;	// avaliable S,R,C and null
		double[] dimensions;
		double surface = 0;
		int cans;
		
		// customer to edit
		index = getIndexCustomer(customerList);
		if (index != -1) {
			customer = customerList.get(index);
			
			System.out.println("  --- Edit Customer with ID: " + customer.getId() + " ---");
			
			// if you want to change name
			System.out.println("\n  Current name : " + customer.getName());
			name = MyScanner.getStringOrEmpty("  Type new name (Enter - skip): ");
			if (name.length() > 0)
				customer.setName(name);
			
			// if you want to change phone
			System.out.println("\n  Current phone No : " + customer.getPhone());
			phone = MyScanner.getPhone(true);
			if (phone != null)
				customer.setPhone(phone);
			
			// if you want to change calculation
			System.out.print("\n  Current ordered paint cans : " + customer.getPaintCans());
			roomType = MyScanner.getRoomTypeOrEmpty();
			if (roomType != null) {
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
				// and set new value
				customer.setPaintCans(cans);
			}
			
			System.out.println("\nEdited " + customer);
		}
		else 
			System.out.println("The list of clients is empty");

	}

	public static void saveList(ArrayList<Customer> customerList, final String PATH) {
		
		// try / catch with source
		/*
		// OO save , data in binary format
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
				// seve customer as text line
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
			customerList.add(new Customer("Bogdan Pasterak", "087 7000000", 9));
		} catch (IOException e2) {
			System.err.println(e2.getMessage());
			System.out.println("I add temporary to list three clients");
			customerList.add(new Customer("Jon Doe", "087 7333333", 5));
			customerList.add(new Customer("Anna D'ark", "087 7999999", 3));
			customerList.add(new Customer("Jeny Mc'Donalds", "087 7111111", 7));
		}

		return customerList;
	}
	
	// get index customer given ID
	private static int getIndexCustomer(ArrayList<Customer> customerList) {
		int idToSearch;
		
		if ( customerList.size() > 0)
		// until you enter the correct id number
			do {
				idToSearch = MyScanner.getInt("Enter ID customer: ");
				
				for (int i = 0; i < customerList.size(); i++)
					if (customerList.get(i).getId() == idToSearch) {
						return i;
					}
				System.out.println("There is no client with id " + idToSearch);
			} while ( true );
		else
			System.out.println("There is no clients on the list ");
		return -1;
	}

}