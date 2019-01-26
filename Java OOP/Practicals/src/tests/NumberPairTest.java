package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.NumberPair;

public class NumberPairTest {

	NumberPair np;
	
	@Test
	public void newObjectTest() {
		np = new NumberPair();
		
		assertNotNull(np);
	}

	@Test
	public void assignTest() {
		np = new NumberPair();
		
		np.setNumber1(1);
		np.setNumber2(2);
		
		assertEquals(1, np.getNumber1());
		assertEquals(2, np.getNumber2());
	}

	@Test
	public void functionTest() {
		np = new NumberPair();
		
		np.setNumber1(1);
		np.setNumber2(3);
		
		assertEquals(4, np.sum());
		assertEquals(2, np.difference());
		assertEquals(2.0, np.average(), 0.00001);
		assertEquals(3, np.maximum());
		assertEquals(1, np.minimum());
	}

}
