package chap11;

public class MathRoundExample {

	public static void main(String[] args) {
		
		long v1 = Math.round(5.3);
		long v2 = Math.round(5.7);
		System.out.println(v1);
		System.out.println(v2);
		
		//round함수는 항상 소수점 첫번째 자리에서 반올림하여 정수값리턴
		//원하는 소수 자릿수에서 반올림하기 위해서는 반올림할 자릿수가 소수 첫째자리가 되도록 곱하고 round()리턴 값 후 나눈다
		double value = 12.3456;
		double temp = value*100;
		System.out.println(temp);
		long temp2 = Math.round(temp);
		System.out.println(temp2);
		double v3 = temp2 / 100.0;
		System.out.println(v3);
	}

}
