package tester;

import static core.Queue.*;

import java.util.Scanner;

public class QueueTest {
	public static void main(String[] args) {
				
//				displayQueue();
				enqueue(10);
				enqueue(20);
				enqueue(30);
				enqueue(40);
				displayQueue();
				System.out.println();
				dequeue();
				dequeue();
				dequeue();
				dequeue();
				displayQueue();
				

	}
}
