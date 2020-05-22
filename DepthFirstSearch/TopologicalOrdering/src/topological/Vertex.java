package topological;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String data;
	private boolean visited;
	private List<Vertex> neigbourList;
	
	public Vertex(String data) {
		this.data = data;
		this.neigbourList = new ArrayList<Vertex>(); //adjaceniesList
	}
	
	public void addNeigbour(Vertex vertex) {neigbourList.add(vertex);}
	
	public String getData() {return data;}
	public void setData(String data) {this.data = data;}
	public boolean isVisited() {return visited;}
	public void setVisited(boolean visited) {this.visited = visited;}
	public List<Vertex> getNeigbourList() {return neigbourList;}
	public void setNeigbourList(List<Vertex> neigbourList) {this.neigbourList = neigbourList;}
	
	@Override
	public String toString() {
		return this.data;
	}
	
	
	
	
}
