package paths;

public class Paths {

	/*
	 * 
	 * Count the paths
	 * you only can go down or right -> you are in the upper left corner 
	 * 
	 * 					paths(start, end) = 
	 * 		paths(A, end) 		+			 paths(B,end)
	 * paths(D,end)+paths(C,end)		paths(C, end)+paths(E, end)
	 * 
	 */
	
	public int countPaths(boolean[][] grid, int row, int col){
		if(!validSquare(grid, row, col)) return 0;
		if(isAtEnd(grid, row, col)) return 1;
		
		return countPaths(grid, row + 1, col) + countPaths(grid, row, col + 1); 
	}

	public int countPathsMemo(boolean[][] grid, int row, int col, int[][]paths){
		if(!validSquare(grid, row, col)) return 0;
		if(isAtEnd(grid, row, col)) return 1;
		
		if(paths[row][col] == 0)
			paths[row][col] = countPaths(grid, row + 1, col) + countPaths(grid, row, col + 1);
		
		return paths[row][col]; 
	}
	
	
	
	private boolean isAtEnd(boolean[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean validSquare(boolean[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
