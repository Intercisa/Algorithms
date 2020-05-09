package duplicatesinarray;

public class DuplicatesInArrayAreSmallerThanArray {

	public void solve(int[] array) {
	
	//this is why it is an O(N) running time algorithm
	for(int i = 0; i< array.length; i++) {
		
		//if this value is positive we have to flip
		if(array[Math.abs(array[i])] > 0) {
			array[Math.abs(array[i])] = - array[Math.abs(array[i])];
		}else {
			System.out.printf("%d is a repetition!\n", Math.abs(array[i]));
		}
		
		}
	}
}
