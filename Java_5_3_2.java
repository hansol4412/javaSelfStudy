package sec03.exam01;

public class Java_5_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicResult result = LogicResult.FAIL_PASSWORD;
		
		if(result == LogicResult.SUCCESS)
		{
			System.out.println("�����߽��ϴ�");
		}
		else {
			if(result == LogicResult.FAIL_ID){
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		

	}

}
