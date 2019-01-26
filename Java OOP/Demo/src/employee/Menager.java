package employee;

import java.io.Serializable;

public class Menager extends Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String department;
	private boolean bonus;
	
	public Menager() {
		super();
	}

	public Menager(String firstName, String surName, String phoneNo, String department, boolean bonus) {
		super(firstName, surName, phoneNo);
		this.department = department;
		this.bonus = bonus;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean getBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return	"\nMenager details:\n" +
				super.toString() + "\n" +
				"  Department: " + department + "\n" +
				"  Bonus     : " + ((bonus) ? "Yes" : "No");
	}


}
