package insertionsort;

public class InsertionSort {

	public int[] insertionSort(int[] A) {

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			
			 /* Move elements of A[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
		}
		return A;
	}


	public int[] insertionSortDec(int[] A) {

		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;
			
			 /* Move elements of A[0..i-1], that are 
            greater than key, to one position ahead 
            of their current position */
			
			while (j >= 0 && A[j] < key) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
		}
		return A;
	}

	
	
	
	
}
