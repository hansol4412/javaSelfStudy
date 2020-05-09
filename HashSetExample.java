package chap13;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;;

public class HashSetExample {

	public static void main(String[] args) {
		// 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 한다
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"조민우"));
		set.add(new Student(1,"오길동"));
		set.add(new Student(3,"오길동"));

		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum +":"+ student.name);
		}
	}

}
