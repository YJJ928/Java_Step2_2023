package chapter08;

import java.util.Scanner;

public class TourMain01 {

	public static void main(String[] args) {
//		스테틱 변수 point를 가지는 Guide클래스를 만들고, 
//		이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
//		최초 실행시 등록할 관광객 수를 지정.
//		지정한 수 만큼 Guest클래스의 배열로 만듬
		
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = scan.nextInt();
		
		//Guide01만 끌어오면 됨
		Guide01 gd01 = new Guide01();
		
		//관광객등록 끌어오기
		System.out.println("관광객 등록: ");
		gd01.list();
		

	}

}
