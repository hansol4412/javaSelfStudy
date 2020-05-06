package chap12;

public class MovieThread_interrupted extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			if(Thread.interrupted()) {
				break;
			}
			
		}
		System.out.println("실행종료");
	}
}
