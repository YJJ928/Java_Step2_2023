package chapter17;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		//heap 생성
		arrayList = new ArrayList<Member>();
		
	}
	//arrayList에 add하는 method
	public void MemberAdd(Member member) {
		arrayList.add(member);
	}
	
	//arrayList에 remove하는 method
	public boolean MemberRemove(int memberID) {
		Iterator<Member> it = arrayList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
		
	}
	
	//arrayList 정보출력 method
	public void MemberShowAll() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	} 
}
