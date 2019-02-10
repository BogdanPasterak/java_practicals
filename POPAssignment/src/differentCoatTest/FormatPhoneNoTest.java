package differentCoatTest;

import static org.junit.Assert.*;

import org.junit.Test;

import differentCoat.MyScanner;

public class FormatPhoneNoTest {

	@Test
	public void test1() {
		assertEquals("087 123 4567", MyScanner.formatPhoneNo("0871234567"));;
	}

	@Test
	public void test2() {
		assertEquals("087 123 4567", MyScanner.formatPhoneNo("08 71\t234567"));;
	}

	@Test
	public void test3() {
		assertEquals("01 123 4567", MyScanner.formatPhoneNo("011234567"));;
	}

	@Test
	public void test4() {
		assertEquals("0402 123 456", MyScanner.formatPhoneNo("0402123456"));;
	}

	@Test
	public void test5() {
		assertEquals("041 123 4567", MyScanner.formatPhoneNo("0411234567"));;
	}

	@Test
	public void test6() {
		assertEquals("083 123 4567", MyScanner.formatPhoneNo("0831234567"));;
	}
	@Test
	public void test7() {
		assertEquals(null, MyScanner.formatPhoneNo("0821234567"));;
	}

}
