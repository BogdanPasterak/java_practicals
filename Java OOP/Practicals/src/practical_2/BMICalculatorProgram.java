package practical_2;

import myScanner.MyScanner2;

public class BMICalculatorProgram {

	public static void main(String[] args) {

		// create obj 
		BMICalculator bmi = new BMICalculator(
				MyScanner2.getDouble("Enter the weight in KG:", 30, 200),
				MyScanner2.getDouble("Enter the height in m : ", 0.6, 2));
		System.out.printf("Weight = %.1f KG,  Height = %.2f m\n\n", bmi.getWeight(), bmi.getHeight());

		int choise = 0;
		
		do {
			System.out.println(
					"\n***BMICalculator Menu***\r\n" + 
					"1.	Get BMI\r\n" + 
					"2.	Get BMI Description\r\n" + 
					"3.	Quit\r\n");
			choise = MyScanner2.getInt("Choise option : ", 1, 3, MyScanner2.CAN_NOT_BE_ZERO);
			
			switch (choise) {
			case 1:
				System.out.printf("BMI = %.1f %n", bmi.getBMI());
				break;
			case 2:
				System.out.println("You are " + bmi.getBMIDescription());
				break;
			}
			
		} while (choise != 3);
		
		System.out.println("Bye Bye :)");


	}

}
