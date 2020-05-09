package anagram;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class AnagramProblemTest {
	private String test_str_1 = "restful"; 
	private String test_str_2 = "fluster"; 
	
	AnagramProblem anagram = new AnagramProblem();
	
	@Test
	void test_1() {
		assertEquals(true, anagram.anagramWithArray(test_str_1, test_str_2));
	}
	
	
	@Test
	void test_2() {
		assertEquals(false, anagram.anagramWithArray(test_str_1, "notgood"));
	}

	
	
	@Test
	void test_3() {
		assertEquals(true, anagram.anagramWithSort(test_str_1, test_str_2));
	}
	
	
	@Test
	void test_4() {
		assertEquals(false, anagram.anagramWithSort(test_str_1, "notgood"));
	}
	
	


}
