package mergetwosortedlists;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

	@Test
	void test_1() {
		ListNode headOne =
				new ListNode(1,
						new ListNode(2,
							new ListNode(4)));

		ListNode headTwo =
				new ListNode(1,
						new ListNode(3,
								new ListNode(4)));

		assertEquals(1, new MergeTwoSortedLists().mergeTwoLists(headOne, headTwo).next.val);
	}
}
