package differentCoatTest;

import static org.junit.Assert.*;
import org.junit.Test;
import differentCoat.PaintRequiredCalculator;


public class PaintRequiredCalculatorTest {

	@Test
	public void numberOfCansTestMinus74_2() {
		assertEquals(0, PaintRequiredCalculator.numberOfCans(-74.2), 0.0001);
	}
	
	@Test
	public void numberOfCansTest0() {
		assertEquals(0, PaintRequiredCalculator.numberOfCans(0.0), 0.0001);
	}
	
	@Test
	public void numberOfCansTestLess14() {
		assertEquals(1, PaintRequiredCalculator.numberOfCans(13.99), 0.0001);
	}

	@Test
	public void numberOfCansTestEquals14() {
		assertEquals(1, PaintRequiredCalculator.numberOfCans(14.0), 0.0001);
	}

	@Test
	public void numberOfCansTestMore14() {
		assertEquals(2, PaintRequiredCalculator.numberOfCans(14.01), 0.0001);
	}

	@Test
	public void numberOfCansTestLess28() {
		assertEquals(2, PaintRequiredCalculator.numberOfCans(27.99), 0.0001);
	}

	@Test
	public void numberOfCansTestEquals28() {
		assertEquals(2, PaintRequiredCalculator.numberOfCans(28.0), 0.0001);
	}

	@Test
	public void numberOfCansTestMore28() {
		assertEquals(3, PaintRequiredCalculator.numberOfCans(28.01), 0.0001);
	}

	@Test
	public void numberOfCansTest128_64() {
		assertEquals(10, PaintRequiredCalculator.numberOfCans(128.64), 0.0001);
	}

}
