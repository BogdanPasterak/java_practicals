package differentCoatTest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import differentCoat.Customer;

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
		customer.setPhone("00353	777	2222	3333");
		assertEquals("00353    777    2222    3333", customer.getPhone());
	}
	
	@Test
	public void testSetPaintCans() {
		customer.setPaintCans(7);	
		assertEquals(7, customer.getPaintCans());	
	}	

}
