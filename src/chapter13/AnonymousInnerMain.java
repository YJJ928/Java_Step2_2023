package chapter13;

class Outter2{
	
	//방법2
	Runnable getRunnable(int i) {
		int num = 100; //final
		// new와 동시에 부모클래스의 run 메소드를 상속받으므로 
		// 추상 메소드인 run을 반드시 오버라이딩 해서 사용한다.
		
		return new Runnable() {
			
			@Override
			public void run() {
				// i = 10;		//에러남
				// num = 200;	//에러남
				System.out.println(i);
				System.out.println(num);
			}
			
		}; // return new Runnable()
		
	} // Runnable getRunnable()
	
	
	//방법1
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable이 구현된 익명의 클래스");
		}
		
	}; // Runnable runner
	
} // class Outter2

public class AnonymousInnerMain {
	
	public static void main(String[] args) {
		
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		
		runnable.run(); //방법1
		out.runner.run(); //방법2
		
	} // main

} // class AnonymousInnerMain
