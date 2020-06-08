package partitionequalsubsetsum;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PartitionEqualSubsetSumTest {

	@Test
	void test_1() {
			assertEquals(true, new PartitionEqualSubsetSum().canPartition(new int[] {1, 5, 11, 5}));
	}
	
	@Test
	void test_2() {
			assertEquals(false, new PartitionEqualSubsetSum().canPartition(new int[] {1, 2, 3, 5}));
	}
}
