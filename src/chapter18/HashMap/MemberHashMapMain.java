package chapter18.HashMap;

import chapter17.Member2;


public class MemberHashMapMain {
	
	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//가방에 넣을 Member data
		Member2 memberLee = new Member2(1003, "이지원");
		Member2 memberSon=new Member2(1005, "손민국");
		Member2 memberPark=new Member2(1004, "박서연");
		Member2 memberHong=new Member2(1002, "홍길동");
	
		
		//가방 넣기
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(new Member2(1001, "이민정"));
		memberHashMap.addMember(new Member2(1002, "ㅊㅊ"));
		
		memberHashMap.showAllMember();
		
	}

}
