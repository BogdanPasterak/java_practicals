package differentCoatTest;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

import differentCoat.Customer;

public class CustomerCreateTest {

	Customer customer1, customer2;

	@Ignore ("You can only test one at a time")
	// for the test execution, copy these lines to the second (first) test
	@Test
	public void testCreateNewCustomer() {
		
		customer1 = new Customer("Bogdan Pasterak", "087-1234-567", 5);
		assertNotNull(customer1);
		assertEquals(1, customer1.getId());
		
		// sets up only once, the first use starts the counter
		assertFalse(Customer.setStartId(10));
		
		customer2 = new Customer("Jean Doe", "087-1111-555", 10);
		assertNotNull(customer2);
		assertEquals(2, customer2.getId());
	}
	
	@Test
	public void testCreateNewCustomerFrom10() {
		
		// start from 10
		assertTrue(Customer.setStartId(10));
		// sets up only once
		assertFalse(Customer.setStartId(20));
		
		customer1 = new Customer("Bogdan Pasterak", "087-1234-567", 5);
		assertNotNull(customer1);
		assertEquals(10, customer1.getId());
		
		customer2 = new Customer("Jean Doe", "087-1111-555", 10);
		assertNotNull(customer2);
		assertEquals(11, customer2.getId());
	}
	

}

