package practical_1;

public class CurrentAccount {

	// fields
	private String owner;
	private int	number;
	private double balance;
	private boolean overdraftEnabled = false;
	private double overdraftAmount;
	
	public void lodge(double amountToLodge) {
		if (amountToLodge > 0)
			balance += amountToLodge;
	}
	
	public void disableOverdraft() {
		overdraftEnabled = false;
	}
	
	public void enableOverdraft(double overdraftAmount) {
		overdraftEnabled = true;
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw (double amountToWithdraw) {
		if (amountToWithdraw > 0) {
			if (amountToWithdraw <= ((overdraftEnabled) ? balance + overdraftAmount: balance) ) {
				balance -= amountToWithdraw;
				System.out.println("Withdraw an amount " + amountToWithdraw);
			} else
				System.out.println("You do not have enough on your account");
		} else
			System.out.println("An amount to withdraw must be greater than zero");
	}

	// getters and setters
	public double getBalance() {
		return balance;
	}
	
	public boolean isOverdraftEnabled() {
		return overdraftEnabled;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public double getOverdraftAmount() {
		if (overdraftEnabled)
			return overdraftAmount;
		return 0.0;
	}

}
