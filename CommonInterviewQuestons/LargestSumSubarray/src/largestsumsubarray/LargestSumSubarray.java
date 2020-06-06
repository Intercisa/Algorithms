package largestsumsubarray;

public class LargestSumSubarray {
	
public int largestSumSubarray(int[] nums) {
	
	int maxRes = nums[0], currMax = nums[0];
	
	for (int i = 1; i < nums.length; i++) {
		currMax = Math.max(nums[i], currMax+nums[i]);
		
		maxRes = Math.max(maxRes, currMax);
		/*
		if(currMax > maxRes) maxRes = currMax;
		*/
	}
	return maxRes;
}
}



