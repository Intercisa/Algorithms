package anagram;

import java.util.Arrays;

public class AnagramProblem {

	private static final int N = 26;

	public boolean anagramWithArray(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		int[] charPool = new int[N];
		
		/*
		for(char c : s1.toCharArray()) charPool[c - 'a'] += 1;
		for(char c : s2.toCharArray()) charPool[c - 'a'] -= 1;
		*/
		
		for (int i = 0; i < s1.length(); i++) {
			charPool[s1.charAt(i) - 'a'] += 1;
			charPool[s2.charAt(i) - 'a'] -= 1;
		}
		
		for (int i = 0; i < N; i++) 
			if(charPool[i] != 0) return false;
		
		return true;	
	}
	
	
	public boolean anagramWithSort(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		
		char[] chS1 = s1.toCharArray();
		char[] chS2 = s2.toCharArray();
		Arrays.sort(chS1);
		Arrays.sort(chS2);
		
		for (int i = 0; i < chS1.length; i++) 
			if(chS1[i] != chS2[i]) return false;
		
		return true;
	}
	
	
		
}




