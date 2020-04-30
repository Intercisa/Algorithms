package main;

public class Main {
	/*
	 * 1, Linear search: in an !!UNSORTED!! array we have to iterate through the whole array sequentially
	 * 		checking every item >> O(N) time complexity
	 * 
	 * 2, Binary search: we can do better if the array is sorted
	 * 		Find the position of a target value within a !!SORTED!! array!!
	 * 			O(logN) time complexity
	 * 
	 * The binary search algorithm begins by comparing the target value to the value of the middle element of the !!SORTED!! array: 
	 * 		
	 * 		- if this element is greater than the item we are looking for:
	 * 			we continue the search on the left subarray
	 * 		- if the element is less >> we search the right subarray 
	 * 
	 *  	This way we can discard half of the items on every iteration
	 *  		(that's why it will have logarithmic time complexity)
	 *    
	 * 3, Interpolation search: we can use it if the array is sorted 
	 * 		It is like we humans look for a name in the telephone book
	 * 			- we make a guess where in the remaining search space the sought item might be
	 * 			- in binary search we jump to the middle index >> here this is not the case! 
	 * 				~ we just make a simple linear interpolation
	 * 
	 * 			O(log log N) comparisons! 
	 * 
	 */
	
	
	public static void main(String[] args) {

		
	}
}
