package practical_2;

public class NumberPair {

	int number1, number2;

	public NumberPair(int no1In, int no2In) {
		number1 = no1In;
		number2 = no2In;
	}

	// members function
	public int sum() {
		return number1 + number2;
	}
	
	public int difference() {
		return number2 - number1;
	}

	public int product() {
		return number1 * number2;
	}
	
	public double average() {
		return sum() / 2.0;
	}
	
	public int maximum() {
		return (number1 > number2) ? number1 : number2;
	}
	
	public int minimum() {
		return (number1 < number2) ? number1 : number2;
	}

	
}
