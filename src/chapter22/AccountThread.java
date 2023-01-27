package chapter22;

import java.util.Random;

public class AccountThread implements Runnable{
	
	Account acc;
	
	public AccountThread (Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
				int money = (new Random().nextInt(3)+1)*100; //1,2,3 중 하나 *100 = 100,200,300
				acc.withdraw(money);
				System.out.println("잔액: "+ acc.balance);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
//			if(acc.balance <= 0) {
//				System.out.println("잔액 소진");
//				break;
//			}
		
		//출금액을 100원에서 300사이의 난수로 지정
		}
		
	}
	
}
