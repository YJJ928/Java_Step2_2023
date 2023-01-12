package chapter08;

import javax.swing.JOptionPane;

public class StudentMain {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		System.out.println();
		studentLee.setStudentName("이재민");
		Student1.serialNum++;
		//studentLee.studentID = Student1.serialNum;
		System.out.println(Student1.getSerialNum());
		System.out.println("이름:"+studentLee.studentName+", 아이디 : "+studentLee.studentID);
		
		Student1 studentKim = new Student1();
		System.out.println();
		studentKim.setStudentName("김김김");
		Student1.serialNum++;
		//studentKim.studentID = Student1.serialNum;
		System.out.println(Student1.getSerialNum());
		System.out.println("이름:"+studentKim.studentName+", 아이디 : "+studentKim.studentID);
		
		Student1 studentPark = new Student1();
//		System.out.println(studentPark.studentName);
		System.out.println();
		//studentPark.studentID = Student1.serialNum;
		studentPark.setStudentName("박박박");
		Student1.serialNum++;
		System.out.println(Student1.getSerialNum());
		System.out.println("이름:"+studentPark.studentName+", 아이디 : "+studentPark.studentID);
		
	}

}
