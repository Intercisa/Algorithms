package besttimetobuyandsell;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellTest {

	@Test
	void test_1() {
		assertEquals(5, new BestTimeToBuyAndSell().getMaxProfit(new int[] {7, 1, 5, 3, 6, 4}));
	}
	@Test
	void test_2() {
		assertEquals(1, new BestTimeToBuyAndSell().getMaxProfit(new int[] {1,2}));
	}
	
	@Test
	void test_3() {
		assertEquals(8, new BestTimeToBuyAndSell().getMaxProfitDP(new int[] {7,4,5,6,9,12,1}));
	}
	
	@Test
	void test_4() {
		assertEquals(1, new BestTimeToBuyAndSell().getMaxProfitDP(new int[] {1,2}));
	}
}
