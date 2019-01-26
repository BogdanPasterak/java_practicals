package practical_2;

import myScanner.MyScanner2;

public class CurrencyConverterProgram {

	public static void main(String[] args) {
		
		// create obj 
		CurrencyConverter cc = new CurrencyConverter(
				MyScanner2.getDouble("Enter rate Euro to Pound", 0.9, 0.9),
				MyScanner2.getDouble("Enter rate Euro to Dollar", 1.14, 1.14),
				MyScanner2.getDouble("Enter rate Pound to Euro", 1.11, 1.11),
				MyScanner2.getDouble("Enter rate Pound to Dollar", 1.28, 1.28),
				MyScanner2.getDouble("Enter rate Dollar to Euro", 0.87, 0.87),
				MyScanner2.getDouble("Enter rate Dollar to Pound", 0.78, 0.78));

		int choise = 0;
		double amount = 0;
		
		do {
			System.out.println(
					"\n***CurrencyConverter Menu***\r\n" + 
					"1.	Euro To GBP\r\n" + 
					"2.	Euro To USD\r\n" + 
					"3.	GBP To Euro\r\n" + 
					"4.	GBP To USD\r\n" + 
					"5.	USD To Euro\r\n" + 
					"6.	USD To GBP\r\n" + 
					"7.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 7, MyScanner2.CAN_NOT_BE_ZERO);
			if( choise != 7) {
				System.out.println();
				amount = MyScanner2.getDouble("Enter amount to convert : ", 2000.0);
			}
			
			switch (choise) {
			case 1:
				System.out.printf("%.2f Euros = %.2f Pounds", amount, cc.convertEURtoGBP(amount));
				break;
			case 2:
				System.out.printf("%.2f Euros = %.2f Dollars", amount, cc.convertEURtoUSD(amount));
				break;
			case 3:
				System.out.printf("%.2f Pounds = %.2f Euros", amount, cc.convertGBPtoEUR(amount));
				break;
			case 4:
				System.out.printf("%.2f Pounds = %.2f Dollars", amount, cc.convertGBPtoUSD(amount));
				break;
			case 5:
				System.out.printf("%.2f Dollars = %.2f Euros", amount, cc.convertUSDtoEUR(amount));
				break;
			case 6:
				System.out.printf("%.2f Dollars = %.2f Pounds", amount, cc.convertUSDtoGBP(amount));
				break;
			}
			
		} while (choise != 7);
		
		System.out.println("Bye Bye :)");

	}

}
