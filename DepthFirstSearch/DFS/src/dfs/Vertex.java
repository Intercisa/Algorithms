package dfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private List<Vertex> neigbourList;
	
	public Vertex(String name) {
		this.name = name;
		this.neigbourList = new ArrayList<Vertex>(); //adjaceniesList
	}
	
	public void addNeigbour(Vertex vertex) {this.neigbourList.add(vertex);}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public boolean isVisited() {return visited;}
	public void setVisited(boolean visited) {this.visited = visited;}
	public List<Vertex> getNeigbourList() {return neigbourList;}
	public void setNeigbourList(List<Vertex> neigbourList) {this.neigbourList = neigbourList;}
	
	
	public void addNeigbourVertex(Vertex neigbour) {
		this.neigbourList.add(neigbour);
	}
	
	@Override
	public String toString() {
		return ""+this.name;
	}
	
	
	
	
}
