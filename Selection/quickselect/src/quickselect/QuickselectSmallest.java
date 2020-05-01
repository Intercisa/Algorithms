package quickselect;

import java.util.Random;

public class QuickselectSmallest {
	//for more  -> goto Main
	
	private int[] nums;
	public QuickselectSmallest(int[] nums) {
		this.nums = nums;
	}
	
	public int select(int k) {
		return select(0, nums.length-1, k-1);
	}
	
	
	private int select(int firstIndex, int lastIndex, int k) {
		int pivo = partition(firstIndex,lastIndex);
		
		if(pivo > k)
			return select(firstIndex, pivo-1, k);
		else if(pivo < k)
			return select(pivo+1, lastIndex, k);
					
		return nums[k]; //pivot == k
	}

	private int partition(int firstIndex, int lastIndex) {
				//generate random num in range -> fistIndex & lastIndex
				int pivo = new Random().nextInt(lastIndex-firstIndex+1)+firstIndex; 
				swap(lastIndex, pivo);
		
		for (int i = firstIndex; i < lastIndex; ++i) {
			if(nums[i] < nums[lastIndex]) { 
				swap(i, firstIndex);
				firstIndex++;
			}
		}
		swap(firstIndex, lastIndex);
		return firstIndex;
	}

	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}


