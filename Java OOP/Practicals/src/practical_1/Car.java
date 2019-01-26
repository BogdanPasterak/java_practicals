package practical_1;

public class Car {

	// fields
	String make = "Ford";
	String model = "Focus";
	String registration = "01DL12345";
	double totalDistanceTravelled = 234567;
	double fuelTankSize = 40;
	double fuelInTank = 6.7;
	double milesPerLitreOfFuel = 10.0;
	
	@Override
	public String toString() {
		return	"Car Make: " + make + "\r\n" +
				"Car Model: " + model + "\r\n" +
				"Car Registration: " + registration + "\r\n" +
				"Mileage: " + (int)totalDistanceTravelled + "\r\n" +
				"Fuel Tank Size: " + (int)fuelTankSize + "L\r\n" +
				"Fuel In Tank: " + Math.floor(fuelInTank * 10) / 10 + "L\r\n" +
				"Fuel Efficiency: " + Math.floor(milesPerLitreOfFuel * 10) / 10 + " Mile Per Litre";
	}
	
	public void addFuel(double amountToAdd) {
		
		if (amountToAdd >= 0) {
			double before = fuelInTank;
			fuelInTank += amountToAdd;
			if (fuelInTank > fuelTankSize)
				fuelInTank = fuelTankSize;
			System.out.printf("You fill up %.1f liters\r\n", (fuelInTank - before));
		} else 
			System.out.println("You can not fill up with less than zero");
	}
	
	public void drive(double distanceInMiles) {
		
		if(distanceInMiles / milesPerLitreOfFuel <= fuelInTank) {
			fuelInTank -= (distanceInMiles / milesPerLitreOfFuel);
			totalDistanceTravelled += distanceInMiles;
			System.out.println("We passed " + distanceInMiles + " miles.");
		} else 
			System.out.println("You must refuel more !");
		
	}
		
	public double getFuel() {
		return fuelInTank;
	}
	
	public double getMileage() {
		return totalDistanceTravelled;
	}
	
}
