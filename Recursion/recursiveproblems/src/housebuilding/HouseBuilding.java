package housebuilding;

public class HouseBuilding {
	
	public void buildLayerHead(int height) {
		
		if(height <= 0)return;
		
		buildLayerHead(height-1); //head recursion >> asc order 
		System.out.println(height);
	}
	
	
	public void buildLayerTail(int height) {
		
		if(height <= 0)return;
		
		System.out.println(height);
		buildLayerTail(height-1); //tail recursion - similar to iteration >> desc order  
	}
	
	
	

}
