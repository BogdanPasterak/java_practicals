package practical_2;

public class WaterContainer {

	double maximumCapacity, currentCapacity, drainageSpeedPerSecond;
	
	public WaterContainer (double maximumCapacityIn, double currentCapacityIn, double drainageSpeedPerSecondIn)
	{
		maximumCapacity = maximumCapacityIn;
		currentCapacity = currentCapacityIn;
		drainageSpeedPerSecond = drainageSpeedPerSecondIn;
	}
	
	public double getCurrentCapacity() {
		return currentCapacity;
	}

	public double getMaximumCapacity() {
		return maximumCapacity;
	}
	
	public void addWater(double quantityToAdd) {
		if (quantityToAdd + currentCapacity <= maximumCapacity)
			currentCapacity += quantityToAdd;
	}
	
	public double removeWater(double quantityToRemove) {
		if (quantityToRemove <= currentCapacity) {
			currentCapacity -= quantityToRemove;
			return quantityToRemove / drainageSpeedPerSecond;
		}
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Current : " + currentCapacity +
				"\nMaximum : " + maximumCapacity +
				"\nSeeed : " + drainageSpeedPerSecond;
	}
}
