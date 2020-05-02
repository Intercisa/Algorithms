package main;

import nqueens.NQueensProblem;

/*
 *Backtracking
 *	It is a form of recursion!
 *		General algorithm for finding all solution to some computational problems ->
 *		"constraint satisfaction problems"
 *	
 *	We incrementally build candidates to the solutions
 *	
 *	If partial candidate A cannot be completed to a valid solution: we abandon A as a solution
 *	
 *	For example: eight-queens problem or sudoku 
 *	
 *	Backtracking is often much faster than brute force enumeration of all complete candidates, 
 *	because it can eliminate a large number of candidates with a single test
 *	
 *	Backtracking is an important tool for solving constraint satisfaction problems ->
 *	combinatorial optimization problems!! 
 *
 *	The partial candidates are represented as the nodes of a tree structure
 *	"potential search tree"
 *
 *	Each partial candidate is the parent of the candidates that differ from it by a single extension step
 *
 *	The leaves of the tree are the partial candidates that cannot be extended any further
 *
 *	The backtracking algorithm traverse this search tree recursively, from the root down (like DFS)
 *
 *	This is why backtracking is sometimes called depth-first search
 *		1, For every node the algorithm checks whether the given node can be completed to a valid solution
 *		2, If it can not -> the whole subtree is skipped!
 *		3, Recursively enumerates all subtree of the node
 *
 *
 *							ROOT
 *						   /    \
 *						  A      B
 *						/  \    /  \
 *					   C    D  E    F
 *					  BAD  BAD GOOD  BAD
 *
 *			A single node can have a huge subtree
 *			When pruning -> we get rid of the whole subtree
 *
 *	- we have several options: we can choose A or B at the beginning
 *	- after every choice -> we have a new set of options
 *	- if we make good choice -> we end up with a GOOD state
 *	- if not: we have to backtrack! 
 *
 *	N-Queens Problem 
 *	
 *	The problem of placing N chess queens on an NxN chessboard so that two queens threaten each other 
 *	(they will not be able to attack each other)
 *
 *	We have to consider: queens can move diagonal direction too...
 *	
 *	The original problem was designed for 8 queens... the general form is about N queens
 *
 *	Gauss worked on this problem 
 *
 *	Dijkstra used this problem to illustrate the power of what he called structured programming 
 *
 *	4X4 board with 4 queens 
 *	---------
 *	| | |X| |
 *	|X| | | |
 *	| | | |X|
 *	| |X| | |
 *  ---------
 *	
 *
 *
 */

public class Main {

	public static void main(String[] args) {
		
		
		NQueensProblem nQueensProblem = new NQueensProblem(20);
		nQueensProblem.solve();
		
	}
}
