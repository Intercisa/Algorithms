package main;

/*
 * Given an array A of 0s and 1s, we may change up to K values from 0 to 1.
 * Return the length of the longest (contiguous) subarray that contains only 1s. 
 * One thing's for sure, we will only flip a zero if it extends an existing window of 1s. 
 * Otherwise, there's no point in doing it, right? Think Sliding Window!
 * 
 * Since we know this problem can be solved using the sliding window construct, 
 * we might as well focus in that direction for hints. Basically, in a given window, we can never have > K zeros, right?
 *
 * We don't have a fixed size window in this case. 
 * The window size can grow and shrink depending upon the number of zeros we have (we don't actually have to flip the zeros here!).
 *
 * The way to shrink or expand a window would be based on the number of zeros that can still be flipped and so on.
 *
 * Basic template of such problems is basically 3 steps:
 * 
 * Step1: Have a counter or hash-map to count specific array input and keep on increasing the window toward right using outer loop.
 * 
 * Step2: Have a while loop inside to reduce the window side by sliding toward right. Movement will be based on constraints of problem. 
 * 
 * Step3: Store the current maximum window size or minimum window size or number of windows based on problem requirement.
 * 
 */

public class Main {

	public static void main(String[] args) {
	}
}
