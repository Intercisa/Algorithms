package integerreversion;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class IntegerReversionTest {

	
	IntegerReversion intRev = new IntegerReversion();
	
	@Test
	void test_1() {
		assertEquals(4321, intRev.reverse(1234));
	}

	
	

	
	


}
