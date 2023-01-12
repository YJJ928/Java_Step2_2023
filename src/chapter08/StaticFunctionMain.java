package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
//		StaticFunction st = new StaticFunction();
//		System.out.println(st.str2);
//		String ss = st.getStatic();
//		System.out.println(ss);
		
		//경고창이 뜸...왜지? 
		String str;
		str = StaticFunction.getStatic();
		System.out.println(str);
		//static method는 클래스 명으로 접근이 가능....!
	}

}
