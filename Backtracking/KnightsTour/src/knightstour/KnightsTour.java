package knightstour;

public class KnightsTour {

	private int[][] solutionMatrix;
	private int[] xMoves = {2,1,-1,-2,-2,-1,1,2}; //like coordinates 
	private int[] yMoves = {1,2,2,1,-1,-2,-2,-1};
	
	public KnightsTour() {
		this.solutionMatrix = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		initializeBoard();
	}

	private void initializeBoard() {
		for (int i = 0; i < Constants.BOARD_SIZE; i++) 
			for (int j = 0; j < Constants.BOARD_SIZE; j++) 
				solutionMatrix[i][j] = Integer.MIN_VALUE; //it means it's empty, we have not visited yet 
	}
	
	public void solveTour() {
		solutionMatrix[0][0] = 1; //we starts from here >> starting point for the knight 
		
		if(solveProblem(2,0,0)) //stepCount x-coordinate y-coordinate 
			printSolution();
		else
			System.out.println("No feasible solution...");
	}

	private boolean solveProblem(int stepCount, int x, int y) {
		 
		if (stepCount == Constants.BOARD_SIZE * Constants.BOARD_SIZE +1) 
			return true;
		
 
		for (int i = 0; i < xMoves.length; ++i) {
 
			int nextX = x + xMoves[i];
			int nextY = y + yMoves[i];
 
			if ( isValidMove(nextX, nextY) ) {
 
				this.solutionMatrix[nextX][nextY] = stepCount;
 
				if ( solveProblem(stepCount + 1, nextX, nextY) ) 
					return true; // good solution, keep going
				
				//BACKTRACK
				this.solutionMatrix[nextX][nextY] = Integer.MIN_VALUE;
			}
		}
 
		return false;
	}

	private boolean isValidMove(int x, int y) {
		if(x < 0 || x >= Constants.BOARD_SIZE) return false;
		if (y < 0 || y >= Constants.BOARD_SIZE) return false;
		if(solutionMatrix[x][y] != Integer.MIN_VALUE) return false;

		return true;
	}

	private void printSolution() {
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			for (int j = 0; j < Constants.BOARD_SIZE; j++) 
				System.out.print(solutionMatrix[i][j] + " ");

			System.out.println();
		}
	}
	
}




