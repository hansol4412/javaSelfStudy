package chap13;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;;

public class HashSetExample {

	public static void main(String[] args) {
		// �й��� ������ ������ Student��� �����ϰ� �ߺ� ������ ���� �ʵ��� �Ѵ�
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"ȫ�浿"));
		set.add(new Student(2,"���ο�"));
		set.add(new Student(1,"���浿"));
		set.add(new Student(3,"���浿"));

		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum +":"+ student.name);
		}
	}

}
