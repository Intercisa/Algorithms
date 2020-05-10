package main;

import java.util.Arrays;
import java.util.List;

import binpacking.FirstFitDecreasingAlgorithm;

/*
 * Bin packing: 
 * 	Objects of different volumes must be packed into a finite number of bins or containers each of volume V in a way that minimizes the 
 * 	number of bins used
 * 	In the main: how to fit several things into containers in an efficient way
 * 	It is an NP-complete problem 
 * 	When the number of bins is restricted to 1 and each items is characterised by both a volume and a value, the problem of maximising 
 * 	the value of items that can fit in the bin is known as the knapsack problem
 *
 *	1, Naive approach "brute force search"
 *		iterate over all bins, try to put the current item in the bin and (it it fits) call the same method with the next item
 *	2, First-fit algorithm
 *		iterate over all items we want to put into bins >> if we are not able to put it into a given bin
 *		we try to put it into the next one
 *		yields non-optimal solutions in the main
 *	3, First-fit decreasing algorithm 
 *		sorting the items decreasing order may be helpful. After sorting we use first-fit algorithm 
 *		yields non-optimal solutions in the main  
 *
 * We have N groups of people with group size w1, w2... wN
 * We have minibuses with capacity C. What is the optimal number of minibuses when the group must stay together? 
 * Virtual machines often have to solve this problem!! 
 * Television advertisements: we are given a certain time slot (for example 10 minutes) How do we pack the most commercials
 * into each time slot and maximize our daily profits? 
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		List<Integer> items = Arrays.asList(10,5,5);
		int binCapacity = 10;
		FirstFitDecreasingAlgorithm algorithm = new FirstFitDecreasingAlgorithm(items, binCapacity);
		algorithm.solveBinpackingProblem();
		algorithm.showResults();
		
		
	}
}
