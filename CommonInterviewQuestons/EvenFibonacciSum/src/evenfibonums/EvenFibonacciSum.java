package evenfibonums;

public class EvenFibonacciSum {
	public Integer evenFibonacciSum(Integer n) {
		int a = 0, b = 0,  c = 1,  sum = 0;
		
		for (;;) {
			
			if (c > 4000000) break;  
			
			a = b;
			b = c;
			c = a+b;
			
			if(c<=n &&  c % 2 == 0) sum+= c;
			 
		}
		return sum;
	}
}



