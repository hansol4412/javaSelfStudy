package chap13;

public class Student {

	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	//학생번호가 다르면 저장한다. 
	@Override
	public int hashCode() {
		return studentNum ;
		
	}
	
	
	/*@Override
	public boolean equals(Object obj){
		if((obj instanceof Student)) {
			Student student = (Student)obj;
			//학생이름과는 상관없이 학생 번호가 다르면 저장하지 않는다.
			//name이 true나 false여도 studentNum 같으면 무조전 true => 저장x 
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
		//학생번호 다르면 false로 저장, 학생번호 같으면 무조건 true로 저장 안함
		return true;
		
	}
}
