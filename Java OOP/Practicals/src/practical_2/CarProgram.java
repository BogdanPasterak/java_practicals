package practical_2;

import myScanner.MyScanner2;

public class CarProgram {

	public static void main(String[] args) {

		// create obj 
		Car car = new Car(
				MyScanner2.getString("Enter the make", "Ford"),
				MyScanner2.getString("Enter the model", "Focus"),
				MyScanner2.getString("Enter the registration", "01DL12345"),
				(double)MyScanner2.getInt("Enter the mileage", 100000, 300000),
				(double)MyScanner2.getInt("Enter the tank capacity", 30, 60),
				MyScanner2.getDouble("Enter the fuel in tank", 1, 20),
				MyScanner2.getDouble("Enter the fuel efficiency", 7, 15));
		System.out.println(car);

		int choise = 0;
		
		do {
			System.out.println(
					"\n***Car Menu***\r\n" + 
					"1.	To String\r\n" + 
					"2.	Add Fuel\r\n" + 
					"3.	Drive\r\n" + 
					"4.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 4, MyScanner2.NOT_AUTO_FILL);
			
			switch (choise) {
			case 1:
				System.out.println("\n" + car);
				break;
			case 2:
				car.addFuel(MyScanner2.getDouble("How much fill", 100));
				break;
			case 3:
				car.drive(MyScanner2.getDouble("How many mile", 1000));
				break;
			}
			
		} while (choise != 4);

		System.out.println("Bye Bye :)");

	}

}
