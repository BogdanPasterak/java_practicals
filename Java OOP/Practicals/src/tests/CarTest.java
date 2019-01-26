package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.Car;

public class CarTest {
	
	Car car;

	@Test
	public void newObjectTest() {
		car = new Car();
		
		assertNotNull(car);
	}

	@Test
	public void toStringTest() {
		car = new Car();
		
		String str = "Car Make: Ford\r\n" +
				"Car Model: Focus\r\n" +
				"Car Registration: 01DL12345\r\n" +
				"Mileage: 234567\r\n" +
				"Fuel Tank Size: 40L\r\n" +
				"Fuel In Tank: 6.7L\r\n" +
				"Fuel Efficiency: 10.0 Mile Per Litre";
		
		assertEquals(str, car.toString());
	}

	@Test
	public void driveTest() {
		car = new Car();
		
		assertEquals(6.7, car.getFuel(), 0.001);
		
		car.drive(60);
		// 60 miles cost 6 liters
		// message "We passed 60.0 miles."
		assertEquals(234567.0 + 60.0, car.getMileage(), 0.001);
		assertEquals(6.7 - 6, car.getFuel(), 0.001);
		
		car.drive(10);
		// 10 miles cost 1 liters , in tank 0.7 !!
		// message "You must refuel more !"
		assertEquals(234567.0 + 60.0, car.getMileage(), 0.001);
		assertEquals(6.7 - 6, car.getFuel(), 0.001);
		
	}

	@Test
	public void addFuelTest() {
		car = new Car();
		
		assertEquals(6.7, car.getFuel(), 0.001);
		
		car.addFuel(30);;
		// 6.7 + 30 = 36.7 liters
		// message "You fill up 30.0 liters"
		assertEquals(6.7 + 30.0, car.getFuel(), 0.001);
				
		car.addFuel(10);;
		// 36.7 + 10 > 40.0 liters
		// message "You fill up 3.3 liters"
		assertEquals(40.0, car.getFuel(), 0.001);
				
		car.addFuel( -10 );;
		// -10 illegal, no change
		// message "You can not fill up with less than zero"
		assertEquals(40.0, car.getFuel(), 0.001);
				
	}

}
