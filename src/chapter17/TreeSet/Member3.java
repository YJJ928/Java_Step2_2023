package chapter17.TreeSet;

import java.util.Comparator;

//public class Member3 implements Comparable<Member3>{
	//@overiding할 때 compareTo로 가져올 때
public class Member3 implements Comparator<Member3>{
	//@overiding 할 때 compare(o,o)로 가져올 때
	
	private int memberID;
	private String memberName;
	
	public Member3() {}

	public Member3(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 "+memberID+" 입니다.";
	}
	
	@Override
	public int hashCode() {
//		member.hashCode(); // String이므로 10진수
//		return super.hashCode(); // 10진수 메모리 주소
		//방법1
//		return memberName.hashCode()+memberID;
		//방법2
		return memberID;
	}
	
	//논리적인 값
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member2) {
//			Member2 member = (Member2) obj;
//			return member.memberName.equals(memberName) && 
//					(member.memberID == memberID);
//		} else {
//			return false;
//		}
//		
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member3) {
			Member3 member = (Member3) obj;
			if(this.memberID == member.memberID) {
				return true;
			
			}
			
		} return false;
		
	}

	
	//Comparable를 사용하여 반환
//	@Override
//	public int compareTo(Member3 member) {
//		return (this.memberID - member.memberID)*-1; // 내림차순으로 정렬
//	}

	
	
	//Comparator를 사용하여 반환
	@Override
	public int compare(Member3 member1, Member3 member2) { 
		// 인자 두개를 비교해서 반환하겠다.
		return (member1.memberID - member2.memberID); //오름차순으로 정렬
	}
	
	
	
	

}
