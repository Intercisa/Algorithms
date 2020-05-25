package maze;

public class MazeSolver {

	private int[][] mazeMap;
	private boolean[][] visited;
	private int startPositionCol;
	private int startPositionRow;

	public MazeSolver(int[][] mazeMap, int startPositionCol, int startPositionRow) {
		this.mazeMap = mazeMap;
		this.visited = new boolean[mazeMap.length][mazeMap.length];
		this.startPositionCol = startPositionCol;
		this.startPositionRow = startPositionRow;
	}

	public void findWayOut() {

		try {
			dfs(startPositionRow, startPositionCol + 1);
			System.out.println("No solution found...");
		} catch (RuntimeException e) {
			System.out.println("Route found to exit!!!");
		}
	}

	private void dfs(int rowIndex, int colIndex) {

		System.out.println("Visiting position: (" + rowIndex + "," + colIndex + ")");

		int endOfMap = mazeMap.length - 1;

		// rowIndex or colIndex out of boundary
		if (rowIndex < 0 || rowIndex > endOfMap || colIndex < 0 || colIndex > endOfMap) {
			return;
		}

		// Exit location was found
		if (mazeMap[rowIndex][colIndex] == 3) {
			System.out.println("Exit position: (" + rowIndex + "," + colIndex + ")");
			throw new RuntimeException();
		}
		// Already visited
		else if (visited[rowIndex][colIndex]) {
			return;
		}
		// can't go direction, it is a wall
		else if (mazeMap[rowIndex][colIndex] == 1) {
			return;
		} else {
			visited[rowIndex][colIndex] = true;

			// Down
			dfs(rowIndex + 1, colIndex);
			// Right
			dfs(rowIndex, colIndex + 1);
			// Left
			dfs(rowIndex, colIndex - 1);
			// Up
			dfs(rowIndex - 1, colIndex);
		}
	}
}
