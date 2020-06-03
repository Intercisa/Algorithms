package insertionsort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class InsertionSortTest {
	

	
	@Test
	void test_1() {
		assertArrayEquals(new int[] {1,2,3,4,5,6}, new InsertionSort().insertionSort(new int[] {5,2,4,6,1,3}));
	}

	@Test
	void test_2() {
		assertArrayEquals(new int[] {26, 31, 41, 41, 58, 59},  new InsertionSort().insertionSort(new int[] {31, 41, 59, 26, 41, 58}));
	}
	
	@Test
	void test_3() {
		assertArrayEquals(new int[] {6,5,4,3,2,1}, new InsertionSort().insertionSortDec(new int[] {5,2,4,6,1,3}));
	}
	
	@Test
	void test_4() {
		assertArrayEquals(new int[] {59, 58, 41, 41, 31, 26},  new InsertionSort().insertionSortDec(new int[] {31, 41, 59, 26, 41, 58}));
	}
}
