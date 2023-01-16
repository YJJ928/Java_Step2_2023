package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain{

	public static void main(String[] args) {

//		while(true) {
//			System.out.println();
//			System.out.println("R or r: 한명씩 차례로 할당");
//			System.out.println("L or l: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
//			System.out.println("P or p: 업무스킬이 높은 상담원에게 할당");
//			System.out.println("S or s:  종료");
//			System.out.print("전화 상담방식을 선택하세요: ");
//			
//			Scanner scan = new Scanner(System.in);
//			String input = scan.next();
//			int a = (int) input.charAt(0);
//			
//			Scheduler scheduler = null;
//			Scheduler rr = new RoundRobin();
//			Scheduler lj = new LeastJob();
//			Scheduler pa = new PriorityAllocation();
//			
//			//객체생성
//			if(a == 82 || a == 114) {//R
//				//RoundRobin
//				rr.getNextCall();
//				rr.sendCallToAgent();
//			} else if(a == 76 || a == 108) {//L
//				//LeastJob
//				lj.getNextCall();
//				lj.sendCallToAgent();
//			} else if(a == 80 || a == 112) {//P
//				//PriorityAllocation
//				pa.getNextCall();
//				pa.sendCallToAgent();
//			} else if(a == 83 || a == 115) {//S
//				System.out.println("종료");
//				break;
//			} else {
//				System.out.println("다시");
//			}
//		}
		
//		Scanner scan = new Scanner(System.in);
//		char input = scan.next().charAt(0); // char => ASCII
//		System.in.read();
//		int ch = System.in.read();
		
			while(true) {
				System.out.println();
				System.out.println("R or r: 한명씩 차례로 할당");
				System.out.println("L or l: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
				System.out.println("P or p: 업무스킬이 높은 상담원에게 할당");
				System.out.println("S or s:  종료");
				System.out.print("전화 상담방식을 선택하세요: ");
				
				Scanner scan = new Scanner(System.in);
				int a = (int) scan.next().charAt(0);
				//문자를 아스키코드로 형변환
	    	    //방법1
	    	    //charAt(0) : 문자(char) 또는 문자열(String) => ASCII 즉 int
				//char input=scan.next().charAt(0); 
				//System.in.read() : 콘솔에 입력받기 모든 이력값을 아스키코드값
				//int ch=System.in.read(); //아스키코드값
				//방법2
//				String mun = scan.nextLine();
//				int ch = mun.charAt(0); //charAt(0):String -> ACSII(int)
				
				Scheduler scheduler = null;				
				
				//객체생성
				if(a == 82 || a == 114) {//R
					//RoundRobin
					scheduler = new RoundRobin();
				} else if(a == 76 || a == 108) {//L
					//LeastJob
					scheduler = new LeastJob();
				} else if(a == 80 || a == 112) {//P
					//PriorityAllocation
					scheduler =  new PriorityAllocation();
				} else if(a == 83 || a == 115) {//S
					System.out.println("종료");
					break;
				} else {
					System.out.println("다시");
				}
				scheduler.getNextCall();
				scheduler.sendCallToAgent();
			}
		
		
		
		
	}
}
