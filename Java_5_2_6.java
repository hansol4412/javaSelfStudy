package sec03.exam01;
import java.util.Scanner;
public class Java_5_2_6 {

	public static void main(String[] args) {
		// Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ�, �ְ� ���� �� ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	boolean run = true;
	int studentNum = 0;
	int[] score = null;
	Scanner scanner = new Scanner(System.in);
	
	
	while(run)
	{	int count= 0;
		int sum= 0;
		double avg = 0.0;
		int max = 0;
		System.out.println("-------------------------------------------------------");
		System.out.println("1.�л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м�| 5. ����");
		System.out.println("-------------------------------------------------------");
		System.out.print("����>");
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		
		switch(selectNo) {
		case 1:
			System.out.print("�л���>");
			count = Integer.parseInt(scanner.nextLine());
			score = new int[count];
			break;
			
		case 2:
			for (int i =0; i<score.length; i++) {
			System.out.print("score[" + i + "]>" );
			 score[i] = Integer.parseInt(scanner.nextLine());
			}
			break;
		
		case 3:
			for (int i =0; i<score.length; i++) {
					 System.out.println("score[" + i + "]:" + score[i]);
					}
			break;
			
		case 4:
				for (int i =0; i<score.length; i++) {
					 sum+=score[i];
					 if (max<score[i]) {
						 max=score[i];
					 }
					}
				avg = (double)sum/score.length;
				System.out.println("���:"+avg );
				System.out.println("�ְ�����"+max);
			break;
			
		case 5:
				run = false;
	            
		
		}	
		
	}
	System.out.println("���α׷� ����");
	}

}
