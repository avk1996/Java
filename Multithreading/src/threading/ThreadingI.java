package threading;

public class ThreadingI {
	public static void main(String[] args) {
		StartThreding startThreading1 = new StartThreding();
		startThreading1.start();
		StartThreding startThreding2 = new StartThreding();
		startThreding2.start();
	}
}
// Implement threads using Thread class
class StartThreding extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 8; i++) {
			System.out.println("Thread start "+i);
			try {
				Thread.sleep(500);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
