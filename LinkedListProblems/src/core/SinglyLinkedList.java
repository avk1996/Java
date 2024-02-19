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

	private static int listElements() {
		int listCount = 0;
		if (isEmpty())
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
	public static int findMiddleM1() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty");
		} else if (head.next == null) {
			return head.data;
		} else if (head.next.next == null) {
			return head.next.data;
		} else {
			// 1. count the list elements
			// 2. find the middle position
			int listCount = listElements() / 2;
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

	// Reversing the linked list: using array
	public static void reverseListM1() {
		if (isEmpty())
			throw new RuntimeException("list is empty");
		else {

			int[] array = new int[listElements()];
			Node trav = head;
			int i = 0;
			while (trav != null) {
				array[i] = trav.data;
				trav = trav.next;
				i++;
			}

			head = null;// empty the linked list

			for (i = 0; i < array.length; i++) {
				addFirstElement(array[i]);
			}
		}
	}

	// using following and trailing pointers
	public static void reverseListM2() {
		if (isEmpty())
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
	
}
