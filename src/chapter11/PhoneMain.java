package chapter11;

public class PhoneMain {

	public static void main(String[] args) {
		
//		Phone phone = new Phone();
		//추상클래스
		
		SmartPhone smartPhone = new SmartPhone("김씨");
		
		System.out.println(smartPhone.owner + "님");
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.intersearch();
		
		
		
	}

}
