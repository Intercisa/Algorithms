package palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PalindromeTest {
	private String test_str_true = "gorog"; 
	private String test_str_false = "asdasdas"; 
	
	Palindrome palindrome = new Palindrome();
	
	@Test
	void test_1() {
		assertEquals(true, palindrome.palindrome3(test_str_true));
	}

	
	
	@Test
	void test_2() {
		assertEquals(false, palindrome.palindrome3(test_str_false));
	}
	
	
	
	@Test
	void test_3() {
		assertEquals(true, palindrome.palindrome1(test_str_true));
	}

	
	
	@Test
	void test_4() {
		assertEquals(false, palindrome.palindrome1(test_str_false));
	}
	
	
	
	@Test
	void test_5() {
		assertEquals(true, palindrome.palindrome2(test_str_true));
	}

	
	
	@Test
	void test_6() {
		assertEquals(false, palindrome.palindrome2(test_str_false));
	}


}
