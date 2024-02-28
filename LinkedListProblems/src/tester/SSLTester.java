package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static core.SinglyLinkedList.*;

public class SSLTester {
	public static void main(String[] args) {

//		addFirstElement(30);
//		addFirstElement(20);
//		addFirstElement(10);
//		addFirstElement(5);
//		addFirstElement(2);
//		addFirstElement(1);
//		displayList();
		// Test1: Print the middle of given linked list

//		System.out.println("Middle element: "+findMiddleM1());
//		
//		//Test2: Print the middle of linked list using fast and slow pointer
//		
//		System.out.println("Middle element: "+findMiddleM2());
//		System.out.println("Middle element: "+findMiddleM3());

		// reverse the linked list
//		displayList();
//		System.out.println("list in revese");
//		reverseListM2();
//		displayList();

		List<Integer> lists = new ArrayList<>();
		Node head =  new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter element " + (i + 1) + " : ");
			lists.add(sc.nextInt());
		}
		addBulk(head, lists);

		System.out.println("list is sequence");
		displayList(head);
		mNNodes(head, 1, 1);
		System.out.println("list modified");
		displayList(head);

	}
}
