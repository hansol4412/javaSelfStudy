package chap11;

public class StringConvertExample {

	public static void main(String[] args) {
		// ���ڿ� "200"�� ������ ��ȯ�ϴ� �ڵ�� ���� 150�� ���ڿ��� ��ȯ�ϴ� �ڵ带 �ۼ��Ͻÿ�.
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);

	}

}
