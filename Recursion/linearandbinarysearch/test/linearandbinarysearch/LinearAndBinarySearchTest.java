package linearandbinarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LinearAndBinarySearchTest {
	
	LinearAndBinarySearch linAndBinUnSorted = new LinearAndBinarySearch(new int[] {1,5,3,8,9,10,-3}); //UNSORTED >> LINEAR
	LinearAndBinarySearch linAndBinSorted = new LinearAndBinarySearch(new int[] {-3,1,3,5,8,9,10});  //SORTED >> BINARY (better) || LINEAR 
	
	
	@Test
	void test_1() {
	assertEquals(6, linAndBinUnSorted.linearSearch(-3));
	}
	@Test
	void test_2() {
		assertEquals(-1, linAndBinUnSorted.linearSearch(100));
	}
	
	@Test
	void test_3() {
		assertEquals(0, linAndBinSorted.linearSearch(-3));
	}
	@Test
	void test_4() {
		assertEquals(-1, linAndBinSorted.linearSearch(100));
	}
	


}
