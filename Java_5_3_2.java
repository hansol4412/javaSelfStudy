package sec03.exam01;

public class Java_5_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogicResult result = LogicResult.FAIL_PASSWORD;
		
		if(result == LogicResult.SUCCESS)
		{
			System.out.println("성공했습니다");
		}
		else {
			if(result == LogicResult.FAIL_ID){
				System.out.println("아이디가 틀렸습니다.");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		

	}

}
