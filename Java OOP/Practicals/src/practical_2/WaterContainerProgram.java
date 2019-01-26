package practical_2;

import myScanner.MS3;

public class WaterContainerProgram {

	public static void main(String[] args) {

		// create obj 
		WaterContainer wc = new WaterContainer(
				(double)MS3.getInt("Enter the maximum capacity: ", 100, 200),
				(double)MS3.getInt("Enter the current capacity: ", 100),
				MS3.getDouble("Enter the drainage speed per second: ", 1, 10));
		System.out.println(wc);

		int choise = 0;
		final int MENU = 5;
		
		do {
			System.out.println(
					"\n*** WaterContainer Menu***\r\n" + 
					"1.	Get Maximum Capacity\r\n" + 
					"2.	Get Current Capacity\r\n" + 
					"3.	Add Water\r\n" + 
					"4.	Remove Water\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.CAN_NOT_BE_ZERO);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Maximum Capacity : " + wc.getMaximumCapacity());
				break;
			case 2:
				System.out.println("Current Capacity : " + wc.getCurrentCapacity());
				break;
			case 3:
				wc.addWater(MS3.getDouble("Enter capacity to add", 300));
				break;
			case 4:
				 System.out.printf("Time for remove in secound: %.1f%n",
						 wc.removeWater(MS3.getDouble("Enter capacity to remove", 300)));
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
