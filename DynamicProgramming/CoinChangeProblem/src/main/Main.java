package main;

/*
 *Coin Change Problem: 
 *	Given a set of coins v[] for example {1,2,3}
 *	Given an M amount -> the total
 *	How many ways the coins v[] can be combined in order to get the total M? 
 *	The order of coin does not matter! 
 *	 
 *	Coins v[] -> {1,2,3}
 *	Total amount M -> 4
 *
 *	Solution to the coin change problem:
 *		{1,1,1,1}{1,1,2}{1,3}{2,2}
 *	The order of coins does not matter!
 *		For example {1,3}=={3,1}
 *
 *	The naive approach is to use a simple recursive method / function
 *	For every single coin we have two options: include it in our solution or exclude it
 *	Problem: time complexity + overlapping subpoblems
 *	Exponential time complexity: O(2 pow N) where N is the number of coins
 *	For every coin we have 2 options whether to take it or not  
 *
 *Dynamic programming: 
 *	We have to create a solution matrix: 
 *		dpTable[numOfCoins+1][totalAmmount+1]
 *					rows			columns
 *	We have to define the base cases: 
 *		-if totalAmount is 1 -> there is 1 way to make the change 
 *		 because we do not include any coin!!!
 *		-if numOfCoins is 0 -> there is 0 way to change the amount 
 *		 in this case there is no solution!!
 *
 *	Complexity: O(v*M)
 *
 *	We have to create a solution matrix: 
 *		dpTable[numOfCoins+1][totalAmount+1]
 *				rows			columns
 *	For every coin: make a decision whether to include it or not 
 *	Check if the coin value is less than or equal to the amount needed 
 *	
 *	If yes -> then we will find ways by including that coin and excluding that coin
 *		1, include the coin: reduce the amount by coin value and use the subproblem solution //totalAmount - v[i]
 *		2, exclude the coin: solution for the same amount without considering that coin
 *
 *
 *	If the given v[i]>j -> copy the content of the box above the current
 *	Else: dpTable[i][j] = value of box above the current + (value in same row - v[i])
 *
 */

public class Main {

	public static void main(String[] args) {
		
	}
}
