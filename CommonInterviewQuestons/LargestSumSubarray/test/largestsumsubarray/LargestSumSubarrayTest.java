package largestsumsubarray;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LargestSumSubarrayTest {

	LargestSumSubarray  largestSum= new LargestSumSubarray();
	
	@Test
	void test_1() {
		assertEquals(10, largestSum.largestSumSubarray(new int[]{1,-2,3,4-5,8}));
	}
}
