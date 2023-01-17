package chapter14.String;

public class Example_objectMain {
	
	public static void main(String[] args) {
		
		Example_object v1 = new Example_object();
		v1.setValue("Test");
		// String이지만 이미 Object가 상속되어 있으므로 자동 형변환
		System.out.println(v1.getValue());
		
		//정수(int)로 인자값을 대입
		Example_object v2 = new Example_object();
		v2.setValue(100); // 기본자료형 int = 객체(Object) //오토박싱..!Autoboxing
		System.out.println(v2.getValue());
		
		int i = (int) v2.getValue(); //unboxing
		System.out.println(i+2);
		
	
	}

}
