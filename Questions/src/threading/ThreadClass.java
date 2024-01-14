package threading;

public class ThreadClass {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("current reference of thread: "+t);
	}
}
