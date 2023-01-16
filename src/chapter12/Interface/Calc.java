package chapter12.Interface;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = 999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //private method 호출
	}
	
	static int total(int[] arr) {
		int total = 0;
		 
		for(int i : arr) { //배열은 확장for문이 편리..
			total += i;
		}
		myStaticMethod(); // private method호출
		return total;
	}

	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
	
	//인터페이스 - 뼈대를 만들어놓음
	//인터페이스 요소
	
//	추상메서드: 바디가 없는 메서드로 무조건 재정의 / 자바 8부터 제공이 됨
//	디폴트 메서드: 기본 수행문을 가질수 있으며, 재정의를 할 수 있다.
//	정적 메서드: 객체 생성과 관계없이 인터페이스 타입(클래스명)으로 사용할 수 잇다.
//	private 메소드: 인터페이스를 구현한 클래스에서만 사용가능하고 재정의 할 수 없다.
//  overriding도 안됨.. 호출은 할 수 있는데 재구성이 안됨

}
