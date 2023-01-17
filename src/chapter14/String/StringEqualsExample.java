package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strVal1 = new String("홍길동");
		String strVal2 = "홍길동";
		
		if(strVal1 == strVal2) { //외부 메모리가 같은지 비교....주소???를 비교하는것임..
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVal1.equals(strVal2)) {//equals로 내부 연산 가능함~! / 내부를 비교하는 것임
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		//int는 .intvalue()로 unboxing이 되는데 STring은 그게 없어서 equals를 이용함.
		
		
	}

}
