package twosumproblem;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class TwoSumTest {
	

	
	@Test
	void test_1() {
		assertArrayEquals(new int[] {0,1}, new TwoSum().findTwoSum(new int[] {2, 7, 11, 15}, 9));
	}

}
