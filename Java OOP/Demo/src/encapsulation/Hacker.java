package encapsulation;

public class Hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account ac = new Account();
		// ac.accBal = -100;
		System.out.println(ac.getAccBal());
		ac.deposit(-100);
		System.out.println(ac.getAccBal());
	}

}
