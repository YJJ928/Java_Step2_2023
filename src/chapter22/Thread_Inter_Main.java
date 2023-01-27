package chapter22;

public class Thread_Inter_Main implements Runnable{
	
	public static void main(String[] args) {
		
		Thread_Inter_Main t1 = new Thread_Inter_Main();
		
		System.out.println("메인 클래스 시작!");
		
//		t1.run();
		Thread mThread = new Thread(t1); //t1을 thread 화 함
		//일반 클래스의 객체를 thread로 변혼
		mThread.start();
		
		System.out.println("메인 클래스 종료!");
		
	}

	@Override
	public void run() {
		System.out.println("run() 메서드 수행!");
		first();
	}
	
	private void first() {
		System.out.println("first() 메서드 수행!");
		second();
	}
	
	private void second() {
		System.out.println("second() 메서드 수행!");
	}
	
//	t1.run(); 일반 메서드 수행결과
//	메인 클래스 시작!
//	run() 메서드 수행!
//	first() 메서드 수행!
//	second() 메서드 수행!
//	메인 클래스 종료!
	
	
//	mThread.start(); 스레드화 된 mThread 수행결과
//	메인 클래스 시작!
//	메인 클래스 종료!
//	run() 메서드 수행!
//	first() 메서드 수행!
//	second() 메서드 수행!
	
//	thread는 독립적으로 움직인다. 왼->오, 위->아래 가 아니다

}
