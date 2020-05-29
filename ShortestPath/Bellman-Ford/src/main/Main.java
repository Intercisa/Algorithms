package main;

import java.util.ArrayList;
import java.util.List;

import bellmanford.BellmanFordAlgorithm;
import bellmanford.Edge;
import bellmanford.Vertex;

/*
 * Shortest Path Algorithms
 * 
 * 	Bellman-Ford Algorithm: 
 * 		Invented in 1985 by Bellman and Ford independently 
 * 		Slower than Dijkstra's but more robust: it can handle negative edge weights too
 * 		Dijkstra algorithm choose the edge greedely, with the lowest cost:
 * 		Bellman-Ford relaxes all edges at the same time for V-1 iteration
 * 		Running times is O(V*E)
 * 		Does V - 1 iteration + 1 to detect cycles: if cost decreases in the V-th iteration, than there is a negative cycle,
 * 		because all the paths are traversen up to the V - 1 iteration 
 * 			
 * 			 A
 *		   ^  \	 			
 * 		  /    \		What is the problem? 
 * 		 5	    1		If we would like to find a path with the minimum cost
 *	    /	     \			we have to go A->B->C-A
 *	   /		  V	 	And a next cycle: decrease the cost again
 *	  C<-- - 10 -- B  	And again...	
 *	
 *	Real life scenario: no negative cycles at all... but sometimes we transform a problem into a graph
 *		 with positive / negative edge weights and looking for some negative cycles! 
 *
 *	pseudo code:
 *	
 *	function BellmanFordAlgorith(vertices, edges, source)
 *
 *		distance[source] = 0
 *		
 *		for v in Graph 
 *			distance[v] = inf
 *			predecessor[v] = undefined // previous node in the shortest path
 *			
 *		for i = 1...num_vertexes-1							
 *			for each edge(u,v) with weight w in edges		 -> For all edges, if the distance to the destination can be shortened  
 *															  	by taking the edge, the distance is updated to the new lower value
 *			tempDist = distance[u] + w							V-1 times -> we make relaxation	
 *			
 *			if tempDist < distance[v]
 *				distance[v] = tempDist 
 *				predecessor[v] = u
 *
 *		for each edge(u,v) with w in edges					-> Since the longest possible path without a cycle can have V-1 edges,
 *			if distance[u] + w < distance[v]				   the edges most be scanned V-1 times to ensure the shortest
 *				error: "Negative cycle detected"			   path has been found for all nodes
 *															-> A final scan of all the edges is performed and if any distance is updated->
 *															   means there is a negative cycle!	
 *
 *	Yen optimization: 1970
 *	
 *	Yen algorithm: it is the Bellman-Ford algorithm with some optimization 
 *	We can terminate the algorithm if there is no change in the distances between two iteration!
 *	we use the same technique in bubble sort!
 *
 *	Applications: 
 *		Cycle detection can prove to be very important
 *		Negative cycles as well -> we have to run the Bellman-Ford algorithm that can handle negative edge weights by default
 *		On the FOREX market it can be detect arbitrage situations! 
 *
 *
 *
 *	 
 *
 */

public class Main {

	public static void main(String[] args) {
		
	List<Vertex> vertexList = new ArrayList<>();
		
		vertexList.add(new Vertex("A"));
		vertexList.add(new Vertex("B"));
		vertexList.add(new Vertex("C"));
		vertexList.add(new Vertex("D"));
		vertexList.add(new Vertex("E"));
		
		List<Edge> edgeList = new ArrayList<>();
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(1),5));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(3),-4));
		edgeList.add(new Edge(vertexList.get(0),vertexList.get(2),8));
		edgeList.add(new Edge(vertexList.get(1),vertexList.get(0),-2));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(1),-3));
		edgeList.add(new Edge(vertexList.get(2),vertexList.get(3),9));
		edgeList.add(new Edge(vertexList.get(3),vertexList.get(1),7));
		edgeList.add(new Edge(vertexList.get(4),vertexList.get(0),6));
		edgeList.add(new Edge(vertexList.get(4),vertexList.get(2),7));
		

		BellmanFordAlgorithm bellmannFordAlgorithm = new BellmanFordAlgorithm(vertexList,edgeList);
		bellmannFordAlgorithm.bellmanFord(vertexList.get(4));
		bellmannFordAlgorithm.shortestPathTo(vertexList.get(3));
		
	
		
	}
}