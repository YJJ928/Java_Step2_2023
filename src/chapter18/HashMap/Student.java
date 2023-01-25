package chapter18.HashMap;

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		return false; //위에 if에서 일치하지 않는다고? 그럼 false
	}

	@Override
	public String toString() {
		return "학번 "+sno+" 번, 이름 "+name+" 님의 점수";
	}
	
	
	

}
