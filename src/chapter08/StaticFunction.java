package chapter08;

public class StaticFunction {
	
	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수";
	
	public static String getStatic() {
		
		//str1 = "VIP";
		//return str1; 
		//static method는 static만 쓸 수 있다.
		//str1을 static으로 지정해놓지 않아서 안됨!
		
		//str2 = "VIP";
		return str2;
	}
	

}
