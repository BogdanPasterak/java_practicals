package differentCoatTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;
import differentCoat.Customer;
import differentCoat.IncorrectObjectTypeExeption;

public class CustomerGetterSetterTest {

	Customer customer;
	@Before
	public void setUp() throws Exception {
		customer = new Customer("Bogdan Pasterak", "087-1234-567", 5);
	}

	@Test
	public void testGetName() {	
		assertEquals("Bogdan Pasterak", customer.getName());
	}
	
	@Test
	public void testGetPhone() {
		assertEquals("087-1234-567", customer.getPhone());
	}

	@Test
	public void testGetPaintCans() {
		assertEquals(5, customer.getPaintCans());
	}

	@Test
	public void testSetName() {
		customer.setName("Alice Someone");
		assertEquals("Alice Someone", customer.getName());
	}
	
	@Test
	public void testSetNameWithTab() {
		// setter replace tab with 4 spaces
		customer.setName("Bob\t\tD'\tClark");
		assertEquals("Bob        D'    Clark", customer.getName());
	}
	
	@Test
	public void testSetPhone() {
		customer.setPhone("00353-777-2222-3333");
		assertEquals("00353-777-2222-3333", customer.getPhone());
	}
	
	@Test
	public void testSetPhoneWithTab() {
		// setter replace tab with 4 spaces
		customer.setPhone("00353	777	2222	3333");
		assertEquals("00353    777    2222    3333", customer.getPhone());
	}
	
	@Test
	public void testSetPaintCans() {
		customer.setPaintCans(7);	
		assertEquals(7, customer.getPaintCans());	
	}	
	
	@Test
	public void testGetNewCustomerWrongOrder() {
		try {
			customer = Customer.getNewCustomer("0\tBogdan Pasterak\t1234567890\t4");
		} catch (IncorrectObjectTypeExeption e) {
			assertEquals("Wrong order of customers on the list", e.getMessage());
		}
		// if not catch error fail test
		if (customer != null)
			assertNotEquals("1234567890", customer.getPhone());
	}
	
	@Test
	public void testGetNewCustomerBadInt() {
		try {
			customer = Customer.getNewCustomer("a\tBogdan Pasterak\t1234567890\t4");
		} catch (IncorrectObjectTypeExeption e) {
			assertEquals("Data type not compatible with Customer data", e.getMessage());
		}
		// if not catch error fail test
		if (customer != null)
			assertNotEquals("1234567890", customer.getPhone());
	}
	
	@Test
	public void testGetNewCustomerBadInt2() {
		try {
			customer = Customer.getNewCustomer("0\tBogdan Pasterak\t1234567890\t4.5");
		} catch (IncorrectObjectTypeExeption e) {
			assertEquals("Data type not compatible with Customer data", e.getMessage());
		}
		// if not catch error fail test
		if (customer != null)
			assertNotEquals("1234567890", customer.getPhone());
	}
	
	@Test
	public void testGetNewCustomerNumberData() {
		try {
			customer = Customer.getNewCustomer("0\tBogdan Pasterak\t1234567890");
		} catch (IncorrectObjectTypeExeption e) {
			assertEquals("Data number doesn't match the Customer type", e.getMessage());
		}
		// if not catch error fail test
		if (customer != null)
			assertNotEquals("1234567890", customer.getPhone());
	}
	
	@Test
	public void testGetNewCustomerNumberDataOver() {
		try {
			customer = Customer.getNewCustomer("0\tBogdan Pasterak\t1234567890\t5\t6");
		} catch (IncorrectObjectTypeExeption e) {
			assertEquals("Data number doesn't match the Customer type", e.getMessage());
		}
		// if not catch error fail test
		if (customer != null)
			assertNotEquals("1234567890", customer.getPhone());
	}
	
	@Test
	public void testGetNewCustomerNumberDataTrim() {
		try {
			customer = Customer.getNewCustomer(" \t50\tBogdan Pasterak\t1234567890\t5\t");
		} catch (IncorrectObjectTypeExeption e) {
			
		}
		// if not catch error pass test
		assertEquals(50, customer.getId());
		assertEquals("1234567890", customer.getPhone());
		assertEquals("Bogdan Pasterak", customer.getName());
		assertEquals(5, customer.getPaintCans());
	}
	
	@Test
	public void testToSave() {
		
		customer.setName("Bogdan");
		customer.setPhone("12345");
		customer.setPaintCans(12);
		// start string with id
		String expected = String.valueOf(customer.getId());
		// and rest ( separator tab )
		expected += "\tBogdan\t12345\t12";
		
		assertEquals(expected, customer.toSave());
	}
	


}