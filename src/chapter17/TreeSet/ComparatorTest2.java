package chapter17.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
//		return (s1.compareTo(s2));
		return (s1.compareTo(s2))*-1; // *-1: 내림차순으로 정렬해라..
	}
	
}

public class ComparatorTest2 {
	
	public static void main(String[] args) {
		//오름차순
//		Set<String> set = new TreeSet<String>(); // 일반적인 오름차순 순서
		Set<String> set = new TreeSet<String>(new MyCompare()); // 내림차순 순서
		
		set.add("aaa");
		set.add("eee");
		set.add("vvv");
		set.add("bbb");
		
		System.out.println(set); //정렬되어 나옴.
		
	}

}
