package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import practical_1.CurrentAccount;

public class CurrentAccountTest {

	CurrentAccount ca;
	
	@Test
	public void newObjectTest() {
		ca = new CurrentAccount();
		
		assertNotNull(ca);
	}

	@Test
	public void initialTest() {
		ca = new CurrentAccount();
		
		assertEquals(0.0, ca.getBalance(), 0.0001);
		assertFalse(ca.isOverdraftEnabled());
	}

	@Test
	public void assignTest() {
		ca = new CurrentAccount();
		
		ca.setOwner("Bogdan Pasterak");
		ca.setNumber(12345);
		
		assertEquals("Bogdan Pasterak", ca.getOwner());
		assertEquals(12345, ca.getNumber());
	}

	@Test
	public void lodgeTest() {
		ca = new CurrentAccount();
		
		assertEquals(0.0, ca.getBalance(), 0.0001);
		
		ca.lodge(123.55);
		assertEquals(123.55, ca.getBalance(), 0.0001);
		
		ca.lodge(-10);
		// illegal value, no change
		assertEquals(123.55, ca.getBalance(), 0.0001);
	}

	@Test
	public void disableOverdraftTest() {
		ca = new CurrentAccount();
				
		ca.enableOverdraft(1000.0);;
		assertTrue(ca.isOverdraftEnabled());
		
		ca.disableOverdraft();
		// illegal value, no change
		assertFalse(ca.isOverdraftEnabled());
		assertEquals(0.0, ca.getOverdraftAmount(), 0.001);
		
	}

	@Test
	public void enableOverdraftTest() {
		ca = new CurrentAccount();
				
		assertFalse(ca.isOverdraftEnabled());

		ca.enableOverdraft(1000.0);
		assertTrue(ca.isOverdraftEnabled());
		assertEquals(1000.0, ca.getOverdraftAmount(), 0.001);
		
	}

	@Test
	public void withdrawTest() {
		ca = new CurrentAccount();
				
		ca.withdraw(100.0); // illegal 
		// message "You do not have enough on your account"
		assertEquals(0.0, ca.getBalance(), 0.001);

		ca.lodge(120);
		ca.withdraw(100.0); 
		// message "Withdraw an amount 100.0"
		assertEquals(20.0, ca.getBalance(), 0.001);

		ca.enableOverdraft(100.0);
		ca.withdraw(70.0);
		// message "Withdraw an amount 50.0"
		assertEquals( -50.0, ca.getBalance(), 0.001);
		
		ca.withdraw(60.0); // illegal 
		// message "You do not have enough on your account"
		assertEquals( -50.0, ca.getBalance(), 0.001);
		
	}

}
