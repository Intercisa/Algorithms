package coinchange;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CoinChangeTest {
	
	private CoinChange coinChange = new CoinChange();
	private int[] v = {1,2,3};
	int M = 4;
	
	
	@Test
	void test_1() {
		assertEquals(4, coinChange.naiveCoinChange(M, v, 0));
	}

	@Test
	void test_2() {
		assertEquals(4, coinChange.naiveCoinChange(M, v, 0));
	}


}
