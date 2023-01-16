package chapter11;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행을 합니다.");
		System.out.println("자동차가 스스로 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 브레이크로 정지합니다.");	
	}
	
}
