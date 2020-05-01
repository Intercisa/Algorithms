package quickselect;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class QuickselectSmallestTest2 {
	QuickselectSmallest quickselect = new QuickselectSmallest(new int[] {1,5,4,8,-2});

	@Test
	void test_1() {
		assertEquals(-2, quickselect.select(1));
	}
	@Test
	void test_2() {
		assertEquals(1, quickselect.select(2));
	}
	@Test
	void test_3() {
		assertEquals(4, quickselect.select(3));
	}


}
