package chapter08;

public class Guide {
	
	static String point;
	Guest[] guest; //배열 생성
//	Guest g = new Guest(); //이게 생성되어 있는 것임.
	
	//생성자 초기화
	public Guide() {
		// TODO Auto-generated constructor stub
	}
	
	public Guide(int n) {
		point = "발리";
		guest = new Guest[n]; //보유하는 고객수를 생성
		
		//객체 생성
		for(int i = 0 ; i < guest.length ; i++) {
			guest[i] = new Guest();
		}
	}
	
}
