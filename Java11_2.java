package chap11;

import java.text.*;
import java.util.*;

public class Java11_2 {

	public static void main(String[] args) {
		// Data�� SimpleDataFromat Ŭ������ �̿��Ͽ� �����ǳ�¥�� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��  E����  hh�� mm��");
		String str = sdf.format(date);
		System.out.println(str);
		
		

	}

}
