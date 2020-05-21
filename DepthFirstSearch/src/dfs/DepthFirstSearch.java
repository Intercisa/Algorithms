package dfs;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
	
	private Stack<Vertex> stack;
	
	public DepthFirstSearch() {
		this.stack = new Stack<Vertex>();
	}

	public void dfs(List<Vertex> vertexList) {
		for (Vertex v : vertexList) { //we need this for loop if there are more than one cluster and still want to visit all vertexes
			if(!v.isVisited()) {
				v.setVisited(true);
				//dfsWithStack(v); //if we have only one cluster we can use this only // 1 3 4 5 2
				
				
				//or you can use a recursion solution -> 
				// will use the operating systems stack memory (because recursion) so basically it is a stack solution to
				dfsRecursive(v);  // 1 2 3 4 5 -> because there is no order in graph traversing this is a valid solution
			}
		}
	}
	
	
	private void dfsRecursive(Vertex v) {
		System.out.print(v + " ");
		for (Vertex vertex : v.getNeigbourList()) {
			if(!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsRecursive(vertex);
			}
		}
	}
	
	

	private void dfsWithStack(Vertex rootVertex) {
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while (!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.print(actualVertex +" ");
			
			
			for (Vertex v : actualVertex.getNeigbourList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
		
	}
}
