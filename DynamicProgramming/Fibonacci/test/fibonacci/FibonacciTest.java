package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
	
	private Fibonacci fibo = new Fibonacci();
	
	@Test
	void test_1() {
		assertEquals(5, fibo.naiveFibonacci(5));
	}

	@Test
	void test_2() {
		assertEquals(3, fibo.fibonacciDP(4));
	}

}
