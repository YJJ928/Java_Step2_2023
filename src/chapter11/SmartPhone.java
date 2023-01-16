package chapter11;

public class SmartPhone extends Phone{
	
	//부모 클래스의 생성자를 오버로딩 시 기본 생성자를 인식하지 못하므로
	//추상클래스로 정의한다.
	public SmartPhone(String owner) {
		super(owner); // 부모의 클래스를 이용
	}
	
	public void intersearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
	
}
