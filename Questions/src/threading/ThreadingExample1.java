package threading;

class NewThread extends Thread {
	Thread t;

	// create a constructor to start thread one
	NewThread() {
		t = new Thread(this, "Thread one");
		t.start();
	}

	public void run() {
		try {
			t.join();
			System.out.println(t.getName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadingExample1 {

	public static void main(String[] args) {
		new NewThread();
		System.out.println("hello i am main");
	}

}
