package chapter09;

public class Child extends Parent{

	@Override //오버라이딩

	public void method2() {
		// 우클릭 - source - override~~클릭
		//super.method2();
		System.out.println("Child - method2");
	}
	
	
	public void method3() {
		// 우클릭 - source - override~~클릭
		//super.method2();
		System.out.println("Child - method3");
	}
	
	
	//오버로딩 - 동일한 이름의 메소드를 중복해서 사용하고 싶을 때 매개변수 종류를 다르게 하여 사용하는 방식..
	//오버라이딩 - 부모의 메소드를 변형해서 사용하고 싶을 때 / 상속시에만 사용 할 수 있다.
	//공통점 = 메소드명을 공통으로...//통일성 다형성
	//차이점 = 오버라이딩은 매개변수 까지 동일하게 할 수 있다.
	
	

}
