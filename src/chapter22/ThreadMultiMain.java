package chapter22;

public class ThreadMultiMain {
	
	public static void main(String[] args) {
		
		//멀티스레드 Multithread
		
		ThreadEx03 t1 = new ThreadEx03(); //1
		ThreadEx03_2 t2 = new ThreadEx03_2(); //2
		
		t1.start();
		t2.start();
		//1과 2가 섞이면서 무질서하게 들어옴(독립적으로)
		
	}

}
