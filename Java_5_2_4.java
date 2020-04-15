package sec03.exam01;

public class Java_5_2_4 {

	public static void main(String[] args) {
		// for문을 이용하여 주어진 배열의 항목에서 최대값을 구하시오.
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int i = 0; i<=4; i++) {
							
				if(array[i] >= max)
				{
					max = array[i];
				}
						
		}
		
		System.out.println("max:" + max);

	}

}
