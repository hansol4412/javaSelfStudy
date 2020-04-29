package chap11;

import java.util.HashMap;

public class StudentExample {

		public static void main(String[] args) {
			// 객체해시코드 hashCode()
			
			// Student 키로 총점을 저장하는 HashMap객체 생성
			
			HashMap<Student, String> hashMap = new HashMap<Student, String>();
			
			//점수를 저장
			hashMap.put(new Student("1"), "95");
			
			//점수를 읽어옴
			
			String score = hashMap.get(new Student("1"));
			System.out.println("학생들의 총점:" + score);
			
			
		}

	}


