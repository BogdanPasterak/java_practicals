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
		this.name = name.replaceAll("\t", "    ");
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		// replace the tab with four spaces, the tab is a separator when writing data
		this.phone = phone.replaceAll("\t", "    ");
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
