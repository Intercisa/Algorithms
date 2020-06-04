package main;

/*
 *  Given a positive integer num, create a function that returns the next greater integer that we can make with its digits
 *  (the one that comes just after num).
 *	If such a number doesn't exist, return num itself.
 *  Can you do it in O(n) time complexity and O(n) space complexity? 
 *  
 *  naive -> brute force solution
 *  num = 231
 *  								  i    i+1		
 *  permutations = 123 | 132 | 213 | 231 | 312 | 321 
 *  
 *  return permutations[i+1] > O(n!) 
 *  
 *  
 *  1318540 >> solution 1340158
 *  1 < 3 !>! 1 -> we search for this case -> first digit that breaks the ascend 
 *	
 *	-> 1348510 >> swap the 4 and the one 
 *		
 *		134 | 8510
 *		134 | 0158	>> 	 reverse order! 	
 */

public class Main {

	public static void main(String[] args) {
	}
}
