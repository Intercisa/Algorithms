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
		
		int[] dpTable = new int[prices.length + 1];
		int minPrice = Integer.MAX_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			dpTable[i+1] = Math.max(dpTable[i], prices[i]-minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		
		return dpTable[prices.length];
	}
}