package chap11;

public class MathRoundExample {

	public static void main(String[] args) {
		
		long v1 = Math.round(5.3);
		long v2 = Math.round(5.7);
		System.out.println(v1);
		System.out.println(v2);
		
		//round�Լ��� �׻� �Ҽ��� ù��° �ڸ����� �ݿø��Ͽ� ����������
		//���ϴ� �Ҽ� �ڸ������� �ݿø��ϱ� ���ؼ��� �ݿø��� �ڸ����� �Ҽ� ù°�ڸ��� �ǵ��� ���ϰ� round()���� �� �� ������
		double value = 12.3456;
		double temp = value*100;
		System.out.println(temp);
		long temp2 = Math.round(temp);
		System.out.println(temp2);
		double v3 = temp2 / 100.0;
		System.out.println(v3);
	}

}
