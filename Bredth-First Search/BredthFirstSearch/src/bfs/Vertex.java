package bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neigbourList;
	
	public Vertex(int data) {
		this.data = data;
		this.neigbourList = new ArrayList<Vertex>(); //adjaceniesList
	}
	
	public int getData() {return data;}
	public void setData(int data) {this.data = data;}
	public boolean isVisited() {return visited;}
	public void setVisited(boolean visited) {this.visited = visited;}
	public List<Vertex> getNeigbourList() {return neigbourList;}
	public void setNeigbourList(List<Vertex> neigbourList) {this.neigbourList = neigbourList;}
	
	
	public void addNeigbourVertex(Vertex neigbour) {
		this.neigbourList.add(neigbour);
	}
	
	@Override
	public String toString() {
		return ""+this.data;
	}
	
	
	
	
}
