package main;

import evenfibonums.EvenFibonacciSum;

/*
 * 
 * Write a method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci numbers that are less than or equal to n.
 * Each new element in the Fibonacci sequence is generated by adding the previous two elements.
 * 
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
		EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
		System.out.println(evenFibonacciSum.evenFibonacciSum(1000));
	}
}
