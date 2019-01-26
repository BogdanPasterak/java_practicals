package employee;

import java.io.Serializable;

public class Developer extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int level;

	public Developer() {
		super();
	}

	public Developer(String firstName, String surName, String phoneNo, int level) {
		super(firstName, surName, phoneNo);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return	"\nDeveloper details:\n" +
				super.toString() + "\n" +
				"  Level     : " + level;
	}
}
