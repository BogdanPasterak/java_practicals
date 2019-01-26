package practical_1;

public class DataSet {
	// fields
	private int sum;
	private int number;
	private int smallest = Integer.MAX_VALUE;
	private int largest = Integer.MIN_VALUE;
	
	// functions
	public void addValue(int valueToAdd) {
		
		sum += valueToAdd;
		number++;
		
		if (valueToAdd < smallest)
			smallest = valueToAdd;
		if (valueToAdd > largest)
			largest = valueToAdd;		

	}
	
	public int getSum() {
		return sum;
	}

	public double getAverage() {
		if (number == 0) {
			System.out.println("There is no data yet");
			return 0;
		}
		return sum / (double)number;
	}

	public int getSmallest() {
		return smallest;
	}

	public int getLargest() {
		return largest;
	}


}
