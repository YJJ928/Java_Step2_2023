package chapter17.TreeSet;

public class MemberTreeSetMain {
	
	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member3 memberPark = new Member3(1003,"박서훤");
		Member3 memberLee = new Member3(1001,"이지훤");
		Member3 memberSon = new Member3(1002,"ㅇㅇㅇ");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		memberTreeSet.showAllMember();
		
	}

}
