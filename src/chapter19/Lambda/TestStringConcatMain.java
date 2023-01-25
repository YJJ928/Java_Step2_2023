package chapter19.Lambda;

public class TestStringConcatMain {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		//인스턴스 방식
		System.out.println("---인스턴스 방식---");
		
		StringConcatImple sci = new StringConcatImple();
		sci.makeString(s1, s2);
		
		
		//람다 방식
		System.out.println("---람다 방식---");
		
		StringConcat sc = (s, v) -> System.out.println(s+", "+v);
		sc.makeString("Hello","world");
		
		
		//익명의 내부클래스방식
		System.out.println("---익명의 내부 클래스 방식---");
		
		StringConcat concat3 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		
		concat3.makeString(s1, s2);
		
	}

}
