package employee;

import java.io.Serializable;

public abstract class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int empId;
	private String firstName;
	private String surName;
	private String phoneNo;
	private static int nextEmpId = 1;
	
	public Employee() {
		empId = nextEmpId++;
	}

	public Employee(String firstName, String surName, String phoneNo) {
		this();
		this.firstName = firstName;
		this.surName = surName;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getEmpId() {
		return empId;
	}
	
	public static void setStartIdEmpolyee(int start) {
		nextEmpId = start;
	}
	
	@Override
	public String toString() {
		return	"  Id        : " + empId + "\n" +
				"  First name: " + firstName + "\n" +
				"  Surname   : " + surName + "\n" +
				"  Phone nr  : " + phoneNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null || !(obj instanceof Employee) )
			return false;
		
		// empId is unique
		return ((Employee)obj).empId == empId;
	}

}
