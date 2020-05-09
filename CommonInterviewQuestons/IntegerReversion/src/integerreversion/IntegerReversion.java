package integerreversion;

public class IntegerReversion {

	
	public int reverse(int num) {
		
		int reversed = 0;
		int rem;
		
		while (num > 0) {
			rem = num % 10;
			num /= 10;
			reversed = reversed * 10  + rem;
		}
		return reversed;
	}
	
}




