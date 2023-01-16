package chapter11;

public class ManualCar extends Car{ //에러는 오버로딩하면 사라짐

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");	
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");	
	}
	
	
	

}
