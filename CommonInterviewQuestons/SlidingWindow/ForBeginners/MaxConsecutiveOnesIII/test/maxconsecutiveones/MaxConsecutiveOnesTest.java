package maxconsecutiveones;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

	@Test
	void test_1() {
		assertEquals(6, new MaxConsecutiveOnes().longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
	}
	
	@Test
	void test_2() {
		assertEquals(10, new MaxConsecutiveOnes().longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
		
		
		
	}


	
	

	
	


}
