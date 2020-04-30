package factorialfunction;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialFunctionTest {
	private FactorialFunction factorial = new FactorialFunction();
	
	@Test
	void test_1() {
		assertEquals(24, factorial.factorial(4));
	}
	
	@Test
	void test_2() {
		assertEquals(120, factorial.factorial(5));
	}
	@Test
	void test_3() {
		assertEquals(24, factorial.calculateFactorial(4));
	}
	
	@Test
	void test_4() {
		assertEquals(120, factorial.calculateFactorial(5));
	}
	
	

}
