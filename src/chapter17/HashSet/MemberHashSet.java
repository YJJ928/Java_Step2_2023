package chapter17.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashSet {
	
	private HashSet<Member2> hashSet;
	
	//생성자
	public MemberHashSet() {
		hashSet = new HashSet<Member2>();
	}
	
	//add method
	public void addMember(Member2 member) {
		hashSet.add(member);
	}
	
	//remove
	public boolean removeMember(int memberID) {
		Iterator<Member2> it = hashSet.iterator();
		
		
		while(it.hasNext()) {
			Member2 member = it.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				hashSet.remove(member);
				return true;
				
			} //if
			
		} //while
		
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	
	//showAllMember
	public void showAllMember() {
		for(Member2 member : hashSet)
			System.out.println(member);
	}
	

}
