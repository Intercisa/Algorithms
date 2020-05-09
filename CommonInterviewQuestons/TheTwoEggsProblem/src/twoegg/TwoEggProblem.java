package twoegg;

public class TwoEggProblem {

	//dynamic programming table to store the values for the subproblems
	//dpTable[i][j] represents the minimum number of drops with i eggs and j floors
	private int[][] dpTable = new int[Constants.NUM_OF_EGGS+1][Constants.NUM_OF_FLOORS+1];
	
	public int solve(){
		
		//the first column is initialized with 1s
		//the first column values are 1
		dpTable[0][0] = 1;
		dpTable[1][0] = 1;
		
		//of course if we have just 1 egg then checking n floors requires n egg drops (linear search)
		for(int i = 0; i <= Constants.NUM_OF_FLOORS; i++)
			dpTable[1][i] = i;
		
		
		//n is the index for the eggs & m is the index for the floors
		for(int n = 2; n <=Constants.NUM_OF_EGGS; n++) {
			for(int m = 1; m <= Constants.NUM_OF_FLOORS; m++) {
				
				dpTable[n][m] = Integer.MAX_VALUE;
				
				//check dropping the egg from 1 to the current floor m
				//NOTE: WE CAN REUSE THE SUBSOLUTIONS FROM TABLE!!
				for(int x = 1; x <=m; x++) {
					
					//we have to use the formula -> use max because of worst-case scenario
					//don't forget to add one to include the current drop
					int maxDrops = 1 + Math.max(dpTable[n-1][x-1], dpTable[n][m-x]);
					
					//this is taking the minimum (because we after the minimum of drops)
					if(maxDrops < dpTable[n][m])
						dpTable[n][m] = maxDrops;
				}
			}
		}
		//the last item in the table contains the minimum number of drops 
		return dpTable[Constants.NUM_OF_EGGS][Constants.NUM_OF_FLOORS];
	}

}




