package practical_2;

public class CurrentAccount {

	// fields
	private String owner;
	private int	number;
	private double balance;
	private boolean overdraftEnabled;
	private double overdraftAmount;
	
	//constructor	
	public CurrentAccount(String owner, int number) {
		this.owner = owner;
		this.number = number;
		balance = 0;
		overdraftEnabled = false;
		overdraftAmount = 0;
	}

	public void lodge(double amountToLodge) {
		if (amountToLodge > 0)
			balance += amountToLodge;
		else
			System.out.println("Amount have to be positive");
	}
	
	public void disableOverdraft() {
		overdraftEnabled = false;
		if (balance < 0)
			System.out.println("You must pay the debit");
	}
	
	public void enableOverdraft(double overdraftAmount) {
		overdraftEnabled = true;
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw (double amountToWithdraw) {
		double maxWithdraw = balance;
		if (overdraftEnabled)
			maxWithdraw += overdraftAmount;
		
		if (amountToWithdraw > 0) {
			if (amountToWithdraw <= maxWithdraw ) {
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

	public double getOverdraftAmount() {
		if (overdraftEnabled)
			return overdraftAmount;
		return 0.0;
	}
	
	
}
