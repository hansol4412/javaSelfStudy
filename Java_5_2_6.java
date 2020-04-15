package sec03.exam01;
import java.util.Scanner;
public class Java_5_2_6 {

	public static void main(String[] args) {
		// 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램을 작성하시오.

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
		System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석| 5. 종료");
		System.out.println("-------------------------------------------------------");
		System.out.print("선택>");
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		
		switch(selectNo) {
		case 1:
			System.out.print("학생수>");
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
				System.out.println("평균:"+avg );
				System.out.println("최고점수"+max);
			break;
			
		case 5:
				run = false;
	            
		
		}	
		
	}
	System.out.println("프로그램 종료");
	}

}
