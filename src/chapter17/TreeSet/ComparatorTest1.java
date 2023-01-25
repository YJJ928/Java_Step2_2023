package chapter17.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;




public class ComparatorTest1 {
	
	public static void main(String[] args) {
		
		//default로 오버라이딩 되어있는 String / Integer
		
		Set<String> set = new TreeSet<String>();
		set.add("aaa");
		set.add("eee");
		set.add("ccc");
		
		System.out.println(set);
		
		
		
		
		
	}

}
