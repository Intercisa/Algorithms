package main;

import java.util.ArrayList;
import java.util.List;

import cycledetection.CycleDetectionDFS;
import cycledetection.Vertex;

/*
 * Cycle detection
 * 
 * 	Cycle detection is quite intuitive
 * 	We would like to detect cycles in a directed graph
 * 	Sometimes: cycles are good -> we are looking for arbitrage situations 
 * 	on the FOREX than cycles are exactly what we are looking for!!!
 * 
 * 	But most of the times: we want to avoid them!
 * 	Operating systems can have several processes -> there may be same cases when there is a cycle ->
 * 		they are waiting for each other
 * 	Operating system freeze
 * 	So we have to avoid cycles
 * 
 * dfs(Vertex vertex){
 * 	vertex.setVisited(false);
 * 	vertex.setBeingVisited(true);
 * 
 * 	for(Vertex v : vertex.getAdjenciesList()){
 * 		if(v.isVisited()){
 * 			System.out.print("Backward edge... so there is a cycle in the graph");
 * 			return;
 * 		}
 * 
 * 		if(!v.isVisited()){
 *			v.setVisited(true);
 *			dfs(v); 
 * 		}
 * 	}
 * 	vertex.setVisited(true);
 * 	vertex.setBeingVisited(false);
 * 	}
 * 
 * 	What does it mean, being Visited? 
 * 	If we backtrack and come to the situation that the vertex from where we started has no more unvisited adjencent vertexes 
 * 		-> it will become visited
 * 	Until then -> it is being visited 
 */

public class Main {

	public static void main(String[] args) {
		
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");
		Vertex vertex6 = new Vertex("6");
		
		//two cycles
		vertex1.addNeigbour(vertex2);
		vertex2.addNeigbour(vertex3);
		vertex3.addNeigbour(vertex1);
		vertex4.addNeigbour(vertex1);
		vertex4.addNeigbour(vertex5);
		vertex5.addNeigbour(vertex6);
		vertex6.addNeigbour(vertex4);
		
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		
		
		CycleDetectionDFS detection = new CycleDetectionDFS();
		detection.detectCycle(vertexList);
		
		
	}
}