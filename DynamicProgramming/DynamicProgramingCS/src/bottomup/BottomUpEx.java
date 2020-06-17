package bottomup;

public class BottomUpEx {
	
	//top-down
	public static int product1ToNTop(int n) {
		// we assume n >= 1
		
		return (n > 1) ? (n * product1ToNTop(n-1)) : 1;
		
		/*
		 * it builds up a call stack of size O(n)O(n)O(n), which makes our total memory cost O(n)O(n)O(n). 
		 * This makes it vulnerable to a stack overflow error, 
		 * where the call stack gets too big and runs out of space. 
		 */
	}
	
	//bottom-up
	
	public static int product1ToNBottom(int n) {
		int result = 1;
		for (int num = 1; num <= n; num++) 
			result*=num;
		
		return result;
		
		//This approach uses O(1)O(1)O(1) space (O(n)O(n)O(n) time). 
		
	}

}
