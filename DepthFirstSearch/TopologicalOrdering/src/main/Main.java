package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import topological.TopologicalOrdering;
import topological.Vertex;

/*
 *Topological Ordering / Topological Sort 
 *
 *	Topological ordering of a !!directed graph!! is a linear ordering
 *	of its vertices such that for every directed edge uv from vertex u to vertex v, u comes before v in the ordering
 *	
 *	For instance, the vertices of the graph may represent tasks to be performed, and the edges may represent constraints that 
 *	to be performed, and the edges may represent constraints that one task must be performed before another 
 *	
 *	In this application, a topological ordering is just a valid sequence for the task 
 *	
 *	We can use topological ordering only if the graph has no directed cycles DAG
 *	
 *	Any DAG has at least one topological order 
 *
 *	Topological sort: 
 *		Linear time complexity
 *		It is very important in project management 
 *		Another important fact has something to do with Hamiltonian cycles
 *			Hamiltonian path: it is a path in an undirected or directed graph 
 *			that visits each vertex exactly once
 *		If a Hamiltonian path exists, the topological sort order is unique, no other order
 *		respects the edges of the path; Conversely, if a topological sort does not form a Hamiltonian path, 
 *		the DAG will have two or more valid topological orderings
 *	
 *		Finding Hamiltonian path is NP complete problem: but we can decide whether such a path exits in linear time!! 
 *
 * 
 * 		We have to find a vertex with no incoming edges!
 * 		+ keep repeating it over and over again >> Topological Order: A - C - E - B - D 
 * 
 * 		A ------------->D
 *		|              ^^
 * 		|			  /	|
 * 		|	--->B<----	|
 * 		v /			  \ |
 * 		C ------------> E
 * 
 * 	Applications: 
 * 		Dependency management in software engineering (Maven, Ant or Gradle)
 *		At universities -> constructing the syllabus / curriculum 
 */

public class Main {

	public static void main(String[] args) {
		
		TopologicalOrdering ordering = new TopologicalOrdering();
		List<Vertex> graph = new ArrayList<Vertex>();
		
		graph.add(new Vertex("0"));
		graph.add(new Vertex("1"));
		graph.add(new Vertex("2"));
		graph.add(new Vertex("3"));
		graph.add(new Vertex("4"));
		graph.add(new Vertex("5"));
		
		
		graph.get(2).addNeigbour(graph.get(3));
		graph.get(3).addNeigbour(graph.get(1));
		
		graph.get(4).addNeigbour(graph.get(0));
		graph.get(4).addNeigbour(graph.get(1));
		
		graph.get(5).addNeigbour(graph.get(0));
		graph.get(5).addNeigbour(graph.get(2));
		
		for (int i = 0; i < graph.size(); i++) { //if there are more than one cluster 
			if(!graph.get(i).isVisited()) {
				ordering.dfs(graph.get(i));
			}
		}
		
		Stack<Vertex> stack = ordering.getStack();
		
		for (int i = 0; i < graph.size(); i++) {
			Vertex vertex = stack.pop();
			System.out.print(vertex+" -> ");
		}
		System.out.print("finished");
	}
}