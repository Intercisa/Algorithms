package main;

/*
 * Shortest Path Algorithms
 *	Shortest path problem: finding a path between two vertices in a graph such that the sum of the weights of its edges is minimized
 *	Dijkstra algorithm 
 *	Bellman-Ford algorithm
 *	A* search
 *	Floyd-Warhsall algorithm
 *
 *	Dijkstra algorithm
 *		It was constructed by computer scientist Edsger Dijkstra in 1956
 *		Dijkstra can handle positive edge weights! //Bellman-Ford algorithm can have negative weights as well
 *		Several variants: it can find the shortest path from A to B, but it is able to construct a shortest path tree as well ->
 *		defines the shortest path from a source to all the other nodes
 *		This is asymptotically the fastest known single-source shortest-path algorithm for arbitrary directed graphs 
 *		with unbounded non-negative weights 
 *
 *		Dijkstra's algorithm time complexity: O(V*logV+E)
 *		Dijkstra's algorithm is a greedy one: it tries to find the global optimum with the help of local minimum ->
 *		it turns out to be good!
 *		It is greedy -> on every iteration we want to find the minimum distance to the next vertex possible ->
 *		appropriate data structures: heaps (binary or Fibonacci) or in general a priority queue
 *
 * pseudo code: 
 *		class Node
 *			name
 *			min_distance
 *			Node predecessor
 *
 *	function DijkstraAlgorithm(Graph, source)
 * 			distance[source] = 0
 * 			create vertex queue Q
 * 		
 * 		for v in Graph
 * 			distance[v] = inf
 * 			predecessor[v] = undefined // previous node in the shortest path
 * 			add v to Q
 * 
 * 		while Q not empty 
 * 			u = vertex in Q with min distance // this why to use heaps!!
 * 			remove v from Q
 * 			
 * 			for each neighbour v of u
 * 				tempDist = distance[u] + distBetween(u,v)
 * 				if tempDist < distance[v] 
 * 					distance[v] = tempDist
 * 					predecessor[v] = u 
 * 		
 * 		return distance[] //contains the shortest distance from source to other nodes
 *
 *
 */

public class Main {

	public static void main(String[] args) {
		
	
		
		
	}
}