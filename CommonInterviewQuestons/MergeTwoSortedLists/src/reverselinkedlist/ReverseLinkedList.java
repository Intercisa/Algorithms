package reverselinkedlist;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		return reverse(head, null);
	}
	
	private ListNode reverse(ListNode head, ListNode newHead) {
		if(head == null) return newHead;
		
		ListNode next = head.next;
		head.next = newHead;
		newHead = head;
		head = next;
		
		return reverse(head, newHead); 
	}

	public ListNode reverseListII(ListNode head) {
		if (head == null || head.next == null) return head;

		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		

		return newHead;
	}

	public ListNode reverseListIter(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}