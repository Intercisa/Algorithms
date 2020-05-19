package main;

import bfs.BreadthFirstSearch;
import bfs.Vertex;

/*
 * Graphs
 * 	Graphs G(V,E) are mathematical structures to model pairwise relations between given objects
 * 	A graph  is made up of vertices/nodes and edges 
 * 	There are two types of graphs: directed and undirected graphs
 *
 *	how to represent them in programming languages:
 *		1, adjacency matrixes 
 *		2, edge list representation
 *
 *
 *			adjacency matrixes:
 *				We have an A matrix constructed out of the vertices of the graph: 
 *					-> the A(i,j) value in the matrix is 1 if there is a connection between node i and node j
 *					-> otherwise A(i,j) is 0
 *			
 *			edge list representation:
 *				We create a Vertex class
 *					-> it stores the neighbors accordingly
 *
 * 						class Vertex 
 * 							vertexName;
 * 							visited;
 * 							Vertex[] neighbors;
 * 
 * Applications: 
 * 	shortest path algorithm (GPS, high frequency trading)
 * 	graph traversing: web crawlers for Google
 * 	spanning trees
 * 	maximum flow problem: lots of problem can be reduced to maximum flow
 * 	
 * because there are two representation for graphs: we can handle these problems with matrixes as well
 * 		//thats why most of Google's algorithms have something to do with matrix related operations although they are algorithms  
 *
 *------------------------
 *	Breadth-first search! 
 *
 *	We have a graph and we want to visit every node -> we can do it with BFS 
 *	We visit every vertex exactly once 
 *	We visit the neighbors then the neighbors of these new vertices 
 *	Running time complexity: O(V+E)
 *	Memory complexity is not good: we have to store lots of references 
 *	Thats why DFS is usually preferred
 *	BUT it constructs a shortest path: Dijkstra algorithm does a BFS if all the edge weights are equal to 1  		
 *
 *Iteration
 *	bfs(vertex)
 *		Queue queue -> first in first out (fifo) 
 *		vertex set visited true
 *		queue.enqueue(vertex)
 *	while queue not empty 
 *		actual = queue.dequeue()
 *	for v in actual neighbors
 *		if v is not visited 
 *			v set visited true 
 *				queue.enqueue(v)
 *		
 *	
 * we have an empty queue at the beginning 
 * and we keep checking whether we have visited the given node or not 
 * 	~ keep iterating until queue is not empty 
 *
 *	Applications: 
 *	
 *	In artificial intelligence / machine learning it can prove to be very important: 
 *	robots can discover the surrounding more easily with BFS than DFS
 *	It is also very important in maximum flow: Edmonds_krap algorithm uses BFS for finding augmenting paths
 *	Cheyen's algorithm in garbage collection -> it help to maintain active references on the heap memory 
 *	It uses BFS to detect all the references on the heap
 *	Serialization / deserialization of a tree like structure (for example when order does matter) 
 *			-> it allows the tree to be reconstructed in an efficient manner! 
 *
 */

public class Main {

	public static void main(String[] args) {
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addNeigbourVertex(vertex2);
		vertex1.addNeigbourVertex(vertex4);
		vertex4.addNeigbourVertex(vertex5);
		vertex2.addNeigbourVertex(vertex3);
		
		
		bfs.bfs(vertex1);
		
	}
}
