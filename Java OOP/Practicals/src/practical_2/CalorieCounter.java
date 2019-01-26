package practical_2;

public class CalorieCounter {

	private int maxCaloriesPerDay;
	private int numberOfCalories;
	private int numberOfMeals;
	private int highestCalorieMeal;
	private int lowestCalorieMeal;
		
	public CalorieCounter(int maxCaloriesPerDayIn)
	{
		maxCaloriesPerDay = maxCaloriesPerDayIn;
		numberOfCalories = 0;
		numberOfMeals = 0;
		highestCalorieMeal = 0;
		lowestCalorieMeal = Integer.MAX_VALUE;
	}

	public int getMaximumCaloriesPerDay() {
		return maxCaloriesPerDay;
	}
	
	public int getNumberOfMealsConsumed() {
		return numberOfMeals;
	}
	
	public int getHighestCalorieMeal() {
		return highestCalorieMeal;
	}
	
	public int getLowestCalorieMeal() {
		if(numberOfMeals == 0)
			return 0;
		return lowestCalorieMeal;
	}
	
	public void addMeal(int caloriesIn) {
		if (caloriesIn > 0) {
			numberOfCalories += caloriesIn;
			numberOfMeals++;
			if (caloriesIn > highestCalorieMeal)
				highestCalorieMeal = caloriesIn;
			if (caloriesIn < lowestCalorieMeal)
				lowestCalorieMeal = caloriesIn;
		}
	}
	
	public void reset() {
		maxCaloriesPerDay = 0;
		numberOfCalories = 0;
		numberOfMeals = 0;
		highestCalorieMeal = 0;
		lowestCalorieMeal = Integer.MAX_VALUE;

	}
	
	@Override
	public String toString() {
		return "Maximum Calories Per Day: " + maxCaloriesPerDay + "\r\n" + 
				"Meals Consumed: " + numberOfMeals + "\r\n" + 
				"Number Of Calories Consumed: " + numberOfCalories + 
				" (" + (numberOfCalories - maxCaloriesPerDay) + ") \r\n" + 
				"Highest Calorie Meal: " + highestCalorieMeal + "\r\n" + 
				"Lowest Calorie Meal: " + getLowestCalorieMeal();
	}
}
