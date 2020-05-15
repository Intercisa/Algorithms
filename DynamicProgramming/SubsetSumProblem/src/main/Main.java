package main;

import subsetsum.SubsetSum;

/*
 * Subset sum problem
 * 	One of the most important problems in complexity theory 
 * 	The problem: given an S set of integers, is there a non-empty subset whose s sum is zero or a given integer? 
 * 	For example: given the set {5,2,1,3} and s = 9 the answer is YES because the subset {5,3,1} sums to 9
 * 	The problem is NP-complete -> we have efficient algorithms when the problem is small!!
 * 	Special case of knapsack-problem
 * 
 *  1, Naive approach "brute force search"
 *  	Generate all the subsets of the given set of integers
 *  	N is the number of integers in the set S
 *  	Check whether the sum of all subsets is equal to s or not
 *  	Time complexity: exponential //O(N*2powN)
 *  
 *  2, Dynamic Programming: 
 *  	we want to avoid calculating the same problems over and over again... we create a dynamic programming table and memoize
 *  
 *  
 *   	  					true if j = 0 and false if i = 0
 *  dpTable[i][j] = dpTable[i1][j]= dpTable[i-1][j]} if dopTable[i-1][j] is true
 *  						dpTable[i][j] = dpTable[i-1][j -S[i-1]] else
 *  
 *  
 */

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {5,2,3,1};
		int sum = 9;
		SubsetSum subsetSum = new SubsetSum(numbers, sum);
		subsetSum.solve();
		subsetSum.showIntegeres();
		
		
	}
}
