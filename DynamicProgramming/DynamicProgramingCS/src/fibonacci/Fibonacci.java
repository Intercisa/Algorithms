package fibonacci;

/*
 * 
 * fib(n) = fib(n - 1) + fib(n - 2)
 * base cases: fib(0) == 0,
 * 			   fib(1) == 1
 * 
 */

public class Fibonacci {

	public int fib(int n) {
		if (n == 0 || n == 1) return n;
		return fib(n - 1) + fib(n - 2);
	}
	
	public int fibMemo(int n, int[] memo) { //memo must initialized with size n + 1!!!
		if (n == 0 || n == 1) return n;
		if(memo[n] == 0)
			memo[n] = fibMemo(n -1, memo) + fibMemo(n - 2, memo); 
		return memo[n];
	}
	
	//Top-Down vs Bottom-Up
	
	public int fibBottomUp(int n) {
		//base cases
		if (n == 0 || n == 1) return n;
		
		int[] memo = new int[n + 1];
		memo[0] = 0;
		memo[1] = 1;
		
		for (int i = 2; i <= n; i++)
			memo[i] = memo[i - 1] + memo[i - 2];
		
		
		return memo[n];
		
	}
	
	public int fibBottomUpII(int n) {
		//base cases
		if (n == 0 || n == 1) return n;
		
		int a = 0;
		int b = 1;
		
		int res = 0;
		
		for (int i = 2; i <= n; i++) {
			res = a + b;
			a = b;
			b = res;
		}
		
		return res;
		
	}

}
