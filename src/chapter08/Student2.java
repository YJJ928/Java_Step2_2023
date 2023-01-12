package chapter08;

public class Student2 {
	
	public static int serialnum=9999;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public Student2() {
		serialnum++;
		this.studentID = serialnum;
//		studentID = ++serialnum;
	}
	public static int getSerialnum() {
		return serialnum;
	}
//	public static void setSerialnum(int serialnum) {
//		Student2.serialnum = serialnum;
//	}
//	public int getStudentID() {
//		return studentID;
//	}
//	public void setStudentID(int studentID) {
//		this.studentID = studentID;
//	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
//	public int getGrade() {
//		return grade;
//	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}

}
