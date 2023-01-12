package chapter08;

import java.util.Scanner;

public class TourMain {

	public static void main(String[] args) {
//		스테틱 변수 point를 가지는 Guide클래스를 만들고, 
//		이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
//		최초 실행시 등록할 관광객 수를 지정.
//		지정한 수 만큼 Guest클래스의 배열로 만듬
			
//		Scanner로 입력 받음
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = scan.nextInt();
		
		//초기화를 통하여 메모리확보 및 고객 생성(guide 객체)
		Guide gd = new Guide(n); //guide에서 guest[]를 끌어와서 생성했으므로, 
		//gd만 끌어오면 됨
		//gd.guest[i].~~~guest에 있는것 쓸 수 있다.
				
		System.out.println("관광객 등록: ");
		
		
		
		while (true) {
			System.out.println("1.관광객 정보\n2.목적지 변경\n3.종료\n선택>");
			int nn = scan.nextInt();

			if (nn == 1) {
				for (int i = 0; i < gd.guest.length; i++) {
					
					System.out.print((i + 1) + ". 이름 : " + gd.guest[i].getName());
					System.out.print(", 성별 : " + gd.guest[i].getGender());
					System.out.println(", 목적지 : " + gd.guest[i].getPoint());
					System.out.println("--------");
				}
			} else if (nn == 2) {
				System.out.println("어디로변경?> ");
				String aa = scan.next();
				Guide.point = aa;
				System.out.println(Guide.point + "로 목적지 변경");
			} else if (nn == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못선택");
			}
		}
	}

}
