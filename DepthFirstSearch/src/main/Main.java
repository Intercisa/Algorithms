package main;

import java.util.ArrayList;
import java.util.List;

import dfs.DepthFirstSearch;
import dfs.Vertex;

/*
 * Depth-first search 
 * 
 * 	Depth-first search is a widely used graph traversal algorithm besides breadth-first search
 *  
 *  It was investigated as strategy for solving mazes by Trémaux in the 19th century
 *  
 *  It explores as far as possible along each branch before 
 *  backtracking // BFS was a layer-by-layer algorithm 
 *  
 *  Time complexity of traversing a graph with DFS: O(V+E)
 *  
 *  Memory complexity: a bit better than that of BFS!!
 * 
 * RECURSION:
 * 	dfs(vertex)
 * 		vertex set visited true 
 * 		print vertex
 * 	
 * 		for v in vertex neighbors 
 * 			if v is not visited
 * 				dfs(v)
 * 
 * ITERATION: 
 * 	Stack stack (lifo -> last in first out)
 * 	vertex set visited true
 * 	stack.push(vertex)
 * 	
 * while stack not empty 
 * 	actual = stack.pop()
 * 
 * 		for v in actual neighbors
 * 			if v is not visited 
 * 				v set visited true
 * 					stack.push(v)
 * 
 * Application
 * 	Topological ordering
 * 	
 * 	Kosaraju algorithm for finding strongly connected components in a graph which can be proved to be very important
 * 		in recommendation systems (youtube)
 * 
 * 	Detecting cycles (checking whether a graph is a DAG or not) -> Directed Asynric Graph
 * 
 * 	Generating mazes OR finding way out of a maze
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		
		List<Vertex> list = new ArrayList<Vertex>();
		v1.addNeigbour(v2);
		v1.addNeigbour(v3);
		v3.addNeigbour(v4);
		v4.addNeigbour(v5);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
		depthFirstSearch.dfs(list);
		
	}
}
