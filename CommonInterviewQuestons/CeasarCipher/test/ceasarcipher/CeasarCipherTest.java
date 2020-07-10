package ceasarcipher;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CeasarCipherTest {

	@Test
	void test_1() {
		assertEquals("car", new CeasarCipher().decode("xvm"));
	}
	
	@Test
	void test_2() {
		assertEquals("java", new CeasarCipher().decode("evqv"));
	}
	
	@Test
	void test_3() {
		assertEquals("interview", new CeasarCipher().decode("diozmqdzr"));
	}
}
