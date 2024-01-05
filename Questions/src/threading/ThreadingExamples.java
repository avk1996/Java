package threading;

public class ThreadingExamples implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadingExamples());
		thread.start();
		thread.start();
		thread.start();
		System.out.println(thread.getState());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
	}

}
