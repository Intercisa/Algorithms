package coloring;

public class ColoringProblem {

	private int numOfVertexes;
	private int numOfColors;
	private int[] colors;
	private int[][] adjacencyMatrix;
	
	public ColoringProblem(int numOfColors, int[][] adjacencyMatrix) {
		this.numOfColors = numOfColors;
		this.adjacencyMatrix = adjacencyMatrix;
		this.numOfVertexes = adjacencyMatrix.length;
		this.colors = new int[numOfVertexes];
	}
	
	public void solve() {
		if(solveProblem(0))
			showRersult();
		else
			System.out.println("No solution...");
		
	}

	private boolean solveProblem(int nodeIndex) {
		if(nodeIndex == numOfVertexes)
			return true;
		
		for(int colorIndex = 1; colorIndex <= numOfColors; colorIndex++) {
			
			if(isColorValid(nodeIndex, colorIndex)) {
				colors[nodeIndex] = colorIndex;
				
				if(solveProblem(nodeIndex+1)) 
					return true;
				
				//BACKTRACK!!
			}
		}
		return false;
	}

	private boolean isColorValid(int nodeIndex, int colorIndex) {
		for(int i = 0; i < numOfVertexes; i++)
			if(adjacencyMatrix[nodeIndex][i] == 1 && colorIndex == colors[i])
				return false;
		
		return true;
	}

	private void showRersult() {
		for (int i = 0; i < numOfVertexes; i++) 
			System.out.println("Node "+(i+1)+ " has color index: "+colors[i]);
	}
}




