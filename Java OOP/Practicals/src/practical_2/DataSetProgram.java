package practical_2;

import myScanner.MyScanner2;

public class DataSetProgram {

	public static void main(String[] args) {

		// create obj 
		DataSet ds = new DataSet();
		
		
		int choise = 0, value;
		
		do {
			System.out.println(
					"\n***DataSet Menu***\r\n" + 
					"1.	Add Value\r\n" + 
					"2.	Get Sum\r\n" + 
					"3.	Get Average\r\n" + 
					"4.	Get Largest\r\n" + 
					"5.	Get Smallest\r\n" + 
					"6.	Quit\r\n");
			
			choise = MyScanner2.getInt("Choise option : ", 1, 6, MyScanner2.CAN_NOT_BE_ZERO);
			
			switch (choise) {
			case 1:
				value = MyScanner2.getInt("Enter the number to add to a set", 30);
				ds.addValue(value);
				System.out.println(value + " is added to a set");
				break;
			case 2:
				System.out.println("Sum = " + ds.getSum());
				break;
			case 3:
				System.out.println("Average = " + ds.getAverage());
				break;
			case 4:
				System.out.println("Largest = " + ds.getLargest());
				break;
			case 5:
				System.out.println("Smallest = " + ds.getSmallest());
				break;
			}
			
		} while (choise != 6);
		
		System.out.println("Bye Bye :)");



	}

}
