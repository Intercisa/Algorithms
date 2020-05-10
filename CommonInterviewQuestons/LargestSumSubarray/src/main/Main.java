package main;

/*
 * 
 * Interview Question #6:
 * Create an algorithm to find the sum of !contiguous! subarray within a one-dimensional array of numbers which has the largest sum!
 *
 *  -> if the array contains all negative numbers: the solution is the number in the array with the smallest magnitude 
 * 	-> if the array contains all positive numbers: solution is the sum of all the items
 * 	-> if it contains negative and positive numbers as well thats when the problem gets a bit more complex
 * 		Kadane's algorithm solves this problem in O(N) 
 * 
 *  1, computer vision: to detect the brightest area in an image 
 *  		~ it is crucial in Haar-features, deep learning and self-driving cars
 *  2, genomic sequence analysis: we can indentify important segments of protein sequences and the information to be able to predict outcomes
 *  3, data mining: largest subarray problem is important when dealing with association rules and foresesing customer's behavior 
 *
 *
 *		Kadane's approach: if we know the Bi maximum subarray sum ending at index i
 *		then what is the Bi+1 maximum subarray sum ending at index i+1?
 *
 *			-> either the maximum subarray sum ending at index i+1 includes the max subarray ending at index i OR it does not
 *				Bi+1 = max(nums[i+1], nums[i+1]+Bi)
 *				dynamic programming approach
 *
 */

public class Main {

	public static void main(String[] args) {
	}
}
