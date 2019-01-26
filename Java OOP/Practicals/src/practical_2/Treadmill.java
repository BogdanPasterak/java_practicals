package practical_2;

public class Treadmill {
	
	private double minimumSpeed, maximumSpeed, currentSpeed;
	private boolean running;

	public Treadmill()
	{
		minimumSpeed = 1.5;
		maximumSpeed = 10;
		currentSpeed = 0;
		running = false;
	}
	
	public void start() {
		running = true;
		currentSpeed = minimumSpeed;
	}
	
	public void stop() {
		running = false;
		currentSpeed = 0;
	}

	public void increaseSpeed() {
		if (running && currentSpeed + .1 <= maximumSpeed)
			currentSpeed += .1;
	}
	
	public void decreaseSpeed() {
		if (running && currentSpeed - .1 >= minimumSpeed)
			currentSpeed -= .1;
	}
	
	public void setSpeed(double speedIn) {
		if (running && speedIn >= minimumSpeed && speedIn <= maximumSpeed)
			currentSpeed = speedIn;
	}

	public double getMinimumSpeed() {
		return minimumSpeed;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}
	
	public double getCaloriesBurned(double distanceCoveredInKM,
									double weightInKG, double heightInCM) {
		return (heightInCM * heightInCM / (weightInKG * weightInKG))
				* distanceCoveredInKM * currentSpeed;
	}

	@Override
	public String toString() {
		return 	"Minimum Speed: " + minimumSpeed +
				"\nMaximum Speed: " + maximumSpeed +
				"\nCurrent Speed: " + currentSpeed+
				"\nRunning: " + running;
	}
	
}
