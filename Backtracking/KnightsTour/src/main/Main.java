package main;

import knightstour.KnightsTour;

/*
 *
 *A sequence of moves of a knight on a chessboard such that the knight visits every square EXACTLY once 
 *Closed tour:: when the knight end point is the same as the starting point
 *The knight's tour-problem is an instance of the more general Hamiltonian-path problem
 *Closed knight tour ~ hamiltonian-cycle problem! 
 *Solution: brute-force approach + backtracking
 *
 *
 *	Schwenk theorem
 *		For an m x n chessboard the closed knight tour problem is always feasible, unless: 
 *			- m and n are both odds
 *			- m = 1, 2 or 4
 *			- m = 3 and n = 4, 6 or 8
 *
 *
 *	Backtracking 
 *		Start with an empty solution matrix / 2D array 
 *		When adding a new item -> we check whether adding the current item violates the problem constraints or not 
 *		YES: we backtrack
 *		NO: we add the item to the solution set and go to the next item
 *		f we have considered all the item we ready 
 */

public class Main {

	public static void main(String[] args) {

		KnightsTour knightsTour = new KnightsTour();
		knightsTour.solveTour();
		
		
	}
}
