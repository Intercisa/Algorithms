package bellmanford;

import java.util.List;

public class BellmanFordAlgorithm {

	private List<Edge> edgeList;
	private List<Vertex> vertexList;

	public BellmanFordAlgorithm(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
	}

	public void bellmanFord(Vertex sourceVertex) {

		sourceVertex.setDistance(0);

		for (Vertex vertex : vertexList) {
			for (Edge edge : edgeList) {

				if (edge.getStartVertex().getDistance() == Double.MAX_VALUE) continue;
				

				double newDistance = edge.getStartVertex().getDistance() + edge.getWeight();

				if (newDistance < edge.getTargetVertex().getDistance()) {
					edge.getTargetVertex().setDistance(newDistance);
					edge.getTargetVertex().setPredecessor(edge.getStartVertex());
				}
			}
		}

		for (Edge edge : edgeList) {
			if (edge.getStartVertex().getDistance() != Double.MAX_VALUE) {
				if (hasCycle(edge)) {
					System.out.println("Negative edge weight cycles detected!");
					return;
				}
			}
		}

	}

	public void shortestPathTo(Vertex targetVertex) {
		if(targetVertex.getDistance() == Double.MAX_VALUE) System.out.println("There is no path from the source tot the target");
		
		Vertex actualVertex = targetVertex;
		
		while (actualVertex.getPredecessor() != null) {
			System.out.println(actualVertex);
			actualVertex = actualVertex.getPredecessor();
		}	
	}
	
	private boolean hasCycle(Edge edge) {
		return edge.getTargetVertex().getDistance() > edge.getStartVertex().getDistance() + edge.getWeight();
	}
}
