package chap12;

public class MovieThread_interrupted extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			if(Thread.interrupted()) {
				break;
			}
			
		}
		System.out.println("��������");
	}
}
