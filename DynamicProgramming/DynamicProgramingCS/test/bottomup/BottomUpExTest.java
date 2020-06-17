package bottomup;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class BottomUpExTest {

	@Test
	void testTop() {
		assertEquals(120, BottomUpEx.product1ToNTop(5));
	}
	
	@Test
	void testBottom() {
		assertEquals(120, BottomUpEx.product1ToNBottom(5));
	}

}
