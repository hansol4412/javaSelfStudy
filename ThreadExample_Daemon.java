package chap12;

public class ThreadExample_Daemon {

	public static void main(String[] args) {
		
		Thread daemon = new MovieThread_Daemon();
		 //MovieThread_Daemon daemon = new MovieThread_Daemon();
		daemon.setDaemon(true);
		daemon.start();
		
		try{ Thread.sleep(1000); } catch(InterruptedException e) {}
	}
	

}
