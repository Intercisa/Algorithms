package removeNthnode;

public class RemoveNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		ListNode fast = temp;
		ListNode slow = temp;
		int counter = 0;
		
		while (fast.next != null) {
			fast = fast.next;
			if(++counter >= n+1) slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return temp.next;
	}
	
}
