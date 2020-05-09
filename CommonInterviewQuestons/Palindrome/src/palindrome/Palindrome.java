package palindrome;

public class Palindrome {

	public boolean palindrome1(String s) {
	
		String rev = "";
		int len = s.length();
		
		for (int i = 0; i < len; i++) 
			rev += s.charAt(len-i-1); //reverse string 
			
		
			if(s.equals(rev)) return true;
			
			return false;
	}
	
	public boolean palindrome2(String s) {
		
		int len = s.length();
		
		for (int i = 0; i < len; i++) 
			if(s.charAt(i) != s.charAt(len-i-1)) return false;
		
		return true;
	}
	
	
	public boolean palindrome3(String s) {
		
		int i = 0; 
		int j = s.length()-1;
		int k = (i+j)/2;
		
		for(int index = i; index <=k; index++) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
}




