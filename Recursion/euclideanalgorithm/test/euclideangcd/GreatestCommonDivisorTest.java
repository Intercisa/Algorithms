package euclideangcd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {
	GreatestCommonDivisor gcd = new GreatestCommonDivisor();
	
	@Test
	void test_1() {
			assertEquals(2, gcd.gcdIterative(2, 6));
	}
	@Test
	void test_2() {
		assertEquals(2, gcd.gcdRecursive(2, 6));
	}
	@Test
	void test_3() {
		assertEquals(1, gcd.gcdIterative(7, 9));
	}
	@Test
	void test_4() {
		assertEquals(1, gcd.gcdRecursive(7, 9));
	}

	

}
