package sec03.exam01;
import java.util.Scanner;

public class Java_4_2_7 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		outter :while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ���� ");
			System.out.println("-----------------------------------");
			System.out.print("����>");
		int select = Integer.parseInt(scanner.nextLine());
		
			switch(select)
			{
			case 1:
				System.out.print("���ݾ�>");
				int deposit = Integer.parseInt(scanner.nextLine());
				balance += deposit;
				break;
				
			case 2:
				System.out.print("��ݾ�>");
				int withdraw = Integer.parseInt(scanner.nextLine());
				balance -= withdraw;
				break;
				
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
				
			case 4:
				break outter;
			}
		}
		System.out.println("���α׷� ����");
		
	}
	
}
