package core;

public class SinglyLinkedList {
	static private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private static Node head;

	// empty linked list check
	public static boolean isEmpty() {
		return head == null;
	}

	// show linked list
	public static int displayList() {
		int countList = 0;
		if (isEmpty()) {
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
	public static void addFirstElement(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// find middle of linked list method1 time complexity O(n) and space comlexity
	// O(1)
	public static int findMiddleM1() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		} else if (head.next == null) {
			return head.data;
		} else if (head.next.next == null) {
			return head.next.data;
		} else {
			// 1. count the list elements
			Node trav = head;
			int listCount = 1;
			while (trav.next != null) {
				trav = trav.next;
				listCount++;
			}
			// 2. find the middle position
			listCount = listCount / 2;
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
	public static int findMiddleM2() {
		Node slow = head;
		if (isEmpty()) {
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
	public static int findMiddleM3() {
		Node mid = head;
		if (isEmpty()) {
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
}
