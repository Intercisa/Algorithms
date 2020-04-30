package linearandbinarysearch;

import org.junit.jupiter.api.Test;

import towersofhanoi.TowersOfHanoi;

class TowersOfHanoiTest {

	TowersOfHanoi towersHanoi = new TowersOfHanoi();
	
	@Test
	void test_1() {
		towersHanoi.towerOfHanoi(3, 'A', 'B', 'C');
	}
}
