package main;

public class Main {
	/*
	 * Towers of Hanoi
	 * 	
	 * It consists of three rods and numbers of disk of different sizes which can clide onto any rod
	 * 
	 * The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, 
	 * thus making a conical shape
	 * 
	 * The minimum number of moves requested to solve a Tower of Hanoi problem is 2pow(n) -1 //O(2pow(n)) exponential time compelxity
	 * 
	 * We have some rules: 
	 * 	Only one disk can be moved at a time
	 * 
	 * 	Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack -> 
	 * 		a disk can only be moved if its the uppermost dist on a stack
	 * 	
	 * 	No disk may be placed on top of a smaller disk
	 * 
	 * 
	 * 	Subproblems: 
	 * 		There will be always a situation like ->
	 * 			we have to shift n-1 plates to the auxilary rod >> we have to put the largest to the last rod 
	 * 			and we have to put the plates from the auxilary rod to the top of the biggest plate!
	 * 			
	 * 			>>BUT it is the same problem again so we can use recursion!<<
	 * 
	 */
	
	public static void main(String[] args) {

		
	}
}
