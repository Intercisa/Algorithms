package maxconsecutiveones;

public class MaxConsecutiveOnes {

	 public int longestOnes(int[] A, int K) {
	        
		 int windowSize = 0, j = 0;
		 int res = Integer.MIN_VALUE;
		 
		 for (int i = 0; i < A.length; i++) {
			if(A[i] == 0) windowSize ++; /* have some hashmap or counter */
			
			/* Loop inside for to reduce the window size based on constraint */
			while (windowSize > K && j < A.length) {
				if(A[j] == 0) windowSize--;
				
				j++;
			}
			/* get the maximum value of the window which satisfies the constraint */
			res = Math.max(res, i-j+1);
		}
		 return res == Integer.MIN_VALUE ? ((windowSize <= K) ? A.length : 0) : res;
	}
}




