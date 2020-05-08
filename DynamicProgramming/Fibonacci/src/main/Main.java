package main;

/*
 *Dynamic Programming is a method for solving a complex problem by breaking it down into  a collection of simpler subproblems
 *It is applicable to problems exhibiting the properties of overlapping subproblems
 *The method takes far less time than other methods that don't take advantage of the subproblem overlap
 *We need to solve different parts of the problem (subproblems) + +combine the solutions of the subproblems to reach an overall solution
 *We solve each subproblems only once -> we reduce the number of computations
 *Subproblems can be stored ("memoziation")!!  
 *
 *Dynamic programming vs. "divide and conquer" method
 *Several problems can be solved by combining optimal solutions to non-overlapping sub-problems 
 *This strategy is called "divide an conquer" method
 *This is why merge sort/quick sort are not classified as dynamic programming problems
 *Overlapping subproblems -> dynamic programming
 *Non-overlapping subproblems -> divide and conquer method
 *
 *
 *Fibonacci Numbers
 *
 *Fibonacci sequnece: 0 1 1 2 3 5 8 13 21 34 ... 
 *
 *	Fibonacci numbers are defined by the recurrence relation 
 *		F(N) = F(N-1) + F(N-2)
 *		F(0) = F(1) = 1
 *	With generator functions we can get a closed form: "Binet formula"
 *
 *Solution: 
 *	Use dynamic programming and memoization in order to avoid recalculating a subproblem over and over again
 *	We should use an associative array abstract data type (hashtable) to store the solution for the subproblems / O(1) time complexity 
 *	On every f() method call -> we insert the calculated value if necessary 
 *	Instead of the exponential time complexity we will have O(N) time complexity + requires O(N) space
 *
 */

public class Main {

	public static void main(String[] args) {

	}
}
