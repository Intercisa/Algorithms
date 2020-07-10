package reverselinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

	@Test
	void test_1() {
		ListNode root = new ListNode(1, 
				new ListNode(2, 
						new ListNode(3, 
								new ListNode(4, 
										new ListNode(5)))));
		
		assertEquals(5, new ReverseLinkedList().reverseList(root).val);
	}
}
