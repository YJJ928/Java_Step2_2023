package chapter17.HashSet;

import java.util.HashSet;
import java.util.Set;

import chapter17.Member;

public class MemberHashSetMain {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		set.add(new Member(30, "홍길동"));
		
		System.out.println("총 객체수: "+set.size());
		
		
	}

}
