package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X, Y, MyInterface 클래스 각각의 인스턴스 변수를 선언하여 출력
		MyClass myc = new MyClass();
		
		X myx = myc; // X Class 타입의 인스턴스 변수
		myx.x();
		
		Y myy = myc; // Y Class 타입의 인스턴스 변수
		myy.y();
		
		MyInterface myi = myc;
		myi.x();
		myi.y();
		myi.myMethod();
		
		

	}

}
