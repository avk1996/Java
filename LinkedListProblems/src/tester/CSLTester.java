package tester;

import static core.CircularLinkedList.*;

public class CSLTester {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++)
			addLast(i);
		
		displayList();
	}
}
