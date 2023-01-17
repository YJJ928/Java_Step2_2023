package chapter14.String;

public class StringTest {

	public static void main(String[] args) {
		
		String str = "";
		String str1 = "Hi ";
		String str2 = "Hello";
		
		System.out.println(System.identityHashCode(str1)); // 해쉬태그값 반환...주소임
		str = str1 + str2;
		System.out.println(System.identityHashCode(str1)); // 주소 같음..
		System.out.println(str);
		System.out.println();
		
		//str1의 다른 주소 생성
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 주소 달라짐..
		System.out.println(str1);
		
		//str1의 다른 주소 생성
		str = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 주소 안바뀜
		System.out.println(str1);
		
		System.out.println("str 글자수: "+str.length());
		System.out.println("str1 글자수: "+str1.length());
		System.out.println("str2 글자수: "+str2.length());
		
		System.out.println("str1 i글자위치: "+str1.indexOf('i'));
		System.out.println("str2 i글자위치: "+str2.indexOf('i'));
		
		System.out.println("str1 모두 소문자로: "+str1.toLowerCase());
		System.out.println("str2 모두 소문자로: "+str2.toLowerCase());
		
		System.out.println("str1 모두 대문자로: "+str1.toUpperCase());
		System.out.println("str2 모두 대문자로: "+str2.toUpperCase());
			
	}

}
