package practical_2;

import myScanner.MS3;

public class TreadmillProgram {

	public static void main(String[] args) {

		// create obj 
		Treadmill t = new Treadmill();
		System.out.println(t);

		int choise = 0;
		final int MENU = 10;
		
		do {
			System.out.println(
					"\n*** Treadmill Menu***\r\n" + 
					"1.	Start\r\n" + 
					"2.	Stop\r\n" + 
					"3.	Increase Speed\r\n" + 
					"4.	Decrease Speed\r\n" + 
					"5.	Set Speed\r\n" + 
					"6.	Get Current Speed\r\n" + 
					"7.	Get Maximum Speed\r\n" + 
					"8.	Get Minimum Speed\r\n" + 
					"9.	Get Calories Burned\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.CAN_NOT_BE_ZERO);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Start");
				t.start();
				break;
			case 2:
				System.out.println("Stop");
				t.stop();
				break;
			case 3:
				System.out.println("Increase Speed");
				t.increaseSpeed();
				break;
			case 4:
				System.out.println("Decrease Speed");
				t.decreaseSpeed();
				break;
			case 5:
				t.setSpeed(MS3.getDouble("Type speed to set: ", 10));
				break;
			case 6:
				System.out.println("Current Speed: " + t.getCurrentSpeed());
				break;
			case 7:
				System.out.println("Maximum Speed: " + t.getMaximumSpeed());
				break;
			case 8:
				System.out.println("Minimum Speed: " + t.getMinimumSpeed());
				break;
			case 9:
				System.out.println("Calories Burned: " + t.getCaloriesBurned(
						MS3.getDouble("Distance covered in KM: ", 1, 100),
						MS3.getDouble("Weight in KG: ", 30, 200),
						MS3.getDouble("Height in cm: ", 100, 200)));
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
