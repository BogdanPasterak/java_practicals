package practical_2;

import myScanner.MyScanner2;

public class CurrentAccountProgram {

	public static void main(String[] args) {

		// create obj 
		CurrentAccount ca = new CurrentAccount(
				MyScanner2.getString("Enter the name", MyScanner2.STRINGS.NAME),
				MyScanner2.getInt("Enter the number of acount", 100, 110));
		System.out.println(ca.getOwner() + "   Acc. Nr : " + ca.getNumber());

		int choise = 0;
		
		do {
			System.out.println(
					"\n***CurrentAccount Menu***\r\n" + 
					"1.	Get Balance\r\n" + 
					"2.	Lodge\r\n" + 
					"3.	Withdraw\r\n" + 
					"4.	Enable Overdraft\r\n" + 
					"5.	Disable Overdraft\r\n" + 
					"6.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 6, MyScanner2.NOT_AUTO_FILL);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.printf("You balance = %.2f%n", ca.getBalance());
				break;
			case 2:
				ca.lodge( MyScanner2.getDouble("How much do you want to lodge", 5000) );
				break;
			case 3:
				ca.withdraw( MyScanner2.getDouble("How much do you want to withdraw", 600) );
				break;
			case 4:
				ca.enableOverdraft(MyScanner2.getDouble("What limit to set", 2000));
				break;
			case 5:
				ca.disableOverdraft();
				break;
			}
			
		} while (choise != 6);

		System.out.println("Bye Bye :)");

	}

}
