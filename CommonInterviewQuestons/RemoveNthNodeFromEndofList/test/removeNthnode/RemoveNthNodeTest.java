package removeNthnode;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveNthNodeTest {

	@Test
	void test_1() {
		ListNode actual = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		int expected = new RemoveNthNode().removeNthFromEnd(actual, 2).next.next.next.val;
		
		assertEquals(5, expected);
		
	}
}
