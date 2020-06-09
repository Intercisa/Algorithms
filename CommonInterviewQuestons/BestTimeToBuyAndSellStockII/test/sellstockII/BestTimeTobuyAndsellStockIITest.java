package sellstockII;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeTobuyAndsellStockIITest {
	

	
	@Test
	void test_1() {
		assertEquals(7, new BestTimeTobuyAndsellStockII().maxProfit(new int[] {7,1,5,3,6,4}));
	}

	@Test
	void test_2() {
		assertEquals(20, new BestTimeTobuyAndsellStockII().maxProfit(new int[] {3,1,5,6,5,3,2,4,7,8,10,4,6,10,11,6,2}));
	}
}
