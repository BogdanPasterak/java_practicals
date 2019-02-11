package differentCoatTest;

import static org.junit.Assert.*;

import org.junit.Test;

import differentCoat.MyScanner;

public class ValidatePhoneNoTest {

	@Test
	public void testTrue01() {
		assertTrue(MyScanner.validatePhoneNo("012345678"));;
	}

	@Test
	public void testTrue02() {
		assertTrue(MyScanner.validatePhoneNo("0 1	2-3*4/5:6"));;
	}

	@Test
	public void testTrue03() {
		assertTrue(MyScanner.validatePhoneNo("0;1,2.3 / 4/5:6"));;
	}
	
	@Test
	public void testTrue04() {
		assertTrue(MyScanner.validatePhoneNo("021 12345"));;
	}
	
	@Test
	public void testTrue05() {
		assertTrue(MyScanner.validatePhoneNo("029 1234567"));;
	}

	@Test
	public void testTrue06() {
		assertTrue(MyScanner.validatePhoneNo("0402 12345"));;
	}
	
	@Test
	public void testTrue07() {
		assertTrue(MyScanner.validatePhoneNo("0404 1234567"));;
	}

	@Test
	public void testTrue08() {
		assertTrue(MyScanner.validatePhoneNo("041 12345"));;
	}
	
	@Test
	public void testTrue09() {
		assertTrue(MyScanner.validatePhoneNo("047 1234567"));;
	}

	@Test
	public void testTrue10() {
		assertTrue(MyScanner.validatePhoneNo("071 12345"));;
	}
	
	@Test
	public void testTrue11() {
		assertTrue(MyScanner.validatePhoneNo("074 1234567"));;
	}
	
	@Test
	public void testTrue12() {
		assertTrue(MyScanner.validatePhoneNo("087 1234567"));;
	}
	
	@Test
	public void testTrue13() {
		assertTrue(MyScanner.validatePhoneNo("+35387 1234567"));;
	}
	
	@Test
	public void testTrue14() {
		assertTrue(MyScanner.validatePhoneNo("0035387 1234567"));;
	}
	
	// Invalid numbers
	@Test
	public void testTrue15() {
		assertFalse(MyScanner.validatePhoneNo("00 1234567"));;
	}
	
	@Test
	public void testTrue16() {
		assertFalse(MyScanner.validatePhoneNo("01 12345678"));;
	}

	@Test
	public void testTrue17() {
		assertFalse(MyScanner.validatePhoneNo("01 1234"));;
	}

	@Test
	public void testTrue18() {
		assertFalse(MyScanner.validatePhoneNo("0402 1234"));;
	}

	@Test
	public void testTrue19() {
		assertFalse(MyScanner.validatePhoneNo("0402 123456789"));;
	}

	@Test
	public void testTrue20() {
		assertFalse(MyScanner.validatePhoneNo("0403 1234567"));;
	}

	@Test
	public void testTrue21() {
		assertFalse(MyScanner.validatePhoneNo("0032374 1234567"));;
	}

	@Test
	public void testTrue22() {
		assertFalse(MyScanner.validatePhoneNo("+32374 1234567"));;
	}

	@Test
	public void testTrue23() {
		assertFalse(MyScanner.validatePhoneNo("087 123456"));;
	}

	@Test
	public void testTrue24() {
		assertFalse(MyScanner.validatePhoneNo("087 12345678"));;
	}

	@Test
	public void testTrue25() {
		assertFalse(MyScanner.validatePhoneNo("087 1234S67"));;
	}
}