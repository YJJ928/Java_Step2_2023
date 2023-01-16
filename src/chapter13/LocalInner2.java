package chapter13;

class Outter{
	//외부 클래스 멤버변수
	int outNum = 100;
	static int sNum = 200;
	
	//Runnable 매개변수와 멤버변수는 final로 정의..
	Runnable getRunnable(int i) { 
		int num = 100; // final
		
		class MyRunnable implements Runnable{
			int localNum = 10; //내부 클래스의 멤버변수
			
			@Override
			public void run() {
				// 얘를 반드시 구현해야 쓸 수 있음..
				// num = 300; // 위에 int num이 final로 정의되어 있어서 못 바꿈...
				// i = 100; // 위에 int i가 final로 정의되어 있어서 못 바꿈...
				System.out.println("i: "+i);
				System.out.println("num: "+num);
				System.out.println("localNum: "+localNum);
				System.out.println("outNum: "+outNum+"(외부)");
				System.out.println("Outter.sNum: "+Outter.sNum+"(외부data영역)");
				
			} // run()
			
		} // class MyRunnable
		
		return new MyRunnable();
	}
}

public class LocalInner2 {
	
	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		
		runner.run();
			
	}

}
