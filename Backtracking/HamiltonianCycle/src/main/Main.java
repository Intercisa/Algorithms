package main;

import hamiltonian.HamiltonianCycle;

/*
 *Hamiltonian Path and Hamiltonian Cycle 
 *
 *Graphs  -> G(V,E) >>
 *		V: vertices in the graph 
 *		E: edges in the graph
 *
 *	we represent a graph with a help of a two dimensional array (matrix) 
 *
 *			a b c d e f 
 *
 *	   a	0 1 0 0 0 1
 *	   b	1 0 1 0 0 0
 *	   c	0 1 0 0 1 0
 *	   d	0 0 0 0 1 1
 *	   e	0 0 1 1 0 1
 *	   f	1 0 0 1 1 0
 *
 * 	A(i,j) = {1 - if there is a connection between i and j; 0 - if no connection}
 *
 *
 *	A hamiltonian path is an undirected graph is a path that visit every node exactly once!
 *	
 *	Hamiltonian cycle: the first node and the last node of the path are the same vertexes -> StartingPoint == EndPoint
 *	So a hamiltonian cycle is a hamiltonian path where the starting point is the same as the end point (if we visit all the nodes only once)
 *
 *	A valid hamiltonian path is: {a b c d a}
 *	There may be several hamiltonian path in a given graph! 
 *
 *	Hamiltonian problem
 *		Determining whether such path and cycles exist in graph is the Hamiltonian path problem 
 *		This is an NP-complete complete problem!!
 *		Dirac-principle: a simple garph with N vertices is hamiltonian id every vertex has degree (neighbor) N/2 or greater 
 *			(degree is the number of edges of a vertex)
 *		Important fact: finding Hamiltonian path is NP-complete, but we cab decide whether such path exists in linear time complexity 
 *		with topological ordering  -> but is not the solution, it will only tell me if there is a hemiltonian path or not 
 *
 *	Solutions: 
 *	Naive approach: 
 *		Generate all possible configurations of the vertices and print a configuration that satisfies the given constraints
 *		Problem -> id the graph ha N vertices there are N! configurations, so the "solution space" is enormous
 *		Very inefficient! 
 *	
 *	Construct a tree: 
 *		We start the root node, and want to get to one of the good leaves 
 *		If we get to a bad leaf: we just "backtrack" and keep moving on by revoking our most resent choice 
 *
 *		Problem: hard to construct a tree is N is big!
 *
 *	Backtracking: 
 *		We use recursion to solve the problem 
 *		Create an empty path array and add vertex 0 to it as the starting vertex 
 *		Add other vertices, starting from the vertex 1
 *		Before adding a vertex, check whether it is adjacent to the previously added vertex 
 *			+ make sure it is not already added 
 *		If we find such vertex  -> we add the vertex as part of the solution
 *		If we don't find a vertex -> we return false
 *
 *
 */

public class Main {

	public static void main(String[] args) {
		int[][] matrix = {
				{0,1,1,1,0,0},
				{1,0,1,0,1,0},
				{1,1,1,1,0,1},
				{1,0,1,0,0,1},
				{0,1,0,0,0,1},
				{0,1,1,1,1,1}
		};
		
		HamiltonianCycle cycle = new HamiltonianCycle(matrix);
		cycle.solve();
		
		//0 1 4 5 2 3 0
		//same as: 
		//a d f e b c a
		
	}
}
