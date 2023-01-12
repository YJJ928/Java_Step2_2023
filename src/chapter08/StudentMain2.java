package chapter08;

public class StudentMain2 {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		System.out.println("이름:"+studentLee.studentName+", 아이디 : "+studentLee.studentID);
		//Student2.serialNum++;
		
		System.out.println();
		Student2 studentKim = new Student2();
		
		studentKim.setStudentName("김김김");
		System.out.println("이름:"+studentKim.studentName+", 아이디 : "+studentKim.studentID);
		
		Student2 studentPark = new Student2();
		System.out.println();
		studentPark.setStudentName("박박박");
		System.out.println("이름:"+studentPark.studentName+", 아이디 : "+studentPark.studentID);
		System.out.println();
		System.out.println("이름:"+studentLee.studentName+", 아이디 : "+studentLee.studentID);
//		

	}

}
