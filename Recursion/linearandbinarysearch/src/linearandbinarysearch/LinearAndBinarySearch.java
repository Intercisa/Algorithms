package linearandbinarysearch;

public class LinearAndBinarySearch {

	private int[] array;
	
	public LinearAndBinarySearch(int[] array) {
		this.array = array;
	}
	
	public int linearSearch(int item) {
		for (int i = 0; i < array.length; i++)
			if(array[i] == item)
				return i;
		
		return -1;
	}

	//helper method for binary search
	public int binarySerach(int item) {
		return binarySearch(0, array.length-1, item);
	}
	
	private int binarySearch(int startIndex, int endIndex, int item) {
		
		if(endIndex < startIndex) {
			System.out.printf("The %d is not present in the array...", item);
			return -1;
		}
		
		int middleIndex = startIndex + (endIndex-startIndex)/2;
		
		if(item == array[middleIndex])
			return middleIndex;
		else if(item < array[middleIndex])
			return binarySearch(startIndex, middleIndex-1, item);
		else 
			return binarySearch(middleIndex+1, endIndex, item);
	}
}


