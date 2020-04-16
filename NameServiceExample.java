package sec03.exam03;

public class NameServiceExample {

	public static void main(String[] args) {
		//MemberService 클래스에 login()메소드와 logout()메소드를 선언하려고 한다.
		//login()메소드를 호출할 때는 매개값으로 id와 password를 제공하고, logout()메소드는 id만 매개값으로 제공

		
		NameService nameService = new NameService();
		boolean result = nameService.login("hong","12345");
		if(result)
		{
			System.out.println("로그인 되었습니다");
			nameService.logout("hong");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다");
		}
		
	}

}
