package practical_2;

import myScanner.MS3;

public class CalorieCounterProgram {

	public static void main(String[] args) {

		// create obj 
		CalorieCounter cc = new CalorieCounter(
				MS3.getInt("Enter the maximum calories per day: ", 2000, 5000));
		System.out.println(cc);

		int choise = 0;
		final int MENU = 8;
		
		do {
			System.out.println(
					"\n*** CalorieCounter Menu***\r\n" + 
					"1.	Get Maximum Calories Per Day\r\n" + 
					"2.	Add Meal\r\n" + 
					"3.	Get Number Of Meals Consumed\r\n" + 
					"4.	Get Highest Calorie Meal Consumed\r\n" + 
					"5.	Get Lowest Calorie Meal Consumed\r\n" + 
					"6.	Reset\r\n" + 
					"7.	To String\r\n" + 
					MENU + ".	Quit\r\n");
			choise = MS3.getInt("Choise option : ", 1, MENU, MS3.CAN_NOT_BE_ZERO);
			System.out.println();
			
			switch (choise) {
			case 1:
				System.out.println("Maximum Calories Per Day : " + cc.getMaximumCaloriesPerDay());
				break;
			case 2:
				cc.addMeal(MS3.getInt("Enter number of calories : ", 10, 3000));
				break;
			case 3:
				System.out.println("Number Of Meals Consumed : " + cc.getNumberOfMealsConsumed());
				break;
			case 4:
				System.out.println("Highest Calorie Meal Consumed : " + cc.getHighestCalorieMeal());
				break;
			case 5:
				System.out.println("Lowest Calorie Meal Consumed : " + cc.getLowestCalorieMeal());
				break;
			case 6:
				cc.reset();
				System.out.println("Reset");
				break;
			case 7:
				System.out.println(cc);
				break;
			}
			
		} while (choise != MENU);
		
		System.out.println("Bye Bye :)");

	}

}
