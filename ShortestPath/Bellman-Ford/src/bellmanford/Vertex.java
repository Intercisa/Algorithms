package bellmanford;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	
	private String name;
	private boolean visited;
	private double distance = Integer.MAX_VALUE;
	private Vertex predecessor;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		this.name = name;
		this.adjacencies = new ArrayList<Edge>();
		
	}
	
	public void addNeighbour(Edge edge) {
		this.adjacencies.add(edge);
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public boolean isVisited() {return visited;}
	public void setVisited(boolean visited) {this.visited = visited;}
	public double getDistance() {return distance;}
	public void setDistance(double distance) {this.distance = distance;}
	public Vertex getPredecessor() {return predecessor;}
	public void setPredecessor(Vertex predecessor) {this.predecessor = predecessor;}
	public List<Edge> getAdjacenciesList() {return adjacencies;}
	public void setAdjacenciesList(List<Edge> adjacenciesList) {this.adjacencies = adjacenciesList;}

	@Override
	public String toString() {
		return String.format("Vertex [name=%s]", name);
	}

}
