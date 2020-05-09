package main;

import twoegg.TwoEggProblem;

/*
 * Interview Question #3:
 * The problem itself is that there are N number of eggs and building which has M floors. Write an algorithm to find
 * the minimum number of drops is required to know the floor from which if egg is dropped, it will break.
 * (usually N=2 and M=100)
 * 
 *  	1, an egg that does not break can be reused 
 *  	2, if an egg breaks when dropped from a given floor then it will break if dropped from any higher floor
 *  	3, if an egg does not break when dropped from a given floor then it will not break if dropped from any lower floors 
 *  
 * Dynamic programming
 *  
 * 	if we have just a single egg we have no other option but to try the floors on a one-by-one basis:
 * 		 we end up with O(M) linear running time algorithm 
 * 	
 *  many eggs problem 
 * 		if we have lots of eggs (lets suppose infinite number of eggs) then we can use binary search to find the critical floor 
 * 			-> we go to floor 50 and drop an egg
 * 			-> the outcome of this drop instantly cuts our problem into half
 * 				(very similar to binary search or binary search trees)
 * 			-> the number of drops to find the critical floor is log2 100 ~ 7
 * 
 * 		we are after the worst-case scenario because in best-case we may find the critical floor with a few drops...	
 *
 * 2 eggs problem (100 floors)
 * 	This is a special case of the egg dropping problem where we have just 2 eggs
 * 		~ we have too few eggs to make binary search in this case 
 * 			-> we drop the first egg from floor n: if it breaks then we consider all the floors
 * 				below one-by-one - otherwise we jump to floor 2n then 3n...
 * 			-> reducing the worst case means making all cases take the same number of drops
 * 
 * 	Main idea: when considering the lower floors we have more tries ... we need a one-by-one strategy but
 * 		when we get higher up the building we have already used drop chances to get there 
 * 		
 * 		Let's suppose we drop the first egg from floor n 
 * 			-> if it breaks we can do a linear search through the previous n-1 floors
 * 			-> if egg does not break then we jump up n floors... but we should take the previous drops into consideration
 * 				Thats why jump up n-1 floors instead of n 
 * 				in the next iteration we jump n-2 floors and so on
 * 		Finally we will consider all the floors so we keep reducing the steps 
 * 
 * 		n + (n - 1) + (n - 2) + (n - 3) + ... + 1 = 100
 * 
 * 		n(n+1)/2 = 100
 * 		n = 13.7 -> 14 drops 
 * 
 * Dynamic programming
 * 	we can solve the problem with recursion but it is inefficient because 
 * 				there are overlapping subproblems: this is why we can use dynamic programming 
 * 			-> we will store ("memoize") the subsolutions in a 2D array
 * 			-> we can use the following formula 
 * 	If we have n eggs and m is the number of floors then there are 2 possible outcomes: 
 * 		1, if the egg breaks after dropping from floor x then we have to check 
 * 			floors below with the remaining eggs
 * 				~ problem reduces to n-1 eggs and x-1 floors 
 * 		2, if egg does not break after dropping from floor x then we have to check the floors above: 
 * 			so we have n eggs an m-x floors to check	
 * 
 *  We are after the minimum of egg drops in worst-case scenario
 *  	
 *  		max because we are dealing with worst-case scenario  	
 * 							|
 * 					min { max ( drop(n-1,x-1) , drop(n,m-x) ) } 
 *					 |				 |				  |
 *				min because		  egg breaks	  egg does not break
 *				 minimize        after dropping   break after dropping from floor x
 *				the number        from floor x 
 *				 of drops
 *
 *					1		2		3		4		5
 *	
 *			1		1		2		3		4		5
 *	
 *			2		1
 *
 *	The columns represent the floors while the rows represent the number of eggs
 *		-> dpTable[i][j] represents the minimum number of drops with i eggs and j floors
 *		-> first column's items are all 1 because if we have just 1 floor than we can check it with 1 drop
 *		-> first row's value are the index of the columns accordingly
 *
 */

public class Main {
	public static void main(String[] args) {
		TwoEggProblem eggProblem = new TwoEggProblem();
		System.out.println(eggProblem.solve());
	}
}
