package sec03.exam01;

public class Java_4_2_4 {

	public static void main(String[] args) {
		
	// ��ø for���� �̿��� ������ 4x + 5y  = 60�� ��� �ظ� ���ؼ� (x,y) ���·� ����غ�����
    // �� x�� y�� 10������ �ڿ����̴�.
		
	int x = 4;
	int y = 5;
	
	
	for(int a = 1; a <= 10; a++ ){
		for(int b = 1; b<=10; b++) {
			if((x*a+y*b)==60) {
				System.out.println("(" + a + "," + b +")");
			}
		}
		
	}
	
	

	}

}
