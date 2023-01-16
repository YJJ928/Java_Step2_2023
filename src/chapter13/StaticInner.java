package chapter13;

public class StaticInner {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	//생성자
	
	//메소드
	
	//내부 클래스
	
	static class Inner{ //static class면 아래도 static 만 가능...
		//필드명
		static int d = 1000;
		//디폴트생성자
		//메소드
		public void printData() {
			//a와 b는 static이 아니어서 인식이 불가능. 들어올 수 없다.
			//static은 data영역이고, 나머지 데이터는 stack영역 stack영역인것이 올라갈 수 없다.
//			System.out.println(a);
//			System.out.println(b);
			System.out.println(c);
			System.out.println(c=5000);
			System.out.println(c);

		}
	}
	
	
	public static void main(String[] args) {
		//외부
		
		
//		StaticInner outer = new StaticInner();
////		outer. new Inner();
//		//내부
////		MemberInner.Inner outer = new MemberInner.Inner();
//		
//		StaticInner.Inner inner = new StaticInner().new Inner(); //멤버이너클래스에 이너메소드로 진입한다.
		
		Inner inner = new Inner(); // static이라서 바로 불러 올 수 있다.
		inner.printData();

		StaticInner outer = new StaticInner();
		
	}

}
