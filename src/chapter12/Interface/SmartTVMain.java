package chapter12.Interface;

public class SmartTVMain {

	public static void main(String[] args) {
		
		SmartTV tv = new SmartTV();
		tv.turnOn();
		tv.setVolume(15);
		tv.setVolume(-2);
		tv.setVolume(7);
		tv.search("www.google.com");
		tv.turnOff();
		System.out.println("-----");	
		
		//Remote 클래스에 정의 되어 있는 메소드만 오버라이딩이 인식되어 사용가능함.
		Remote rc = tv; // new SmartTV();랑 같다
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
//		rc.search("www.google.com"); 
		//Remote에 있지 않아 사용이 불가능하다. 
		
		Searchable rc2 = tv; // new SmartTV();랑 같다
//		rc2.turnOn();
//		rc2.turnOff();
//		rc2.setVolume(3);
		//search에 있는것만 구현이 됨.
		rc2.search("www.naver.com");

	}

}
