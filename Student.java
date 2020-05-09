package chap13;

public class Student {

	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//�л���ȣ�� �ٸ��� �����Ѵ�. 
	@Override
	public int hashCode() {
		return studentNum ;
		
	}
	
	
	/*@Override
	public boolean equals(Object obj){
		if((obj instanceof Student)) {
			Student student = (Student)obj;
			//�л��̸����� ������� �л� ��ȣ�� �ٸ��� �������� �ʴ´�.
			//name�� true�� false���� studentNum ������ ������ true => ����x 
			return (student.studentNum==studentNum)||(student.name.equals(name));
		}
		else {
			return false;
		}
		*/
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false; 
		Student student = (Student)obj;
		if(!(student.studentNum == studentNum)) return false;
		//�л���ȣ �ٸ��� false�� ����, �л���ȣ ������ ������ true�� ���� ����
		return true;
		
	}
}
