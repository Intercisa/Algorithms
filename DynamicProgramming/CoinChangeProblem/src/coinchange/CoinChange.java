package coinchange;

public class CoinChange {

	//recursive coin change - EXPONENTIAL RUNNING TIME O(2 pow N)
	public int naiveCoinChange(int M, int[]v, int index) {
		//base cases
		if(M < 0) return 0; 
		if(M == 0) return 1; //single one way -> we don't take any coin
		
		
		if(v.length == index) return 0; //we have considered every single coin
		
		return naiveCoinChange(M-v[index], v, index) + naiveCoinChange(M, v, index+1);
	}
	
	
	public int dpCoinChange(int[]v, int M) {
		
		int[][] dpTable = new int[v.length+1][M+1];
		
		//initialize first row
		for(int i = 0; i <= v.length; i++)
			dpTable[i][0] = 1;
		
		//initialize first column
		for(int i = 1; i <= M; i++)
			dpTable[0][i] = 0;
		
		//O(v*M)
		for(int i = 1; i <= v.length; i++) { //we start from 1 because we only considering the empty parts of the table 
			for(int j = 1; j <= M; j++) {
				if(v[i-1] <= j) {			//we take the given coin and check 
					dpTable[i][j] = dpTable[i-1][j] + dpTable[i][j-v[i-1]];
				}else {
					dpTable[i][j] = dpTable[i-1][j]; //we are not take the given coin
				}
			}
		}
		return dpTable[v.length][M];
	}
}




