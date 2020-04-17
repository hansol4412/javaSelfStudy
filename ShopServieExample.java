package sec03.exam03;

public class ShopServieExample {

	public static void main(String[] args) {
		// ShopService 객체를 싱글톤으로 만들고 싶습니다. ShopServiceExample 클래스에서 ShopService의
		//getInstance() 메소드로 싱글톤을 얻을 수 있도록 코드를 작성하시오.
		
		ShopService obj1 = ShopService. getInstance();
		ShopService obj2 = ShopService. getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다");
		} else {
			System.out.println("다른 shopService 객체입니다");
		}
		

	}

}
