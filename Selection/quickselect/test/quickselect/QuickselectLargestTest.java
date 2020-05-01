package quickselect;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class QuickselectLargestTest {
	QuickselectLargest quickselect = new QuickselectLargest(new int[] {1,5,4,8,-2});

	@Test
	void test_1() {
		assertEquals(8, quickselect.select(1));
	}
	@Test
	void test_2() {
		assertEquals(5, quickselect.select(2));
	}
	@Test
	void test_3() {
		assertEquals(4, quickselect.select(3));
	}


}
