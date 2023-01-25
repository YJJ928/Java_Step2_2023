package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashMap {
	
	private HashMap<Integer, String> hashMap;
	
	public MemberHashMap() { //선언만 해놓은 hashMamp을 선언하자
		
		hashMap = new HashMap<Integer, String>();
	
	}
	
	public void addMember(Member2 member) {
		
		hashMap.put(member.getMemberID(), member.getMemberName());
		
	}
	
	//remove
		public boolean removeMember(int memberID) {
						
			while(hashMap.containsKey(memberID)) {
				hashMap.remove(memberID);
					return true;
			} //if
			
			System.out.println(memberID+"가 존재하지 않습니다.");
			return false;
			
		} //while
			
		//showAllMember
		public void showAllMember() {
			
			Iterator<Integer> ir = hashMap.keySet().iterator();
		
			while(ir.hasNext()) {
				int key = ir.next();
				String member = hashMap.get(key);
				System.out.println(member);
			}
	
		}

}
