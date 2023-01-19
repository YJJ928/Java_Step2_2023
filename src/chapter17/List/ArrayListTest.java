package chapter17.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("Oracle");
		list.add("Servlet/JSP");
		list.add(2, "Spring"); // 2번방에 스프링
		list.add("Python");
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		String skill = list.get(2);
//		System.out.println("2 : "+skill);
		
		for(int i = 0 ; i < list.size() ; i++) { //length아니닷
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println(); // spring이 중간에 끼어들었다..servlet을 밀어냈다.
		list.remove(2); //스프링삭제
		list.remove(2); //JSP삭제
		list.remove("Python"); //어딘진 모르지만 파이썬 지워줘
		
		for(int i = 0 ; i < list.size() ; i++) { //length아니닷
			String str = list.get(i);
			System.out.println(i+" : "+str); 
		}//자바랑 오라클만 남아
		
	}
	
}
