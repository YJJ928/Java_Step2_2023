package chapter17;

public class Member2 {
	
	private int memberID;
	private String memberName;
	
	public Member2(int memberID, String memberName) {
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
	public int hashCode() {
//		member.hashCode(); // String이므로 10진수
//		return super.hashCode(); // 10진수 메모리 주소
		//방법1
//		return memberName.hashCode()+memberID; // 이 방법으로 하면 4,1,2,3 순서로 나옴
		//방법2
		return memberID;
	}
	
	//논리적인 값
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2) obj;
			return member.memberName.equals(memberName) && 
					(member.memberID == memberID);
		} else {
			return false;
		}
		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member2) {
//			Member2 member = (Member2) obj;
//			if(this.memberID == member.memberID) {
//				return true;
//			
//			}
//			
//		} return false;
//		
//	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 "+memberID+" 입니다.";
	}

}
