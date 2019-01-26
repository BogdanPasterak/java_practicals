package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.BMICalculator;

public class BMICalculatorTest {

	BMICalculator bmi;
	
	@Test
	public void newObjectTest() {
		bmi = new BMICalculator();
		
		assertNotNull(bmi);
	}

	@Test
	public void assignTest() {
		bmi = new BMICalculator();
		
		bmi.setHeight(1.68);
		bmi.setWeight(78);
		
		assertEquals(1.68, bmi.getHeight(), 0.0001);
		assertEquals(78, bmi.getWeight(), 0.0001);
	}

	@Test
	public void functionTest() {
		bmi = new BMICalculator();
		
		bmi.setHeight(1.68);
		bmi.setWeight(88);
		
		assertEquals(31.179, bmi.getBMI(), 0.001);
		assertEquals("Obese", bmi.getBMIDescription());
		
		bmi.setHeight(1.68);
		bmi.setWeight(78);
		
		assertEquals(27.636, bmi.getBMI(), 0.001);
		assertEquals("Overweight", bmi.getBMIDescription());
		
		bmi.setHeight(1.68);
		bmi.setWeight(68);
		
		assertEquals(24.093, bmi.getBMI(), 0.001);
		assertEquals("Normal Weight", bmi.getBMIDescription());
		
		bmi.setHeight(1.68);
		bmi.setWeight(50);
		
		assertEquals(17.715, bmi.getBMI(), 0.001);
		assertEquals("Under Weight", bmi.getBMIDescription());
	}
	
}
