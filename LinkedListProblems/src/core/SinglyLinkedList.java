package core;

import java.util.List;

public class SinglyLinkedList {
	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

		public Node() {
			this.data = 0;
			this.next = null;
		}
	}

	private static Node head1;
	private static Node head2;

	// empty linked list check
	public static boolean isEmpty(Node head) {
		return head == null;
	}

	// show linked list
	public static int displayList(Node head) {
		int countList = 0;
		if (isEmpty(head)) {
			throw new RuntimeException("linked list empty");
		} else {
			Node trav = head;
			while (trav != null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
		}
		return countList;
	}

	// add elements at first
	public static void addFirstElement(Node head, int data) {
		Node newNode = new Node(data);

		if (isEmpty(head)) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// add last elements
	public static void addLast(Node head, int data) {
		Node newNode = new Node(data);

		if (isEmpty(head)) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	// add all at once
	public static void addBulk(Node head, List<Integer> data) {
		for (int i : data) {
			addLast(head, i);
		}
	}

	private static int listElements(Node head) {
		int listCount = 0;
		if (isEmpty(head))
			throw new RuntimeException("list is empty");
		else {
			listCount = 1;
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
				listCount++;
			}

		}
		return listCount;
	}

	// find middle of linked list method1 time complexity O(n) and space comlexity
	// O(1)
	public static int findMiddleM1(Node head) {
		if (isEmpty(head)) {
			throw new RuntimeException("list is empty");
		} else if (head.next == null) {
			return head.data;
		} else if (head.next.next == null) {
			return head.next.data;
		} else {
			// 1. count the list elements
			// 2. find the middle position
			int listCount = listElements(head) / 2;
			Node middle = head;
			// 3. traverse till middle position
			for (int pos = 1; pos <= listCount; pos++) {
				middle = middle.next;
			}
			return middle.data;
		}
	}

	// find the middle of linked list method2 O(n) and O(1) using fast and slow
	// pointer
	public static int findMiddleM2(Node head) {
		Node slow = head;
		if (isEmpty(head)) {
			throw new RuntimeException("list is empty");
		} else {
			Node fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return slow.data;
	}

	// find the middle of linked list method3
	public static int findMiddleM3(Node head) {
		Node mid = head;
		if (isEmpty(head)) {
			throw new RuntimeException("list is empty");
		} else {
			int i = 1;
			while (head != null) {
				if (i % 2 == 0) {
					mid = mid.next;
				}
				++i;
				head = head.next;
			}
		}
		return mid.data;
	}

	// Reversing the linked list: using array
	public static void reverseListM1(Node head) {
		if (isEmpty(head))
			throw new RuntimeException("list is empty");
		else {

			int[] array = new int[listElements(head)];
			Node trav = head;
			int i = 0;
			while (trav != null) {
				array[i] = trav.data;
				trav = trav.next;
				i++;
			}

			head = null;// empty the linked list

			for (i = 0; i < array.length; i++) {
				addFirstElement(head, array[i]);
			}
		}
	}

	// using following and trailing pointers
	public static void reverseListM2(Node head) {
		if (isEmpty(head))
			throw new RuntimeException("list is empty");
		else {
			Node trav1 = null;
			Node trav2 = head;
			Node trav3 = head.next;
			while (trav2 != null) {
				trav2.next = trav1;
				trav1 = trav2;
				trav2 = trav3;
				if (trav3 == null)
					break;
				trav3 = trav3.next;
				head = trav2;
			}
		}
	}

	// reverse linked list using recursion

	// rotate a linked list using brute force: doesn't work for large numbers
	public Node rotateRight1(Node head, int k) {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			return head;
		} else {
			for (int i = 0; i < k; i++) {
				Node trav = head;
				while (trav.next.next != null) {
					trav = trav.next;
				}
				Node newNode = new Node(trav.next.data);
				trav.next = null;
				newNode.next = head;
				head = newNode;
			}
			return head;
		}
	}

	// works for large numbers
	public Node rotateRight2(Node head, int k) {
		int listSize = listSize(head);
		if (head == null || listSize == 0) {
			return null;
		} else if (listSize == 1) {
			return head;
		} else {
			k = k % listSize;
			for (int i = 0; i < k; i++) {
				Node trav = head;
				while (trav.next.next != null) {
					trav = trav.next;
				}
				Node newNode = new Node(trav.next.data);
				trav.next = null;
				newNode.next = head;
				head = newNode;
			}
			return head;
		}
	}

	public static int listSize(Node head) {
		if (isEmpty(head)) {
			return 0;
		}
		Node trav = head;

		int lSize = 1;

		while (trav.next != null) {
			trav = trav.next;
			++lSize;
		}
		return lSize;
	}

	// find the Nth node from last
	public static int lastNthNode(Node head, int n) {
		if (isEmpty(head)) {
			throw new RuntimeException("List is empty");
		} else {
			Node trav = head;
			int lSize = listSize(head);

			lSize = n - lSize;
			for (int i = 0; i < lSize; i++) {
				trav = trav.next;
			}
			return trav.data;
		}
	}

	public int listSize1(Node head) {
		int count = 1;
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
			++count;
		}
		return count;
	}

	public Node removeLast(Node head) {
		Node trav = head;
		while (trav.next.next != null) {
			trav = trav.next;
		}
		trav.next = null;
		return head;
	}

	public Node removeFirst(Node head) {
		head = head.next;
		return head;
	}

	public Node removeNthFromEnd(Node head, int n) {
		int lSize = listSize(head);
		if (isEmpty(head)) {
			return null;
		} else if (head.next == null) {
			return null;
		} else if (lSize == n) {
			return removeFirst(head);
		} else {
			Node trav = head;

			lSize = lSize - n;

			for (int i = 0; i < lSize - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			return head;
		}
	}

	// swapping the pairs in linked list
	public static Node NodeswapPairs(Node head) {

		if (isEmpty(head) || head.next == null)
			return head;
		else {
			Node trav = head;
			while (trav != null) {
				if (trav.next == null)
					break;
				int temp = trav.data;
				trav.data = trav.next.data;
				trav.next.data = temp;
				trav = trav.next.next;
			}
			return head;
		}
	}

	// removing the middle of element
	public Node deleteMiddle(Node head) {

		if (isEmpty(head)) {
			return head;
		} else if (head.next == null) {
			return null;
		} else {
			int middleList = listSize(head) / 2;
			Node trav = head;
			for (int i = 1; i < middleList; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
			return head;
		}
	}

	// removing duplicates
	public Node deleteDuplicates(Node head) {
		Node trav = head;
		Node follow = head;

		if (isEmpty(head) || head.next == null) {
			return head;
		} else {
			while (trav.next != null) {
				int target = trav.data;

				if (target == trav.next.data) {
					trav.next = trav.next.next;
				} else {
					trav = trav.next;
				}
			}

			return head;
		}
	}

	// find loop in a list
	public boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head;

		if (head == null) {
			return false;
		} else {
			while (slow != null && fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
				if (slow == fast)
					return true;
			}
		}
		return false;
	}

	// Delete N nodes after M nodes of a linked list
	public static void mNNodes(Node head, int m, int n) {
		if (isEmpty(head)) {
			throw new RuntimeException("list is empty");
		} else {
			Node trav = head;
			Node follow = null;
			while (trav != null) {
				for (int i = 0; i < m; i++) {
					follow = trav;
					trav = trav.next;
				}
				for (int i = 0; i < n; i++) {
					follow.next = trav.next;
					trav = trav == null ? null : follow.next;
				}
			}
		}
	}

	// Merge a linked list into another linked list at alternate positions
	public static Node merge2Lists(Node head1, Node head2) {
		Node newNode = new Node();
		if (isEmpty(head1) && isEmpty(head2))
			return null;
		else if (isEmpty(head1))
			return head2;
		else if (isEmpty(head2))
			return head1;
		else {
			int s1 = listSize(head1);
			int s2 = listSize(head2);
			int itr = s1 > s2 ? s1 : s2;
			for (int i = 0; i < itr; i++) {
				if(head1!=null) {
					addLast(newNode, head1.data);
					head1 = head1.next;
				}
				if(head2!=null) {
					addLast(newNode, head2.data);
					head2 = head2.next;
				}
			}
		}
		return newNode.next;
	}
}
