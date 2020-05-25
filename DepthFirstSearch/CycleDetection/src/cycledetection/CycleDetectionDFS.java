package cycledetection;

import java.util.List;

public class CycleDetectionDFS {
	
	public void detectCycle(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if(!v.isVisited()) 
				dfs(v);
			
		}
	}

	private void dfs(Vertex vertex) {
		System.out.println("DFS on vertex " + vertex);
		vertex.setBeingVisited(true);
		
		for (Vertex v : vertex.getAdjaceniesList()) {
			
			System.out.println("visiting the neigbours of vertex "+ vertex);
			
			if(v.isBeingVisited()) {
				System.out.println("There is a backwards edge, so there is a cycle!");
				return;
			}
			if(!v.isVisited()) {
				System.out.println("visiting vertex " + v + " recursively");
				v.setVisited(true);
				dfs(v);
			}
		}
		System.out.println("set vertex " + vertex +" setBeingVisited->false and visited->true");
		vertex.setBeingVisited(false);
		vertex.setVisited(true); //just to be sure 
	}
}
