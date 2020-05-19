package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void bfs(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while (!queue.isEmpty()) {
			Vertex actual = queue.remove();
			System.out.println(actual +" ");
			
			for (Vertex v : actual.getNeigbourList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
