package main;

import rodcutting.RodCutting;

/*
 *Rod Cutting Problem 
 * Given a rod with certain length I
 * Given the prices of different lengths
 * How to maximize the profit?
 * 
 * 	Rod length -> I = 5 
 * 	
 * Prices: 
 * 		1m - $2
 * 		2m - $5
 * 		3m - $7
 * 		4m - $3
 * 
 * Solution to the rod cutting problem: 
 * 		{2,3} so a cut the rod to get 2 m piece and a 3m piece
 * 
 * 	OR
 * 
 * {2,2,1} 2 2m piece and a single 1 m piece, it is going to be the same $12 profit
 * 
 *  Total value for both solutions: $12
 *  
 *  Recursion:
 *  	The naive approach is to use a simple recursive method / function
 *  	N-1 cuts can be made in the rod length N
 *  	There are 2 pow N-1 ways to cut the rod
 *  	Problems: time complexity + overlapping subproblems
 *  	Exponential time complexity O(2powN) where N is the length of the rod in units
 *  	for every length we have 2 options whether to cut or not
 *  
 *  Dynamic Programming:
 *  	We have to create a solution matrix: 
 *  	
 *  	dpTable[numOfLengths+1][originalLength+1]
 *  				rows			columns
 *  
 *  	We have to define the base cases: 
 *  		-if originalLength is 0 -> 0 is the profit
 *  		-if we do not consider any lengths -> 0 is the profit 
 *  
 *  	Complexity: O(numOfLengths*originalLength)
 *  
 *  
 *  					0 if j = 0
 *  dpTable[i][j] = max{dpTable[i-1][j]; prices[i]+dpTable[i][j-i]} if i <= j
 *  					dpTable[i-1][j] if i > j
 *  
 *  
 */

public class Main {

	public static void main(String[] args) {
		int lengthOfTheRod = 5;
		int[] prices = new int[] {0, 2, 5, 7, 3};
		
		RodCutting cutting = new RodCutting(lengthOfTheRod, prices);
		cutting.solve();
		cutting.showResult();
	}
}
