package problems;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

class Solution {
	// problem: split linked list in parts
	public ListNode[] splitListToParts(ListNode head, int k) {
		int listSize = listSize(head);

		ListNode[] listNode = new ListNode[k];
		ListNode trav = head;
		ListNode track = head;
		ListNode curr = head;

		int split = k / listSize;

		for (int i = 0; i < k; i++) {
			listNode[i] = curr;

			if (split > 0) {
				int temp = i == 0 ? 1 : 0;

				for (int j = 1; j < split + temp; j++) {
					trav = trav.next;
				}
				if (trav.next == null)
					break;
				track = trav.next;
				trav.next = null;

				curr = track;
				trav = track;

			} else {
				track = trav.next;
				if (trav.next != null)
					trav.next = null;
				else
					track = null;

				curr = track;
				trav = track;
			}
		}

		return listNode;
	}

	public int listSize(ListNode head) {
		int size = 1;
		while (head != null) {
			head = head.next;
			size++;
		}
		return size;
	}
}