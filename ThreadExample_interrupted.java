package chap12;

public class ThreadExample_interrupted {

	public static void main(String[] args) {
		Thread thread = new MovieThread_interrupted();
		thread.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		
		thread.interrupt();


	}
}
