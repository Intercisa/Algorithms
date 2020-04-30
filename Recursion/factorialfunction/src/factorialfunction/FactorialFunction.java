package factorialfunction;

public class FactorialFunction {
	//n! = n*(n-1) * (n-2) * ... * 1
	
	public int factorial(int n) {
		if(n == 1) return 1;
		
		return n * factorial(n -1);
	}
	
	
	//accumulator - advisable to use accumulator when you can!  
	public int factorialWithAccumulator(int accumulator, int n) {
		if(n == 1) return accumulator;
		
		return factorialWithAccumulator(accumulator * n, n - 1);
	}
	
	//helper method to accumulator
	public int calculateFactorial(int n) {
		return factorialWithAccumulator(1, n);
	}
	
}


