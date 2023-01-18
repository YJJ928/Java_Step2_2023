package chapter15;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		String javaStr = new String("Java "); //heap
		String androidStr = new String(" androidStr"); //heap
		System.out.println(javaStr); //toString 안했는데 왜 값이 나오는가?
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr)); //16진수
		
		System.out.println(androidStr); //toString 안했는데 왜 값이 나오는가?
		System.out.println(androidStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(androidStr)); //16진수
		System.out.println();
		
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); 
		//javaStr의 주소가 바뀜
		
		
		
	}
}
