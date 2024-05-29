package threading;

public class ThreadingII {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new StartThreadingI());
		Thread thread2 = new Thread(new StartThreadingI());
		thread1.start();
		thread2.start();
	}

}

// Threading using runnable interface
class StartThreadingI implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("Thread start " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}