package chapter22;

public class DaeMonThread_Main implements Runnable{
	
	
	static boolean autoSave = false; //자동저장기능 잠금
	
	public static void main(String[] args) {
		//Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 스레드로 활용 가능하다.
		DaeMonThread_Main dm = new DaeMonThread_Main();
		Thread t = new Thread(dm); //스레드 객체로 변환
		
		//데몬스레드로 설정: 메인이 종료되면 같이 종료됨
		t.setDaemon(true); //t를 daemon스레드로 변경
		t.start();
		
		for(int i = 1 ; i <= 15 ; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			
			if(i == 3) { // 3초뒤에 저장모드로 변환
				autoSave = true;
			}
			
		}
	
	}
	
	//3초마다 저장을 무한반복
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3000);//3초마다
				
			} catch (Exception e) {
				e.printStackTrace();
			} // try
			
			if(autoSave == true) {
				System.out.println("자동저장되었습니다.");//뿌려주기만
				//여기에 자동저장 기능도 넣으면 자동저장
			}
			
		}
		
	}

}
