package topological;

import java.util.Stack;

public class TopologicalOrdering {
	
	
	private Stack<Vertex> stack;
	
	public TopologicalOrdering() {
		stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex vertex) {
		
		vertex.setVisited(true);
		for (Vertex v : vertex.getNeigbourList()) {
			if(!v.isVisited()) {
				dfs(v);
			}
		}
		
		stack.push(vertex);
	}
	
	public Stack<Vertex> getStack(){
		return this.stack;
	}
	
}
