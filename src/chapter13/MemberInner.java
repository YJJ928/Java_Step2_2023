package chapter13;

public class MemberInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//생성자
	
	//메소드
	
	//내부 클래스
	
	class Inner{
		//필드명
		//디폴트생성자
		//메소드
		public void printData() {
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}
	}
	
	
	public static void main(String[] args) {
		//외부
		MemberInner outer = new MemberInner();
//		outer. new Inner();
		//내부
//		MemberInner.Inner outer = new MemberInner.Inner();
		
		MemberInner.Inner inner = new MemberInner().new Inner(); //멤버이너클래스에 이너메소드로 진입한다.
		
		inner.printData();
		
	}

}
