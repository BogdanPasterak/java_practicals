package differentCoatTest;

import static org.junit.Assert.*;

import org.junit.Test;

import differentCoat.SurfaceCalculator;

public class SurfaceCalculatorTest {

	@Test
	public void testSquareRoomH2S3() {
		double surface = SurfaceCalculator.squareRoom(2, 3);
		
		assertEquals(24, surface, 0.00001);
	}

	@Test
	public void testSquareRoomH2_4S3_22() {
		double surface = SurfaceCalculator.squareRoom(2.4, 3.22);
		
		assertEquals(30.912, surface, 0.00001);
	}

	@Test
	public void testSquareRoomH2S5_3() {
		double surface = SurfaceCalculator.squareRoom(2, 5.3);
		
		assertEquals(42.4, surface, 0.00001);
	}

	@Test
	public void testSquareRoomH2_77S3() {
		double surface = SurfaceCalculator.squareRoom(2.77, 3);
		
		assertEquals(33.24, surface, 0.00001);
	}

	@Test
	public void testRectangularRoomH2L3W4() {
		double surface = SurfaceCalculator.rectangularRoom(2, 3, 4);
		
		assertEquals(28, surface, 0.00001);
	}
	
	@Test
	public void testRectangularRoomH2_8L3_5W4_2() {
		double surface = SurfaceCalculator.rectangularRoom(2.8, 3.5, 4.2);
		
		assertEquals(43.12, surface, 0.00001);
	}

	@Test
	public void testCylindricaRoomH2D2() {
		double surface = SurfaceCalculator.cylindricalRoom(2, 2);
		
		assertEquals(4 * Math.PI, surface, 0.00001);
	}

	@Test
	public void testCylindricaRoomH2_8D3() {
		double surface = SurfaceCalculator.cylindricalRoom(2.8, 3);
		
		assertEquals(8.4 * Math.PI, surface, 0.00001);
	}

	@Test
	public void testCylindricaRoomH2_8D2_2() {
		double surface = SurfaceCalculator.cylindricalRoom(2.8, 2.2);
		
		assertEquals(6.16 * Math.PI, surface, 0.00001);
	}

}
