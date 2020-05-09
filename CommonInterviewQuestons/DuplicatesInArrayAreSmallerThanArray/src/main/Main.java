package main;

import duplicatesinarray.DuplicatesInArrayAreSmallerThanArray;

/*
 *
 * Interview Question #4:
 * The problem is that we want to find duplicates in a one-dimensional array of integers 
 * in O(N) running time where the integer values are SMALLER than the length of the array!
 * 
 * 	1, we can use the brute-force approach (comparing items with all the rest) but it has O(N^2)running time
 * 	2, we can use hashmaps
 * 
 *  Traverse the give array and try to insert item in a hashtable with the value as the key. If you can not insert the item it means it is a duplicate
 *  		PROBLEM: not an in place algorithm, we can do better than this
 *  
 *  	3, using absolute values: with this approach we can achieve O(N) running time algorithm that is in-place as well 
 *  
 *  consider all the i items of array T[]:
 *  	check the sign of T[abs(T[i])]:
 *  		if it is positive:
 *  			flip the sign T[abs(T[i])] = - T[abs(T[i])]
 *  		else:
 *  			the given i items is a repetition
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		DuplicatesInArrayAreSmallerThanArray duplicatesInArray = new DuplicatesInArrayAreSmallerThanArray();
		duplicatesInArray.solve(new int[] {2,3,1,2,4,3});

	}
}
