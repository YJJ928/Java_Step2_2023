package chapter19.Lambda;

interface PrintString{
	
	void showString(String str);
	
}

public class TestLambda {
	
	public static void main(String[] args) {
	
		//람다식
		//1)
		PrintString lambdastr = s -> System.out.println(s); // 함수명을 변수명으로 대체
		showMyString(lambdastr); // lamdba가 show~~부르고 거기에 s를 넣을것이다.
		//2)
		PrintString reStr = returnString(); //returnString()메소드안에 있는 람다식 구현부 호출
		reStr.showString("hello ");
		
	}
	
	private static void showMyString(PrintString p) { //매개변수 구현 => p가 body
		
		p.showString("Hello Lambda");

	}
	
	public static PrintString returnString() { //반환값으로 body구현
		
		return s -> System.out.println(s + "world");
		
	}

}
