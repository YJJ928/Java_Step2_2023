package chapter17.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		//리스트 구조를 갖는 ArrayList클래스의 객체생성
		List<String> ls = new ArrayList<String>();
//		String[] ls1 = {};  //배열: String[] ls1 = {};
		ls.add("Hi");
		ls.add("Happy");
		ls.add("Nice");
		
//		int size;
		
		for(int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		} //ls.get(i)다음에 주소가 나온다면 .toString()을 추가해주면 됨.
		System.out.println();
		System.out.println("---데이터 추가 후---");
		ls.add(3, "Good");
		for(int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("---데이터 삭제 후---");
		ls.remove(0);
		for(int i = 0 ; i < ls.size() ; i++) {
			System.out.println(i+" : "+ls.get(i).toString());
		}
		
	}

}
