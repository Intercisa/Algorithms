package main;

import dijkstraalgorithm.DijkstraAlgorithm;
import dijkstraalgorithm.Edge;
import dijkstraalgorithm.Vertex;

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
 *		DAG shortest path
 *			If the graph is a DAG, so there is no directed cycles, it is easier to find the shortest path 
 *			We sort the vertices into topological order: we iterate throught the topological order relaxing all edges
 *			form the actual vertex
 *			Topological sort algorithm computes shortest path tree in any edge weighted (can be negative!!!) DAG in timeO(E+V)
 *			It is much faster than Bellman-Ford or Dijkstra
 *			Application: solving Knapsack-problem
 *
 * 
 * 	Applications: 
 * 		GPS, E-mail path finder etc.
 * 		
 *  Avidan-Shamir method
 *  	When we want to shrink an image for example in the browser or on a smartphone without distortion
 *  	We want to make sure the image will not deform
 *  	we have to eliminate the least significant bit strings
 *  	We set up an "energy function": and remove the connected string of pixels containing the least energy 
 *  	Photoshop, GIMP use it
 *  	We build a huge graph: vertices are the pixels and the edges are pointing from every vertex to its downward 3 neighbours
 *  	The energy function determines what the edge weights will be
 *  	It's acyclic: we can use topological order shortest path to find the string of pixels to be removed
 *  	
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertex0.addNeighbour(new Edge(1,vertex0, vertex1));
		vertex0.addNeighbour(new Edge(3,vertex0, vertex2));
		vertex1.addNeighbour(new Edge(1,vertex1, vertex2));
		
		
		DijkstraAlgorithm algorithm = new DijkstraAlgorithm();
		algorithm.computePath(vertex0);
		
		System.out.println(algorithm.getShortestPathTo(vertex2));
		
		
		
	}
}