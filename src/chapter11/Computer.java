package chapter11;

public abstract class Computer { 
	//밑에 하나라도 추상 메소드(바디 없는)가 있으면
	//class앞에 abstract를 표현해 주어야 함!! -> 추상 클래스...
	
	//추상 메소드 -- body{}가 없다!
	public abstract void display(); //바디{} 가 없어 에러나는 즁...
	//하위 클래스 구현해서 사용하라는 의미...
	public abstract void typing();
	//다형성?
	//
	
	
	//일반 메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	
	
	
	
}
