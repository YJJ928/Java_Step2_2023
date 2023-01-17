package chapter14.String;

public class EqualTest {

	public static void main(String[] args) {
		
		//String Class는 이미 toString으로 재정의 되어있다.
		String str1 = new String("test");
		String str2 = new String("test");
		
		Student studentLee = new Student(100, "ㅇㅇㅇ");
		Student studentLee2 = studentLee; //String str = "자바";
		Student studentSang = new Student(100, "ㅇㅇㅇ");
		
		//동일한 주소의 두 인스턴스 비교 (물리적 논리적 값이 동일)
		
		System.out.println("---동일한 주소의 두 인스턴스 비교---");
		if(studentLee == studentLee2) {
			System.out.println("studentLee == studentLee2 주소가 같다.");
		} else {
			System.out.println("studentLee != studentLee2 주소가 같지않다.");
		}
		
		if(studentLee.equals(studentLee2)) { //내용물 비교
			System.out.println("studentLee == studentLee2 내용물이 같다.");
		} else {
			System.out.println("studentLee != studentLee2 내용물이 같지않다.");
		}
		
		//동일한 주소의 두 인스턴스 비교 (물리적 논리적 값이 동일)
		
		System.out.println("---물리적 주소는 다르지만 논리적 값이 동일(equals)---");
		if(studentLee == studentSang) {
			System.out.println("studentLee == studentSang 주소가 같다.");
		} else {
			System.out.println("studentLee != studentSang 주소가 같지않다.");
		}
		
		if(studentLee.equals(studentSang)) { //내용물 비교
			System.out.println("studentLee == studentSang 내용물이 같다.");
		} else {
			System.out.println("studentLee != studentSang 내용물이 같지않다.");
		}
		System.out.println();
		System.out.println("---데이터 값 출력---");
		System.out.println("studentLee hashcode: "+studentLee.hashCode());
		System.out.println("studentSang hashcode: "+studentSang.hashCode());
		System.out.println();
		
		System.out.println("---데이터 값은 같으나 hash값이 다르므로 재정의가 필요함---");
		System.out.println("studentLee hashcode: "+System.identityHashCode(studentLee));
		System.out.println("studentSang hashcode: "+System.identityHashCode(studentSang));
		System.out.println();
		//hashcode가 재정의 되어있음.
		System.out.println("---String클래스의 실제값 출력---");
		System.out.println("str1의 hashCode: "+str1.hashCode());
		System.out.println("str2의 hashCode: "+str2.hashCode());
		System.out.println();
		System.out.println("str1의 hashCode: "+System.identityHashCode(str1));
		System.out.println("str2의 hashCode: "+System.identityHashCode(str2));
		
		
		
	}
}
