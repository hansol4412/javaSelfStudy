package sec03.exam03;

public class ShopServieExample {

	public static void main(String[] args) {
		// ShopService ��ü�� �̱������� ����� �ͽ��ϴ�. ShopServiceExample Ŭ�������� ShopService��
		//getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
		
		ShopService obj1 = ShopService. getInstance();
		ShopService obj2 = ShopService. getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�");
		} else {
			System.out.println("�ٸ� shopService ��ü�Դϴ�");
		}
		

	}

}
