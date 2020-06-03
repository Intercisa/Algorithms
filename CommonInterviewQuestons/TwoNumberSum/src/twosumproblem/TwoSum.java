package twosumproblem;

import java.util.HashMap;

public class TwoSum {

	public int[] findTwoSum(int[] nums, int target) {
		
		if(nums == null) return null;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len = nums.length;
		
		for (int i = 0; i < len; i++) {
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) 
				return new int[] {map.get(complement), i};
			else
				map.put(nums[i], i);
		}
		return new int[] {};
	}
}
