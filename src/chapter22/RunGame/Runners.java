package chapter22.RunGame;

import java.util.Random;

public class Runners implements Runnable{
	
	int[] playerRandom = new int[5];
	String[] playerJump = {"","","","",""}; //5개 방 초기화
	
	boolean finish = false;
	int finishPlayer = 0;
	
	@Override
	public void run() {
		while(true) {
			
			// 도약거리(랜덤)
			for(int i = 0 ; i < playerRandom.length ; i++) {
				playerRandom[i] = new Random().nextInt(4); //0,1,2,3 중 하나
			}
			
			// 0.1초 간격 휴식
					
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			// 각 선수에게 도약거리 적용
			for(int i = 0 ; i < playerRandom.length ; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += " "; // += 로 누적을 시켜줘야 한다 / " "으로 공란의 차이 준다.
					break;
				case 1:
					playerJump[i] += "   ";
					break;
				case 2:
					playerJump[i] += "     ";
					break;
				case 3:
					playerJump[i] += "       ";
					break;
				default:
					break;
				} // switch
				
			} // for
			
			//달리기
			System.out.println("-------------------------------------------------");
			for(int i = 0 ; i < playerJump.length ; i++) {
				System.out.print(playerJump[i]);
				System.out.println( i + 1 +" 옷 ");
				
				if(playerJump[i].length() >= 50) {
					finishPlayer = i + 1;
					finish = true;
				}
			} // for
			// 결산
			if(finish) {
				System.out.println("Winner = "+finishPlayer);
				break;
			}
		}
	}
} 

