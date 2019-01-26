package encapsulation;

public class Account {

	// variables
	private String accNo;
	private double accBal;
	
	
	// getters, setters
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	public void deposit(double amount) {
		if (amount > 0)
			accBal += amount;
		else
			System.out.println("BACK OF HACKER !");
	}
	
	
}
