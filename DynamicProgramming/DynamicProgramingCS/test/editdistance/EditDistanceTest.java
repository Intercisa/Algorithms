package editdistance;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class EditDistanceTest {

	
	@Test
	void test_naive1() {
		
		String str1 = "hello", str2 = "hail";
		assertEquals(3, new EditDistance().calculateEditDistanceNaive(str1, str2, str1.length(), str2.length()));
	}
	
	@Test
	void test_naive2() {
		String str1 = "intrinsic", str2 = "intrusive";
		assertEquals(4, new EditDistance().calculateEditDistanceNaive(str1, str2, str1.length(), str2.length()));
	}

	
	@Test
	void test_naive_memo1() {
		
		String str1 = "hello", str2 = "hail";
		
		 // When generating the memo, we need an extra row and column to accomodate
	    // empty substrings.
		int[][] memo = new int[str1.length() + 1][str2.length() + 1];
		
		// int arrays in Java are initialized with 0 values, but 0 in this
	    // context means that no changes are needed. We need another value to
	    // represent an unmemoized value, so we'll fill the memo with -1 values 
	    // instead.
		for (int[] row : memo) Arrays.fill(row, -1);
		
		
		assertEquals(3, new EditDistance().calculateEditDistanceNaiveMemo(str1, str2, str1.length(),str2.length(), memo));
	}
	
	@Test
	void test_naive_memo2() {
		String str1 = "intrinsic", str2 = "intrusive";
		int[][] memo = new int[str1.length() + 1][str2.length() + 1];
		
		for (int[] row : memo) Arrays.fill(row, -1);
		
		assertEquals(4, new EditDistance().calculateEditDistanceNaiveMemo(str1, str2, str1.length(), str2.length(), memo));
	}

	
	
	@Test
	void test1() {
		assertEquals(3, new EditDistance().calculateEditDistance("hello", "hail"));
	}
	
	@Test
	void test2() {
		assertEquals(4, new EditDistance().calculateEditDistance("intrinsic", "intrusive"));
	}

}
