package cycledetection;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean visited;
	private boolean beingVisited;
	private List<Vertex> adjaceniesList;
	
	public Vertex(String name) {
		this.name = name;
		this.adjaceniesList = new ArrayList<Vertex>(); //adjaceniesList
	}
	
	public void addNeigbour(Vertex vertex) {adjaceniesList.add(vertex);}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public boolean isVisited() {return visited;}
	public void setVisited(boolean visited) {this.visited = visited;}
	public boolean isBeingVisited() {return beingVisited;}
	public void setBeingVisited(boolean beingVisited) {this.beingVisited = beingVisited;}
	public List<Vertex> getAdjaceniesList() {return adjaceniesList;}
	public void setAdjaceniesList(List<Vertex> adjaceniesList) {this.adjaceniesList = adjaceniesList;}
	
	@Override
	public String toString() {
		return this.name;
	}
}
