package sec03.exam01;

public class Java_5_2_4 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� �־��� �迭�� �׸񿡼� �ִ밪�� ���Ͻÿ�.
		
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
