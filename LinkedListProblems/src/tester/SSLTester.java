package tester;

import static core.SinglyLinkedList.*;

public class SSLTester {
	public static void main(String[] args) {

//		addFirstElement(30);
//		addFirstElement(20);
//		addFirstElement(10);
		addFirstElement(5);
		addFirstElement(2);
//		addFirstElement(1);
//		displayList();
		//Test1: Print the middle of given linked list

//		System.out.println("Middle element: "+findMiddleM1());
//		
//		//Test2: Print the middle of linked list using fast and slow pointer
//		
//		System.out.println("Middle element: "+findMiddleM2());
//		System.out.println("Middle element: "+findMiddleM3());
		
		//reverse the linked list
		System.out.println("list is sequence");
		displayList();
		System.out.println("list in revese");
		reverseListM2();
		displayList();
		
	}
}
