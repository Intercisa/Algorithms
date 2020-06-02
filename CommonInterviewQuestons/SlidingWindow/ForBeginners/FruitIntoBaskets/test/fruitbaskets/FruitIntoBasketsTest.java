package fruitbaskets;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FruitIntoBasketsTest {

	@Test
	void test_1() {
		assertEquals(3, new FruitIntoBaskets().totalFruit(new int[] {1,2,1}));
	}
	
	@Test
	void test_2() {
		assertEquals(3, new FruitIntoBaskets().totalFruit(new int[] {0,1,2,2}));

	}
	
	@Test
	void test_3() {
		assertEquals(4, new FruitIntoBaskets().totalFruit(new int[] {1,2,3,2,2}));
		
	}
	@Test
	void test_4() {
		assertEquals(5, new FruitIntoBaskets().totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
		
	}


	
	

	
	


}
