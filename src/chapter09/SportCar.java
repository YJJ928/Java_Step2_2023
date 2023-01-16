package chapter09;

public class SportCar extends Car{
	
	
//	public void stop() {
//		System.out.println("스포츠카가 멈춥니다.");
//		speed = 0;
//	} //부모에게서 final 을 붙여서 재정의가 불가능
	
	@Override
	public void speedUp() {
		//super.speedUp();
		speed += 10;
		System.out.println(speed);
	}
	
	public static void main(String[] args) {
		SportCar ac = new SportCar();
		
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();
	}

}
