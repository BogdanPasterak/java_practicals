package encapsulation;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account();
		a.setAccNo("FZ101");
		a.setAccBal(1000);
		System.out.println("Details of Account 1");
		System.out.println("Account No       : " + a.getAccNo());
		System.out.println("Account Ballance : " + a.getAccBal());
		a.deposit(500);
		System.out.println("After depositing");
		System.out.println("Account Ballance : " + a.getAccBal());
		
	}

}
