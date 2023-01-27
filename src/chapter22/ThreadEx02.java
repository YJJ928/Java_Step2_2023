package chapter22;

public class ThreadEx02 extends Thread {
	
	private int[] temp;
	
	public ThreadEx02() {
		//초기화
		temp = new int[10];
		for(int i = 0 ; i < temp.length ; i++) {
			temp[i] = i+1;
		}
		
	}

	@Override
	public void run() {
		
		try {
			for(int t : temp) {
				System.out.println(t);
				Thread.sleep(1000); // 1000은 1초
			}  // 1초에 한번씩 읽어라
		} catch (Exception e) {
			e.printStackTrace();
		} // try/catch
		
		
	}
	
	
	
}
