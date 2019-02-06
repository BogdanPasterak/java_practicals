package differentCoatTest;

import static org.junit.Assert.*;

import org.junit.Test;

import differentCoat.Customer;

public class CustomerToStringTest {

	@Test
	public void testToString() {

		Customer customer = new Customer("Bogdan Pasterak", "087-1234-567", 5);
		String expected =	"Customer ID - 1\n" +
							"  Name - Bogdan Pasterak\n" +
							"  Phone Nr - 087-1234-567\n" +
							"  Ordered paint cans - 5";
	
		assertEquals(expected, customer.toString());	
	}

}
