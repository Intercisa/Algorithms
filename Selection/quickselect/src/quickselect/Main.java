package quickselect;

public class Main {

	/*
	 * Quickselect
	 * 
	 * It is a selection algorithm to find the k-th smallest/largest item in an unordered array
	 * 
	 * Hoare constructed the algorithm -> "Hoare-algorithm"
	 * 
	 *  It has a very good average case running time: O(N)
	 *  Worst case: O(N pow(2))
	 *  In-place algorithm 
	 *  
	 *  Concept is similar to quicksort 
	 *  	choose a pivot element at random
	 *  	partition the array
	 *  	instead of recursion into both sides, we just take one side 
	 *  	O(N*logN) -> O(N)
	 *  
	 *  1, partition phase
	 *  	-choose a pivot value at random (or use the middle is up to you really): for now we generate a random number
	 *  		in the range [firstIndex,lastINdex]
	 *  	-rearranges the list in a way that all elements less than pivot are on left side of pivot and others on right
	 *  		it then returns index of the pivot element 
	 *  
	 *  2, select phase
	 *  	After the partitioning -> we are looking for the k-th smallest item for example
	 *  		So we keep the left subarray in the partition phase 
	 *  
	 *  	After partitioning there are 3 cases: 
	 *  		1, k == pivot 
	 *  			it means we have found the k-th smallest item we are after, because this how partitioning works:
	 *  			there are exactly k-1 items that are smaller than the pivot / in this case pivot == k!!
	 *  
	 *  		2, k < pivot
	 *  			the k-th smallest item is on the left side of the pivot, thats why we can discard the other subarray / unlike quicksort 
	 *  		
	 *  		3, k > pivot 
	 *  			k-th smallest item is on the right side of the pivot 
	 *  
	 *  
	 *  simulation: 
	 *  	nums = [1,-2,5,8,7,6] quick.select(2) >> looking for the second largest element 
	 *  
	 *  	select(indexFirst, indexLast, k') //k = k - 1  -> k==2 - 1 >> 1 because it's an index we looking for, and on the 0 index will be the first largest 
	 *  		pivot = partition(indexFirst, indexLast);
	 *  
	 *  		if(pivot > k')
	 *  			return select(indexFirst, pivot - 1, k');
	 *  		else if(pivot < k')
	 *  			return select(pivot + 1, indexLast, k');
	 *  	return nums[k];
 	 *  
 	 *  	partition(indexFirst, indexLast)
 	 *  		pivot = random(indexFirst, indexLast)
 	 *  		swap(indexLast, pivot)
 	 *  	
 	 *  		for(int i = indexFirst; i < lindexLast; i++)
 	 *  			if(nums[i] > nums[indexLast]) if we use < than there will be the smaller number 
 	 *  				swap(i, indexFirst);
 	 *  				indexFirst++;
 	 *  		swap(indexFirst, indexLast)
 	 *  	
 	 *  		return indexFirst
 	 *  
 	 *  
 	 *  we may make sure the running time remains O(N) if we keep discarding half of the array on every iteration
 	 *  	
 	 *  	>> We have to pick a "good" pivot!
 	 *  		if we pick the median as a pivot: there will be approximatley same amount of items ont the left and right subarrays!!
 	 *  		
 	 *  	It is the approximated median: but enough to make sure we discard more items
 	 *  
 	 *  ///////////////////////////////////////////
 	 *  !Median of medians!
 	 *    -> It is basically the same as quickselect, the only difference is how we get the pivot value 
 	 *    		
 	 *    		- quickselect: we generate a random index 
 	 *    		- median of medians: we calculate the approximated median 
 	 *    
 	 *    O(N) running time guaranteed 
 	 *    O(logN) worst case memory complexity 
 	 *    
 	 *  
 	 *   /////////////////////////////////////////// 
 	 *   !Introselect!
 	 *   
 	 *    It is a hybrid algorithm: combining two algorithms in order to take advantage of the best features
 	 *    		- quickselect is in place algorithm 
 	 *    		- median of medians select: always fast o(N)
 	 *    
 	 */
 	
	
 	/*
 	 * 	 
 	 *   !Online selection - the secretary problem!
 	 *   
 	 *    	Online algorithm related problem
 	 *    	We want to find the k-th smallest / largest item of a stream 
 	 *    	Partition based algorithms can not be used: we don't know the data in advance 
 	 *    	
 	 *    	The Trouble is to select (under these constraints) 
 	 *    		a specific element of the input sequence of data with largest probability 
 	 *    
 	 *    Secretary problem:
 	 *    	Very important problem of optimal stopping theory 
 	 *    	Also known as "best choice problem"
 	 *    
 	 *    	Problem: we want to hire the best secretary out of N applicants.
 	 *    	Applicants are interviewed one by one + after rejecting, the applicant can't be recalled
 	 *    	We can rank the applicant among all applicants interviewed so far, 
 	 *    	but we are unaware of the quality of yet unseen applicants 
 	 *    	
 	 *    	What is the optimal strategy?
 	 *    	We want to maximize the probability of selection the best applicant
 	 *    
 	 *    		If we can make the decision at the end: we just have to make a maximum finding 
 	 *    		It can be done in O(N) 
 	 *    		But we have to make the decision immediately  
 	 *    
 	 *    SOLUTION: 
 	 *    	always reject the first n/e applicants and then we have to stop at the one who is better than all the previous one 
 	 *    	the one who is better than all the previous ones:
 	 *    		e: natural logarithm ~2.718...
 	 *    
 	 *     		- it is  very popular problem because it has a well defined solution 
 	 *     		- the probability of choosing the best applicant is 1/e 
 	 *     		- so 37% chance we find the optimal one 
 	 *  
 	 *  
	 */
	
	public static void main(String[] args) {


	}

}
