package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.CurrencyConverter;

public class CurrencyConverterTest {

	CurrencyConverter cc;
	
	@Test
	public void newObjectTest() {
		cc = new CurrencyConverter();
		
		assertNotNull(cc);
	}


	@Test
	public void functionTest() {
		cc = new CurrencyConverter();
			
		assertEquals(9.0, cc.convertEURtoGBP(10), 0.00001);
		assertEquals(11.4, cc.convertEURtoUSD(10), 0.00001);
		assertEquals(11.1, cc.convertGBPtoEUR(10), 0.00001);
		assertEquals(12.8, cc.convertGBPtoUSD(10), 0.00001);
		assertEquals(8.7, cc.convertUSDtoEUR(10), 0.00001);
		assertEquals(7.8, cc.convertUSDtoGBP(10), 0.00001);

	}


}
