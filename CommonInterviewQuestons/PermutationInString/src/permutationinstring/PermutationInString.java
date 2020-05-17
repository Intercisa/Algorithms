package permutationinstring;

public class PermutationInString {

	public boolean checkInclusion(String s1, String s2) {

		if (s2 == null || s2.length() == 0)
			return s2.equals(s1);
		
		if (s1.length() > s2.length())
			return false;

		int[] s1Pool = new int[26];
		int[] s2Pool = new int[26];
		
		for (int i = 0; i < s1.length(); i++) {
			s1Pool[s1.charAt(i) - 'a']++;
			s2Pool[s2.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s2.length()- s1.length(); i++) {
			if(isMatch(s1Pool, s2Pool)) return true;
			
			
			// if don't match, we move the sliding window
            // remove the preceding character and add a new succeeding character to the new window 
			s2Pool[s2.charAt(i + s1.length()) - 'a']++;
			s2Pool[s2.charAt(i)- 'a']--;
		}


		return isMatch(s1Pool, s2Pool);
	}

	private boolean isMatch(int[] s1Pool, int[] s2Pool) {
		for (int i = 0; i < s1Pool.length; i++) {
			
			if(s1Pool[i] != s2Pool[i])
				return false;
		}
		return true;
	}
}