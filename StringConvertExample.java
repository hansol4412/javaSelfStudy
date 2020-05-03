package chap11;

public class StringConvertExample {

	public static void main(String[] args) {
		// 문자열 "200"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드를 작성하시오.
		
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);

	}

}
