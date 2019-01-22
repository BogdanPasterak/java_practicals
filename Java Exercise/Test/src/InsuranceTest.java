import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsuranceTest {

	@Test
	void test_Age_17_21_Men() {
		assertEquals(0, Insurance.insuranceCalk(17, Insurance.MEN));
		assertEquals(0, Insurance.insuranceCalk(19, Insurance.MEN));
		assertEquals(0, Insurance.insuranceCalk(21, Insurance.MEN));
	}

	@Test
	void test_Age_17_21_Female() {
		assertEquals(0, Insurance.insuranceCalk(17, Insurance.FEMALE));
		assertEquals(0, Insurance.insuranceCalk(19, Insurance.FEMALE));
		assertEquals(0, Insurance.insuranceCalk(21, Insurance.FEMALE));
	}

	@Test
	void test_Age_22_35_Men() {
		assertEquals(3, Insurance.insuranceCalk(22, Insurance.MEN));
		assertEquals(3, Insurance.insuranceCalk(30, Insurance.MEN));
		assertEquals(3, Insurance.insuranceCalk(35, Insurance.MEN));
	}

	@Test
	void test_Age_22_35_Female() {
		assertEquals(6, Insurance.insuranceCalk(22, Insurance.FEMALE));
		assertEquals(6, Insurance.insuranceCalk(30, Insurance.FEMALE));
		assertEquals(6, Insurance.insuranceCalk(35, Insurance.FEMALE));
	}

	@Test
	void test_Age_Over_35_Men() {
		assertEquals(5, Insurance.insuranceCalk(36, Insurance.MEN));
		assertEquals(5, Insurance.insuranceCalk(70, Insurance.MEN));
	}

	@Test
	void test_Age_Over_35_Female() {
		assertEquals(10, Insurance.insuranceCalk(36, Insurance.FEMALE));
		assertEquals(10, Insurance.insuranceCalk(70, Insurance.FEMALE));
	}
	
	@Test 
	void test_Out_Of_Range() {
		
		// for men
		try {
			assertEquals(0.0f, Insurance.insuranceCalk(16, Insurance.MEN));
		} catch (IllegalArgumentException e) {
			assertEquals("There are no drivers aged 16", e.getMessage());
		}
		try {
			assertEquals(0.0f, Insurance.insuranceCalk(151, Insurance.MEN));
		} catch (IllegalArgumentException e) {
			assertEquals("There are no drivers aged 151", e.getMessage());
		}
		
		// for female
		try {
			assertEquals(0.0f, Insurance.insuranceCalk(16, Insurance.FEMALE));
		} catch (IllegalArgumentException e) {
			assertEquals("There are no drivers aged 16", e.getMessage());
		}
		try {
			assertEquals(0.0f, Insurance.insuranceCalk(151, Insurance.FEMALE));
		} catch (IllegalArgumentException e) {
			assertEquals("There are no drivers aged 151", e.getMessage());
		}
		
	}

}
