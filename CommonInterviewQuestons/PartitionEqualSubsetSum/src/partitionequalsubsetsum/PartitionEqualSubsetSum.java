package partitionequalsubsetsum;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
	 public boolean canPartition(int[] nums) {
	        
		 int sum = 0;
		 
		 for (int i : nums) sum += i;
		 
		 if(sum % 2 != 0) return false;
		 int target = sum / 2;
		 boolean[]dp = new boolean[target + 1];
		 
		 dp[0] = true;
		 
		 for (int num : nums) {
			 for (int i = target; i >= num; i--) {
				dp[i] = dp[i] | dp[i - num];
				printDp(dp, i); //for debug
			}
		}
		 return dp[target];
	    }

	private void printDp(boolean[] dp, int index) {
		for (int i = 0; i < dp.length; i++) {
			System.out.print(dp[i] + " " + index +" ");
		}
		System.out.println();
	}
	
	
	//or
	
	public boolean canPartitionOneDim2(int[] nums) {
	    int sum = 0;
	    
	    for (int num : nums) sum += num;
	    
	    if ((sum & 1) == 1) return false;
	    sum /= 2;
	    
	    boolean[] dp = new boolean[sum+1];
	    
	    Arrays.fill(dp, false);
	    dp[0] = true;
	    
	    for (int num : nums) {
	        for (int i = sum; i > 0; i--) {
	            if (i >= num) {
	                dp[i] = dp[i] || dp[i-num];
	            }
	        }
	    }
	    
	    return dp[sum];
	}
	
	
	public boolean canPartitionTwoDim(int[] nums) {
	    int sum = 0;
	    
	    for (int num : nums) sum += num;
	    
	    if ((sum & 1) == 1) return false;
	    sum /= 2;

	    int n = nums.length;
	    boolean[][] dp = new boolean[n+1][sum+1];
	    for (int i = 0; i < dp.length; i++) Arrays.fill(dp[i], false);
	    
	    dp[0][0] = true;
	    
	    for (int i = 1; i < n+1; i++) dp[i][0] = true;
	    for (int j = 1; j < sum+1; j++) dp[0][j] = false;

	    
	    for (int i = 1; i < n+1; i++) {
	        for (int j = 1; j < sum+1; j++) {
	            dp[i][j] = dp[i-1][j];
	            if (j >= nums[i-1]) {
	                dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
	            }
	        }
	    }
	   
	    return dp[n][sum];
	}
	
	
}
