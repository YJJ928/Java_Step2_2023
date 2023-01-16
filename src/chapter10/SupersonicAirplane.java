package chapter10;

public class SupersonicAirplane extends Airplane{
	
	//NORMAL = 1
	//SUPERSONIC = 2
	//필드(전역변수(static), 변경할 수 없게(final) 선언)
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL; //1
	
	//overriding을 이용하여 flymode가 supersonic이면 초음속 비행입니다.
	//그렇지 않으면 Airplane의 fly를 실행한다.
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
			return;
		} else {
			super.fly();
		}
		
	}
	
	
		

}
