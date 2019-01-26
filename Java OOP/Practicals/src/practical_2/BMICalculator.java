package practical_2;

public class BMICalculator {
	// fields
	private double weight;
	private double height;
	
	// constructor
	public BMICalculator (double weightIn, double heightIn)
	{
		weight = weightIn;
		height = heightIn;
	}

	// functions
	public double getBMI() {
		return getWeight() / (getHeight() * getHeight());
	}

	public String getBMIDescription() {
		double bmi = getBMI();
		
		if(bmi <= 18)
			return "Under Weight";
		else if (bmi <= 25)
			return "Normal Weight";
		else if (bmi <= 30)
			return "Overweight";

		return "Obese";
	}

	// getters and setters
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}
