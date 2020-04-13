package sec03.exam01;

public class Java_4_2_6 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<=4; i++) {
			for (int j = 4; j>0; j--) {
				
				if(i<j) System.out.printf(" ");
				else System.out.print("*");
				
			}
			System.out.print("\n");
		
		}
}
}
