package numbersubstringscontaining;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NumberofSubstringsContainingAllThreeCharactersTest {

	@Test
	void test_1() {
		assertEquals(10, new NumberofSubstringsContainingAllThreeCharacters().numberOfSubstrings("abcabc"));
	}
	
	@Test
	void test_2() {
		assertEquals(3, new NumberofSubstringsContainingAllThreeCharacters().numberOfSubstrings("aaacb"));
		
		
		
	}


	
	

	
	


}
