package chapter14.String;

public class Student {
	
	int studentID;
	String studentName;
	
	//생성자
	public Student(int studentID, String studentName) {
//		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID+", "+studentName;
	}

	@Override
	public int hashCode() { //물리적 주소
		return studentID;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {// Student가 자식
			Student std = (Student)obj;
			if(studentID == std.studentID) {//비교판단
				return true;
			} else {
				return false;
			}
		}
		return false; // 
	}
	
	

		

	

}
