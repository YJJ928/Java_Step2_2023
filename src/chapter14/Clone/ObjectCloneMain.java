package chapter14.Clone;

public class ObjectCloneMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30);
		Circle circleCopy = (Circle) circle.clone(); // Circle class에 clone override한 후 해야 함
		// circleCopy가 자식임. 즉 (강제형변환) 업캐스팅해줘야 함
		// 에러나서 throws CloneNotSupportedException 추가해 줌.
		
		System.out.println(circle);
		System.out.println(circleCopy);
		System.out.println("---");
		//hash값
		System.out.println(circle.hashCode());
		System.out.println(circleCopy.hashCode());
		System.out.println("---");
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopy));
		
	}

}
