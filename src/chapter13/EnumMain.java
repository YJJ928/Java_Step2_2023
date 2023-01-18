package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item {Start, Pause, Exit} //배열로 보면 편하다..
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료]: ");
			int n = scan.nextInt();
			Item start = Item.Start; //Start 0 이 넘어왔다....
			Item pause = Item.Pause; //Pause 1 이 넘어왔다....
			Item exit = Item.Exit; //Exit 2 이 넘어왔다....
			
			if (n == start.ordinal()) { //n == 0 
				System.out.println("게임을 시작");
			} else if (n == pause.ordinal()) { //n==1
				System.out.println("일시정지");
			} else {
				System.out.println("종료");
				return; //if 문 빠져나감 // break는 멈춤이면 return은 if종료해서 빠져나감
			} // if
			
		} // while
		
	} // main

} // class EnumMain
