package chapter16.generic1;

public class GenExMain {

	public static void main(String[] args) {
		
		// 사용자가 원하는 형태로 객체 생성
		// Generic 타입의 객체는 기본자료형(int, double, char)을 인식할 수 없다.
		// 오토박싱 하여 사용한다.
		
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//정수
		GenEx<Integer> v2 = new GenEx<Integer>();
		v2.setValue(33);
		System.out.println(v2.getValue());
		
		//실수
		GenEx<Double> v3 = new GenEx<Double>();
		v3.setValue(4.44);
		System.out.println(v3.getValue());
		
		//문자
		GenEx<Character> v4 = new GenEx<Character>();
		v4.setValue('e');
		System.out.println(v4.getValue());
	} //main

} //class GenExMain
