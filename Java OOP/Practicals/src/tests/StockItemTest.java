package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.StockItem;

public class StockItemTest {

	StockItem st;
	
	@Test
	public void createObjectTest() {
		st = new StockItem();

		assertNotNull(st);
	}
	
	@Test
	public void getterSetterTest() {
		st = new StockItem();
		
		st.setItemName("Milk");
		assertEquals("Milk", st.getItemName());
		
		st.setItemName("Egg");
		assertEquals("Egg", st.getItemName());
		
		st.setItemID(7);
		assertEquals(7, st.getItemID());
		
		st.setPrice(3.55);
		assertEquals(3.55 , st.getPrice(), 0.0001);
	}

}
