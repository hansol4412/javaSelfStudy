package chap11;

import java.text.*;
import java.util.*;

public class Java11_2 {

	public static void main(String[] args) {
		// Data와 SimpleDataFromat 클래스를 이용하여 오늘의날짜를 다음과 같이 출력하는 프로그램을 작성하시오
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일  E요일  hh시 mm분");
		String str = sdf.format(date);
		System.out.println(str);
		
		

	}

}
