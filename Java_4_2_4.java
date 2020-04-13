package sec03.exam01;

public class Java_4_2_4 {

	public static void main(String[] args) {
		
	// 중첩 for문을 이용해 방정식 4x + 5y  = 60의 모든 해를 구해서 (x,y) 형태로 출력해보세요
    // 단 x와 y는 10이하의 자연수이다.
		
	int x = 4;
	int y = 5;
	
	
	for(int a = 1; a <= 10; a++ ){
		for(int b = 1; b<=10; b++) {
			if((x*a+y*b)==60) {
				System.out.println("(" + a + "," + b +")");
			}
		}
		
	}
	
	

	}

}
