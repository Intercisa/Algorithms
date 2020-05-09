package main;

import knapsack.Knapsack;

/*
 *Knapsack Problem
 *	It is a problem in combinatorial optimization
 *	Given a set of items, each with a mass w and a value v, determine the number of each item
 * 	to include in a collection so that the total weight M is less than or equal to a given limit 
 * 	and the total value is as large as possible
 * 
 *  The problem often arises in resource allocation where there are financial constraints
 *  
 *  Applications: 
 *  	Has lots of applications of course 
 *  	Finding the least wasteful way to cut raw materials
 *  	Selection of investments and portfolios 
 *  	Selection of assets for asset-backed securitization
 *  	Construction and scoring of tests in which the test-takers have a choice as to which questions they answer 
 *  
 *  Divisible problem 
 *  	If we take fractions of the given items, then the greedy approach can be used
 *  	Sort the items according to their values, it can be done in O(N*logN) time complexity
 *  	Start with the item that is the most valuable and take as much as possible 
 *  	Than try with the next item from our sorted list 
 *  	This linear search ha O(N) time complexity 
 *  	Overall complexity: O(N*logN) + O(N) = O(N*logN)!!!
 *  	So we can solve the divisible knapsack problem quite fast 
 *  
 *  0-1 knapsack problem 
 *  	In this case we are not able to take fractions: we have to decide whether to take an item or not 
 *  	Greedy algorithm will not provide the optimal result!!
 *  	Another approach would be to sort by cost per unit weight and include from highest on down until knapsack is full... 
 *  		not a good solution too
 *  	DYNAMIC PROGRAMMING is the right way!
 *  
 *  Dynamic programming: 
 *  	Solves larger problems by relating to overlapping subproblems and then solves the subproblems 
 *  	It works trough the exponential set of solutions, but does not examine them all explicitly 
 *  	Stores intermediate results so that they not recomputed >> "memoization"
 *  	Solution to original problem is easily computed from the solutions to subproblems 
 *  
 *  Knapsack with dynamic programming 
 *  	We have to define subproblems: we have N items so we have to make N decisions whether to take the item with given index or not
 *  	The subproblems: the solution considering every possible combination of remaining items and remaining weight 
 *  	S[i][w] the solution to the subproblem corresponding to the first i items and available weight w
 *  	Or in other words:
 *  		S[i][w] = maximum cost of items that fit inside a knapsack of size (weight) w, choosing from the first i items!!
 *  		We have to decide whether to take the item or not
 *  
 * 			 S[i][w] = Math.max(S[i-1][w]) ;  v'i + S[i-1][w-w'i])  
 *  			do not take i-th item 			we take i-th item
 *  
 *  		BUT! We are only considering S[i-1][w-w'i] if it can fit w>= w'i
 *  			If there is not room for it -> the answer is just S[i-1][w]!!
 *  
 *  Time complexity 
 *  	Running time of Knapsack: O(n*W)
 *  	But  it is not polynominal, it is pesudo-polynominal
 *  	Numeric algorithm runs in pseudo-ploynominal time if its running time is polynominal in the numeric value of the input, 
 *  	but is exponential in length of the input (the number of bits required to represent it)
 *  
 */

public class Main {

	public static void main(String[] args) {
		
		int numOfItems = 3;
		int capacityOfKnapsack = 5;
		
		int[] weightOfItems = new int[numOfItems + 1];
		weightOfItems[1] = 4;
		weightOfItems[2] = 2;
		weightOfItems[3] = 3;
		
		int[] profitOfItems = new int[numOfItems + 1];
		profitOfItems[1] = 10;
		profitOfItems[2] = 4;
		profitOfItems[3] = 7;
		
		Knapsack knapsack = new Knapsack(numOfItems, capacityOfKnapsack, weightOfItems, profitOfItems);
		knapsack.solve();
		knapsack.showResult();

	}
}
