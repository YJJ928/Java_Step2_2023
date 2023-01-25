package chapter18.TreeMap;

import java.util.HashMap;
import java.util.Iterator;
import chapter17.TreeSet.Member3;

public class MemberTreeMap {
	
	private HashMap<Integer, String> treeMap;
	
	public MemberTreeMap() { //선언만 해놓은 hashMamp을 선언하자
		
		treeMap = new HashMap<Integer, String>();
	
	}
	
	public void addMember(Member3 member) {
		
		treeMap.put(member.getMemberID(), member.getMemberName());
		
	}
	
	//remove
		public boolean removeMember(int memberID) {
						
			while(treeMap.containsKey(memberID)) {
				treeMap.remove(memberID);
					return true;
			} //if
			
			System.out.println(memberID+"가 존재하지 않습니다.");
			return false;
			
		} //while
			
		//showAllMember
		public void showAllMember() {
			
			Iterator<Integer> ir = treeMap.keySet().iterator();
		
			while(ir.hasNext()) {
				int key = ir.next();
				String member = treeMap.get(key);
				System.out.println(member);
			}
	
		}

}
