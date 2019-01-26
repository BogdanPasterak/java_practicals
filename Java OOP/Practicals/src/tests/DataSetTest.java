package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import practical_1.DataSet;

public class DataSetTest {

	DataSet ds;
	
	@Test
	public void newObjectTest() {
		ds = new DataSet();
		
		assertNotNull(ds);
	}

	@Test
	public void initialTest() {
		ds = new DataSet();
		
		assertEquals(0, ds.getSum());
		assertEquals(Integer.MIN_VALUE, ds.getLargest());
		assertEquals(Integer.MAX_VALUE, ds.getSmallest());
		assertEquals(0, ds.getAverage(), 0.0001);
		// message !  There is no data yet
	}

	@Test
	public void addValueTest() {
		ds = new DataSet();
		
		ds.addValue(5);
		
		assertEquals(5, ds.getSum());
		assertEquals(5, ds.getLargest());
		assertEquals(5, ds.getSmallest());
		// 1 number
		assertEquals(5.0, ds.getAverage(), 0.0001);
		
		ds.addValue(2);
		
		assertEquals(7, ds.getSum());
		assertEquals(5, ds.getLargest());
		assertEquals(2, ds.getSmallest());
		// 2 numbers
		assertEquals(3.5, ds.getAverage(), 0.0001);
		
		ds.addValue(8);
		
		assertEquals(15, ds.getSum());
		assertEquals(8, ds.getLargest());
		assertEquals(2, ds.getSmallest());
		// 3 numbers
		assertEquals(5.0, ds.getAverage(), 0.0001);
		
	}

}
