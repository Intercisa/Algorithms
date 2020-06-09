package sellstockcooldown;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimetoBuyandSellStockwithCooldownTest {
	

	
	@Test
	void test_1() {
		assertEquals(3, new BestTimetoBuyandSellStockwithCooldown().maxProfit(new int[] {1,2,3,0,2}));
	}
	
	
	@Test
	void test_2() {
		assertEquals(3, new BestTimetoBuyandSellStockwithCooldown().maxProfit(new int[] {1,2,4}));
	}

}
