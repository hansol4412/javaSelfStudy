package chap11;

import java.util.HashMap;

public class StudentExample {

		public static void main(String[] args) {
			// ��ü�ؽ��ڵ� hashCode()
			
			// Student Ű�� ������ �����ϴ� HashMap��ü ����
			
			HashMap<Student, String> hashMap = new HashMap<Student, String>();
			
			//������ ����
			hashMap.put(new Student("1"), "95");
			
			//������ �о��
			
			String score = hashMap.get(new Student("1"));
			System.out.println("�л����� ����:" + score);
			
			
		}

	}


