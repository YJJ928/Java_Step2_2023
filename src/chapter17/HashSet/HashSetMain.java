package chapter17.HashSet;

import java.util.HashSet;

public class HashSetMain {
	
	public static void main(String[] args) {
		
		//equals와 hashcode가 overriding 된 String type
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("임정희"));
		hashSet.add(new String("박형정"));
		hashSet.add(new String("홍연희"));
		hashSet.add(new String("김김김"));
		
		System.out.println(hashSet);
		System.out.println();
		
		hashSet.add(new String("김김김")); 
		System.out.println(hashSet); //중복은 가져오지 않는다! (중복값을 허용하지 않는다.) 순서는 랜덤하게 입력한 순서대로 나열한다.
		System.out.println();
		
	}

}
