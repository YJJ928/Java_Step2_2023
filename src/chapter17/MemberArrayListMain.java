package chapter17;

public class MemberArrayListMain {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박시원");
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.MemberAdd(memberLee);
		memberArrayList.MemberAdd(memberSon);
		memberArrayList.MemberAdd(memberPark);
		memberArrayList.MemberAdd(memberHong);
		
		memberArrayList.MemberShowAll();
		
		memberArrayList.MemberRemove(memberHong.getMemberID());
		
		memberArrayList.MemberShowAll();
		

	}

}
