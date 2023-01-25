package chapter17.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("ㅇㅇㅇ");
		treeSet.add("ㄷㄷㄷ");
		
		for(String str : treeSet) { // 순서 맞춰줌 // default : 오름차순
			System.out.println(str);
		}
		
				
		
	}

}
