package hamiltonian;

public class HamiltonianCycle {

	private int numOfVertexes;
	private int[] hamiltonianPath;
	private int[][] adjacencyMatrix;
	
	public HamiltonianCycle(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
		this.hamiltonianPath =  new int[adjacencyMatrix.length];
		this.numOfVertexes = adjacencyMatrix.length;
		
		this.hamiltonianPath[0] = 0;
	}
	
	public void solve() {
		if(isFoundFeasibleSolution(1)) 
			showHamiltonianPath();
		else
			System.out.println("No feasible solution");
	}

	private boolean isFoundFeasibleSolution(int position) {
		
		if(position == numOfVertexes)
			if(adjacencyMatrix[hamiltonianPath[position-1]][hamiltonianPath[0]] == 1) //if the first is connected to the last based on the adjacencyMatrix >> ther is a solution
				return true;
			else return false;
		
		for(int vertexIndex = 1; vertexIndex < numOfVertexes; ++vertexIndex) {
			if(isFeasible(vertexIndex, position)) {
				hamiltonianPath[position] = vertexIndex;
				
				if(isFoundFeasibleSolution(position+1)) {
					return true;
				}
				//BACKTRACK
			}
		}
		return false;
	}

	private boolean isFeasible(int vertexIndex, int actualPosition) {
		//first criterion: whether two nodes are connected? 
		if(adjacencyMatrix[hamiltonianPath[actualPosition-1]][vertexIndex] == 0)
			return false;
		
		//second criterion: whether we have visited or not
		
		for (int i = 0; i < actualPosition; i++) {
			if(hamiltonianPath[i] == vertexIndex)
				return false;
		}
		return true;
	}

	private void showHamiltonianPath() {
		System.out.println("Hamiltonian cycle: ");
		for (int i = 0; i < hamiltonianPath.length; i++) 
			System.out.printf("%d ", hamiltonianPath[i]);
		
		System.out.print(hamiltonianPath[0]); //because it's a closed cycle >> the first element == last element  
	} 
}




