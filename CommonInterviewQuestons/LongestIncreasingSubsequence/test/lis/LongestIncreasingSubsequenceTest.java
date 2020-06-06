package lis;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {

	@Test
	void test_1() {
		assertEquals(4, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
	}
	
	@Test
	void test_2() {
		assertEquals(6, new LongestIncreasingSubsequence().lengthOfLIS(new int[] {1,3,6,7,9,4,10,5,6}));
	}
}

