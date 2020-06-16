package editdistance;

import java.util.Collections;
import java.util.List;

public class EditDistance {
	
	//helper
	static int min (int insert, int remove, int replace) {
		List<Integer> values = List.of(insert, remove, replace);
		return Collections.min(values);
	}
	
	
	//bottom-up DP
	int calculateEditDistance(String str1, String str2) {
		int[][] memo = new int[str1.length() +1][str2.length() +1];
		
		for (int i = 0; i <= str1.length(); i++) {
			for (int j = 0; j <= str2.length(); j++) {
				if(i == 0) memo[i][j] = j;
				else if(j == 0) memo[i][j] = i;
				else if(str1.charAt(i - 1) == str2.charAt(j - 1)) memo[i][j] = memo[i - 1][j - 1];
				else
					memo[i][j] = min(1 + memo[i][j - 1], // insert
							1 + memo[i - 1][j], // remove
							1 + memo[i - 1][j - 1]); // replace 
			}
		}

		return memo[str1.length()][str2.length()];
		
		
	}
	
	
	//naive solution with memo
	// When generating the memo, we need an extra row and column to accomodate
    // empty substrings.
	// int[][] memo = new int[str1.length() + 1][str2.length() + 1];
		int calculateEditDistanceNaiveMemo(String str1, String str2, int n, int m, int[][]memo) {
			
			 // A value of greater than -1 in the memo grid means that the value for
		    // this combination of i and j has already been calculated and can be
		    // promptly returned.
			if(memo[n][m] > -1) return memo[n][m];  // int arrays in Java are initialized with 0 values, but 0 in this
		    // context means that no changes are needed. so we fill the memo with -1 values instead.
			
			if(n == 0) {
				memo[n][m] = m;
				return m;
			}
			
			if(m == 0) {
				memo[n][m] = n;
				return n;
			}
			
			if(str1.charAt(n-1) == str2.charAt(m-1)) {
				memo[n][m] = calculateEditDistanceNaiveMemo(str1, str2, n - 1, m - 1, memo);
				return memo[n][m];
			} 
			
			memo[n][m] = min(1 + calculateEditDistanceNaiveMemo(str1, str2, n, m - 1, memo), //insert
					1 + calculateEditDistanceNaiveMemo(str1, str2, n - 1, m, memo), //remove
					1 + calculateEditDistanceNaiveMemo(str1, str2, n - 1, m - 1, memo)); //replace
			
			return memo[n][m];
		}
	
	
	
	
	//naive solution -> prefixes >> n == str.length m == str2.length
	int calculateEditDistanceNaive(String str1, String str2, int n, int m) {
	    // If n is 0, we're essentially looking at an empty substring of str1.
	    // To convert an empty substring to any other string, you just insert 
	    // every character from the other string. Since the only operation to be 
	    // performed is insertion, the cost is equal to the length of the other 
	    // string.
		
		if(n == 0) return m;
		
		// This goes the other way as well of course — if you need to get from
	    // some substring to an empty string, The shortest path is to simply 
	    // remove every character in the substring.
		if(m == 0) return n;
		
		

	    // If the characters in the strings at a particular value of i and j match,
	    // then we don't need to perform any operation and the cost is 0. Since
	    // Java is a 0-indexed language, we need to subtract 1, otherwise we'd
	    // get a StringIndexOutOfBoundsException.
		if(str1.charAt(n-1) == str2.charAt(m-1)) 
			return calculateEditDistanceNaive(str1, str2, n - 1, m - 1);
		
		
		return min(1 + calculateEditDistanceNaive(str1, str2, n, m - 1), //insert
				1 + calculateEditDistanceNaive(str1, str2, n - 1, m), // remove
				1 + calculateEditDistanceNaive(str1, str2, n - 1, m - 1)); // subtitute if using Levenshtein than it would 2+ in here 
		
		
		
	}
	
	
	
}
