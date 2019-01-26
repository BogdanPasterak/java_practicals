package practical_2;

public class Car {

	// fields
	private String make = "Ford";
	private String model = "Focus";
	private String registration = "01DL12345";
	private double totalDistanceTravelled = 234567;
	private double fuelTankSize = 40;
	private double fuelInTank = 6.7;
	private double milesPerLitreOfFuel = 10.0;
	
	// Constructor auto generate
	public Car(String make, String model, String registration, double totalDistanceTravelled, double fuelTankSize,
			double fuelInTank, double milesPerLitreOfFuel) {
		this.make = make;
		this.model = model;
		this.registration = registration;
		this.totalDistanceTravelled = totalDistanceTravelled;
		this.fuelTankSize = fuelTankSize;
		this.fuelInTank = fuelInTank;
		this.milesPerLitreOfFuel = milesPerLitreOfFuel;
	}

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
		double maxDistance = fuelInTank * milesPerLitreOfFuel;
		
		if( (maxDistance) >= distanceInMiles) {
			fuelInTank -= (distanceInMiles / milesPerLitreOfFuel);
			totalDistanceTravelled += distanceInMiles;
			System.out.println("We passed " + distanceInMiles + " miles.");
		} else {
			System.out.println("You must refuel more !");
			System.out.printf("Now you can drive up to %.1f miles", (maxDistance));
		}
	}
		
	public double getFuel() {
		return fuelInTank;
	}
	
	public double getMileage() {
		return totalDistanceTravelled;
	}
	
}
