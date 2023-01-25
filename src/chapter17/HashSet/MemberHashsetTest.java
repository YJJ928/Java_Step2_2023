package chapter17.HashSet;

import chapter17.Member2;

public class MemberHashsetTest {
	
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
				
		Member2 memberLee = new Member2(1001, "aaa");
		Member2 memberSon = new Member2(1002, "bbb");
		Member2 memberPark = new Member2(1003, "ccc");
		Member2 memberHong = new Member2(1004, "ddd");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		System.out.println();
		//방법1
		Member2 memberKim = new Member2(1004, "eee");
		
		//방법2
//		Member2 memberKim = new Member2(1005, "eee");
		
//		memberHashSet.removeMember(memberKim.getMemberID());
		memberHashSet.addMember(memberKim);
		
		memberHashSet.showAllMember();
		System.out.println();
		
		Member2 memberyy = new Member2(1002, "fff");
		memberHashSet.addMember(memberyy);
				
		memberHashSet.showAllMember();
		System.out.println();
	}

}
