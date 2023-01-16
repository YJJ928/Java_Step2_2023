package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() { // final이 붙으면 override불가능하고 이건 절대 바꿀 수 없다.
		System.out.println("차가 멈춥니다.");
		speed = 0;
	}
	

}
