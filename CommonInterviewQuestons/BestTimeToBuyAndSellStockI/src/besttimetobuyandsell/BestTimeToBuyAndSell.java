package besttimetobuyandsell;

public class BestTimeToBuyAndSell {

	public int getMaxProfit(int[] prices) {

		int maxProfit = 0, minPrice = Integer.MAX_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}
	
	
	public int getMaxProfitDP(int[] prices) {
		
		int[] dpTable = new int[prices.length];
		int minPrice = Integer.MAX_VALUE;
		
		for (int i = 1; i < prices.length; i++) {
			dpTable[i] = Math.max(dpTable[i - 1], prices[i]-minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		
		return dpTable[prices.length-1];
	}
}