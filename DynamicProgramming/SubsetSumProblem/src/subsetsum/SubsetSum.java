package subsetsum;

public class SubsetSum {

	private boolean[][] dpTable;
	private int[] S;
	private int sum;
	public SubsetSum(int[] S, int sum) {
		this.S = S;
		this.sum = sum;
		this.dpTable = new boolean[S.length+1][sum+1];
	}
	
	public void solve() {
		//initialize the board
		for(int i = 0; i < S.length+1; i++) 
			dpTable[i][0] = true;
		
		for(int rowIndex = 1; rowIndex < S.length+1; rowIndex++) {
			for (int columnIndex = 1; columnIndex < sum+1; columnIndex++) {
				if(columnIndex < S[rowIndex-1]) {
					dpTable[rowIndex][columnIndex] = dpTable[rowIndex-1][columnIndex];
				}else {
					if(dpTable[rowIndex-1][columnIndex] == true) {
						dpTable[rowIndex][columnIndex] = dpTable[rowIndex-1][columnIndex];
					}else {
						dpTable[rowIndex][columnIndex] = dpTable[rowIndex-1][columnIndex-S[rowIndex-1]];
					}
				}
			}
		}
		System.out.println("Solution: "+ dpTable[S.length][sum]);
	}
	
	public void showIntegeres() {
		int columnIndex = sum, rowindex = S.length;
		
		while (columnIndex > 0 || rowindex > 0) {
			if(dpTable[rowindex][columnIndex] == dpTable[rowindex-1][columnIndex]) {
				rowindex--;
			}else {
				System.out.println("We take: " + S[rowindex-1]);
				columnIndex = columnIndex -S[rowindex-1];
				rowindex--;
			}
		}
	}
	
}




