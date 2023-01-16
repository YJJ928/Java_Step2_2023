package chapter11;

public class CarMain {

//	public static void main(String[] args) {
//		
//		method(new ManualCar());
//		System.out.println("---");
//		method(new AICar());
//		System.out.println("-----");
//	}
//	
//	public static void method(Car car) {
//		car.drive();
//		System.out.println("---");
//		car.stop();
//		System.out.println("-----");
//	}
	
	public static void main(String[] args) {
		System.out.println("자율주행");
		Car mycar = new AICar();
		mycar.run();
		
		System.out.println("수동주행");
		Car manualcar = new ManualCar();
		manualcar.run();
	}
	
	
}
