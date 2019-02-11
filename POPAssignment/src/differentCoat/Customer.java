package differentCoat;

import java.io.Serializable;

public class Customer implements Serializable {
	
	// number for Serializable
	private static final long serialVersionUID = 1L;
	// class variable
	private static int idLastCustomer;
	// constant id for each customer
	private final int id;
	// members variable
	private String name;
	private String phone;
	private int paintCans;
	
	// constructor to initialize ID customera
	private Customer() {
		idLastCustomer++;
		id = idLastCustomer;
	}

	// constructor to create new customer
	public Customer(String name, String phone, int paintCans) {
		this();
		setName(name);
		setPhone(phone);
		this.paintCans = paintCans;
	}

	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// replace the tab with four spaces, the tab is a separator when writing data
		this.name = name.trim().replaceAll("\t", "    ");
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		// replace the tab with four spaces, the tab is a separator when writing data
		this.phone = MyScanner.formatPhoneNo(phone);
	}

	public int getPaintCans() {
		return paintCans;
	}
	public void setPaintCans(int paintCans) {
		this.paintCans = paintCans;
	}
	// id only getter
	public int getId() {
		return id;
	}
	
	// method needed to read the list as an object
	public static boolean setStartId(int start) {
		// greater than 0
		if (start <= 0)
			return false;
		// it was already initialized, you can only once
		if (idLastCustomer != 0)
			return false;
		// constructor incrase
		start--;
		idLastCustomer = start;
		// success
		return true;
	}
	
	// method to convert customer to 1 line of string (tab is a separator
	public String toSave() {
		
		return id + "\t" + name + "\t" + phone + "\t" + paintCans;
	}
	
	// method return new customer from String (loaded) if correct
	public static Customer getNewCustomer(String customer) throws IncorrectObjectTypeExeption {
		
		// seperate data
		String[] customerDetails = customer.trim().split("\t");
		
		// if number data match 
		if (customerDetails.length == 4) {
			try {
				// id and paintCans are int type
				int nrId = Integer.parseInt(customerDetails[0]);
				int cans = Integer.parseInt(customerDetails[3]);
				// validate phone
				String phoneNo = MyScanner.formatPhoneNo(customerDetails[2]);
				// if a gap in id numbers leave a gap
				if (idLastCustomer + 1 < nrId )
					idLastCustomer = nrId - 1;
				else if (idLastCustomer >= nrId)
					throw new IncorrectObjectTypeExeption("Wrong order of customers on the list");
				if (phoneNo == null)
					throw new IncorrectObjectTypeExeption("Wrong phone No customer " + customerDetails[1]);
				
				// return new customer
				return new Customer(customerDetails[1], phoneNo, cans);
			} catch (NumberFormatException e) {
				throw new IncorrectObjectTypeExeption("Data type not compatible with Customer data");
			}
		} else
			throw new IncorrectObjectTypeExeption("Data number doesn't match the Customer type");
		//return null;
	}
	
	@Override
	public String toString() {
		String customer;
		customer = "Customer ID - " + id + "\n";
		customer += "  Name - " + name + "\n";
		customer += "  Phone Nr - " + phone + "\n";
		customer += "  Ordered paint cans - " + paintCans;
		return customer;
	}
	

}