package practical_2;

import myScanner.MyScanner2;

public class StockItemProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sName = MyScanner2.getString("Enter the name of the stock : ", "Milk", "Egg", "Bread", "Butter");
		int sID = MyScanner2.getInt("Enter the id of the stock : ", 10);
		int sQty = MyScanner2.getInt("Enter the quantity of the stock : ", 100);
		double sPrice = MyScanner2.getDouble("Enter the price of the stock : ", 5, 30);
		sPrice = ((int) (sPrice * 100)) / 100.0;

		StockItem stockItemObj = new StockItem(sName, sID, sQty, sPrice);

		// System.out.println(stockItemObj.getPrice());
		int choise = 0;

		
		while (true) {

			System.out.println("\n***StockItem Menu***\n" +
							"1.	Get Quantity In Stock\n" +
							"2.	Add Stock\n" +
							"3.	Remove Stock\n" +
							"4.	Get Price\n" +
							"5.	Set Price\n" +
							"6.	Quit");
			choise = MyScanner2.getInt("Enter the choise : ", 1, 6);
			switch (choise) {
			case 1:
				System.out.println(stockItemObj.getQuantityInStock());
				break;
			case 2:
				stockItemObj.addStock(MyScanner2.getInt("How many item to add", 100));
				break;
			case 3:
				stockItemObj.removeStock(MyScanner2.getInt("How many item to remove", 100));
				break;
			case 4:
				System.out.println(stockItemObj.getPrice());
				break;
			case 5:
				stockItemObj.setPrice(MyScanner2.getDouble("Enter new price", 50));
				break;
			case 6:
				System.exit(0);
				break;
			}
			
		}
	}

}
