package differentCoat;

import java.io.Serializable;

public class Customer implements Serializable {
	
	// number for Serializable
	private static final long serialVersionUID = 1L;
	// class variable
	private static int idLastCustomer;
	// constans id for each customer
	private final int ID;
	// members variable
	private String name;
	private String phone;
	private int paintCans;
	
	// constructor to initialize ID customera
	private Customer() {
		idLastCustomer++;
		ID = idLastCustomer;
	}

	// constructor to create new customer
	public Customer(String name, String phone, int paintCans) {
		this();
		this.name = name;
		this.phone = phone;
		this.paintCans = paintCans;
	}

	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPaintCans() {
		return paintCans;
	}
	public void setPaintCans(int paintCans) {
		this.paintCans = paintCans;
	}

	public int getID() {
		return ID;
	}
	
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
	

}
