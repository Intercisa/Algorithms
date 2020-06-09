package sellstockII;

public class BestTimeTobuyAndsellStockII {

	public int maxProfit(int[] prices) {

		int len = prices.length;
		int maxProfit = 0;

		for (int i = 1; i < len; i++) 

			if (prices[i] > prices[i - 1])
				maxProfit += prices[i] - prices[i - 1];
		
		return maxProfit;
	}
}

/*       
 * 
 *   
 *                                   11
 *                                   / \
 *                       10        10   \
 *                       / \       /     \
 *          6           8   \     6       6
 *   	   / \         /     \   /         \
 *        5   5       7       \ /           \
 * 3     /     \     /         4             \
 * 	\   /       3   4                         2
 *   \ /         \ /
 *    1           2
 *    |-----|     |-------|     |-----|
 *      5             8            7
 *    (5-1)      (4-2)+(7-4)   	(6-4)+(10-6)
 *   +(6-5)     +(8-7)+(10-8)  +(11-10)
 */
