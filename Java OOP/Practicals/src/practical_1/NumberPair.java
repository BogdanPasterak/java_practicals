package practical_1;

public class NumberPair {

	// fields
	private int number1;
	private int number2;
	
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

	// getters, setters
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
}
