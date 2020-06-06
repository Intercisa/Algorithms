package lis;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
	     int[] dp = new int[nums.length];
	        int len = 0;

	        for(int num : nums) {
	            int val = Arrays.binarySearch(dp, 0, len, num);
	            if(val < 0) val = -(val + 1);
	            dp[val] = num;
	            if(val == len) len++;
	        }

	        return len;
	}
	
	
    public int lengthOfLISBasic(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
	
	
	
	
}
