package chapter11;

public class Actor {
//	아래와 같이 배우이름과 작품을 2차원 배열로 정의한 후.

	String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
		            { "[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
		            { "[이병헌]", "지아이조", "레드", "광해"} };
	
//	아래의 결과를 반영하는 프로그램을 작성해보자.
//		검색할 배우 : 김수현
//	[김수현]
//	도둑들
//	수상한 그녀
//	은밀하게 위대하게  ---> 검색이 제대로 이루어 진 경우.
//	
//	검색할 배우 : ㅁ
//	해당배우가 존재하지 않습니다 ---> 검색이 제대로 이루어지지 않은 경우.
	public String showActor(String act) {
//		int cnt = 0;
//		for(int i = 0 ; i < actor.length ; i++) {
//			if(act.equals(actor[i][0])) {
//				System.out.println(actor[i][1]);
//				System.out.println(actor[i][2]);
//				System.out.println(actor[i][3]);
//			} else {
//				cnt++;
//				if(cnt >= actor.length) { 
//					//3번 돌았다 = 위에서 못찾았다. 3>=3이면~아래것
//					System.out.println("해당배우가 존재하지 않습니다.");
//					break;
//				}
//			}
//		} return act; 
		
		int cnt = -1;
		for(int i = 0 ; i < actor.length ; i++) {
			if(act.equals(actor[i][0])) {
				System.out.println(actor[i][1]);
				System.out.println(actor[i][2]);
				System.out.println(actor[i][3]);
				cnt = i;
			}
		} 
		if (cnt < 0) {
			System.out.println("해당배우가 존재하지 않습니다.");
		} 
		return act;
	} 
		
} 
	

