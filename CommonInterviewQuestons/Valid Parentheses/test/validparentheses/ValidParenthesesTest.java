package validparentheses;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

	@Test
	void test_1() {
		//assertTrue(new ValidParentheses().isValid("()"));
	}
	
	@Test
	void test_2() {
		assertTrue(new ValidParentheses().isValid("()[]{}"));
	}
	
	@Test
	void test_3() {
		//assertFalse(new ValidParentheses().isValid("(]"));
	}
	
	@Test
	void test_4() {
		//assertFalse(new ValidParentheses().isValid("([)]"));
	}
	
	@Test
	void test_5() {
		//assertTrue(new ValidParentheses().isValid("{[]}"));
	}
}
