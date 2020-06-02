package numbersubstringscontaining;

public class NumberofSubstringsContainingAllThreeCharacters {

	public int numberOfSubstrings(String s) {

		int n = s.length();
		int j = 0, res = 0, tmp = 0;
		int[] counts = new int[3];

		for (int i = 0; i < n; i++) {
			counts[s.charAt(i) - 'a']++; /* have some hashmap or counter */

			/* Loop inside for to reduce the window size based on constraint */
			while (j < n && counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {

				tmp++;
				counts[s.charAt(j) - 'a']--;
				j++;
			}

			/* Count number of substrings */
			res += tmp;
		}
		return res;
	}

}
