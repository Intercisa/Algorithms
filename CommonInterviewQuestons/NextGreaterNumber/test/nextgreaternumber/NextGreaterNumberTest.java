package nextgreaternumber;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NextGreaterNumberTest {

	@Test
	void test_1() {
		assertEquals(3410, NextGreaterNumber.nextGreater(3401));
	}
	
	@Test
	void test_2() {
		assertEquals(4013, NextGreaterNumber.nextGreater(3410));
	}
	
	@Test
	void test_3() {
		assertEquals(12354, NextGreaterNumber.nextGreater(12345));
	}
	
	@Test
	void test_4() {
		assertEquals(12435, NextGreaterNumber.nextGreater(12354));
	}
	
	@Test
	void test_5() {
		assertEquals(4310, NextGreaterNumber.nextGreater(4310));
	}
	
	@Test
	void test_6() {
		assertEquals(11111, NextGreaterNumber.nextGreater(11111));
	}

}
