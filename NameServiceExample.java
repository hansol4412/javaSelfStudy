package sec03.exam03;

public class NameServiceExample {

	public static void main(String[] args) {
		//MemberService Ŭ������ login()�޼ҵ�� logout()�޼ҵ带 �����Ϸ��� �Ѵ�.
		//login()�޼ҵ带 ȣ���� ���� �Ű������� id�� password�� �����ϰ�, logout()�޼ҵ�� id�� �Ű������� ����

		
		NameService nameService = new NameService();
		boolean result = nameService.login("hong","12345");
		if(result)
		{
			System.out.println("�α��� �Ǿ����ϴ�");
			nameService.logout("hong");
		}else {
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�");
		}
		
	}

}
