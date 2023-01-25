package chapter17.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import chapter17.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> linkedList;
	
	//생성자
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
//	LinkedList<Member> linkedList = new LinkedList<Member>();
	
	//add method
	public void addMember(Member member) {
		linkedList.add(member);
	}
	
	//remove
	public boolean removeMember(int memberID) {
		Iterator<Member> it = linkedList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				linkedList.remove(member);
				return true;
				
			} //if
			
		} //while
		
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	
	//showAllMember
	public void showAllMember() {
		for(Member member : linkedList)
			System.out.println(member);
	}
	

}
