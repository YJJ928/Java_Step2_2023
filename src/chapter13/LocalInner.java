package chapter13;

public class LocalInner {
	
	int a = 100;
	//innerTest 함수 정의
	public void innerTest(int n) {
		int b = 200;
		final int c = n; // 상수
		
		//innerTest()함수 내부에 지역클래스 작성
		class Inner{
			//Local 내부 클래스는 외부 클래스의 멤버변수와 상수들만 접근 할 수 있다.
			public void getData() {
				System.out.println("int a: "+a);
				System.out.println("int b: "+b);
				System.out.println("int c: "+c);
			}
		} // class Inner
		//함수 내부에 있는 클래스라고 해도 함수 호출시 결과 나오지 않음
		//객체를 만들어서 사용해야 함..
		Inner i = new Inner();
		i.getData();
	} // innerTest(int n) method
	
	public static void main(String[] args) {//main
		LocalInner outer = new LocalInner();
		outer.innerTest(0);
		
	}
}
