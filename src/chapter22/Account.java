package chapter22;

public class Account {
	
	int balance = 1000; //잔액
	
	//출금메서드
	public synchronized void withdraw(int money) {
		
		if(balance < money) {
			try {
				wait(); //스레드 일시적으로 정지상태
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		balance -= money;
		
	} // withdraw
	
	//입금메서드
	public synchronized void depoisit(int money) {
		
		balance += money;
		notify();
		
	}

}

// 멀티스레드 환경에서 고려해야할 스레드 간의 동기화
// 예를 들어 스레드 간에 공유하는 데이터가 존재할 시, 수정하고 삭제하는 과정에서 동기화를 유지시켜야 한다.
// 자바에서는 synchronized 키워드로 동기화를 시켜준다.
