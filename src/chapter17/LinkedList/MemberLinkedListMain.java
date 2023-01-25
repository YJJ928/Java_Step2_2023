package chapter17.LinkedList;

import chapter17.Member;

public class MemberLinkedListMain {
	
	public static void main(String[] args) {
		
		//순서 OK, 중복 OK
		MemberLinkedList memberLinkedList = new MemberLinkedList();
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박시원");
		Member memberHong = new Member(1004, "홍길동");
		
		//팀원들의 정보
		memberLinkedList.addMember(memberLee);
		memberLinkedList.addMember(memberSon);
		memberLinkedList.addMember(memberPark);
		memberLinkedList.addMember(memberHong);
		memberLinkedList.showAllMember();
		System.out.println();
		
		
		Member memberKim = new Member(1003, "김김김");
		memberLinkedList.addMember(memberKim);
		memberLinkedList.showAllMember(); // 아이디 겹쳐도 그냥 들어가게 됨
		System.out.println(); 
		
	}

}
