package fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test1() {
		assertEquals(34, new Fibonacci().fib(9));
		
	}
	
	@Test
	void test2() {
		assertEquals(34, new Fibonacci().fibMemo(9, new int[10]));
		
	}
	
	@Test
	void test3() {
		assertEquals(34, new Fibonacci().fibBottomUp(9));
		
	}
	
	@Test
	void test4() {
		assertEquals(34, new Fibonacci().fibBottomUpII(9));
		
	}

}
