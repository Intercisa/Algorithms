package main;

import sudoku.Sudoku;

/*
 *The aim of sudoku is to fill a 9x9 chesboard-like grid with digits
 *We have some rules: 
 *	Each column + each row, and each of the nine 3x3 sub-grids that compose the grid (boxes)
 *	contains all of the digits 1 to 9
 *	Initially we have -> a partially completed grid, which for a well-posed puzzle has a unique solution
 *	The same integer may not appear twice in the same row + column or in any of the nine 3x3 subregions / boxes of the 9x9 grid  
 *
 *	The problem itself is NP-complete 
 *	Running time complexity: O(m pow n)
 *	m: number of possibilities for a single cell (9)
 *	n: number of blank fields at the beginning
 *	Backtracking: 
 *		Iterates all the possible solutions for the given Sudoku
 *		If the solutions assigned do not lead to the solution of Sudoku, the algorithm discards the solution
 *		and rollbacks to the original solutions and retries again 
 *
 *Wiki: https://en.wikipedia.org/wiki/Sudoku_solving_algorithms
 */

public class Main {

	public static void main(String[] args) {
		int sudokuTable[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
        		{5, 2, 0, 0, 0, 0, 0, 0, 0},
        		{0, 8, 7, 0, 0, 0, 0, 3, 1},
        		{0, 0, 3, 0, 1, 0, 0, 8, 0},
        		{9, 0, 0, 8, 6, 3, 0, 0, 5},
        		{0, 5, 0, 0, 9, 0, 6, 0, 0},
        		{1, 3, 0, 0, 0, 0, 2, 5, 0},
        		{0, 0, 0, 0, 0, 0, 0, 7, 4},
        		{0, 0, 5, 2, 0, 6, 3, 0, 0}};
		
		Sudoku sudoku = new Sudoku(sudokuTable);
		sudoku.solveProblem();
	}
}
