package threading;

class NewThreads extends Thread{
	//constructor to invoke threads
	Thread t1,t2;
	NewThreads(){
		t1 = new Thread(this,"Thread_1");
		t2 = new Thread(this,"Thread_2");
		//t1 and t2 are concurrently starts
		t1.start();
		t2.start();
	}
	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t1));
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThreads();
	}

}
