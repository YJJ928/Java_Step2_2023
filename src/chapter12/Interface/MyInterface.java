package chapter12.Interface;

public interface MyInterface extends X, Y{ 
	// 일반 class X, class Y 라면 다중 상속 불가. 
	// interface는 다중 상속이 가능함.
	
	void myMethod();
}
