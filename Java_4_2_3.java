package sec03.exam01;

public class Java_4_2_3 {

	public static void main(String[] args) {
		/* while���� Math.random() �޼ҵ带 �̿��� 2���� �ֻ����� ������ �� ������ �� (��1, ��2)���·� ����ϰ�
		 ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������ ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��Ͻÿ�. */
				
				while(true)
				{
					int a = (int)(Math.random() * 6)+1;
					int b = (int)(Math.random() * 6)+1;
					
					System.out.println("(" + a +"," + b + ")");
					
					if ((a+b) == 5) break;
					
						
				}
						
		

	}

}
